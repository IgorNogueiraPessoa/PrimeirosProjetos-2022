
package com.etec.padrao.exercicio9;

import java.util.Scanner;
 
public class principal 
{
  public static Scanner teclado = new Scanner(System.in);   
  
  public static float res;
  
  public static float n1;
  
  public static float n2;
  
  public static float n3;
  
  public static float n4;
  
  public static void main (String args[])
  {
      System.out.println("Fechamento de notas do aluno");
      System.out.println("Digite a primeira nota do aluno: ");
      n1 = teclado.nextFloat();
      
      System.out.println("Digite a segunda nota do aluno: ");
      n2 = teclado.nextFloat();
      
      System.out.println("Digite a terceira nota do aluno: ");
      n3 = teclado.nextFloat();
      
      System.out.println("Digite a quarta nota do aluno: ");
      n4 = teclado.nextFloat();
      
      res = (n1+n2+n3+n4)/4;
      
      if(res>=9)
      {
          System.out.println("A nota final do aluno é A, e ele está aprovado.");   
          System.exit(0);
      }
      else
      {
        if(res>=7&&res<9)
        {
            System.out.println("A nota final do aluno é B e ele está aprovado.");
            System.exit(0);
        }
        else
        {
          if(res>=5&&res<7)
          {
              System.out.println("A nota final do aluno é C e ele está aprovado.");
              System.exit(0);
          }
          else
          {
            if(res>=2.5&&res<5)
            {
                System.out.println("A nota final do aluno é D e ele está reprovado.");
                System.exit(0);
            }
            else
            {
              if(res<2.5)
              {
                  System.out.println("A nota final do aluno é E e ele se lascou, está reprovado.");
              }              
            }
          }
        }
      }
      
      
  }

}
