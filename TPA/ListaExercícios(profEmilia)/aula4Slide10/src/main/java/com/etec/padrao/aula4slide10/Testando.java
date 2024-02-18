/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao.aula4slide10;

/**
 *
 * @author henrr
 */
public class Testando {
    public static void main(String[] args)
    {
        String str = "Isto é uma string do Java";
        String xyz = new String ("Isto é uma string do java");
        //maneira errada de comparar string, portanto dará diferente
        if (str==xyz)
             System.out.println("IGUAL");
        else
             System.out.println("DIFERENTE");
        //maneira certa de comparar string
        if (str.equals(xyz))
        System.out.println("Tamanho: "+str.length());
        System.out.println("Substring: "+ str.substring(0,10));
        System.out.println("Caracter na posição S: "+ str.charAt(5));
        // outros métodos
        //quebra sempre que encontrar espaços 
        String palavras[]=str.split(" ");
        System.out.println("Paalavras: "+ palavras[0]);
        System.out.println("Paalavras: "+ palavras[1]);
        System.out.println("Paalavras: "+ palavras[2]);
        //aponta o index
        int i = str.indexOf("uma");
        System.out.println("Indice "+ i);//o indice conta a partir de 0
        //compara o inicio e o fim da string
        boolean teste =(str.startsWith("Olá") || str.endsWith("Mundo"));
        System.out.println("Resultado "+teste);
        //elimina espaços vazios no inicio e fim da string
        str=str.trim();
        System.out.println(str);
        //substitui caracter
        str=str.replace('a','@');
        System.out.println(str);
        //substitui palavra
        str=str.replaceAll("string","cadeia de caracteres");
        System.out.println(str);
        
    }
}
