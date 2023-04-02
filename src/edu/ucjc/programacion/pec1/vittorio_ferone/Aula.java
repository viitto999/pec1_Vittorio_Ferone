package edu.ucjc.programacion.pec1.vittorio_ferone;

public class Aula {
    private int numero;
    private int planta;
    private Alumno[] asientos;

    public Aula(int numero, int planta) {
        this.numero = numero;
        this.planta = planta;
        this.asientos = new Alumno[3]; // Inicializa el array de asientos con capacidad para 3 alumnos
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public Alumno[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Alumno[] asientos) {
        this.asientos = asientos;
    }
}