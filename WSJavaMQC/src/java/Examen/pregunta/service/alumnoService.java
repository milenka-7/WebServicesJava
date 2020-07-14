/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.pregunta.service;

import Examen.pregunta.alumno.alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Milenka
 */
public class alumnoService {

    List <alumno> listaAlumnos =new ArrayList <>();
    public alumnoService() {
    }
    public String crearAlumno(String nombreAlumno){
     alumno a= new alumno();
     a.setIdAlumno(listaAlumnos.size()+1);
     a.setNombreAlumno(nombreAlumno);
     listaAlumnos.add(a);
     return "Se agrego"+a.getNombreAlumno();
    }
    public List<alumno> listarAlumno(){
    return listaAlumnos;
    }
}
