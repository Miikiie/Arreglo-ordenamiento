/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progfvma006;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author BINNILIDXI
 */
public class ProgFVMA006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[], x, aux;

        x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del arreglo"));

        arreglo = new int[x]; //Le asignamos el numero de elementos al arreglo

        for (int i = 0; i < x; i++) {
            System.out.print((i + 1) + ".Introduzca un numero ");
            arreglo[i] = entrada.nextInt();
        }
        //Metodo burbuja 
        for (int i = 0; i < (x - 1); i++) {
            for (int j = 0; j < (x - 1); j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        //Mostando el arreglo ordenado
        System.out.print("\nArreglo ordenado menor a mayor: ");
        for (int i = 0; i < x; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.print("\nArreglo ordenado de mayor a menor: ");
        for (int i = (x - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("");
    }

}
