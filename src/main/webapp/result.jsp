<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="java.util.List" %>
<%@ page import="com.quiz.model.Question" %>
<%
    Integer score = (Integer) session.getAttribute("score");
    Integer total = (Integer) session.getAttribute("totalQuestions");
    String username = (String) session.getAttribute("username");
    List<Question> questions = (List<Question>) session.getAttribute("questions");
    List<String> userAnswers = (List<String>) session.getAttribute("userAnswers");

    double percent = (total != null && total > 0) ? ((double) score / total) * 100 : 0;
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quiz Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #1e1e1e;
            color: #f1f1f1;
            font-family: 'Segoe UI', sans-serif;
            animation: fadeIn 1.5s ease-in-out;
        }

        .container {
            margin-top: 100px;
            background-color: #2c2c2c;
            padding: 40px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.6);
        }

        h1, h3 {
            color: #00bcd4;
        }

        .btn {
            background-color: #00bcd4;
            border: none;
            padding: 12px 25px;
            font-weight: bold;
            border-radius: 8px;
            margin-top: 20px;
        }

        .btn:hover {
            background-color: #0097a7;
        }

        .review-box {
            background-color: #3a3a3a;
            padding: 20px;
            border-radius: 10px;
            text-align: left;
            margin-top: 30px;
        }

        .review-box p {
            margin: 5px 0;
        }

        .correct {
            color: #4caf50;
        }

        .wrong {
            color: #f44336;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(30px); }
            to { opacity: 1; transform: translateY(0); }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>🎉 Quiz Completed!</h1>
    <h3>Great job, <%= username != null ? username : "Participant" %>!</h3>
    <h4>Your Score: <%= score %> / <%= total %></h4>

    <!-- Progress Bar -->
    <div class="progress my-4" style="height: 25px;">
        <div class="progress-bar bg-success" role="progressbar"
             style="width: <%= percent %>%;" aria-valuenow="<%= percent %>"
             aria-valuemin="0" aria-valuemax="100">
            <%= String.format("%.0f", percent) %>% Scored
        </div>
    </div>
    
    <div class="alert alert-success mt-4">
    <h3>🎉 Well Done, <%= session.getAttribute("username") %>!</h3>
    
    <p>Your score: <strong><%= session.getAttribute("score") %> / <%= session.getAttribute("totalQuestions") %></strong></p>
    <p>Review your answers below and keep practicing for interviews!</p>
</div>
    

    <!-- ✅ Answer Review Section -->
    <div class="review-box">
        <h4 class="text-info mb-3">📋 Answer Review</h4>
        <%
            if (questions != null && userAnswers != null) {
                for (int i = 0; i < questions.size(); i++) {
                    Question q = questions.get(i);
                    String selected = (i < userAnswers.size()) ? userAnswers.get(i) : "Not Answered";
                    String correct = q.getCorrectAnswer();

                    String selectedText = selected.equals("A") ? q.getOptionA() :
                                          selected.equals("B") ? q.getOptionB() :
                                          selected.equals("C") ? q.getOptionC() : "No Answer";

                    String correctText = correct.equals("A") ? q.getOptionA() :
                                         correct.equals("B") ? q.getOptionB() :
                                         correct.equals("C") ? q.getOptionC() : "No Answer";
        %>
            <div class="mb-3">
                <p><strong>Q<%= i + 1 %>:</strong> <%= q.getQuestion() %></p>
                <% if (selected.equals(correct)) { %>
                    <p class="correct">✔ Your Answer (<%= selected %>): <strong><%= selectedText %></strong></p>
                <% } else { %>
                    <p class="wrong">✘ Your Answer (<%= selected %>): <strong><%= selectedText %></strong></p>
                    <p class="correct">✔ Correct Answer (<%= correct %>): <strong><%= correctText %></strong></p>
                <% } %>
                <hr style="border-top: 1px solid #666;">
            </div>
        <%
                }
            } else {
        %>
            <p class="text-warning">⚠ Answer review not available.</p>
        <%
            }
        %>
    </div>
    

    <a href="index.jsp" class="btn">Try Again</a>
    
    
    
</div>
<footer class="mt-5 text-center text-white" style="background-color: #1c1c1c; padding: 1rem;">
    <hr style="border-color: #444;">
    <p>&copy; 2025 Quiz Portal by Mani | Built with 💻 using Java, JSP, Servlets & Bootstrap</p>
</footer>

</body>
</html>
