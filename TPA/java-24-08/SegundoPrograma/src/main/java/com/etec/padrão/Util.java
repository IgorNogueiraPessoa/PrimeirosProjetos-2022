/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrão;

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;


public class Util //declaração dos atributos
{
  
    
    
private String texto; //método construtor
    
    
    
public Util()
{
    System.out.println("Construtor executado...");
}
    
//método Set´s e Get´s (encapsulado)

    /**
     * @return the texto
     */
    public String getTexto() 
    {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) 
    {
        this.texto = texto;
    }


    //exibirTexto
    
    public void exibirTexto()
    {
      JOptionPane.showMessageDialog(null , "Uhuu, seu primeiro programa..." + "\n" + this.getTexto());
    }

    
    //método digitarTexto



    public void digitarTexto()
    {
      this.setTexto(JOptionPane.showInputDialog("Digite seu nome:"));
    }

}
