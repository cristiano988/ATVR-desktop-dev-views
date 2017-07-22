/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;

/**
 *
 * @author cristiano
 */
public class MainApplicationView extends javax.swing.JFrame {

    /**
     * Creates new form MainApplicationView
     */
    public MainApplicationView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJpanel = new javax.swing.JPanel();
        barMenu = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuFileNew = new javax.swing.JMenu();
        menuEditNewTournament = new javax.swing.JMenu();
        menuItemQuickTournament = new javax.swing.JMenuItem();
        menuItemFromWeb = new javax.swing.JMenuItem();
        menuFileRecent = new javax.swing.JMenu();
        menuFileExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Score System");
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
        mainJpanel.setLayout(mainJpanelLayout);
        mainJpanelLayout.setHorizontalGroup(
            mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        mainJpanelLayout.setVerticalGroup(
            mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuFileNew.setText("New");

        menuEditNewTournament.setText("Tournament");

        menuItemQuickTournament.setText("Quick Tournament");
        menuEditNewTournament.add(menuItemQuickTournament);

        menuItemFromWeb.setText("From Web");
        menuItemFromWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        menuEditNewTournament.add(menuItemFromWeb);

        menuFileNew.add(menuEditNewTournament);

        menuFile.add(menuFileNew);

        menuFileRecent.setText("Recent");
        menuFile.add(menuFileRecent);

        menuFileExit.setText("Exit");
        menuFileExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        menuFile.add(menuFileExit);

        barMenu.add(menuFile);

        menuEdit.setText("Edit");
        barMenu.add(menuEdit);

        setJMenuBar(barMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        
        switch(evt.getActionCommand())
        {
            case "From Web":
                GetWebIDView getWebId = new GetWebIDView(this);
                getWebId.setVisible(true);
                break;
                
            case "Exit":
                TournamentEntryView tournament = new TournamentEntryView();
        tournament.setSize(getContentPane().getSize());
        setContentPane(tournament);
                break;
                
            default:
                break;
        }
    }//GEN-LAST:event_menuActionPerformed

    public void startTournamentByID(long id){
        TournamentEntryView tournament = new TournamentEntryView();
        tournament.setSize(getContentPane().getSize());
        setContentPane(tournament);
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
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApplicationView().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuEditNewTournament;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuFileExit;
    private javax.swing.JMenu menuFileNew;
    private javax.swing.JMenu menuFileRecent;
    private javax.swing.JMenuItem menuItemFromWeb;
    private javax.swing.JMenuItem menuItemQuickTournament;
    // End of variables declaration//GEN-END:variables
}
