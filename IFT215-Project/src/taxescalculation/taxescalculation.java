package taxescalculation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class taxescalculation extends javax.swing.JPanel {

    /**
     * Creates new form taxescalculation
     */
    public taxescalculation() {
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

        yearlysalarylbl = new javax.swing.JLabel();
        marriedchkbx = new javax.swing.JCheckBox();
        submitbut = new javax.swing.JButton();
        yearlysalarytxtfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxkids = new javax.swing.JComboBox();
        taxesamountpanel = new javax.swing.JPanel();
        amountlbl = new javax.swing.JLabel();
        Amounttxt = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Employee information"));

        yearlysalarylbl.setText("yearly salary:");

        marriedchkbx.setText("married");

        submitbut.setText("submit");

        yearlysalarytxtfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        yearlysalarytxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlysalarytxtfieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Nb kids:");

        cbxkids.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1 kids", "2 kids", "3 kids", "4 kids", "5 kids", " " }));

        taxesamountpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("taxes amount"));

        amountlbl.setText("Amount:");

        javax.swing.GroupLayout taxesamountpanelLayout = new javax.swing.GroupLayout(taxesamountpanel);
        taxesamountpanel.setLayout(taxesamountpanelLayout);
        taxesamountpanelLayout.setHorizontalGroup(
            taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxesamountpanelLayout.createSequentialGroup()
                .addComponent(amountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        taxesamountpanelLayout.setVerticalGroup(
            taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taxesamountpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(taxesamountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearlysalarylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearlysalarytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(submitbut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marriedchkbx, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxkids, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
            .addComponent(taxesamountpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlysalarylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearlysalarytxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marriedchkbx, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxkids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitbut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxesamountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yearlysalarytxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlysalarytxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearlysalarytxtfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JLabel amountlbl;
    private javax.swing.JComboBox cbxkids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox marriedchkbx;
    private javax.swing.JButton submitbut;
    private javax.swing.JPanel taxesamountpanel;
    private javax.swing.JLabel yearlysalarylbl;
    private javax.swing.JTextField yearlysalarytxtfield;
    // End of variables declaration//GEN-END:variables
}
