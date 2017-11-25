/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Bruna Leonel
 */
public class TelaInicial extends javax.swing.JFrame {
    /**
     * Creates new form TelaGerente
     */
    public TelaInicial() {
      initComponents();
      
      setExtendedState(MAXIMIZED_BOTH);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtLogout = new javax.swing.JMenu();
        BtSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        BtManutenção = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");

        jDesktopPane1.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        BtLogout.setText("Logout");
        BtLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLogoutActionPerformed(evt);
            }
        });

        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });
        BtLogout.add(BtSair);

        jMenuBar1.add(BtLogout);

        jMenu1.setText("Funcionários");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        BtManutenção.setText("Manutenção");
        BtManutenção.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtManutençãoActionPerformed(evt);
            }
        });
        jMenu1.add(BtManutenção);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Oficina");

        jMenuItem1.setText("Ordem de Serviço");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Peças");

        jMenuItem2.setText("Estoque");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Venda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Clientes");

        jMenuItem4.setText("Manutenção");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Veículos");

        jMenuItem5.setText("Manutenção");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void MecanicoLogin()
    {
        jMenu1.setEnabled(false);
        jMenu1.setVisible(false);
        jMenu4.setEnabled(false);
        jMenu4.setVisible(false);
        jMenu3.setEnabled(false);
        jMenu3.setVisible(false);
        jMenu5.setEnabled(false);
        jMenu5.setVisible(false);
    }
    public void AtendenteLogin()
    {
        jMenu1.setEnabled(false);
        jMenu1.setVisible(false);
        jMenu2.setEnabled(false);
        jMenu2.setVisible(false);
        jMenu3.setEnabled(false);
        jMenu3.setVisible(false);
    }
    public void GerenteLogin()
    {
        jMenu1.setEnabled(true);
        jMenu1.setVisible(true);
        jMenu2.setEnabled(true);
        jMenu2.setVisible(true);
        jMenu3.setEnabled(true);
        jMenu3.setVisible(true);
        jMenu4.setEnabled(true);
        jMenu4.setVisible(true);
        jMenu5.setEnabled(true);
        jMenu5.setVisible(true);
    }
    private void BtManutençãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtManutençãoActionPerformed
        TelaFuncionario CadFunc = new TelaFuncionario();
        jDesktopPane1.add(CadFunc);
        CadFunc.setVisible(true);
    }//GEN-LAST:event_BtManutençãoActionPerformed

    private void BtLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLogoutActionPerformed
        
    }//GEN-LAST:event_BtLogoutActionPerformed

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.dispose();
        TelaLogin Login = new TelaLogin();
        Login.setVisible(true);
    }//GEN-LAST:event_BtSairActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaCliente TelaCli = new TelaCliente();
        jDesktopPane1.add(TelaCli);
        TelaCli.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaCarro Carro = new TelaCarro();
        jDesktopPane1.add(Carro);
        Carro.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaVenda Venda = new TelaVenda();
        jDesktopPane1.add(Venda);
        Venda.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed



   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BtLogout;
    private javax.swing.JMenuItem BtManutenção;
    private javax.swing.JMenuItem BtSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
