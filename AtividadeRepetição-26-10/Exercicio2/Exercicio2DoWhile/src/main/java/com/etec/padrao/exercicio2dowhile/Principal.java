
package com.etec.padrao.exercicio2dowhile;

import java.util.Scanner;

public class Principal  
{
   public static Scanner teclado = new Scanner(System.in);   
   public static int num = 0;
   public static int res = 0; 
   public static int i = 0;
public static void main(String args[])
{
    
    System.out.println("Digite o número para o cálculo fatorial.");
    num = teclado.nextInt();
    res=num;
    if(num==0 || num==1)
    {
        System.out.println("O fatorial de "+num+" é: 1");
    }
    else
    {
     do
    {  
      i++;
      res=(res*i);
    }
    while(i<num-1);
    System.out.println("O fatorial de "+num+" é: "+res);  
    }
    
    
    
}
}
