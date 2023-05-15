<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Calculator" %></h1>
<br/>
<form method="post" action="/index">
        <label>Product Description: </label><br/>
        <input type="text" name="description" placeholder="Product Description:"><br>
        <label>List Price: </label><br/>
        <input type="text" name="price" placeholder="List Price:"><br>
        <label>Discount Percent: </label><br/>
        <input type="text" name="discount" placeholder="Discount Percent:"><br>
        <input type = "submit" id = "submit" value = "Calculator"/>
</form>
</body>
</html>