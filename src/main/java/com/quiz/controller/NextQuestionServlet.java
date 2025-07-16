package com.quiz.controller;

import com.quiz.model.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

@WebServlet("/NextQuestionServlet")
public class NextQuestionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        List<Question> questions = (List<Question>) session.getAttribute("questions");
        Integer currentIndex = (Integer) session.getAttribute("currentIndex");
        Integer score = (Integer) session.getAttribute("score");

        // Get previously stored answers or create new
        List<String> userAnswers = (List<String>) session.getAttribute("userAnswers");
        if (userAnswers == null) {
            userAnswers = new ArrayList<>();
        }

        String selectedAnswer = request.getParameter("answer");
        if (selectedAnswer != null && questions != null && currentIndex != null) {
            Question currentQuestion = questions.get(currentIndex);

            // Add selected answer to the list
            userAnswers.add(selectedAnswer);

            if (selectedAnswer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())) {
                score++;
            }

            // Update session values
            session.setAttribute("score", score);
            session.setAttribute("currentIndex", currentIndex + 1);
            session.setAttribute("userAnswers", userAnswers);  // ✅ Add this
            session.setAttribute("totalQuestions", questions.size());  // Just in case
        }

        // Redirect to next question or result page
        if (currentIndex + 1 >= questions.size()) {
            response.sendRedirect("result.jsp");
        } else {
            response.sendRedirect("quiz.jsp");
        }
    }
}
