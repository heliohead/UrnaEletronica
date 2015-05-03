/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.EleicaoBean;
import classes.Eleitor;
import dao.EleitorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author helio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
       frmSobre.setVisible(false);
       frmCadastrarVoto.setVisible(false);
       frmCadastrarEleteitor.setVisible(false);
       frmVoto.setVisible(false);
    }
    
    private Eleitor montarEleitor(){
        Eleitor el = new Eleitor();
        
        el.setNome(txtNome.getText());
        el.setTitulo(txtTitulo.getText());
        
        return el;
    }
    
    private boolean verificarTexto(String txtNome, String txtTitulo){
        boolean match1 = txtNome.matches("[a-zA-Z]+");
        boolean match2 = txtTitulo.matches("[0-9]+");
        return (match1 && match2);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmSobre = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        frmCadastrarEleteitor = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        frmCadastrarVoto = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtVotoTitulo = new javax.swing.JTextField();
        btnIniciarVotacao = new javax.swing.JButton();
        lblErros = new javax.swing.JLabel();
        frmVoto = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtVotoNome = new javax.swing.JTextField();
        txtVotoNumero = new javax.swing.JTextField();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCadastrarEleitor = new javax.swing.JMenuItem();
        mnuCadastrarVoto = new javax.swing.JMenuItem();
        mnuVerResultado = new javax.swing.JMenuItem();
        mnuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        frmSobre.setClosable(true);
        frmSobre.setVisible(true);
        frmSobre.getContentPane().setLayout(null);

        jLabel1.setText("149032-0");
        frmSobre.getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 110, 80, 16);

        jLabel2.setText("Prof. Amilton");
        frmSobre.getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 170, 110, 20);

        jLabel3.setText("Helio Oliveira");
        frmSobre.getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 40, 100, 20);

        jLabel4.setText("RGM:");
        frmSobre.getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 110, 45, 16);

        jLabel5.setText("Nome:");
        frmSobre.getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 40, 41, 16);

        getContentPane().add(frmSobre);
        frmSobre.setBounds(480, 10, 410, 250);

        frmCadastrarEleteitor.setClosable(true);
        frmCadastrarEleteitor.setVisible(true);
        frmCadastrarEleteitor.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Eleitor"));
        jPanel1.setLayout(null);

        jLabel6.setText("Título:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 80, 60, 16);

        jLabel7.setText("Nome:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 40, 41, 16);

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(100, 70, 210, 40);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(100, 30, 210, 40);

        frmCadastrarEleteitor.getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 380, 130);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        frmCadastrarEleteitor.getContentPane().add(btnSalvar);
        btnSalvar.setBounds(310, 160, 81, 29);

        getContentPane().add(frmCadastrarEleteitor);
        frmCadastrarEleteitor.setBounds(0, 0, 490, 270);

        frmCadastrarVoto.setClosable(true);
        frmCadastrarVoto.setVisible(true);
        frmCadastrarVoto.getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Eleitor"));
        jPanel2.setLayout(null);

        jLabel8.setText("Título:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 30, 60, 16);

        txtVotoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVotoTituloActionPerformed(evt);
            }
        });
        jPanel2.add(txtVotoTitulo);
        txtVotoTitulo.setBounds(90, 20, 210, 40);

        frmCadastrarVoto.getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 10, 380, 90);

        btnIniciarVotacao.setText("Iniciar Votacão");
        btnIniciarVotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarVotacaoActionPerformed(evt);
            }
        });
        frmCadastrarVoto.getContentPane().add(btnIniciarVotacao);
        btnIniciarVotacao.setBounds(271, 100, 140, 29);

        getContentPane().add(frmCadastrarVoto);
        frmCadastrarVoto.setBounds(0, 270, 490, 210);
        getContentPane().add(lblErros);
        lblErros.setBounds(510, 470, 380, 50);

        frmVoto.setClosable(true);
        frmVoto.setTitle("Votação");
        frmVoto.setVisible(true);
        frmVoto.getContentPane().setLayout(null);

        jLabel9.setText("Nome:");
        frmVoto.getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 160, 41, 16);

        jLabel10.setText("Numero:");
        frmVoto.getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 60, 70, 20);
        frmVoto.getContentPane().add(txtVotoNome);
        txtVotoNome.setBounds(40, 190, 180, 30);

        txtVotoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVotoNumeroActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(txtVotoNumero);
        txtVotoNumero.setBounds(40, 100, 90, 30);

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/3.jpg"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn3);
        btn3.setBounds(520, 50, 70, 50);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/1.jpg"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn1);
        btn1.setBounds(360, 50, 70, 50);

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/2.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn2);
        btn2.setBounds(440, 50, 70, 50);

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/6.jpg"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn6);
        btn6.setBounds(520, 110, 70, 50);

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/4.jpg"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn4);
        btn4.setBounds(360, 110, 70, 50);

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/5.jpg"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn5);
        btn5.setBounds(440, 110, 70, 50);

        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/0.jpg"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn0);
        btn0.setBounds(440, 230, 70, 50);

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/7.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn7);
        btn7.setBounds(360, 170, 70, 50);

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/8.jpg"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn8);
        btn8.setBounds(440, 170, 70, 50);

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/9.jpg"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btn9);
        btn9.setBounds(520, 170, 70, 50);

        btnBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/branco.jpg"))); // NOI18N
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btnBranco);
        btnBranco.setBounds(290, 320, 110, 60);

        btnCorrige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/corrige.jpg"))); // NOI18N
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btnCorrige);
        btnCorrige.setBounds(400, 320, 110, 60);

        btnConfirma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/confirma.jpg"))); // NOI18N
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });
        frmVoto.getContentPane().add(btnConfirma);
        btnConfirma.setBounds(520, 320, 110, 60);

        getContentPane().add(frmVoto);
        frmVoto.setBounds(0, 0, 690, 470);

        jMenu1.setText("Menu Principal");

        mnuCadastrarEleitor.setText("Cadastrar Eleitor");
        mnuCadastrarEleitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCadastrarEleitorMouseClicked(evt);
            }
        });
        mnuCadastrarEleitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarEleitorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastrarEleitor);

        mnuCadastrarVoto.setText("Cadastar Voto");
        mnuCadastrarVoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarVotoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCadastrarVoto);

        mnuVerResultado.setText("Ver Resultado");
        jMenu1.add(mnuVerResultado);

        jMenuBar1.add(jMenu1);

        mnuSobre.setText("Sobre");
        mnuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSobreMouseClicked(evt);
            }
        });
        mnuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuSobre);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 896, 582);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSobreActionPerformed
        
    }//GEN-LAST:event_mnuSobreActionPerformed

    private void mnuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSobreMouseClicked
      frmSobre.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_mnuSobreMouseClicked

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void mnuCadastrarEleitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCadastrarEleitorMouseClicked
        frmCadastrarEleteitor.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarEleitorMouseClicked

    private void mnuCadastrarEleitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarEleitorActionPerformed
        frmCadastrarEleteitor.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarEleitorActionPerformed

    private void txtVotoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVotoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVotoTituloActionPerformed

    private void mnuCadastrarVotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarVotoActionPerformed
        frmCadastrarVoto.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarVotoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean verificar = verificarTexto(txtNome.getText(), txtTitulo.getText());
        
        if (verificar) {
            EleitorDAO el = new EleitorDAO();
            String resp;
            
            resp = el.gravarEleitor(montarEleitor());
            if (resp.matches(".*PRIMARY.*")) {
                lblErros.setText("Título já cadastrado!");
            }else{
                lblErros.setText(resp);
            }
        }else{
            lblErros.setText("Dados incorretos");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtVotoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVotoNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVotoNumeroActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        String result = new EleicaoBean().verificarVoto(txtVotoNumero);
        lblErros.setText(result);
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        txtVotoNumero.setText("00");
        txtVotoNome.setText("BRANCO");
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnIniciarVotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarVotacaoActionPerformed
        String titulo = txtVotoTitulo.getText();
        if (titulo.matches("[0-9]+")) {
            Eleitor e = new EleitorDAO().getEleitor(titulo);
            if (e == null) {
                int n = JOptionPane.showConfirmDialog(null, "Titulo não Cadastrado, Deseja Cadastrar",
                        "",
                        JOptionPane.YES_NO_OPTION);

                if(n == JOptionPane.YES_OPTION){
                    frmCadastrarEleteitor.setVisible(true);
                    frmCadastrarVoto.setVisible(false);
                }else {
                    return;
                }
            }
            
            if (e.isVotou()) {
                lblErros.setText("Eleitor já votou");
            }else{
                frmVoto.setVisible(true);
                frmCadastrarVoto.setVisible(false);
            }
            lblErros.setText(String.valueOf(e));
        }else{
            lblErros.setText("Digite somente números");
        }
    }//GEN-LAST:event_btnIniciarVotacaoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtVotoNumero.setText(txtVotoNumero.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
       txtVotoNumero.setText("");
    }//GEN-LAST:event_btnCorrigeActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Principal p = new Principal();
               p.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnIniciarVotacao;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JInternalFrame frmCadastrarEleteitor;
    private javax.swing.JInternalFrame frmCadastrarVoto;
    private javax.swing.JInternalFrame frmSobre;
    private javax.swing.JInternalFrame frmVoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblErros;
    private javax.swing.JMenuItem mnuCadastrarEleitor;
    private javax.swing.JMenuItem mnuCadastrarVoto;
    private javax.swing.JMenu mnuSobre;
    private javax.swing.JMenuItem mnuVerResultado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtVotoNome;
    private javax.swing.JTextField txtVotoNumero;
    private javax.swing.JTextField txtVotoTitulo;
    // End of variables declaration//GEN-END:variables
}