
package com.etec.vetor_ordenacao;



class Vetor 
{
 void exibirVetor(int[] _vetor)
 {
     System.out.print("Vetor = [");
     
     for (int contador = 0; contador< _vetor.length ; contador++)
     {
       if (contador == _vetor.length - 1)
       {
           System.out.print(_vetor[contador] + "]\n");
       }
       else
       {
           System.out.print(_vetor[contador] + " , ");  
       }
       
     }
 }
 
 void ordenarVetor(int[] _vetor)
 {
    int auxiliar = 0;
    
    for(int cont1 = 0; cont1<_vetor.length;cont1++)
    {
       for (int cont2 = cont1 + 1;cont2<_vetor.length;cont2++)
       {
          if (_vetor[cont1]>_vetor[cont2])
          {
              auxiliar = _vetor[cont2];
              _vetor[cont2] = _vetor[cont1];
              _vetor[cont1] = auxiliar;
          }
           System.out.print("cont1 = " + cont1 + "/ cont2 = " + cont2 + " / ");
           
           this.exibirVetor(_vetor);
       }
    }   
 }
}
