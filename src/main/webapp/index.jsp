<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quiz Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
            color: white;
            font-family: 'Segoe UI', sans-serif;
            animation: fadeIn 2s ease-in;
        }

        .container {
            margin-top: 100px;
            background-color: rgba(44, 44, 44, 0.85);
            padding: 40px;
            border-radius: 12px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.6);
            animation: slideUp 1s ease-out;
        }

        h1 {
            margin-bottom: 30px;
        }

        .btn-primary {
            background-color: #00bcd4;
            border: none;
            padding: 12px 25px;
            font-weight: bold;
            border-radius: 8px;
        }

        .btn-primary:hover {
            background-color: #0097a7;
        }

        .form-select, .form-control {
            border-radius: 8px;
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        @keyframes slideUp {
            from { transform: translateY(50px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }
        
    </style>
</head>
<body>
<div class="container text-center">
    <div class="alert alert-info mt-4">
    <h3>Welcome to the Quiz Portal! 🎯</h3>
    <p>This platform helps you test your knowledge in key computer science subjects like Java, DSA, SQL, OS, CN, and more — all designed to boost your interview readiness.</p>
    <p>Select your name and preferred subject to begin. Best of luck! 💪</p>
</div>

    <form action="QuizServlet" method="post">
        <div class="mb-3">
            <label for="username" class="form-label">Enter Your Name:</label>
            <input type="text" name="username" id="username" class="form-control" required>
        </div>
        <div class="mb-3">
            <label for="subject" class="form-label">Choose a Subject:</label>
            <select name="subject" id="subject" class="form-select" required>
            <option value="">Select the Subject</option>
                <option value="aptitude">Aptitude & Reasoning</option>
<option value="java">Java (Core + OOP)</option>
<option value="dsa">Data Structures & Algorithms</option>
<option value="sql">SQL & DBMS</option>
<option value="os">Operating System</option>
<option value="cn">Computer Networks</option>
<option value="web">Web Basics (HTML/CSS/JS)</option>
<option value="projects">Real-World & Projects</option>

            </select>
        </div>
        <button type="submit" class="btn btn-primary">Start Quiz</button>
    </form>
    
</div>
<footer class="mt-5 text-center text-white" style="background-color: #1c1c1c; padding: 1rem;">
    <hr style="border-color: #444;">
    <p>&copy; 2025 Quiz Portal by Mani | Built with 💻 using Java, JSP, Servlets & Bootstrap</p>
</footer>


</body>
</html>
