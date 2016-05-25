<%--
  Created by IntelliJ IDEA.
  User: Ruby
  Date: 5/23/2016
  Time: 12:51 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<h2>Technician</h2>
<g:hasErrors bean="${tech}">
    <div class="errors">
        <g:renderErrors bean="${tech}" as="list" />
    </div>
</g:hasErrors>
<g:form action="add" controller="technician">
    Name: <input type="text" name="name" value="${tech?.name}"> <br>
    Address: <input type="text" name="address" value="${tech?.address}"><br>
    Contact: <input type="text" name="contact" value="${tech?.contact}"><br>
    Email: <input type="text" name="email" value="${tech?.email}"><br>
    Experience: <g:textArea name="experience" rows="5" cols="30"/><br>
    Service :
    <g:select name="services" from="${ser}" multiple="true" optionKey="id" optionValue="type"/>
    <br>
    <input type="submit" id="tech-submit" value="Add Technician">
</g:form>

</body>
</html>