/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Cristian
 */
public class imprimir {
    public static void resultadoOrdenado(int[] vectorInicial, int tamanoVector){
           
        int vectorFinal[]= vectorInicial;
        for(int i = 0; i < vectorFinal.length; i++)
        {
       System.out.print(vectorFinal[i]+" ");
        } 
    System.out.println("");
    }
}
