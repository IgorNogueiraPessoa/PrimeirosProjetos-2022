
package com.etec.vetor;

import java.util.Scanner;

public class Vetor 
{
  Scanner scanner=new Scanner(System.in);
  
  void inicializarVetor(int _vetor[])
  {
      for (int contador = 0; contador<_vetor.length; contador++)
      {
          System.out.println("Digite um número inteiro para a posição " +contador+"; ");
          _vetor[contador] = scanner.nextInt();
          
      }
      System.out.println("Vetor inicializando...");
  }

   void exibirVetor(int _vetor[])
   {
       System.out.print("Vetor = [");
       
       for (int contador=0; contador< _vetor.length; contador++)
       {
          if (contador == _vetor.length-1) 
          {
              System.out.print(_vetor[contador] + "]");
          } 
          else
          {
              System.out.print(_vetor[contador] + " , ");
          }
       }
   }
}
