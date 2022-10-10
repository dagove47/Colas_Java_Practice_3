/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas_Java_Practice_3;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Nodo {
    private String nombre;
    private int cedula;
    private Nodo nodoAnterior;
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    public Nodo(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public Nodo() {}
    
    @Override
    
    public String toString() {
        return nombre;
    }
}
