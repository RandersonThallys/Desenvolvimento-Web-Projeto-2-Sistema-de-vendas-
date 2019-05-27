/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;

/**
 *
 * @author RandersonThallys
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

     private Dados clsdados;
     private int usuarioatual = 0;
     
    public void setDados(Dados clsdados){
        this.clsdados = clsdados;
    }
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobreNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox();
        cmdAlterar = new javax.swing.JButton();
        cmdNovo = new javax.swing.JButton();
        cmdSalvar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdPrimeiro = new javax.swing.JButton();
        cmdAnterior = new javax.swing.JButton();
        cmdProximo = new javax.swing.JButton();
        cmdUltimo = new javax.swing.JButton();
        cmdPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuarios");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Cod Usuario:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nome:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Sobre nome:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Senha:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Conf Senha:");

        txtCodUsuario.setEnabled(false);
        txtCodUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUsuarioActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        txtSobreNome.setEnabled(false);

        txtSenha.setEnabled(false);

        txtConfSenha.setToolTipText("");
        txtConfSenha.setEnabled(false);

        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Perfil:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Perfil", "Administrador", "Funcionario", " ", " " }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        cmdAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-lápis-24.png"))); // NOI18N
        cmdAlterar.setToolTipText("Editar Cadastro");
        cmdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAlterarActionPerformed(evt);
            }
        });

        cmdNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-adicionar-24.png"))); // NOI18N
        cmdNovo.setToolTipText("Novo Cadastro");
        cmdNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNovoActionPerformed(evt);
            }
        });

        cmdSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-salvar-filled-24.png"))); // NOI18N
        cmdSalvar.setToolTipText("Salvar Cadastro");
        cmdSalvar.setEnabled(false);
        cmdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvarActionPerformed(evt);
            }
        });

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-excluir-24.png"))); // NOI18N
        cmdCancelar.setToolTipText("Pesqusiar Cadastro");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        cmdPrimeiro.setToolTipText("Primeiro Cadastro");

        cmdAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/video-play-square-button.png"))); // NOI18N
        cmdAnterior.setToolTipText("Cadastro Anterior");

        cmdProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/play-video-button.png"))); // NOI18N
        cmdProximo.setToolTipText("Proximo Cadastro");

        cmdUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/skip.png"))); // NOI18N
        cmdUltimo.setToolTipText("Ultimo Cadastro");

        cmdPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-pesquisar-24.png"))); // NOI18N
        cmdPesquisar.setToolTipText("Pesqusiar Cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(cmdPrimeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdProximo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdUltimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdSalvar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdPrimeiro)
                    .addComponent(cmdAnterior)
                    .addComponent(cmdProximo)
                    .addComponent(cmdUltimo)
                    .addComponent(cmdNovo)
                    .addComponent(cmdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdSalvar)
                    .addComponent(cmdPesquisar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void cmdNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNovoActionPerformed
        // :botão novo cadastro do formulario cadastro
        cmdPrimeiro.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdProximo.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdNovo.setEnabled(false);
        cmdAlterar.setEnabled(false);
        cmdCancelar.setEnabled(true);
        cmdSalvar.setEnabled(true);
        cmdPesquisar.setEnabled(false);
        
        txtCodUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
        
        
        txtCodUsuario.setText("");
        txtNome.setText("");
        txtSobreNome.setText("");
        txtSenha.setText("");
        txtConfSenha.setText("");
        cmbPerfil.setSelectedIndex(0);
        
        txtCodUsuario.requestFocusInWindow();
        
        
        
    }//GEN-LAST:event_cmdNovoActionPerformed

    private void cmdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvarActionPerformed
        // codigo botão salvar formulario usuarios
        
        cmdPrimeiro.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdProximo.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdNovo.setEnabled(true);
        cmdAlterar.setEnabled(true);
        cmdCancelar.setEnabled(false);
        cmdSalvar.setEnabled(false);
        cmdPesquisar.setEnabled(true);
        
        txtCodUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobreNome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
        
        
    }//GEN-LAST:event_cmdSalvarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // codigo botão cancelar formulario usuario
        
        cmdPrimeiro.setEnabled(true);
        cmdAnterior.setEnabled(true);
        cmdProximo.setEnabled(true);
        cmdUltimo.setEnabled(true);
        cmdNovo.setEnabled(true);
        cmdAlterar.setEnabled(true);
        cmdCancelar.setEnabled(false);
        cmdSalvar.setEnabled(false);
        cmdPesquisar.setEnabled(true);
        
         txtCodUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobreNome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfSenha.setEnabled(false);
        cmbPerfil.setEnabled(false);
        
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAlterarActionPerformed
        // Codigo botão alterar
        
        cmdPrimeiro.setEnabled(false);
        cmdAnterior.setEnabled(false);
        cmdProximo.setEnabled(false);
        cmdUltimo.setEnabled(false);
        cmdNovo.setEnabled(false);
        cmdAlterar.setEnabled(false);
        cmdCancelar.setEnabled(true);
        cmdSalvar.setEnabled(true);
        cmdPesquisar.setEnabled(false);
        
        ;
        txtNome.setEnabled(true);
        txtSobreNome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfSenha.setEnabled(true);
        cmbPerfil.setEnabled(true);
       
                   
        txtNome.requestFocusInWindow();
    }//GEN-LAST:event_cmdAlterarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtCodUsuario.setText(clsdados.getUsuarios()[usuarioatual].getCodusuario());
        txtNome.setText(clsdados.getUsuarios()[usuarioatual].getNome());
        txtSobreNome.setText(clsdados.getUsuarios()[usuarioatual].getSobrenome());
        txtSenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        txtConfSenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        cmbPerfil.setSelectedItem(clsdados.getUsuarios()[usuarioatual].getPerfil());
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbPerfil;
    private javax.swing.JButton cmdAlterar;
    private javax.swing.JButton cmdAnterior;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdNovo;
    private javax.swing.JButton cmdPesquisar;
    private javax.swing.JButton cmdPrimeiro;
    private javax.swing.JButton cmdProximo;
    private javax.swing.JButton cmdSalvar;
    private javax.swing.JButton cmdUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables
}
