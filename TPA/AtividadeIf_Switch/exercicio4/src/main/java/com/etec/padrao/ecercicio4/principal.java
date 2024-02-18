
package com.etec.padrao.ecercicio4;

import java.util.Scanner;

public class principal 
{
  public static Scanner teclado = new Scanner(System.in);   
  
  public static String senha;
  
  public static void main(String args[])
  {
      System.out.println("Digite a senha.");
      senha = teclado.nextLine();
      

      if("carpediem".equals(senha))
      {
          System.out.println("senha correta. Acesso liberado.");
          System.exit(0);
      }  
      else
      {
          System.out.println("Senha incorreta. Tente novamente!");
      }
      
        
  }
    
    
    
}
