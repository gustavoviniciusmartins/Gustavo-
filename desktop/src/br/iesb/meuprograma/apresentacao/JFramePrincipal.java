
package br.iesb.meuprograma.apresentacao;

public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
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

        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuSistema = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemDocumento = new javax.swing.JMenuItem();
        jMenuItemMeta = new javax.swing.JMenuItem();
        jMenuAnalise = new javax.swing.JMenu();
        jMenuItemAnaliseDoc = new javax.swing.JMenuItem();
        jMenuItemGerarRel = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meu Programa");

        jMenuSistema.setMnemonic('S');
        jMenuSistema.setText("Sistema");

        jMenuItemSair.setMnemonic('r');
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSistema.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuSistema);

        jMenuCadastro.setMnemonic('C');
        jMenuCadastro.setText("Cadastro");

        jMenuItemDocumento.setMnemonic('D');
        jMenuItemDocumento.setText("Documento");
        jMenuItemDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocumentoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemDocumento);

        jMenuItemMeta.setMnemonic('M');
        jMenuItemMeta.setText("Meta");
        jMenuCadastro.add(jMenuItemMeta);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuAnalise.setMnemonic('A');
        jMenuAnalise.setText("Análise");

        jMenuItemAnaliseDoc.setMnemonic('n');
        jMenuItemAnaliseDoc.setText("Análise de Documento");
        jMenuItemAnaliseDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnaliseDocActionPerformed(evt);
            }
        });
        jMenuAnalise.add(jMenuItemAnaliseDoc);

        jMenuItemGerarRel.setMnemonic('G');
        jMenuItemGerarRel.setText("Gerar Relatório");
        jMenuItemGerarRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGerarRelActionPerformed(evt);
            }
        });
        jMenuAnalise.add(jMenuItemGerarRel);

        jMenuBarPrincipal.add(jMenuAnalise);

        jMenuAjuda.setMnemonic('j');
        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setMnemonic('S');
        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBarPrincipal.add(jMenuAjuda);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JDialogSobre dialog = new JDialogSobre(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemDocumentoActionPerformed

    private void jMenuItemGerarRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGerarRelActionPerformed
        GerarRelatorio dialog = new GerarRelatorio(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemGerarRelActionPerformed

    private void jMenuItemAnaliseDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnaliseDocActionPerformed
        AnaliseDocumento dialog = new AnaliseDocumento(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItemAnaliseDocActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuAnalise;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAnaliseDoc;
    private javax.swing.JMenuItem jMenuItemDocumento;
    private javax.swing.JMenuItem jMenuItemGerarRel;
    private javax.swing.JMenuItem jMenuItemMeta;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuSistema;
    // End of variables declaration//GEN-END:variables
}
