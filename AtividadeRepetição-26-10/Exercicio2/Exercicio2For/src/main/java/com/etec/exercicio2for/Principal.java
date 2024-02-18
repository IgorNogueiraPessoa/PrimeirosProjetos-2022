
package com.etec.exercicio2for;

import java.util.Scanner;

public class Principal 
{

   public static Scanner teclado = new Scanner(System.in);   
   public static int num;
   public static int res;
  
public static void main(String args[])
{
    
    System.out.println("Digite o número para cálculo fatorial.");
    num = teclado.nextInt();
    res = num;
    if(num==0 || num==1)
    {
        System.out.println("O fatorial de "+num+" é: 1");
    }
    else
    {
    if (num<0)
    {
        System.out.println("Não existe fatorial de negativo!");
    }
    else
    {
    for (int i=1 ; i<num; i++)
    {
    res = res*i; 
    }
    System.out.println("O fatorial de "+num+" é: "+res);
    }
    }
    
    
    
}
}
