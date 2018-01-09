/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Cristian
 */
public class Ordenamiento {
        public static int[] burbuja(int[] vectorInicial, int tamanoVector){
           
        int vectorFinal[]= vectorInicial;
       
       for(int i = 0; i < vectorFinal.length - 1; i++)
        {
            for(int j = 0; j < vectorFinal.length - 1; j++)
            {
                if (vectorFinal[j] < vectorFinal[j + 1])
                {
                    int tmp = vectorFinal[j+1];
                    vectorFinal[j+1] = vectorFinal[j];
                    vectorFinal[j] = tmp;
                }
            }
        } 
            System.out.println("Metodo Burbuja");
        return vectorFinal;
    }
        
    public static void shell(int A[]){
   int salto, aux, i;
   boolean cambios;
   for(salto=A.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ // Mientras se intercambie algún elemento
                       cambios=false;
                       for(i=salto; i< A.length; i++) // se da una pasada
                               if(A[i-salto]>A[i]){ // y si están desordenados
                                     aux=A[i]; // se reordenan
                                     A[i]=A[i-salto];
                                     A[i-salto]=aux;
                                     cambios=true; // y se marca como cambio.
                               }
                        }
            }
   System.out.println("Metodo Shell");
}
      public static void quick_srt(int array[],int low, int n){
      int lo = low;
      int hi = n;
      if (lo >= n) {
          return;
      }
      int mid = array[(lo + hi) / 2];
      while (lo < hi) {
          while (lo<hi && array[lo] < mid) {
              lo++;
          }
          while (lo<hi && array[hi] > mid) {
              hi--;
          }
          if (lo < hi) {
              int T = array[lo];
              array[lo] = array[hi];
              array[hi] = T;
          }
      }
      if (hi < lo) {
          int T = hi;
          hi = lo;
          lo = T;
      }
      quick_srt(array, low, lo);
      quick_srt(array, lo == low ? lo+1 : lo, n);
      System.out.println("Metodo QuickSort");
   }
}


