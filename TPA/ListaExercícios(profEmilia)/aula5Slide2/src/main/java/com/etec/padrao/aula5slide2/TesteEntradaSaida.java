/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao.aula5slide2;

/**
 *
 * @author henrr
 */
import javax.swing.JOptionPane;
public class TesteEntradaSaida {
    public static void main (String[] args)
    {
        String numero = JOptionPane.showInputDialog("Digite um numero");
        
        JOptionPane.showMessageDialog(null, "O número digitado foi: "+ numero);
       
    } 
    
}
