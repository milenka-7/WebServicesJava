
package alumno.examen.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearAlumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearAlumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearAlumno", propOrder = {
    "nomAlumno"
})
public class CrearAlumno {

    protected String nomAlumno;

    /**
     * Obtiene el valor de la propiedad nomAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomAlumno() {
        return nomAlumno;
    }

    /**
     * Define el valor de la propiedad nomAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomAlumno(String value) {
        this.nomAlumno = value;
    }

}
