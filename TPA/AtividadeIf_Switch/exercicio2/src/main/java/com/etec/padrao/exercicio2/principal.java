
package com.etec.padrao.exercicio2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal 
{
   public static Scanner teclado = new Scanner(System.in); 
   
   public static float peso=0;
   public static float alt=0;
   public static double imc;
    
 public static void main(String args [])
    {
        System.out.println("Cálculo do IMC");
        System.out.println("Digite o seu peso: ");
        peso = teclado.nextFloat();
        
        try
        {
        System.out.println("Digite a sua altura(com vírgula): ");
        
        alt = teclado.nextFloat();
        }
        
        catch (InputMismatchException e1)
        {
            System.out.println("Escreva com vírgula!");
            System.out.println("Tente novamente");
            System.exit(0);
        } 
        
        imc = peso/(alt*alt);
        
        if(imc<18.5)
        {
            System.out.printf("Seu imc é %.2f %n",imc);   
            System.out.println("Você está abaixo do peso");
            System.exit(0);
        }
        else
        {
          if(imc>=18.5&&imc<=24.9) 
          {
            System.out.printf("Seu imc é %.2f %n",imc);   
            System.out.println("Você está no peso ideal.");
            System.exit(0);
          }
          else
          {
           if(imc>=25&&imc<=29.9)   
           {
            System.out.printf("Seu imc é %.2f %n",imc);   
            System.out.println("Você está com sobrepeso.");
            System.exit(0);  
           }
           else
           {
            if(imc>=30&&imc<=34.9)   
            {
            System.out.printf("Seu imc é %.2f %n",imc);   
            System.out.println("Você está com obesidade grau I.");
            System.exit(0);    
            }
            else
            {
             if(imc>=35&&imc<=39.9) 
              {
               System.out.printf("Seu imc é %.2f %n",imc);   
               System.out.println("Você está com obesidade grau II.");
               System.exit(0);   
              }
              else
             {
               if(imc>=40)
               {
                System.out.printf("Seu imc é %.2f %n",imc);   
                System.out.println("Você está com obesidade mórbida");
                System.exit(0); 
               }
               
             }
             
            }
               
           }
           
           
          }
          
            
        }
        
        
    }

    
}
