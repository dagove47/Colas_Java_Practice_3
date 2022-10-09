package Colas_Java_Practice_3;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Persona {
    helper help = new helper();
    private int id;
    private int edad;
    private String nombre;
    private int discapacidad;

    public Persona() {
    }

    public Persona(int id, int edad, String nombre, int discapacidad) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.discapacidad = discapacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(int discapacidad) {
        this.discapacidad = discapacidad;
    }

    public void solicitarDatos(){
        help.imprimeMensaje("A continuación deberá rellenar los siguientes datos para ser agregados a la cola: ");
        this.nombre = help.recibeString("Ingrese su nombre: ");
        this.id = help.recibeInt("Ingrese su número de cédula: ");
        this.edad = help.recibeInt("Ingrese su edad: ");
        preferencial(this.edad);
    }

    public boolean preferencial(int edad){
        boolean personaPreferencial = false;

        this.discapacidad = help.recibeInt("Tiene usted alguna discapacidad?\n\t1.Sí\n\t2.No" +
                "\nSeleccione su condición (1-2): ");
        if (edad >= 65 || this.discapacidad == 1){
            personaPreferencial = true;
            return personaPreferencial;
        }else{
            personaPreferencial = false;
            return personaPreferencial;
        }
    }


}
