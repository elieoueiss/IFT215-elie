package taxescalculation;

import java.awt.event.KeyEvent;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class taxes extends javax.swing.JFrame {
    private String married;
    private Object Nbkids;

    /**
     * Creates new form taxes
     */
    public taxes() {
        initComponents();
      
       marriedchkbx.setSelected(true);
        rootPane.setDefaultButton(submitbut);
        this.setTitle("taxes calculation");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yearlysalarylbl = new javax.swing.JLabel();
        marriedchkbx = new javax.swing.JCheckBox();
        submitbut = new javax.swing.JButton();
        yearlysalarytxtfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxkids = new javax.swing.JComboBox();
        taxesamountpanel = new javax.swing.JPanel();
        amountlbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        amountPane = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taxes Calculation");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee information"));

        yearlysalarylbl.setText("yearly salary:");

        marriedchkbx.setText("married");

        submitbut.setText("submit");
        submitbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbutActionPerformed(evt);
            }
        });

        yearlysalarytxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        yearlysalarytxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlysalarytxtfieldActionPerformed(evt);
            }
        });
        yearlysalarytxtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearlysalarytxtfieldKeyTyped(evt);
            }
        });

        jLabel1.setText("Nb kids:");

        cbxkids.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1 ", "2 ", "3 ", "4 ", "5 ", " " }));

        taxesamountpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("taxes amount"));

        amountlbl.setText("Amount:");

        jScrollPane2.setViewportView(amountPane);

        javax.swing.GroupLayout taxesamountpanelLayout = new javax.swing.GroupLayout(taxesamountpanel);
        taxesamountpanel.setLayout(taxesamountpanelLayout);
        taxesamountpanelLayout.setHorizontalGroup(
            taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxesamountpanelLayout.createSequentialGroup()
                .addComponent(amountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        taxesamountpanelLayout.setVerticalGroup(
            taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxesamountpanelLayout.createSequentialGroup()
                .addGroup(taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yearlysalarylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearlysalarytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(submitbut))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(marriedchkbx, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxkids, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 324, Short.MAX_VALUE))
                    .addComponent(taxesamountpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlysalarylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlysalarytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marriedchkbx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxkids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitbut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxesamountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearlysalarytxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlysalarytxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlysalarytxtfieldActionPerformed

    private void yearlysalarytxtfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearlysalarytxtfieldKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_yearlysalarytxtfieldKeyTyped

    @SuppressWarnings("empty-statement")
    private void submitbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbutActionPerformed
        //TODO add your handling code here:
     if(yearlysalarytxtfield.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter yearlysalary","Waring",JOptionPane.INFORMATION_MESSAGE);
        }else{
           String yearlysalary = yearlysalarytxtfield.getText();   
           
         boolean married;
        
            married = marriedchkbx.isSelected();
           int Nbkids = 
                    Integer.parseInt(
                            cbxkids.getSelectedItem().toString());
           code co = 
                new code(yearlysalary,married,Nbkids);
        amountPane.setFont(co.getAmount());
    }//GEN-LAST:event_submitbutActionPerformed

    public taxes(JEditorPane amountPane) {
        this.amountPane = amountPane;
    }

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
            java.util.logging.Logger.getLogger(taxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(taxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(taxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(taxes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
         
             /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new taxes().setVisible(true);
            }
        });
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane amountPane;
    private javax.swing.JLabel amountlbl;
    private javax.swing.JComboBox cbxkids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox marriedchkbx;
    private javax.swing.JButton submitbut;
    private javax.swing.JPanel taxesamountpanel;
    private javax.swing.JLabel yearlysalarylbl;
    private javax.swing.JTextField yearlysalarytxtfield;
    // End of variables declaration//GEN-END:variables
}
