/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;
import java.util.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raphael
 */
public class guestform extends javax.swing.JFrame {
        Statement st=null;
        ResultSet rs=null;
        PreparedStatement prs=null;
        Connection conn = MySqlconnect.dbConnection() ;
    /**
     * Creates new form guestform
     */
    public guestform() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txttitle = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtauth = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtpr1 = new javax.swing.JTextField();
        txtpr2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guest Form");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Top 10 Sales");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Last 10 Books Sold ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setText("Search By Book Title");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Book Title");

        txttitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitleActionPerformed(evt);
            }
        });

        jButton10.setText("Search By Author Name");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter Author Name");

        txtauth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ανθρωπιστικές επιστήμες", "θετικές-τεχνολογικές επιστήμες", "λογοτεχνία-δοκίμια", "μαγειρική", "οικογένεια-σπίτι", "οικονομικά", "παιδικά βιβλία", "περιβάλλον", "πληροφορική", "ταξίδια - τουρισμός", "τέχνες", "σπορ - αθλητισμός", "εκπαιδευτικά", "χόμπι - ελεύθερος χρόνος", "ημερολόγια", "audio books" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Category");

        jButton5.setText("Search By Category");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Search By Price");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtpr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpr1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpr1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpr2))
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttitle)
                            .addComponent(txtauth, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtauth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        try{
            st = conn.createStatement();

            String sql=("SELECT s.BOOKID,b.Title, SUM(s.qty) FROM Sales s , Books b where s.BOOKID=b.BOOKID GROUP BY s.BOOKID,b.Title ORDER BY SUM(s.qty) DESC");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        try{
            st = conn.createStatement();

            String sql=("SELECT bookid,title,sdate FROM(Select s.bookid,b.title,s.sdate From sales s Inner Join books b ON s.bookid=b.bookid Order by s.sdate DESC) Where rownum<=10 Order by sdate DESC");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        String title=String.valueOf(txttitle.getText());
        try{
            st = conn.createStatement();

            String sql=("SELECT BOOKID,TITLE,AUTHOR,CATEGORY,ISBN,PUBLICATION_DATE,PUBLISHERID,QTY,PRICE FROM Books where Title='"+title+"'");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txttitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitleActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        String author=String.valueOf(txtauth.getText());
        try{
            st = conn.createStatement();

            String sql=("SELECT BOOKID,TITLE,AUTHOR,CATEGORY,ISBN,PUBLICATION_DATE,PUBLISHERID,QTY,PRICE FROM Books where author='"+author+"' Order By Title Desc");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtauthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtauthActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String categ=(String)jComboBox2.getSelectedItem();
        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        String name=String.valueOf(txttitle.getText());
        try{
            st = conn.createStatement();

            String sql=("SELECT BOOKID,TITLE,AUTHOR,CATEGORY,ISBN,PUBLICATION_DATE,PUBLISHERID,QTY,PRICE FROM Books where Category='"+categ+"' Order By Title Desc");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelcl = (DefaultTableModel) jTable1.getModel();
        modelcl.setRowCount(0);
        modelcl.setColumnCount(0);
        int price1=Integer.valueOf(txtpr1.getText());
        int price2=Integer.valueOf(txtpr2.getText());
        try{
            st = conn.createStatement();

            String sql=("SELECT BOOKID,TITLE,AUTHOR,CATEGORY,ISBN,PUBLICATION_DATE,PUBLISHERID,QTY,PRICE FROM Books where price Between '"+price1+"' And '"+price2+"' Order By price Asc");
            rs=st.executeQuery(sql);
            ResultSetMetaData metadata= rs.getMetaData();

            int col = metadata.getColumnCount();
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            Vector rows=new Vector();
            Vector columns=new Vector();

            for(int i=1; i<= col; i++){
                columns.addElement(metadata.getColumnName(i));
            }
            model.setColumnIdentifiers(columns);

            while (rs.next()){
                rows =new Vector();
                for (int j=1; j<= col; j++){
                    rows.addElement(rs.getString(j));
                }
                model.addRow(rows);
            }
            jTable1.setModel(model);
        }
        catch (Exception ex){
            System.out.println("exception 2 ");
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtpr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpr1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login a=new Login();
        a.setVisible(true);
        dispose();
                  
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(guestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guestform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guestform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtauth;
    private javax.swing.JTextField txtpr1;
    private javax.swing.JTextField txtpr2;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}