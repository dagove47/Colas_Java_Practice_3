/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Colas_Java_Practice_3;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Colas_Java_Practice_3 {

    public static void main(String[] args) {
        Cola cola = new Cola();
        int loop = 0;
        while(loop == 0) {
            int mainMenu = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero de la accion que desea realizar:\n\n" +
                "0- Salir \n" +
                "1- Solicitar ticket \n" +
                "2- Buscar ticket \n" + 
                "3- Ver fila actual \n\n"));
            switch(mainMenu) {
                case 0:
                    loop = 1;
                    break;
                case 1:
                    String nombre = JOptionPane.showInputDialog(
                        "Digite su nombre:\n\n");
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite su numero de cedula \n\n"));
                    boolean discapacidad = isDiscapacidad();
                    if(discapacidad) {
                        cola.preferencial(new Nodo(nombre, cedula));
                    } else {
                        cola.encola(new Nodo(nombre, cedula));
                    }
                    JOptionPane.showMessageDialog(null,
                            "Fila Actual: \n\n" + cola + "\n\n");
                    break;
                case 2:
                    int buscarNum = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite el numero de"
                            + " cedula que desee buscar en la fila: \n\n"));
                    boolean isNum = cola.buscar(buscarNum);
                    if(isNum) {
                        JOptionPane.showMessageDialog(null, 
                                "El numero de cedula " + buscarNum + 
                                " SI esta en la fila");
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "El numero de cedula " + buscarNum + 
                                " NO esta en la fila");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Fila Actual: \n\n" + cola);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Valor valor incorrecto\n" +
                            "Por favor, digite una de las dos opciones \n");
                    break;
            }
        }
        System.exit(0);      
    }
    
    public static boolean isDiscapacidad() {
        int loop = 0;
        boolean disc = false;
        while(loop == 0) {
            int mainMenu = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero de la accion que desea realizar:\n\n" +
                "Posee alguna discapacidad? \n" +
                "1- Si \n" +
                "2- No \n\n"));
            switch(mainMenu) {
                case 1:
                    disc = true;
                    loop = 1;
                    break;
                case 2:
                    disc = false;
                    loop = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Valor valor incorrecto\n" +
                            "Por favor, digite una de las dos opciones \n");
                    break;
            }
        }
        return disc;
    }
    
    public static void menuBuscar() {
        
    }
    
}
