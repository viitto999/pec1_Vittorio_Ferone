package edu.ucjc.programacion.pec1.vittorio_ferone;

public class GestionColegios {

    public static void main(String[] args) {
        String nombreColegio = "Mi Colegio";
        String direccionColegio = "Avenida Principal 123";
        int numeroAulas = 4;
        int numeroAlumnos = 10;

        Colegio colegio = new Colegio(nombreColegio, direccionColegio, numeroAulas);
        Alumno[] alumnos = UtilsColegio.crearAlumnos(numeroAlumnos);

        asignarAlumnos(alumnos, colegio);
    }

    public static void asignarAlumnos(Alumno[] alumnos, Colegio colegio) {
        for (Alumno alumno : alumnos) {
            colegio.asignarAlumno(alumno);
        }
    }
}