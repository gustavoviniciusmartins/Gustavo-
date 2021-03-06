/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.iesb.meuprograma.apresentacao;

import br.iesb.meuprograma.dados.Curso;
import br.iesb.meuprograma.negocio.CursoBO;
import br.iesb.meuprograma.negocio.NegocioException;
import javax.swing.JOptionPane;

/**
 *
 * @author vimag
 */
public class JDialogoCadastroCurso extends javax.swing.JDialog {

    /**
     * Creates new form JDialogoCadastroCurso
     */
    public JDialogoCadastroCurso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lblTipoCurso = new javax.swing.JLabel();
        tfTipoCurso = new javax.swing.JTextField();
        lblModalidade = new javax.swing.JLabel();
        tfModalidade = new javax.swing.JTextField();
        lblNomeCurso = new javax.swing.JLabel();
        tfNomeCurso = new javax.swing.JTextField();
        lblHabilitacao = new javax.swing.JLabel();
        tfHabilitacao = new javax.swing.JTextField();
        lblLocalOferta = new javax.swing.JLabel();
        tfLocalOferta = new javax.swing.JTextField();
        lblTurno = new javax.swing.JLabel();
        tfTurno = new javax.swing.JTextField();
        lblNumVagas = new javax.swing.JLabel();
        tfNumVagas = new javax.swing.JTextField();
        lblCarga = new javax.swing.JLabel();
        tfCarga = new javax.swing.JTextField();
        lblEstrutura = new javax.swing.JLabel();
        tfRegime = new javax.swing.JTextField();
        lblRegime = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        tfPeriodo = new javax.swing.JTextField();
        lblCoordenador = new javax.swing.JLabel();
        lblNomeCC = new javax.swing.JLabel();
        cbNome = new javax.swing.JComboBox<>();
        lblNomeCC1 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        lblTitulacao = new javax.swing.JLabel();
        tfTitulacao = new javax.swing.JTextField();
        lblTempo = new javax.swing.JLabel();
        tfTempo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblCodCurso = new javax.swing.JLabel();
        tfCodCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Incluir Dados Gerais de Cursos");

        lblTipoCurso.setText("Tipo de Curso: ");

        lblModalidade.setText("Modalidade: ");

        lblNomeCurso.setText("Nome do Curso: ");

        lblHabilitacao.setText("Habilitação: ");

        lblLocalOferta.setText("Local de Oferta: ");

        lblTurno.setText("Turnos de Funcionamento: ");

        lblNumVagas.setText("Nº Vagas para cada Turno: ");

        lblCarga.setText("Carga Horária do Curso: ");

        lblEstrutura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEstrutura.setText("Estrutura Currícular: ");

        lblRegime.setText("Regime Letivo: ");

        lblPeriodo.setText("Períodos: ");

        lblCoordenador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCoordenador.setText("Coordenador do Curso: ");

        lblNomeCC.setText("Nome: ");

        cbNome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNomeCC1.setText("CPF : ");

        lblTitulacao.setText("Titulação: ");

        lblTempo.setText("Tempo de Dedicação: ");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        btnAlterar.setText("Alterar");

        lblCodCurso.setText("Código do Curso: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCurso)
                            .addComponent(lblHabilitacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 514, Short.MAX_VALUE))
                            .addComponent(tfNomeCurso)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCC)
                            .addComponent(lblNomeCC1)
                            .addComponent(lblTitulacao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(tfTitulacao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAlterar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTempo)
                                        .addGap(27, 27, 27)
                                        .addComponent(tfTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCoordenador)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoCurso)
                                .addGap(18, 18, 18)
                                .addComponent(tfTipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblEstrutura, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTurno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCarga)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblRegime)
                                            .addGap(30, 30, 30)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfRegime)
                                        .addComponent(tfCarga)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblLocalOferta)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfLocalOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNumVagas)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfNumVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblModalidade)
                                            .addGap(42, 42, 42)
                                            .addComponent(tfModalidade))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPeriodo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                            .addComponent(tfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(lblCodCurso)
                                .addGap(23, 23, 23)
                                .addComponent(tfCodCurso)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodCurso)
                        .addComponent(tfCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTipoCurso))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCurso)
                    .addComponent(tfNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabilitacao)
                    .addComponent(tfHabilitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModalidade))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTurno)
                            .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCarga)
                            .addComponent(tfCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLocalOferta)
                            .addComponent(tfLocalOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumVagas)
                            .addComponent(tfNumVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(lblEstrutura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegime)
                    .addComponent(tfRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeriodo)
                    .addComponent(tfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(lblCoordenador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCC)
                    .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCC1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTempo)
                        .addComponent(tfTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulacao)
                    .addComponent(tfTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnAlterar))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Curso curso = new Curso();
      
        curso.setCodCurso(Integer.parseInt(tfCodCurso.getText()));
        curso.setTipo(tfTipoCurso.getText());
        curso.setModalidade(tfModalidade.getText());
        curso.setNome(tfNomeCurso.getText());
        curso.setHabilitacao(tfHabilitacao.getText());
        curso.setLocaloferta(tfLocalOferta.getText());
        curso.setTurno(tfTurno.getText());
        curso.setNumvagas(Integer.parseInt(tfNumVagas.getText()));
        curso.setCarga(tfCarga.getText());
        curso.setRegime(tfRegime.getText());
        curso.setPeriodo(tfPeriodo.getText());
                
        CursoBO bo = new CursoBO();
        
        try{
            bo.inserir(curso);
        } catch (NegocioException ex){
            if (ex.getCause() != null){
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogoCadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogoCadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogoCadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogoCadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogoCadastroCurso dialog = new JDialogoCadastroCurso(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbNome;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblCodCurso;
    private javax.swing.JLabel lblCoordenador;
    private javax.swing.JLabel lblEstrutura;
    private javax.swing.JLabel lblHabilitacao;
    private javax.swing.JLabel lblLocalOferta;
    private javax.swing.JLabel lblModalidade;
    private javax.swing.JLabel lblNomeCC;
    private javax.swing.JLabel lblNomeCC1;
    private javax.swing.JLabel lblNomeCurso;
    private javax.swing.JLabel lblNumVagas;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblRegime;
    private javax.swing.JLabel lblTempo;
    private javax.swing.JLabel lblTipoCurso;
    private javax.swing.JLabel lblTitulacao;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCarga;
    private javax.swing.JTextField tfCodCurso;
    private javax.swing.JTextField tfHabilitacao;
    private javax.swing.JTextField tfLocalOferta;
    private javax.swing.JTextField tfModalidade;
    private javax.swing.JTextField tfNomeCurso;
    private javax.swing.JTextField tfNumVagas;
    private javax.swing.JTextField tfPeriodo;
    private javax.swing.JTextField tfRegime;
    private javax.swing.JTextField tfTempo;
    private javax.swing.JTextField tfTipoCurso;
    private javax.swing.JTextField tfTitulacao;
    private javax.swing.JTextField tfTurno;
    // End of variables declaration//GEN-END:variables
}
