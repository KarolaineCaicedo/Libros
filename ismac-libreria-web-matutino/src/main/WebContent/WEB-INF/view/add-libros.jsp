<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Libros </h1>

         <form action="add" method="post">
         
         
				idLibro         
               <input type="hidden" id="idLibro" name="idLibro" value="${libro.idLibro}" />
               titulo
               <input type="text" id="titulo" name="titulo" value="${libro.titulo}" />
               <br/>
               editorial
               <input type="text" id="editorial" name="editorial" value="${libro.editorial}" />
               <br/>
               numPaginas
               <input type="number" id="numPaginas" name="numPaginas" value="${libro.numPaginas}" />
               <br/>
               edicion
               <input type="text" id="edicion" name="edicion" value="${libro.edicion}" />
               <br/>
               idioma
               <input type="text" id="idioma" name="idioma" value="${libro.idioma}" />
               <br/>
               fechaPublicacion
               <input type="date" id="fechaPublicacion" name="fechaPublicacion" value="${libro.fechaPublicacion}" />
               <br/>
               Descripcion
               <input type="text" id="descripcion" name="descripcion" value="${libro.descripcion}" />
               <br/>
               tipoPasta
               <input type="text" id="tipoPasta" name="tipoPasta" value="${libro.tipoPasta}" />
               <br/>
               ISBN
               <input type="text" id="ISBN" name="ISBN" value="${libro.ISBN}" />
               <br/>
               numEjemplares
               <input type="number" id="numEjemplares" name="numEjemplares" value="${libro.numEjemplares}" />
               <br/>
               portada
               <input type="text" id="portada" name="portada" value="${libro.portada}" />
               <br/>
               presentacion
               <input type="text" id="presentacion" name="presentacion" value="${libro.presentacion}" />
               <br/>
               precio
               <input type="number" id="precio" name="precio" value="${libro.precio}" />
               <br/>
               id_categoria
              <select id="idCategoria" name="idCategoria">
              
              <c:forEach var="item" items="${categorias}">
              <option value="${item.idCategoria}" ${item.idCategoria == libro.categoria.idCategoria ?'selected' : ''}> ${item.categoria }</option>
              </c:forEach>
              
      
              </select>
              <br/>
               id_autor
              <select id="idAutor" name="idAutor">
                          
              <c:forEach var="item" items="${autores}">
              <option value="${item.idAutor}" ${item.idAutor == libro.autor.idAutor ?'selected' : ''}> ${item.nombre} ${item.apellido}</option>
              </c:forEach>
              </select>
               <br/>
               <br/>
               <button type="submit" onclick ="">Guardar</button>
               
               <button type="button" onclick="window.location.href='/ismac-libreria-web-matutino/libros/findAll';return false ;">
               Cancelar
               </button>
         </form>

</body>
</html>