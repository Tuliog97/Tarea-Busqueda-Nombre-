package sample.modelos;

import java.util.ArrayList;

/**
 * Created by T. Garcia on 23/10/2017.
 */
public class Persona {
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String nombre;
    public String apellido;
    public int edad;
    private static Persona[] personas = {
            new Persona("David", "Delcid", 20),
            new Persona("Tulio", "Garcia", 20),
            new Persona("David", "Martinez", 20),
            new Persona("Oscar", "Diaz", 20),
            new Persona("Orlando", "Calix", 20),
            new Persona("Yarince", "Padilla", 21),
            new Persona("Felix", "Peralta", 21),

    };

    public static Persona buscarPorPosicion(int posicion) {
        try {
            return personas[posicion];
        } catch (IndexOutOfBoundsException e) {

            return null;

        }

    }

    public static Persona busqueda(String buscar) {
        for (int i = 0; i < personas.length; i++) {
            if (buscar.equals(personas[i].nombre)) {

                return personas[i];

            }
        }
        return null;
    }


}
