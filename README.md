# parametra

prueba parametra

Este proyecto se encuentra desarrollado en java 8 bajo el framework springBoot. Para ejecución de proyecto previamente debe estar instalada la base de datos MySql en la ruta /prueba/src/main/resources encontrara el archivo application.properties al cual para que se ejecute el proyecto se le deben cambiar los valores a las propiedades

spring.datasource.username = root spring.datasource.password = qpalwosk10

usando respectivamente los valores configurados en el username y password de la base de datos del ambiente donde se va a ejecutar el proyecto.

en caso de que el servidor de base de datos de Mysql instalado en el ambiente donde se ejecutara el proyecto esté en un puerto diferente al 3306 se debe tener en cuenta que la el puerto debe ser cambiado de igual forma en la propiedad

spring.datasource.url = jdbc:mysql://localhost:3306/parametra?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC

De igual forma se debe crear en MySql la base de datos parametra CREATE DATABASE parametra;

El proyecto corre por el puerto 8080 a continuación se adjunta  ejemplo de api rest del proyecto

localhost:8080/api/parametra/getEmployee?nombres=Juan&apellidos=Perez&fechanacimiento=14/03/2000&fechavinculacion=14/03/2020&cargo=Java Developer Parametra&salario=7000000&tipodocumento=CC&numerodocumento=1111111111

de igual forma se adjunta url de wsdl del servicio soap


http://localhost:8080/service/empleadoWsdl.wsdl

Ejemplo de datos de entrada al ejecutar el servicio en soap ui

http://localhost:8080/service/empleado


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:par="http://www.parametra.com/xml/parametra">
   <soapenv:Header/>
   <soapenv:Body>
      <par:EmpleadoRequest>
         <par:EmpleadoOBJ>
            <par:nombres>Juan</par:nombres>
            <par:apellidos>Perez</par:apellidos>
            <par:tipoDocumento>CC</par:tipoDocumento>
            <par:numeroDocumento>1111111111</par:numeroDocumento>
            <par:fechaNacimiento>14/03/2000</par:fechaNacimiento>
            <par:fechaVinculacion>14/03/2000</par:fechaVinculacion>
            <par:cargo>Java Developer Parametra</par:cargo>
            <par:salario>7000000</par:salario>
         </par:EmpleadoOBJ>
      </par:EmpleadoRequest>
   </soapenv:Body>
</soapenv:Envelope>
