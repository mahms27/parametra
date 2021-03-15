//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.03.14 a las 09:32:25 PM COT 
//


package com.parametra.xml.parametra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmpleadoOBJ" type="{http://www.parametra.com/xml/parametra}EmpleadoOBJ"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "empleadoOBJ"
})
@XmlRootElement(name = "EmpleadoResponse")
public class EmpleadoResponse {

    @XmlElement(name = "EmpleadoOBJ", required = true)
    protected EmpleadoOBJ empleadoOBJ;

    /**
     * Obtiene el valor de la propiedad empleadoOBJ.
     * 
     * @return
     *     possible object is
     *     {@link EmpleadoOBJ }
     *     
     */
    public EmpleadoOBJ getEmpleadoOBJ() {
        return empleadoOBJ;
    }

    /**
     * Define el valor de la propiedad empleadoOBJ.
     * 
     * @param value
     *     allowed object is
     *     {@link EmpleadoOBJ }
     *     
     */
    public void setEmpleadoOBJ(EmpleadoOBJ value) {
        this.empleadoOBJ = value;
    }

}
