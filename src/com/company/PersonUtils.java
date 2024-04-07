package com.company;

import java.util.ArrayList;

public class PersonUtils {

    public static double calcularPromedioEdades(ArrayList<Person> personas) {
        if (personas.isEmpty()) {
            return 0; // Si no hay personas, el promedio es cero
        }

        int sumaEdades = 0;

        for (Person persona : personas) {
            sumaEdades += persona.getEdad();
        }

        return (double) sumaEdades / personas.size();
    }

    public static int contarMasculinos(ArrayList<Person> personas) {
        int contador = 0;
        for (Person persona : personas) {
            if (persona.getGenero() == 'M') {
                contador++;
            }
        }
        return contador;
    }

    public static int contarFemeninos(ArrayList<Person> personas) {
        int contador = 0;
        for (Person persona : personas) {
            if (persona.getGenero() == 'F') {
                contador++;
            }
        }
        return contador;
    }
}