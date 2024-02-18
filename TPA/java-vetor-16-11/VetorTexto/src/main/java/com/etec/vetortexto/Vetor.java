
package com.etec.vetortexto;

class Vetor 
{
 void exibirVetorPorLetra(String[] _vetor)
 {
     for (int contador = 0; contador< _vetor.length; contador++)
     {
         System.out.println("Indice =>" + "/ Letra =>" + _vetor[contador]);
     }
 }
  void exibirVetorPorLinha(String[] _vetor)
  {
      System.out.print("Nome: ");
      
      for(int contador = 0; contador<_vetor.length;contador++)
      {
          System.out.print(_vetor[contador]);
      }
  }
}
