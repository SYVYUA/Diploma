/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttongroup;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class step9Form extends javax.swing.JFrame {
    public step9Form() {
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
        step9Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Метод Ленда та Дойга, крок 9");
        setResizable(false);

        jLabel1.setText("Розв’язуємо ЗЦЛП1");

        step9Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(step9Table);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot_2.jpg"))); // NOI18N

        jButton4.setText("Перевірка");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("В таблиці міститься оптимальний розвязок?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Так");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Ні");

        jLabel4.setText("Для ЗЦЛП1 складіть 1-шу симплекс-таблицю");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(103, 103, 103)
                        .addComponent(jRadioButton2)
                        .addGap(16, 16, 16)))
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(86, 86, 86)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        step10Form frame4 = new step10Form();
        frame4.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton2.isSelected()) {
            //JOptionPane.showMessageDialog(null, "Вірно, переходимо до наступного кроку!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            step10Form frame4 = new step10Form();
            frame4.setVisible(true);
            //видаляємо(очищаємо) попередній фрейм
            dispose();}
        if (jRadioButton1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        step8Form frame4 = new step8Form();
        frame4.setVisible(true);
        //видаляємо(очищаємо) попередній фрейм
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ((step9Table.getModel().getValueAt(1, 0).equals("P3"))
                && ((step9Table.getModel().getValueAt(2, 0).equals("P4")))
                && ((step9Table.getModel().getValueAt(3, 0).equals("P5")))
                && ((step9Table.getModel().getValueAt(1, 1).equals("0")))
                && ((step9Table.getModel().getValueAt(2, 1).equals("0")))
                && ((step9Table.getModel().getValueAt(3, 1).equals("0")))
                && ((step9Table.getModel().getValueAt(1, 2).equals("5")))
                && ((step9Table.getModel().getValueAt(2, 2).equals("12")))
                && ((step9Table.getModel().getValueAt(3, 2).equals("1")))
                && ((step9Table.getModel().getValueAt(4, 2).equals("0")))
                && ((step9Table.getModel().getValueAt(1, 3).equals("1")))
                && ((step9Table.getModel().getValueAt(2, 3).equals("1")))
                && ((step9Table.getModel().getValueAt(3, 3).equals("0")))
                && ((step9Table.getModel().getValueAt(4, 3).equals("-1")))
                && ((step9Table.getModel().getValueAt(1, 4).equals("0")))
                && ((step9Table.getModel().getValueAt(2, 4).equals("6")))
                && ((step9Table.getModel().getValueAt(3, 4).equals("1")))
                && ((step9Table.getModel().getValueAt(4, 4).equals("-1")))
                && ((step9Table.getModel().getValueAt(1, 5).equals("1")))
                && ((step9Table.getModel().getValueAt(2, 5).equals("0")))
                && ((step9Table.getModel().getValueAt(3, 5).equals("0")))
                && ((step9Table.getModel().getValueAt(4, 5).equals("0")))
                && ((step9Table.getModel().getValueAt(1, 6).equals("0")))
                && ((step9Table.getModel().getValueAt(2, 6).equals("1")))
                && ((step9Table.getModel().getValueAt(3, 6).equals("0")))
                && ((step9Table.getModel().getValueAt(4, 6).equals("0")))
                && ((step9Table.getModel().getValueAt(1, 7).equals("0")))
                && ((step9Table.getModel().getValueAt(2, 7).equals("0")))
                && ((step9Table.getModel().getValueAt(3, 7).equals("1")))
                && ((step9Table.getModel().getValueAt(4, 7).equals("0")))
                && ((step9Table.getModel().getValueAt(1, 8).equals("-")))
                && ((step9Table.getModel().getValueAt(2, 8).equals("2")))
                && (step9Table.getModel().getValueAt(3, 8).equals("1"))) {
            JOptionPane.showMessageDialog(null, "Вірно, дайте відповідь на запитання!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            jButton1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Не вірно!!! Проаналізуйте підказку і дайте відповідь на питання.", "Помилка", JOptionPane.WARNING_MESSAGE);
            prompt4 frame = new prompt4();
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
            java.util.logging.Logger.getLogger(step9Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(step9Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(step9Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(step9Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new step9Form().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable step9Table;
    // End of variables declaration//GEN-END:variables
}
