package edu.ucjc.programacion.pec1.vittorio_ferone;

public class Colegio {
    private String nombre;
    private String direccion;
    private Aula[] aulas;

    public Colegio(String nombre, String direccion, int numAulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aulas = new Aula[numAulas];

        // Inicializa las aulas
        for (int i = 0; i < numAulas; i++) {
            aulas[i] = new Aula(i + 1, 1);
        }
    }

    public void asignarAlumno(Alumno alumno) {
        boolean asignado = false;
        for (Aula aula : aulas) {
            Alumno[] asientos = aula.getAsientos();
            for (int i = 0; i < asientos.length; i++) {
                if (asientos[i] == null) {
                    asientos[i] = alumno;
                    asignado = true;
                    System.out.printf("Alumno %s (%s) asignado al aula %d, asiento %d%n",
                            alumno.getNombre(), alumno.getDni(), aula.getNumero(), i + 1);
                    break;
                }
            }
            if (asignado) {
                break;
            }
        }

        if (!asignado) {
            System.out.printf("No hay asientos disponibles para el alumno %s (%s)%n", alumno.getNombre(), alumno.getDni());
        }
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Aula[] getAulas() {
        return aulas;
    }

    public void setAulas(Aula[] aulas) {
        this.aulas = aulas;
    }
}