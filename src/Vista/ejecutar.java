/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.io.IOException;
import java.util.Scanner;
import Controlador.ingresoNumeroEntero;
import Controlador.imprimir;
import Metodos.Ordenamiento;
/**
 *
 * @author Cristian
 */
public class ejecutar {

    public static void main(String[] args) {
  int[] vector=null;      
  int tamanoVector;
ingresoNumeroEntero numeroEntero = new ingresoNumeroEntero();
tamanoVector = numeroEntero.definirTamañoLista();
vector = numeroEntero.ingresoVector(tamanoVector);
Ordenamiento orden = new Ordenamiento();
vector= orden.burbuja(vector, tamanoVector);
imprimir impr = new imprimir();
impr.resultadoOrdenado(vector, tamanoVector);


    }
    
   
    
}
