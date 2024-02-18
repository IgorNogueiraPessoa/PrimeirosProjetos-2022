
package com.etec.terminal;

import java.util.Scanner;

public class Principal 
{
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome;
    
    public static int idade;
    
    public static float altura;
    
    public static boolean paulistano;

    public Principal() {
    }
    
    public static void main(String args [])
    {
        System.out.println("Seja bem vindo á aplicação de cadastro do aluno!");
        
        System.out.println("Digite o nome do aluno: ");
        
        nome = teclado.nextLine();
        
        System.out.println("Digite a idade: ");
        
        idade = teclado.nextInt();
        
        System.out.println("Digite a altura do aluno(com vírgula): ");
        
        altura = teclado.nextFloat();
        
        System.out.println("É paulistano? (digite true se sim e false se não) ");
        
        paulistano = teclado.nextBoolean(); 
        
        System.out.println("O nome do aluno é " + nome + ", a idade é " + idade + " e a altura é " + altura + ". Paulistano: " + paulistano);
        
        System.out.println("Dados cadastrados com sucesso!");
        
         
    }
    
}
