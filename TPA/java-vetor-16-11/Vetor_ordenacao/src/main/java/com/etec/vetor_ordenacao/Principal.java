
package com.etec.vetor_ordenacao;



public class Principal 
{

 public static int vetorNumeros[] = {5, 9, 0, 1, 2, 7, 8, 3, 6, 4};
 
 public static Vetor vet = new Vetor();
 
 public static void main(String[] args)
 {
     System.out.println("Vetores...");
     
     vet.exibirVetor(vetorNumeros);
     vet.ordenarVetor(vetorNumeros);
 }
 
}
