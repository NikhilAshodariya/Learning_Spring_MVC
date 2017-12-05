<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>${headerMessage}</h1>
        <h2>Congratulations your admission is done</h2>
        ${ladaka}
        
        <h3>Name : ${ladaka.studentName}</h3>
        <h3>Hobby: ${ladaka.studentHobby}</h3>
        <h3>Address:${ladaka.studentAddress}</h3>
    </body>
</html>
