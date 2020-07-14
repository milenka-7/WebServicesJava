/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen.pregunta.alumno;

/**
 *
 * @author Milenka
 */
public class alumno {
    private int idAlumno;
    private String nombreAlumno;
    private String apellidoAlumno;
    private String fechanacAlumno;
    public alumno(){    
    
}
    public int getIdAlumno(){
        return idAlumno;
    }
    public void setIdAlumno(int idAlumno){
        this.idAlumno=idAlumno;
    }
     public String getNombreAlumno(){
        return nombreAlumno;
    }
    public void setNombreAlumno(String nombreAlumno){
        this.nombreAlumno=nombreAlumno;
    }
     public String getApellidoAlumno(){
        return apellidoAlumno;
    }
    public void setApellidoAlumno(String apellidoAlumno){
        this.apellidoAlumno=apellidoAlumno;
    }
     public String getFechanacAlumno(){
        return fechanacAlumno;
    }
    public void setFechanacAlumno(String fechanacAlumno){
        this.fechanacAlumno=fechanacAlumno;
    }
    
}