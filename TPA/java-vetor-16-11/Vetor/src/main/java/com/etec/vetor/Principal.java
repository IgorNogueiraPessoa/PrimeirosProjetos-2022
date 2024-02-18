
package com.etec.vetor;

public class Principal 
{
  public static int vetorNumeros[] = new int[5];
  public static Vetor vet = new Vetor ();
  
  public static void main(String[] args)
  {
      System.out.println("Vetores...");
      vet.inicializarVetor(vetorNumeros);
      vet.exibirVetor(vetorNumeros);
  }
}
