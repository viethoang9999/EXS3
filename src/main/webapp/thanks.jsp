<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <link rel="stylesheet" href="main.css" type="text/css"/>
</head>
<body>
  <div class="container">
    <h1>🎉 Thank You!</h1>
    <p>We appreciate your time for filling out the survey.</p>

    <div class="thank-box">
        <p><strong>Your information:</strong></p>
        <ul class="info-list">
            <li>First Name: <%= request.getParameter("firstName") %></li>
            <li>Last Name: <%= request.getParameter("lastName") %></li>
            <li>Email: <%= request.getParameter("email") %></li>
            <li>Date of Birth: <%= request.getParameter("dob") %></li>
            <li>Heard About Us: <%= request.getParameter("source") %></li>
            <li>Offers: <%= request.getParameter("offers") %></li>
            <li>Email Offers: <%= request.getParameter("emailOffers") %></li>
            <li>Contact Method: <%= request.getParameter("contactMethod") %></li>
        </ul>

        <a href="index.html" class="back-btn">⬅ Back to Survey</a>
    </div>
  </div>
</body>
</html>
