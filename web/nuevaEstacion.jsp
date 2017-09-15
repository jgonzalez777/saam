<%@taglib uri="/struts-tags" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SAAM -- Mis Estaciones</title>
        <link href="lib/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="stylesheet"/>        
        <link rel="stylesheet" type="text/css" href="recursos/header.css"/>  
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function(){
                $(".label").css("color", "black");
                $(".label").css("font-size","1em");
                
                $("#crearEstacion").on("click", function(){                    
                    $("#nuevaEstacion").submit();
                });
            });
        </script>
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
            <s:form id="nuevaEstacion" action="nuevaEstacion"  method="POST" namespace="/">
                <table>
                    <tr>                        
                        <td>                            
                            <s:textfield id="nombre" key="estacion.nombre" label="Nombre estación: "/> 
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:textfield id="ip" key="estacion.ip" label="Ip estación"/> 
                        </td>
                    </tr>     
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>                        
                        <td>
                            <s:textfield id="longitud" key="estacion.longitud" label="Ubicación (Lóngitud)"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <s:textfield id="latitud" key="estacion.latitud" label="Ubicación (Latitud)"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" >
                            <center>
                                <button type="button" class="btn btn-success" id="crearEstacion">Crear Estación</button>
                                <button type="button" class="btn btn-danger" onclick="window.location.href='estaciones.action'">Regresar</button>
                            </center>
                        </td>
                    </tr>                    
                </table>
            </s:form>
        </article>
        <br>
        <footer><center>Copyright &copy; SAAM.com</center></footer>
    </body>
</html>