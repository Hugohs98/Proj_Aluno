package BotaoEdicaoAlunos;



import controller.controller;
import dao.alunoDAO;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import model.Aluno;



public class PainelDeAcao extends javax.swing.JPanel {

    public AcaoBotao getCmdDelete() {
        return cmdDelete;
    }

    public AcaoBotao getCmdEditar() {
        return cmdEditar;
    }

    public JCheckBox getjCheckBox3() {
        return jCheckBox3;
    }
    
    public AcaoBotao getCmdView() {
        return cmdView;
    }
    
    

    public Aluno aluno;

    public PainelDeAcao(Aluno aluno) {
       this.aluno=aluno;
       initComponents();
       Nome.setText(aluno.getNome());
       cpf.setText(aluno.getCpf());
       data.setText(aluno.getDataDeNascimento());
       peso.setText("" + aluno.getPeso());
       altura.setText("" + aluno.getAltura());
       imc.setText(aluno.calculaImc());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        cmdEditar = new BotaoEdicaoAlunos.AcaoBotao();
        cmdDelete = new BotaoEdicaoAlunos.AcaoBotao();
        jCheckBox3 = new javax.swing.JCheckBox();
        cmdView = new BotaoEdicaoAlunos.AcaoBotao();
        cpf = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        altura = new javax.swing.JTextField();
        imc = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();

        jCheckBox2.setText("jCheckBox2");

        setBackground(new java.awt.Color(255, 255, 255));

        cmdEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotaoEdicaoAlunos/edit.png"))); // NOI18N
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotaoEdicaoAlunos/delete.png"))); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        cmdView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotaoEdicaoAlunos/view.png"))); // NOI18N
        cmdView.setToolTipText("");
        cmdView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewActionPerformed(evt);
            }
        });

        cpf.setBackground(new java.awt.Color(255, 255, 255));

        data.setBackground(new java.awt.Color(255, 255, 255));

        peso.setBackground(new java.awt.Color(255, 255, 255));

        altura.setBackground(new java.awt.Color(255, 255, 255));
        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        imc.setBackground(new java.awt.Color(255, 255, 255));
        imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imcActionPerformed(evt);
            }
        });

        Nome.setEditable(false);
        Nome.setBackground(new java.awt.Color(255, 255, 255));
        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpf)
                .addGap(12, 12, 12)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaActionPerformed

    private void imcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imcActionPerformed

    private void cmdViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdViewActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        controller.deleteStudent(this);
    }

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(jCheckBox3.isSelected()){
            Nome.setEditable(true);
            cpf.setEditable(true);
            data.setEditable(true);
            peso.setEditable(true);
            altura.setEditable(true);
        }
        else {
            Nome.setEditable(false);
            cpf.setEditable(false);
            data.setEditable(false);
            peso.setEditable(false);
            altura.setEditable(false);
        }
    }

    private void jTextField1ActionPerformed() {                                            
        // TODO add your handling code here:
    }

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {
        aluno.setNome(Nome.getText());
        aluno.setCpf(cpf.getText());
        aluno.setDataDeNascimento(data.getText());
        controller.updateStudent(this);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField altura;
    private BotaoEdicaoAlunos.AcaoBotao cmdDelete;
    private BotaoEdicaoAlunos.AcaoBotao cmdEditar;
    private BotaoEdicaoAlunos.AcaoBotao cmdView;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField data;
    private javax.swing.JTextField imc;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JTextField peso;
    // End of variables declaration//GEN-END:variables

}
