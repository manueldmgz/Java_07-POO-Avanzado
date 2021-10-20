package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.encapsulamiento.ejercicio.Person;
import com.generation.paquete2.Animal;
import sun.lwawt.macosx.CSystemTray;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;
    public static float suma;

    public static void main (String[] args) {


        System.out.println("Antes de hacer la división");

        try {
            division = numerador / denominador;
        } catch (NullPointerException ex) {
            ex.getMessage();
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            ex.getMessage();
            System.out.println("Exception");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Gracias por participar");
        }

        suma = numerador + denominador;

        System.out.println(suma);

        System.out.println("Después de la división");






    /* public static void main(String[] args) {
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
