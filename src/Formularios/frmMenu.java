/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author RandersonThallys
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        DeskPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        mnArquivosClientes = new javax.swing.JMenuItem();
        mnArquivosProdutos = new javax.swing.JMenuItem();
        mnArquivosUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnArquivosAlterarSenha = new javax.swing.JMenuItem();
        mnArquivosAlterarUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnArquivosSair = new javax.swing.JMenuItem();
        mnMovimentos = new javax.swing.JMenu();
        mnMovimentosVendas = new javax.swing.JMenuItem();
        mnMovimentosRelatoriosVendas = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnAjudaSobre = new javax.swing.JMenuItem();
        mnAjudaAjuda = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA JAVA");

        DeskPainel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout DeskPainelLayout = new javax.swing.GroupLayout(DeskPainel);
        DeskPainel.setLayout(DeskPainelLayout);
        DeskPainelLayout.setHorizontalGroup(
            DeskPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DeskPainelLayout.setVerticalGroup(
            DeskPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/open-file-button (1).png"))); // NOI18N
        mnArquivo.setText("Arquivos");

        mnArquivosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-recepção-16.png"))); // NOI18N
        mnArquivosClientes.setText("Clientes");
        mnArquivo.add(mnArquivosClientes);

        mnArquivosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/box (1).png"))); // NOI18N
        mnArquivosProdutos.setText("Produtos");
        mnArquivosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivosProdutosActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivosProdutos);

        mnArquivosUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/office-worker-outline (1).png"))); // NOI18N
        mnArquivosUsuario.setText("Usuario");
        mnArquivosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivosUsuarioActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivosUsuario);
        mnArquivo.add(jSeparator1);

        mnArquivosAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house-key (1).png"))); // NOI18N
        mnArquivosAlterarSenha.setText("Alterar Senha");
        mnArquivo.add(mnArquivosAlterarSenha);

        mnArquivosAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-alterar-usuário-masculino-16.png"))); // NOI18N
        mnArquivosAlterarUsuario.setText("Alterar Usuario");
        mnArquivosAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArquivosAlterarUsuarioActionPerformed(evt);
            }
        });
        mnArquivo.add(mnArquivosAlterarUsuario);
        mnArquivo.add(jSeparator2);

        mnArquivosSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/power-on-semicircle- (1).png"))); // NOI18N
        mnArquivosSair.setText("Sair");
        mnArquivo.add(mnArquivosSair);

        jMenuBar1.add(mnArquivo);

        mnMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cash-register (1).png"))); // NOI18N
        mnMovimentos.setText("Movimentos");

        mnMovimentosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-receber-dinheiro-16.png"))); // NOI18N
        mnMovimentosVendas.setText("Vendas");
        mnMovimentos.add(mnMovimentosVendas);

        mnMovimentosRelatoriosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/businessman-discussing-a-progress-report (2).png"))); // NOI18N
        mnMovimentosRelatoriosVendas.setText("Relatorios Vendas");
        mnMovimentos.add(mnMovimentosRelatoriosVendas);

        jMenuBar1.add(mnMovimentos);

        mnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/round-help-button (1).png"))); // NOI18N
        mnAjuda.setText("Ajuda");

        mnAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/open-book.png"))); // NOI18N
        mnAjudaSobre.setText("Sobre");
        mnAjuda.add(mnAjudaSobre);

        mnAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier-and-mark-help (1).png"))); // NOI18N
        mnAjudaAjuda.setText("Ajuda");
        mnAjuda.add(mnAjudaAjuda);

        jMenuBar1.add(mnAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPainel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnArquivosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivosProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnArquivosProdutosActionPerformed

    private void mnArquivosAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivosAlterarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnArquivosAlterarUsuarioActionPerformed

    private void mnArquivosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArquivosUsuarioActionPerformed
        // Botão usuarios da barra de menu
        frmUsuarios fusuario = new frmUsuarios();
        DeskPainel.add(fusuario);
        fusuario.show();
        
        
        
    }//GEN-LAST:event_mnArquivosUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskPainel;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnAjudaAjuda;
    private javax.swing.JMenuItem mnAjudaSobre;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenuItem mnArquivosAlterarSenha;
    private javax.swing.JMenuItem mnArquivosAlterarUsuario;
    private javax.swing.JMenuItem mnArquivosClientes;
    private javax.swing.JMenuItem mnArquivosProdutos;
    private javax.swing.JMenuItem mnArquivosSair;
    private javax.swing.JMenuItem mnArquivosUsuario;
    private javax.swing.JMenu mnMovimentos;
    private javax.swing.JMenuItem mnMovimentosRelatoriosVendas;
    private javax.swing.JMenuItem mnMovimentosVendas;
    // End of variables declaration//GEN-END:variables
}
