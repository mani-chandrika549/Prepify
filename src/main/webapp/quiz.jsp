<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="com.quiz.model.Question" %>
<%@ page import="javax.servlet.http.HttpSession" %>

<%
    List<Question> questions = (List<Question>) session.getAttribute("questions");
    Integer currentIndex = (Integer) session.getAttribute("currentIndex");
    Integer score = (Integer) session.getAttribute("score");

    if (questions == null || currentIndex == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    if (currentIndex >= questions.size()) {
        response.sendRedirect("result.jsp");
        return;
    }

    Question q = questions.get(currentIndex);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quiz Question</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #1e1e1e;
            color: #f1f1f1;
            font-family: 'Segoe UI', sans-serif;
        }

        .container {
            background-color: #2c2c2c;
            border-radius: 12px;
            padding: 30px;
            margin-top: 60px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.5);
        }

        h3, h5 {
            color: #ffffff;
        }

        .form-check-input {
            margin-right: 10px;
        }

        .form-check:hover {
            background-color: #383838;
            border-radius: 6px;
        }

        .btn-primary {
            background-color: #00bcd4;
            border: none;
            padding: 10px 20px;
            font-weight: bold;
            border-radius: 8px;
        }

        .btn-primary:hover {
            background-color: #0097a7;
        }

        .fade-in {
            animation: fadeIn 1s ease-in;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }
    </style>
</head>
<body>

<div class="container fade-in">
    <h3>🚀 Question <%= currentIndex + 1 %> of <%= questions.size() %></h3>

    <div class="progress my-3">
        <div class="progress-bar bg-info" role="progressbar"
             style="width: <%= ((currentIndex + 1) * 100 / questions.size()) %>%;">
            Question <%= currentIndex + 1 %> of <%= questions.size() %>
        </div>
    </div>

    <form action="NextQuestionServlet" method="post">
        <h5><%= q.getQuestion() %></h5>

        <div class="form-check">
            <input class="form-check-input" type="radio" name="answer" value="A" required>
            <label class="form-check-label"><%= q.getOptionA() %></label>
        </div>

        <div class="form-check">
            <input class="form-check-input" type="radio" name="answer" value="B">
            <label class="form-check-label"><%= q.getOptionB() %></label>
        </div>

        <div class="form-check">
            <input class="form-check-input" type="radio" name="answer" value="C">
            <label class="form-check-label"><%= q.getOptionC() %></label>
        </div>

        <br>
        <input type="submit" class="btn btn-primary" value="Next">
        
    </form>
</div>



</body>
</html>
