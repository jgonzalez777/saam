<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SAAM -- Mis Estaciones</title>
        <link href="lib/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="stylesheet"/>
        <script src="lib/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> 
        <link rel="stylesheet" type="text/css" href="recursos/header.css"/>  
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <header>
            <div class="page-header">
                <h1>Sistema de Apoyo al Agricultor Moderno</h1>      
            </div>
        </header>
        <nav>
            <ul>                 
                <li style="float:right"><a class="active" href="#about">admin</a></li>
                <li style="float:right"><a href="#contact">Logout</a></li>
            </ul> 
        </nav>
        <article>
            <center><h3 id="titulo">Nueva Estación</h3></center>
            <form>
                <table>
                    <tr>
                        <td>
                            <label for="nombre">Nombre: </label>
                        </td>
                        <td>
                            <input type="text" class="form-control" id="nombre" placeholder="Nombre estación" style="display: inline; width: 276px;">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="ip">Ip:</label>
                        </td>
                        <td>
                            <input type="text" class="form-control" id="ip" placeholder="Ip V4" style="display: inline; width: 276px;">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="ip">Longitud:</label>
                        </td>
                        <td>
                            <input type="text" class="form-control" id="longitud" placeholder="Decimal" style="display: inline; width: 276px;">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="ip">Latitud: </label>
                        </td>
                        <td>
                            <input type="text" class="form-control" id="latitud" placeholder="Decimal" style="display: inline; width: 276px;">
                        </td>
                    </tr> 
                     <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                    <tr>
                        <td colspan="2" >
                            <center>
                                <button type="button" class="btn btn-success">Crear Estación</button>
                                <button type="button" class="btn btn-danger" onclick="window.location.href='estaciones.action'">Regresar</button>
                            </center>
                        </td>
                    </tr>                    
                </table>
            </form>
        </article>
        <br>
        <footer><center>Copyright &copy; SAAM.com</center></footer>
    </body>
</html>