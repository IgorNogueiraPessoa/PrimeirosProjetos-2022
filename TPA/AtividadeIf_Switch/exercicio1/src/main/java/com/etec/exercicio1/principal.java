
package com.etec.exercicio1;

import java.util.Scanner;

public class principal 
{
   public static Scanner teclado = new Scanner(System.in);   
   
   public static float a;
   
   public static float b;
   
   public static float c;
   
   public static float x1;
   
   public static float x2;
   
   public static float delta;
   
  
   
    public static void main (String args[])
    {
        System.out.println("Digite o valor de a");
        a = teclado.nextFloat();
        
        System.out.println("Digite o valor de b");
        b = teclado.nextFloat();
        
        System.out.println("Digite o valor de c");
        c = teclado.nextFloat();
        
        delta = (b*b)-4*a*c;
        if (delta>=0)
        {
          x1 = (float) ((-b+(Math.sqrt(delta)))/(2*a));
          
          x2 = (float) ((-b-(Math.sqrt(delta)))/(2*a));
          
            System.out.printf("O valor de x1 é: %.2f %n",x1);
            System.out.printf("O valor de x2 é: %.2f %n",x2);
            System.exit(0);
        }
        else
        {
            System.out.println("Não é possível realizar a operação com um numero negativo!"); 
            System.exit(0);
        }  
    }
    
}
