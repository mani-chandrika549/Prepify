package com.quiz.model;

import java.util.ArrayList;
import java.util.List;

public class QuizDAO {

    public static List<Question> getQuestions(String subject) {
        List<Question> questions = new ArrayList<>();

        switch (subject) {
        case "aptitude":
            questions.add(new Question("What comes next: 2, 6, 12, 20, ?", "30", "32", "36", "B"));
            questions.add(new Question("A train 150m long is running at 60km/h. Time to cross a pole?", "6.5 sec", "9 sec", "12 sec", "C"));
            questions.add(new Question("If A is twice as fast as B, and B finishes in 12 min, A finishes in?", "6 min", "4 min", "8 min", "A"));
            questions.add(new Question("Odd one out: 2, 3, 5, 9, 11", "3", "5", "9", "C"));
            questions.add(new Question("If x + y = 10, x - y = 2, find x", "6", "8", "4", "A"));
            questions.add(new Question("Find missing: 3, 9, 27, ?, 243", "54", "81", "72", "B"));
            questions.add(new Question("Average of 10, 20, 30, 40?", "20", "25", "30", "B"));
            questions.add(new Question("Compound interest is more than simple interest due to?", "More Time", "Interest on Interest", "More Principal", "B"));
            questions.add(new Question("What is the LCM of 6 and 8?", "24", "48", "12", "A"));
            questions.add(new Question("1 rupee = 100 paise. 75 paise = ?", "0.5 rupee", "0.75 rupee", "1.5 rupee", "B"));
            break;

        case "java":
            questions.add(new Question("What is the size of int in Java?", "2 bytes", "4 bytes", "8 bytes", "B"));
            questions.add(new Question("Which of these is not a Java keyword?", "static", "Boolean", "void", "B"));
            questions.add(new Question("Inheritance is used to achieve?", "Abstraction", "Polymorphism", "Code Reusability", "C"));
            questions.add(new Question("Which method is entry point for Java?", "main()", "start()", "run()", "A"));
            questions.add(new Question("Java is?", "Compiled", "Interpreted", "Both", "C"));
            questions.add(new Question("What is JVM?", "Compiler", "Interpreter", "Java Virtual Machine", "C"));
            questions.add(new Question("Which package is automatically imported?", "java.lang", "java.util", "java.io", "A"));
            questions.add(new Question("String in Java is?", "Mutable", "Immutable", "Flexible", "B"));
            questions.add(new Question("Which is used for multiple inheritance?", "interface", "class", "object", "A"));
            questions.add(new Question("Which operator is used to compare values?", "==", "=", "!=", "A"));
            break;

        case "dsa":
            questions.add(new Question("Which sorting has best avg case: Bubble, Merge, Selection?", "Bubble", "Merge", "Selection", "B"));
            questions.add(new Question("Stack uses which order?", "FIFO", "LIFO", "Random", "B"));
            questions.add(new Question("LinkedList nodes contain?", "Data", "Pointer", "Both", "C"));
            questions.add(new Question("Binary Search works on?", "Sorted Array", "Any Array", "Stack", "A"));
            questions.add(new Question("Tree traversal in order?", "Inorder", "Postorder", "Preorder", "A"));
            questions.add(new Question("Queue is?", "LIFO", "FIFO", "LILO", "B"));
            questions.add(new Question("Which is not linear DS?", "Array", "Stack", "Tree", "C"));
            questions.add(new Question("Which DS uses recursion naturally?", "Queue", "Stack", "Array", "B"));
            questions.add(new Question("Big O of binary search?", "O(n)", "O(n^2)", "O(log n)", "C"));
            questions.add(new Question("Hashing is used for?", "Searching", "Sorting", "Mapping", "A"));
            break;

        case "sql":
            questions.add(new Question("Which is used to extract data?", "SELECT", "INSERT", "DELETE", "A"));
            questions.add(new Question("Which joins all rows from both tables?", "INNER JOIN", "LEFT JOIN", "FULL JOIN", "C"));
            questions.add(new Question("Which keyword deletes all rows?", "DROP", "TRUNCATE", "DELETE", "C"));
            questions.add(new Question("Primary Key allows?", "Duplicate", "Null", "Unique & Not Null", "C"));
            questions.add(new Question("GROUP BY is used with?", "WHERE", "HAVING", "ORDER BY", "B"));
            questions.add(new Question("Which command is DDL?", "UPDATE", "ALTER", "SELECT", "B"));
            questions.add(new Question("To prevent SQL injection, use?", "PreparedStatement", "Statement", "QueryBuilder", "A"));
            questions.add(new Question("Which is not a constraint?", "PRIMARY", "UNIQUE", "JOIN", "C"));
            questions.add(new Question("Which is ACID property?", "Atomicity", "Accuracy", "Access", "A"));
            questions.add(new Question("To fetch unique rows?", "SELECT", "SELECT DISTINCT", "SELECT ALL", "B"));
            break;

        case "os":
            questions.add(new Question("Which manages CPU scheduling?", "Loader", "Kernel", "Compiler", "B"));
            questions.add(new Question("Semaphore is used for?", "Memory Mgmt", "Process Sync", "Interrupts", "B"));
            questions.add(new Question("What is a process?", "Program in Disk", "Program in Execution", "Code", "B"));
            questions.add(new Question("Thrashing happens due to?", "Low CPU", "High Paging", "Low Disk", "B"));
            questions.add(new Question("Which is not a scheduling algo?", "FCFS", "SJF", "RAM", "C"));
            questions.add(new Question("Virtual memory is?", "More RAM", "Logical Memory", "Secondary Memory", "B"));
            questions.add(new Question("Interrupts are handled by?", "RAM", "Kernel", "HDD", "B"));
            questions.add(new Question("Deadlock can be avoided using?", "Banker's Algo", "Scheduling", "RAM", "A"));
            questions.add(new Question("Context switch is?", "Switch User", "Switch Thread", "Switch Process", "C"));
            questions.add(new Question("Fork() creates?", "Thread", "Child Process", "Semaphore", "B"));
            break;

        case "cn":
            questions.add(new Question("Which protocol uses port 80?", "FTP", "HTTP", "SMTP", "B"));
            questions.add(new Question("OSI layer for Routing?", "Transport", "Network", "Session", "B"));
            questions.add(new Question("TCP is?", "Connectionless", "Reliable", "Unreliable", "B"));
            questions.add(new Question("IP address version?", "IPv1", "IPv2", "IPv4", "C"));
            questions.add(new Question("Which device connects networks?", "Router", "Switch", "Hub", "A"));
            questions.add(new Question("DNS translates?", "Domain to IP", "IP to MAC", "MAC to Domain", "A"));
            questions.add(new Question("Ping uses which protocol?", "UDP", "TCP", "ICMP", "C"));
            questions.add(new Question("Firewall is used for?", "Speed", "Security", "Sharing", "B"));
            questions.add(new Question("MAC is?", "Memory Address", "Media Access Ctrl", "Main Access Control", "B"));
            questions.add(new Question("Which has fastest speed?", "Fiber", "DSL", "Coaxial", "A"));
            break;

        case "web":
            questions.add(new Question("HTML stands for?", "HyperText Markup Language", "Hyper Transfer ML", "Markup HyperText", "A"));
            questions.add(new Question("CSS is used for?", "Database", "Styling", "Programming", "B"));
            questions.add(new Question("JS can manipulate?", "HTML only", "CSS only", "DOM", "C"));
            questions.add(new Question("Bootstrap is a?", "JS Library", "CSS Framework", "Database Tool", "B"));
            questions.add(new Question("form tag is used for?", "Display", "Layout", "Input", "C"));
            questions.add(new Question("Which HTML tag creates table?", "td", "th", "table", "C"));
            questions.add(new Question("To handle click event?", "onclick", "onhover", "onsubmit", "A"));
            questions.add(new Question("Which is not a HTML5 feature?", "Video", "Audio", "Applet", "C"));
            questions.add(new Question("Responsive design uses?", "Bootstrap", "jQuery", "Servlet", "A"));
            questions.add(new Question("To link external JS?", "script", "js", "code", "A"));
            break;

        case "projects":
            questions.add(new Question("Which is a real-world benefit of MVC?", "Separation of Concerns", "More Speed", "Less RAM", "A"));
            questions.add(new Question("Git is used for?", "Deployment", "Version Control", "Security", "B"));
            questions.add(new Question("404 error means?", "Not Found", "Forbidden", "OK", "A"));
            questions.add(new Question("Which HTTP method for data fetch?", "POST", "PUT", "GET", "C"));
            questions.add(new Question("Which tool manages dependencies?", "Tomcat", "Maven", "JSP", "B"));
            questions.add(new Question("Which page handles backend logic?", "Servlet", "HTML", "CSS", "A"));
            questions.add(new Question("Which is safest method to store passwords?", "Plaintext", "Hashed", "Encrypted", "B"));
            questions.add(new Question("Session management done using?", "Cookies", "Forms", "Tags", "A"));
            questions.add(new Question("MVC stands for?", "Model View Controller", "Model View Client", "Modular View Controller", "A"));
            questions.add(new Question("SQL Injection can be prevented by?", "PreparedStatement", "Statement", "Dynamic SQL", "A"));
            break;

            default:
                break;
        }

        return questions;
    }
}
