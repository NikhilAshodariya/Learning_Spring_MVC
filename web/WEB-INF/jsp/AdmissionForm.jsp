<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring-form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>${headerMessage}</h1>
        <h2>Learning Spring MVC</h2>

        <h4><spring-form:errors path="ladaka.*" /> </h4>

        <form action="submitAdmissionForm" method="post">
            <p><spring:message code="label.studentName" /> <input type="text" name="studentName" /></p>
            <p>Student's Hobby:<input type="text" name="studentHobby" />  </p>

            <p>Student's Mobile: <input type="text" name="studentMobile"/> </p>
            <p>Student's DOB: <input type="text" name="studentDOB" /> </p>
            <p>Student's Skills set: 
                <select name="studentSkills" multiple>
                    <option value="Java Core"> Java Core</option>
                    <option value="Spring Core">Spring Core</option>
                    <option value="Spring MVC"> Spring MVC</option>
                    <option value="Python3">Python3</option>
                </select>
            </p>

            <p>Student's Address:</p>
            <p>Country: <input type="text" name="studentAddress.country" /> </p>
            <p>City: <input type="text" name="studentAddress.city"> </p>
            <p>Street: <input type="text" name="studentAddress.street"/> </p>
            <p>Pincode: <input type="text" name="studentAddress.pincode"/> </p>

            <p> <input type="submit" value="Click here to submit the form" /> </p>
        </form>
    </body>
</html>
