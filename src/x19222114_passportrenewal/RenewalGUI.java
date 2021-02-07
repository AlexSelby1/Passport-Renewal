package x19222114_passportrenewal;

/**
 *
 * @author Alex.Selby x19222114
 */
public class RenewalGUI extends javax.swing.JFrame {

        PriorityQueue PQ;
    
    public RenewalGUI() {
        PQ = new PriorityQueue();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        DeleteButton2 = new javax.swing.JButton();
        SeniorityNumberLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        NameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ApplicationNoText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextDisplayArea = new javax.swing.JTextArea();
        PrintButton = new javax.swing.JButton();
        DeleteButton1 = new javax.swing.JButton();
        ReasonText = new javax.swing.JTextField();
        LastNameLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstNameLabel.setText("Name");

        LastNameLabel.setText("Application Number");

        DeleteButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DeleteButton2.setForeground(new java.awt.Color(0, 0, 102));
        DeleteButton2.setText("Delete Last Record");
        DeleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton2ActionPerformed(evt);
            }
        });

        SeniorityNumberLabel.setText("Reason");

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(0, 0, 102));
        ExitButton.setText("Exit App");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 0, 102));
        AddButton.setText("Add Record");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Passport Renewal Application");

        TextDisplayArea.setColumns(20);
        TextDisplayArea.setRows(5);
        jScrollPane2.setViewportView(TextDisplayArea);

        PrintButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PrintButton.setForeground(new java.awt.Color(51, 0, 102));
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        DeleteButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DeleteButton1.setForeground(new java.awt.Color(0, 0, 102));
        DeleteButton1.setText("Delete Record by Name");
        DeleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButton1ActionPerformed(evt);
            }
        });

        LastNameLabel1.setText("Please enter Fees, Medical, Family or Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeleteButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SeniorityNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReasonText, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LastNameLabel1)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ApplicationNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrintButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(331, 331, 331)
                    .addComponent(ExitButton)
                    .addContainerGap(192, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(ApplicationNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(LastNameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeniorityNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(DeleteButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton2)
                .addGap(97, 97, 97))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11))
                        .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(240, 240, 240)
                    .addComponent(AddButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                    .addComponent(PrintButton)
                    .addGap(5, 5, 5)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       //Removing last added record.
    private void DeleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton2ActionPerformed
        PQ.dequeue();
        TextDisplayArea.append("\nLast record has been removed.");
    }//GEN-LAST:event_DeleteButton2ActionPerformed

       //Function to exit the application
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed
        //Add button used to add the records of applicants
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        String name = NameText.getText();
        String reason = ReasonText.getText();
        int applicationNo = Integer.parseInt(ApplicationNoText.getText());

            ApplicantRecord ApplicantRecord= new ApplicantRecord(name, reason, applicationNo);

         //Setting the priority as per the question
        int priorkey;
        if (reason.equalsIgnoreCase("Fees")){
            priorkey = 1;
        }
        else if (reason.equalsIgnoreCase("Medical")){
            priorkey = 1;
        }
        else if (reason.equalsIgnoreCase("Family")){
            priorkey = 2;
        }
        else {
            priorkey = 3;
        }

        //Adding application to the priority queue
        PQ.enqueue(priorkey, ApplicantRecord);

        TextDisplayArea.append("\nApplicant: " + name + ", Application No# " + applicationNo +
            ", Reason: " + reason + ".\nResult: Record Submitted.");

        NameText.setText(null);
        ApplicationNoText.setText(null);
        ReasonText.setText(null);

    }//GEN-LAST:event_AddButtonActionPerformed
// Print list of applications with highest priority at the bottom of the list
    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed

        PQElement elem;
        ApplicantRecord applicantRecord;

        for (int i = 0; i < PQ.size(); i++){
            elem = (PQElement) PQ.get(i);
            applicantRecord = (ApplicantRecord) elem.getElement();
            TextDisplayArea.append("\n" + applicantRecord.toString());
        }
    }//GEN-LAST:event_PrintButtonActionPerformed
// Delete application by name
    private void DeleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButton1ActionPerformed

        String name = NameText.getText();

        PQElement elem;
        ApplicantRecord applicantRecord;

        for (int i = 0; i < PQ.size(); i++){
            elem = (PQElement) PQ.get(i);
            applicantRecord = (ApplicantRecord) elem.getElement();
            if (applicantRecord.getName().equals(name)){
                PQ.removeObject(elem);
            }
        }

        TextDisplayArea.append("\nApplcation Name: " + name + ".\nResult: Record Deleted.");
    }//GEN-LAST:event_DeleteButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RenewalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenewalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenewalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenewalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenewalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField ApplicationNoText;
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JButton DeleteButton2;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel LastNameLabel1;
    private javax.swing.JTextField NameText;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTextField ReasonText;
    private javax.swing.JLabel SeniorityNumberLabel;
    private javax.swing.JTextArea TextDisplayArea;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
