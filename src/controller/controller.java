/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import BotaoEdicaoAlunos.PainelDeAcao;
import dao.alunoDAO;
import gui.AlunoGUI;
import java.awt.Dimension;
import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author hugoh
 */
public class controller {
    
    public static void showStudents(){


      alunoDAO dao=new alunoDAO();
          ArrayList<Aluno> lista = dao.getAllAlunos();
          int contador=0;
          
          AlunoGUI.painelInserirAlunos1.removeAll();
          //ClienteGUI.atividadesGui1.painelInserirAlunos.removeAll();
          
          for (Aluno aluno:lista){
  
              PainelDeAcao painel=new PainelDeAcao(aluno);
              //PainelDeAcao2 painel1=new PainelDeAcao2(student);
              painel.getCmdView().setVisible(false);
              //ClienteGUI.atividadesGui1.painelInserirAlunos.add(painel1);
              AlunoGUI.painelInserirAlunos1.add(painel);

              contador++;
              
          }

          AlunoGUI.painelInserirAlunos1.setPreferredSize(new Dimension(901, 50*contador));
          AlunoGUI.painelInserirAlunos1.revalidate();
          AlunoGUI.painelInserirAlunos1.repaint();
         
    }
    
}
