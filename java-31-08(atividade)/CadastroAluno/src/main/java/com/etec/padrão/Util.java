/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrão;

import javax.swing.JOptionPane;
import com.etec.padrão.Aluno;

/**
 *
 * @author dti
 */
public class Util 
{

    Aluno aluno = new Aluno();
    
    
    public void digitarNome()
    {
      aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
    }

    public void digitarIdade()
    {
      aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno")));
    }       
            
    public void digitarAltura()
    {
      aluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do aluno")));
    }   
    
    public void digitarPaulistano()
    {
      aluno.setPaulistano(Boolean.parseBoolean (JOptionPane.showInputDialog("O aluno é paulistano?")));
    } 



}
