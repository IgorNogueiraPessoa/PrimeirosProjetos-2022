

package com.etec.exercicio1for;

import java.util.Scanner;

public class Principal 
{

   public static Scanner teclado = new Scanner(System.in);   
   public static int num = 0;
   public static int res = 0;
public static void main(String args[])
{
    
    System.out.println("Digite o número de 1 a 10 para cálculo da tabuada.");
    num = teclado.nextInt();
    if(num>10 || num<=0)
    {
        System.out.println("DE 1 A 10");
    }
    else
    {
    for (int cont = 0 ; cont <= 10; cont++)
    {
    res = (num*cont);
    
    System.out.println(num+"x"+cont+"="+res);
    }
    }
    
    
    
}
}
