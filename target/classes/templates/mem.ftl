<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Page</title>
</head>
<body>
<h1>${lol}</h1>
<form action="/rest/controller/body/${id}" method="PUT">
    <input type="text" name="name" value="${name}" />
    <input type="submit" value="Обновить" />
</form>
</body>
</html>