package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String answer="Yes";

        ArrayList<Person> personas = new ArrayList<>();

        do {
            System.out.println("Ingrese el nombre:");
            String nombre = inputData.nextLine();

            System.out.println("Ingrese el apellido:");
            String apellido = inputData.nextLine();

            System.out.println("Ingrese el género (M/F):");
            char genero = inputData.nextLine().toUpperCase().charAt(0); // Convertir a mayúsculas

            System.out.println("Ingrese la edad:");
            int edad = Integer.parseInt(inputData.nextLine());

            // Creación de una instancia de Persona utilizando el constructor y agregándola a la lista
            personas.add(new Person(nombre, apellido, genero, edad));

            System.out.println("¿Desea ingresar otra persona? (Yes/No):");
            answer = inputData.nextLine();
        } while (answer.equalsIgnoreCase("Yes"));

        System.out.println("¿Desea ver la lista de personas ingresadas? (Yes/No):");
        answer = inputData.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.println("\nLista de personas ingresadas:");
            for (Person persona : personas) {
                System.out.println("Nombre: " + persona.getNombre() + ", Apellido: "
                        + persona.getApellido() + ", Género: " + persona.getGenero() + ", Edad: "
                        + persona.getEdad());
            }
        }

        System.out.println("¿Desea ver el promedio de edades? (Yes/No):");
        answer = inputData.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            // Calcular y mostrar el promedio de las edades capturadas
            double promedioEdades = PersonUtils.calcularPromedioEdades(personas);
            System.out.println("\nPromedio de edades: " + promedioEdades);
        }

        System.out.println("¿Desea ver la cantidad de personas por género? (Yes/No):");
        answer = inputData.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            // Mostrar la cantidad de personas por género
            System.out.println("\nIngrese el género (M/F):");
            char generoConsulta = inputData.nextLine().toUpperCase().charAt(0); // Convertir a mayúsculas

            switch (generoConsulta) {
                case 'M':
                    int cantidadMasculinos = PersonUtils.contarMasculinos(personas);
                    System.out.println("Cantidad de personas masculinas: " + cantidadMasculinos);
                    break;
                case 'F':
                    int cantidadFemeninos = PersonUtils.contarFemeninos(personas);
                    System.out.println("Cantidad de personas femeninas: " + cantidadFemeninos);
                    break;
                default:
                    System.out.println("Género no válido.");
            }
        }
    }
}
