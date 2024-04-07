package com.company;
public class Person {
    // Propiedades privadas
    private String nombre;
    private String apellido;
    private char genero;
    private int edad;

    // Constructor
    public Person(String nombre, String apellido, char genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    // Métodos para acceder a las propiedades (getters)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
}
