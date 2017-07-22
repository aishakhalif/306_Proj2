/***********************************************
 *  Aisha S. Khalif
 * 32381361
 * ICT 306
 ***********************************************/

package familytree;

import javax.swing.tree.TreePath;

public class ExampleFamilyGUI extends javax.swing.JFrame {

    /**
     * Creates new form ExampleFamilyGUI
     */
    public ExampleFamilyGUI() {
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

        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExampleTree = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        headingLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoTXf = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Maxwell Quinn");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Ethel Quinn");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("James Quinn");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Harleen Quinn (Harleen Isley)");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Helena Isley");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Jamal Isley");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Olivia Quinn (Olivia Hunkel)");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Maxine Hunkel");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("James Quinn Jr");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        ExampleTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ExampleTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                ExampleTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ExampleTree);

        jSplitPane2.setLeftComponent(jScrollPane1);

        headingLbl.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(255, 0, 0));
        headingLbl.setText("QUINN FAMILY TREE");

        nameLbl.setFont(new java.awt.Font("American Typewriter", 2, 14)); // NOI18N

        infoTXf.setEditable(false);
        infoTXf.setColumns(20);
        infoTXf.setRows(5);
        jScrollPane2.setViewportView(infoTXf);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headingLbl)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(headingLbl)
                .addGap(46, 46, 46)
                .addComponent(nameLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jSplitPane2.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExampleTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_ExampleTreeValueChanged
        // TODO add your handling code here:
      
        String nodePath=evt.getPath().toString();
        TreePath[] paths = evt.getPaths();

		// Iterate through all affected nodes
		for (int i=0; i<paths.length; i++) {
			if (evt.isAddedPath(i)) {
				// This node has been selected
				displayFamilyInfo(paths[i].getLastPathComponent().toString(),nodePath);
				break;
			} else {
				// This node has been deselected
				break;
			}
		}
    }//GEN-LAST:event_ExampleTreeValueChanged

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
            java.util.logging.Logger.getLogger(ExampleFamilyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExampleFamilyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExampleFamilyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExampleFamilyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExampleFamilyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree ExampleTree;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JTextArea infoTXf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables

private void displayFamilyInfo(String projectName,String nodePath) {
    
    if(nodePath.contains("Maxwell Quinn"))
        {
            
            infoTXf.setText("Great Grandfather: Deceased \nMaxwell was born on October 3rd in 1929 in Ontario, Canada");
            
            if(projectName.equals("Maxwell Quinn"))
            {
                nameLbl.setText("Click On Child Nodes to know More Details.");
            }
            else if(projectName.equals("Ethel Quinn"))
            {
                nameLbl.setText("Oldest child and daughter of Maxwel: Deceased");
                infoTXf.setText("Ethel was born on February 12th in 1945 in Ontario, Canada. \nShe was never married and had no children.");
            }
            else if(projectName.equals("James Quinn"))
            {
                nameLbl.setText("Oldest son of Maxwel: living");
                infoTXf.setText("James was born on the 4th of July in 1949 in Ontario, Canada. \nJames married Tina Hobart and had 3 children. \nLast known address: 154 Brick Avenue, Franklin 10007");
            }
            else if(projectName.equals("Harleen Quinn (Harleen Isley)"))
            {
                nameLbl.setText("Oldest Daughter of James and Tina Quinn: living");
                infoTXf.setText("Harleen Isley was born on March 2nd in 1979 in Toronto, Canada. \n Harleen married Paulo Isley in 2003 and had 2 children.\nLast know address: 78 x street, jackson 19008.");
            }
            else if(projectName.equals("Helena Isley"))
            {
                nameLbl.setText("Oldest child and daughter of Harleen and Paulo Isley: living");
                infoTXf.setText("Born on October 25th in 2003 in Toronto Canada.");
            }
            else if(projectName.equals("Jamal Isley"))
            {
                nameLbl.setText("Youngest child and son of Harleen and Paulo Isley: living");
                infoTXf.setText("Born on July 3rd in 2005 in Toronto Canada.");
            }
            
            else if(projectName.equals("Olivia Quinn (Olivia Hunkel)"))
            {
                nameLbl.setText("Youngest daughter of James and Tina Quinn: living");
                infoTXf.setText("Olivia Hunkel was born on August 22nd in 1981 in Toronto, Canada. \n Harleen married Tyson Hunkel in 2005 and had 1 child.\nLast know address: 4 xyz street, lakemba 19008.");
            }
            
            else if(projectName.equals("Maxine Hunkel"))
            {
                nameLbl.setText("Only daughter of Olivia and Tyson Hunkel: living");
                infoTXf.setText("Maxine Hunkel was born on January 15th in 2007 in Toronto, Canada.");
            }
            
            else if(projectName.equals("James Quinn Jr"))
            {
                nameLbl.setText("Only son and youngest child of James and Tina Quinn: living");
                infoTXf.setText("James Quinn Jr was born on January 20th in 1986 in Toronto, Canada. \nLast known address: 154 Brick Avenue, Franklin 10007");
            }
        }

}


}
