
package com.etec.vetortexto;


public class Principal 
{
 public static String vetorNome[] = {"S" , "a", "o", " ", "P", "a", "u", "l", "o"};
 
 public static Vetor vet = new Vetor();
 
 public static void main(String[] args)
 {
     System.out.println("Vetores...");
     vet.exibirVetorPorLetra(vetorNome);
     System.out.println("");
     vet.exibirVetorPorLinha(vetorNome);
     System.out.println("");
 }
    
}
