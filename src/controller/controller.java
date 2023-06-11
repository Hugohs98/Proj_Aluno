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
import javax.swing.JOptionPane;
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
    
        public static void deleteStudent(PainelDeAcao studentPanel){
        if(JOptionPane.showConfirmDialog(null, "Todas as informações serão deletadas", "Deseja excluir esse(a) Aluno(a)?", JOptionPane.YES_NO_OPTION) == 0){
            alunoDAO alunoDao = new alunoDAO();
            alunoDao.excluir(studentPanel.aluno);
            showStudents();
        }
    }

    public static void updateStudent(PainelDeAcao studentPanel){
        if(JOptionPane.showConfirmDialog(null, "O cadastro do Aluno sera editado", "Deseja alterar esse(a) aluno(a)?", JOptionPane.YES_NO_OPTION) == 0){
            alunoDAO alunoDao = new alunoDAO();
            alunoDao.atualizar(studentPanel.aluno);
            showStudents();
        }
  }
    
}
