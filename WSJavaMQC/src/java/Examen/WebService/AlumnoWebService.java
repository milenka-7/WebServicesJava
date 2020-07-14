/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.WebService;

import Examen.pregunta.alumno.alumno;
import Examen.pregunta.service.alumnoService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Milenka
 */
@WebService(serviceName = "AlumnoWebService")
public class AlumnoWebService {
    
    alumnoService AlumnoService =new alumnoService();
    
    @WebMethod(operationName = "crearAlumno")
    public String crearAlumnos(@WebParam(name = "nomAlumno") String nomAlumno) {
        return AlumnoService.crearAlumno(nomAlumno);
    }
    @WebMethod(operationName = "listarAlumno")
    public List<alumno> listarAlumno()  {
        return AlumnoService.listarAlumno();
    }
}
