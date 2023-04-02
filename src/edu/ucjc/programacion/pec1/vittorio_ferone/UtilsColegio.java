package edu.ucjc.programacion.pec1.vittorio_ferone;

import java.util.Scanner;

public class UtilsColegio {
    public static Alumno[] crearAlumnos(int numAlumnos) {
        Alumno[] alumnos = new Alumno[numAlumnos];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numAlumnos; i++) {
            System.out.printf("Ingrese el nombre del alumno %d:%n", i + 1);
            String nombre = scanner.nextLine();

            System.out.printf("Ingrese los apellidos del alumno %d:%n", i + 1);
            String apellidos = scanner.nextLine();

            System.out.printf("Ingrese el DNI del alumno %d:%n", i + 1);
            String dni = scanner.nextLine();

            alumnos[i] = new Alumno(nombre, apellidos, dni);
        }

        scanner.close();
        return alumnos;
    }
}