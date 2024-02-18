

package com.etec.padrao.exercicio3;

import java.util.Scanner;

public class principal 
{
 public static Scanner teclado = new Scanner(System.in); 
 
 public static float kg;
 
 public static double multa;
 
public static void main(String args [])
    {
      System.out.println("Digite a quantidade de quilos pescados.");  
      kg = teclado.nextFloat();
      
      if(kg>50)
      {
       multa=(kg-50)*4;
       System.out.printf("Uma multa deverá ser paga no valor de: R$%.2f %n",multa);     
       System.exit(0);
      }
      else      
      {
          System.out.println("Não há multa a ser aplicada.");
          System.exit(0);
      }
      
    }


    
}
