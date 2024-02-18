
package com.etec.exercicio7;

import java.util.Scanner;



public class principal 
{
    public static Scanner teclado = new Scanner(System.in);   
    
    public static int num;

    public static void main (String args [])
    {
        System.out.println("Bem vindo ao menu de pedidos.");
        System.out.println("1. BigMac");
        System.out.println("2. Quarteirão");
        System.out.println("3. McChicken");
        System.out.println("4. Cheddar McMelt");
        System.out.println("5. McMax");
        System.out.println("Digite o número referente ao seu pedido.");
        num = teclado.nextInt();
  
        switch(num){
            case 1:System.out.println("O escolhido foi BigMac."); 
            break;
            case 2: System.out.println("O escolhido foi Quarteirão.");
            break;
            case 3: System.out.println("O escolhido foi o McChiken.");
            break;
            case 4: System.out.println("O escolhido foi Cheddar McMelt");
            break;
            case 5: System.out.println("O escolhido foi McMax.");
            break;
            
            default: System.out.println("Dígito inválido!");
        }
        
    }

    
}
