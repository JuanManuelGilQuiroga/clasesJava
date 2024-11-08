package persona;

import persona.Persona;

import java.util.Scanner;

public class PruebaPersona {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var Persona1 = new Persona();
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        Persona1.setNombre(nombre);
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine();
        Persona1.setApellido(apellido);
        Persona1.Saludo();
    }
}
