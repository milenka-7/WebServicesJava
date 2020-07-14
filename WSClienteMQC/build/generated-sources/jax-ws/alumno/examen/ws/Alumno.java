
package alumno.examen.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechanacAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAlumno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreAlumno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alumno", propOrder = {
    "apellidoAlumno",
    "fechanacAlumno",
    "idAlumno",
    "nombreAlumno"
})
public class Alumno {

    protected String apellidoAlumno;
    protected String fechanacAlumno;
    protected int idAlumno;
    protected String nombreAlumno;

    /**
     * Obtiene el valor de la propiedad apellidoAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    /**
     * Define el valor de la propiedad apellidoAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoAlumno(String value) {
        this.apellidoAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad fechanacAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechanacAlumno() {
        return fechanacAlumno;
    }

    /**
     * Define el valor de la propiedad fechanacAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechanacAlumno(String value) {
        this.fechanacAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad idAlumno.
     * 
     */
    public int getIdAlumno() {
        return idAlumno;
    }

    /**
     * Define el valor de la propiedad idAlumno.
     * 
     */
    public void setIdAlumno(int value) {
        this.idAlumno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    /**
     * Define el valor de la propiedad nombreAlumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlumno(String value) {
        this.nombreAlumno = value;
    }

}
