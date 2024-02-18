
package com.etec.cadastroaluno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal 
{ 
    public static Scanner teclado = new Scanner(System.in);
    
  
    public static String nome = "";
    
    public static int idade;
    
    public static float altura = 0;
    
    public static boolean paulistano;
    
    public principal() {
    }
     
    public static void main(String args [])
    {
      
        System.out.println("Seja bem vindo á aplicação de cadastro do aluno!");
        System.out.println("Digite o nome do aluno: ");
        
        nome = teclado.nextLine();
        if(nome.equals(""))
        {
            System.out.println("Erro! Variável nula");   
            System.exit(0); 
        }
       
         
        try
        {
        System.out.println("Digite a idade: ");
        
        idade = teclado.nextInt();
        
      
        if (idade<=0)
        {
            System.out.println("Número inválido!");
            System.exit(0);
        }
        
        }
        catch (InputMismatchException e1)
        {
            System.out.println("Um erro ocorreu com a idade!(tipo de dados): " + e1.getMessage()); 
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
            System.out.println("Um erro ocorreu ao armazenar a idade (variavel nula): " +e2.getMessage());  
            System.out.println("Tenta novamente! : (*");
            System.exit(0);            
        }
        
        
        try
        {
        System.out.println("Digite a altura do aluno(com vírgula): ");
        
        altura = teclado.nextFloat();
        
        
        
        if (altura<=0)
        {
        System.out.println("Número inválido!");
        System.exit(0);
        }
        else
        {
          if(altura>=4)
          {
              System.out.println("Número inválido!"); 
              System.exit(0);
          }
            
        }
        
        
        }
        
        catch (InputMismatchException e1)
        {
            System.out.println("Ocorreu um erro ao armazenar a altura (tipo de dados): "+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
            System.out.println("Um erro ocorreu ao armazenar a altura (variavel nula): " +e2.getMessage());  
            System.out.println("Tenta novamente! : (*");
            System.exit(0);            
        }
        
       
        try
        {
        System.out.println("É paulistano? (digite true se sim e false se não) ");
        
        paulistano = teclado.nextBoolean(); 
        }
       
        catch (InputMismatchException e1)
        {
            System.out.println("Ocorreu um erro ao armazenar a regionalidade (tipo de dados): "+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
            System.out.println("Um erro ocorreu ao armazenar a regionalidade (variavel nula): " +e2.getMessage());  
            System.out.println("Tenta novamente! : (*");
            System.exit(0);            
        }
       
       
       
       
       
        System.out.println("O nome do aluno é " + nome + ", a idade é " + idade + " e a altura é " + altura + ". Paulistano: " + paulistano);
        
        System.out.println("Dados cadastrados com sucesso!");
        
         
    }
    
}
