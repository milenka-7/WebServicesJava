
package alumno.examen.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the alumno.examen.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarAlumnoResponse_QNAME = new QName("http://WebService.Examen/", "listarAlumnoResponse");
    private final static QName _CrearAlumnoResponse_QNAME = new QName("http://WebService.Examen/", "crearAlumnoResponse");
    private final static QName _CrearAlumno_QNAME = new QName("http://WebService.Examen/", "crearAlumno");
    private final static QName _ListarAlumno_QNAME = new QName("http://WebService.Examen/", "listarAlumno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: alumno.examen.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearAlumnoResponse }
     * 
     */
    public CrearAlumnoResponse createCrearAlumnoResponse() {
        return new CrearAlumnoResponse();
    }

    /**
     * Create an instance of {@link ListarAlumnoResponse }
     * 
     */
    public ListarAlumnoResponse createListarAlumnoResponse() {
        return new ListarAlumnoResponse();
    }

    /**
     * Create an instance of {@link ListarAlumno }
     * 
     */
    public ListarAlumno createListarAlumno() {
        return new ListarAlumno();
    }

    /**
     * Create an instance of {@link CrearAlumno }
     * 
     */
    public CrearAlumno createCrearAlumno() {
        return new CrearAlumno();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.Examen/", name = "listarAlumnoResponse")
    public JAXBElement<ListarAlumnoResponse> createListarAlumnoResponse(ListarAlumnoResponse value) {
        return new JAXBElement<ListarAlumnoResponse>(_ListarAlumnoResponse_QNAME, ListarAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.Examen/", name = "crearAlumnoResponse")
    public JAXBElement<CrearAlumnoResponse> createCrearAlumnoResponse(CrearAlumnoResponse value) {
        return new JAXBElement<CrearAlumnoResponse>(_CrearAlumnoResponse_QNAME, CrearAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.Examen/", name = "crearAlumno")
    public JAXBElement<CrearAlumno> createCrearAlumno(CrearAlumno value) {
        return new JAXBElement<CrearAlumno>(_CrearAlumno_QNAME, CrearAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.Examen/", name = "listarAlumno")
    public JAXBElement<ListarAlumno> createListarAlumno(ListarAlumno value) {
        return new JAXBElement<ListarAlumno>(_ListarAlumno_QNAME, ListarAlumno.class, null, value);
    }

}
