package com.generation;

import com.generation.paquete2.Animal;

public class Persona {

    // Modificador de acceso privado nos permite acceder solo dentro de la misma clase

    private String nombre;
    private int edad;

    Animal animal = new Animal();
    //Animal.nombre = "Iguana";

    void saludar(){
        System.out.println("Hola");
    }
}
