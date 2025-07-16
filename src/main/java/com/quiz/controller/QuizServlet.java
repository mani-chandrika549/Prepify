package com.quiz.controller;

import com.quiz.model.Question;
import com.quiz.model.QuizDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String subject = request.getParameter("subject");
        List<Question> questions = QuizDAO.getQuestions(subject);

        HttpSession session = request.getSession();
        
        String userName = request.getParameter("username");
        session.setAttribute("username", userName);

        session.setAttribute("questions", questions);
        session.setAttribute("score", 0);
        session.setAttribute("currentIndex", 0);
        session.setAttribute("totalQuestions", questions.size());

        response.sendRedirect("quiz.jsp");
    }
}
