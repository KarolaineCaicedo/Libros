<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        text-align: center;
        padding-top: 50px;
    }
    
    h1 {
        color: #333;
    }

    form {
        display: inline-block;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    button {
        padding: 10px 20px;
        margin-top: 10px;
        margin-right: 10px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
    }

    button[type="submit"] {
        background-color: #e74c3c;
        color: white;
        transition: background-color 0.3s ease;
    }

    button[type="submit"]:hover {
        background-color: #c0392b;
    }

    button[type="button"] {
        background-color: #3498db;
        color: white;
    }

    button[type="button"]:hover {
        background-color: #2980b9;
    }
</style>
</head>
<body>
<h1>Libros</h1>

<form action="del" method="get">
    <input type="hidden" id="idLibro" name="idLibro" value="${libro.idLibro}" />
    <strong>¿Deseas Borrar este Libro?</strong>
    <br/>
    <button type="submit">BORRAR</button>
    <button type="button" onclick="window.location.href='/ismac-libreria-web-matutino/libros/findAll';return false;">
        CANCELAR
    </button>
</form>

</body>
</html>
