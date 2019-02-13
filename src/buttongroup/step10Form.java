/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttongroup;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class step10Form extends javax.swing.JFrame {
    public step10Form() {
        initComponents();
        jButton1.setVisible(false);
        ImageIcon icon = new ImageIcon("src/img/matematika-ustnyj-schet-2.0.4-19.png");
	setIconImage(icon.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        step10Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Метод Ленда та Дойга, крок 10");
        setResizable(false);

        jLabel1.setText("Для ЗЦЛП1 складіть 2-гу симплекс-таблицю");

        step10Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "P1", "P2", "P3", "P4", "P5", null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Базис", "Сб", "Р0", "1", "1", "0", "0", "0", "bi/aik"
            }
        ));
        jScrollPane1.setViewportView(step10Table);

        jButton1.setText("Відповідь");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Пропуск");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Назад");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Перевірка");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Виберіть напрямний стовбець?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Р1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Р2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Р3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Р4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Р5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(84, 84, 84)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton5.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
        if (jRadioButton2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
        if (jRadioButton3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
        if (jRadioButton4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
        if (jRadioButton1.isSelected()) {
            //JOptionPane.showMessageDialog(null, "Вірно, переходимо до наступного кроку!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            step11Form frame5 = new step11Form();
            frame5.setVisible(true);
            //видаляємо(очищаємо) попередній фрейм
            dispose();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        step11Form frame5 = new step11Form();
        frame5.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        step9Form frame5 = new step9Form();
        frame5.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ((step10Table.getModel().getValueAt(1, 0).equals("P3"))
                && ((step10Table.getModel().getValueAt(2, 0).equals("P4")))
                && ((step10Table.getModel().getValueAt(3, 0).equals("P2")))
                && ((step10Table.getModel().getValueAt(1, 1).equals("0")))
                && ((step10Table.getModel().getValueAt(2, 1).equals("0")))
                && ((step10Table.getModel().getValueAt(3, 1).equals("1")))
                && ((step10Table.getModel().getValueAt(1, 2).equals("5")))
                && ((step10Table.getModel().getValueAt(2, 2).equals("6")))
                && ((step10Table.getModel().getValueAt(3, 2).equals("1")))
                && ((step10Table.getModel().getValueAt(4, 2).equals("1")))
                && ((step10Table.getModel().getValueAt(1, 3).equals("1")))
                && ((step10Table.getModel().getValueAt(2, 3).equals("1")))
                && ((step10Table.getModel().getValueAt(3, 3).equals("0")))
                && ((step10Table.getModel().getValueAt(4, 3).equals("-1")))
                && ((step10Table.getModel().getValueAt(1, 4).equals("0")))
                && ((step10Table.getModel().getValueAt(2, 4).equals("0")))
                && ((step10Table.getModel().getValueAt(3, 4).equals("1")))
                && ((step10Table.getModel().getValueAt(4, 4).equals("0")))
                && ((step10Table.getModel().getValueAt(1, 5).equals("1")))
                && ((step10Table.getModel().getValueAt(2, 5).equals("0")))
                && ((step10Table.getModel().getValueAt(3, 5).equals("0")))
                && ((step10Table.getModel().getValueAt(4, 5).equals("0")))
                && ((step10Table.getModel().getValueAt(1, 6).equals("0")))
                && ((step10Table.getModel().getValueAt(2, 6).equals("1")))
                && ((step10Table.getModel().getValueAt(3, 6).equals("0")))
                && ((step10Table.getModel().getValueAt(4, 6).equals("0")))
                && ((step10Table.getModel().getValueAt(1, 7).equals("0")))
                && ((step10Table.getModel().getValueAt(2, 7).equals("-6")))
                && ((step10Table.getModel().getValueAt(3, 7).equals("1")))
                && ((step10Table.getModel().getValueAt(4, 7).equals("1")))
                && ((step10Table.getModel().getValueAt(1, 8).equals("5")))
                && ((step10Table.getModel().getValueAt(2, 8).equals("6")))
                && (step10Table.getModel().getValueAt(3, 8).equals(""))) {
            JOptionPane.showMessageDialog(null, "Вірно, дайте відповідь на питання!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            jButton1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Не вірно!!! Проаналізуйте підказку і дайте відповідь на питання.", "Помилка", JOptionPane.WARNING_MESSAGE);
            prompt5 frame = new prompt5();
            frame.setVisible(true);
            jButton1.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(step10Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(step10Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(step10Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(step10Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new step10Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable step10Table;
    // End of variables declaration//GEN-END:variables
}
