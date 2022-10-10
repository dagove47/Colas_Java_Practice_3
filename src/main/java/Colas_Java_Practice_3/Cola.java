/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas_Java_Practice_3;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
    }
    
    public void encola(Nodo newNodo){
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            ultimo.setNodoAnterior(newNodo);
            ultimo=newNodo;
        }
    }
    
    public void preferencial(Nodo newNodo) {
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            newNodo.setNodoAnterior(frente);
            frente = newNodo;
        }
    }
    
    public boolean buscar(int num) {
        boolean result = false;
        Nodo aux = frente;
        while(aux != null){
            if(num == aux.getCedula()){
                result = true;
            }
            aux=aux.getNodoAnterior();
        }
        return result;
    }
    
    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            frente=frente.getNodoAnterior();
            aux.setNodoAnterior(null);
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String s="";
        Nodo aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getNodoAnterior();
        }
        return s;
    }
}
