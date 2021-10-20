package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.encapsulamiento.ejercicio.Person;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
        Person person= new Person("Santiago", 33, "102045455");

        person.setName("Manuel");
        person.setAge(62);
        person.setId("0192830193");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getId());







        //Ejercicio Cuenta Bancaria
        /*
        CuentaBancaria cuenta = new CuentaBancaria();

    cuenta.setNombre("José Manuel");
    cuenta.setClave("ABC-100092");
    cuenta.setSaldo(150000000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
 */

        /*
        Animal animal = new Animal();
        animal.nombre = "Iguana";

       Persona persona = new Persona();
        persona.nombre = "Carlos";
        persona.edad = 31; */
    }
}
