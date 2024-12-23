/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import gui.Dashboard;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Database;

/**
 *
 * @author janin
 */
public class Beaten extends javax.swing.JPanel {

    String username = Dashboard.getUsername();

    /**
     * Creates new form Beaten
     */
    public Beaten() {
        initComponents();
        loadBeatGames();
    }

    public void loadBeatGames() {
        try {
            ResultSet resultSet = Database.executeSearch("SELECT * FROM `mygame` JOIN `user` ON `user`.`username` = `mygame`.`user_username` JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `user`.`username` = '" + username + "' AND `type`.`id` = '1'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("name"));
                vector.add(resultSet.getString("genre"));
                vector.add(resultSet.getString("publisher"));
                vector.add(resultSet.getString("playtime"));
                vector.add(resultSet.getString("year"));

                dtm.addRow(vector);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Game", "Gener", "Publisher", "Playtime", "Year"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove from Beaten");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 210, 11), 3));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Playing");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 210, 11), 3));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("On Pause");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 210, 11), 3));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Quit");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 210, 11), 3));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = jTable1.getSelectedRow();
        String name = String.valueOf(jTable1.getValueAt(row, 0));

        try {
            Database.executeIUD("DELETE FROM `mygame` WHERE `name` = '" + name + "' AND `user_username` = '" + username + "' AND `type_id` = '1' ");
            JOptionPane.showMessageDialog(this, "Game removed from beaten", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        loadBeatGames();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = jTable1.getSelectedRow();
        String name = String.valueOf(jTable1.getValueAt(row, 0));

        try {
            ResultSet resultSet = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` = '2' ");

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Game is already in Playing", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {

                ResultSet resultSet2 = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` != '2' ");

                ResultSet resultSet1 = Database.executeSearch("SELECT * FROM `game` WHERE `name` = '" + name + "'");
                if (resultSet2.next()) {
                    Database.executeIUD("UPDATE `mygame` SET `type_id` = '2' WHERE `user_username` = '" + username + "' AND `name` = '" + name + "'");
                    JOptionPane.showMessageDialog(this, "Added to Playing", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else if (resultSet1.next()) {

                    String genre = resultSet1.getString("genre");
                    String publisher = resultSet1.getString("publisher");
                    int year = resultSet1.getInt("year");
                    String description = resultSet1.getString("description");
                    String playtime = resultSet1.getString("playtime");

                    Database.executeIUD("INSERT INTO `mygame` (`name`, `genre`, `publisher`, `year`, `description`, `type_id`, `playtime`, `user_username`) "
                            + "VALUES ('" + name + "', '" + genre + "', '" + publisher + "', '" + year + "', '" + description + "', '2', '" + playtime + "', '" + username + "')");

                    JOptionPane.showMessageDialog(this, "Added to Playing", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Unknown error occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        loadBeatGames();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int row = jTable1.getSelectedRow();
        String name = String.valueOf(jTable1.getValueAt(row, 0));

        try {
            ResultSet resultSet = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` = '3' ");

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Game is already in On Pause", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {

                ResultSet resultSet2 = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` != '3' ");

                ResultSet resultSet1 = Database.executeSearch("SELECT * FROM `game` WHERE `name` = '" + name + "'");
                if (resultSet2.next()) {
                    Database.executeIUD("UPDATE `mygame` SET `type_id` = '3' WHERE `user_username` = '" + username + "' AND `name` = '" + name + "'");
                    JOptionPane.showMessageDialog(this, "Added to On Pause", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else if (resultSet1.next()) {

                    String genre = resultSet1.getString("genre");
                    String publisher = resultSet1.getString("publisher");
                    int year = resultSet1.getInt("year");
                    String description = resultSet1.getString("description");
                    String playtime = resultSet1.getString("playtime");

                    Database.executeIUD("INSERT INTO `mygame` (`name`, `genre`, `publisher`, `year`, `description`, `type_id`, `playtime`, `user_username`) "
                            + "VALUES ('" + name + "', '" + genre + "', '" + publisher + "', '" + year + "', '" + description + "', '3', '" + playtime + "', '" + username + "')");

                    JOptionPane.showMessageDialog(this, "Added to On Pause", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Unknown error occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        loadBeatGames();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int row = jTable1.getSelectedRow();
        String name = String.valueOf(jTable1.getValueAt(row, 0));

        try {
            ResultSet resultSet = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` = '4' ");

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Game is already in Quit", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {

                ResultSet resultSet2 = Database.executeSearch("SELECT * FROM `mygame` INNER JOIN `user` ON `user`.`username` = `mygame`.`user_username` INNER JOIN `type` ON `mygame`.`type_id` = `type`.`id` WHERE `mygame`.`name` = '" + name + "' AND `mygame`.`user_username` = '" + username + "' AND `mygame`.`type_id` != '4' ");

                ResultSet resultSet1 = Database.executeSearch("SELECT * FROM `game` WHERE `name` = '" + name + "'");
                if (resultSet2.next()) {
                    Database.executeIUD("UPDATE `mygame` SET `type_id` = '4' WHERE `user_username` = '" + username + "' AND `name` = '" + name + "'");
                    JOptionPane.showMessageDialog(this, "Added to Quit", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else if (resultSet1.next()) {

                    String genre = resultSet1.getString("genre");
                    String publisher = resultSet1.getString("publisher");
                    int year = resultSet1.getInt("year");
                    String description = resultSet1.getString("description");
                    String playtime = resultSet1.getString("playtime");

                    Database.executeIUD("INSERT INTO `mygame` (`name`, `genre`, `publisher`, `year`, `description`, `type_id`, `playtime`, `user_username`) "
                            + "VALUES ('" + name + "', '" + genre + "', '" + publisher + "', '" + year + "', '" + description + "', '4', '" + playtime + "', '" + username + "')");

                    JOptionPane.showMessageDialog(this, "Added to Quit", "Success", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Unknown error occured", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        loadBeatGames();
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
