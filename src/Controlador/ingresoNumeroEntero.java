/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.HeadlessException;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ingresoNumeroEntero {
    Scanner scan = new Scanner(System.in);
     public int definirTamañoLista(){
        int tamanoLista = 0;
       
        System.out.println("Ingrese el tamaño del arreglo");
        tamanoLista=scan.nextInt();
        if(tamanoLista<0){
           System.out.println("Error debe ingresar un numero mayor a cero"); 
           definirTamañoLista();
        }
       
    return tamanoLista;}
     
     public int[] ingresoVector(int tamano){
        int[] numerosVector=new int[tamano];
        for(int i=0;i<tamano;i++){
            System.out.println("Ingrese un número");
        numerosVector[i]=scan.nextInt();
        }
      
        
       
    return numerosVector; }
   
}
