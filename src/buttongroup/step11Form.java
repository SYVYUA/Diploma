/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttongroup;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class step11Form extends javax.swing.JFrame {
    public step11Form() {
        initComponents();
        jButton1.setVisible(false);
        ImageIcon icon = new ImageIcon("src/img/matematika-ustnyj-schet-2.0.4-19.png");
	setIconImage(icon.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        step11Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Метод Ленда та Дойга, крок 11");
        setResizable(false);

        step11Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "P1", "P2", "P3", "P4", "P5"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Базис", "Сб", "Р0", "1", "1", "0", "0", "0"
            }
        ));
        jScrollPane1.setViewportView(step11Table);

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

        jLabel1.setText("Для ЗЦЛП1 складіть 3-тю симплекс-таблицю");

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

        jLabel2.setText("В таблиці міститься оптимальний розвязок?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Так");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Ні");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(87, 87, 87)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jRadioButton1)
                        .addGap(140, 140, 140)
                        .addComponent(jRadioButton3)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jRadioButton3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Не вірно!!!", "Помилка", JOptionPane.WARNING_MESSAGE);
        }
        if (jRadioButton1.isSelected()) {
            //JOptionPane.showMessageDialog(null, "Вірно, переходимо до наступного кроку!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            step12Form frame5 = new step12Form();
            frame5.setVisible(true);
            //видаляємо(очищаємо) попередній фрейм
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        step12Form frame6 = new step12Form();
        frame6.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        step10Form frame6 = new step10Form();
        frame6.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ((step11Table.getModel().getValueAt(1, 0).equals("P1"))
                && ((step11Table.getModel().getValueAt(2, 0).equals("P4")))
                && ((step11Table.getModel().getValueAt(3, 0).equals("P2")))
                && ((step11Table.getModel().getValueAt(1, 1).equals("1")))
                && ((step11Table.getModel().getValueAt(2, 1).equals("0")))
                && ((step11Table.getModel().getValueAt(3, 1).equals("1")))
                && ((step11Table.getModel().getValueAt(1, 2).equals("5")))
                && ((step11Table.getModel().getValueAt(2, 2).equals("1")))
                && ((step11Table.getModel().getValueAt(3, 2).equals("1")))
                && ((step11Table.getModel().getValueAt(4, 2).equals("6")))
                && ((step11Table.getModel().getValueAt(1, 3).equals("1")))
                && ((step11Table.getModel().getValueAt(2, 3).equals("0")))
                && ((step11Table.getModel().getValueAt(3, 3).equals("0")))
                && ((step11Table.getModel().getValueAt(4, 3).equals("0")))
                && ((step11Table.getModel().getValueAt(1, 4).equals("0")))
                && ((step11Table.getModel().getValueAt(2, 4).equals("0")))
                && ((step11Table.getModel().getValueAt(3, 4).equals("1")))
                && ((step11Table.getModel().getValueAt(4, 4).equals("0")))
                && ((step11Table.getModel().getValueAt(1, 5).equals("1")))
                && ((step11Table.getModel().getValueAt(2, 5).equals("0")))
                && ((step11Table.getModel().getValueAt(3, 5).equals("0")))
                && ((step11Table.getModel().getValueAt(4, 5).equals("1")))
                && ((step11Table.getModel().getValueAt(1, 6).equals("0")))
                && ((step11Table.getModel().getValueAt(2, 6).equals("1")))
                && ((step11Table.getModel().getValueAt(3, 6).equals("0")))
                && ((step11Table.getModel().getValueAt(4, 6).equals("0")))
                && ((step11Table.getModel().getValueAt(1, 7).equals("0")))
                && ((step11Table.getModel().getValueAt(2, 7).equals("0")))
                && ((step11Table.getModel().getValueAt(3, 7).equals("0")))
                && (step11Table.getModel().getValueAt(4, 7).equals("1"))) {
            JOptionPane.showMessageDialog(null, "Вірно, дайте відповідь на запитання!", "Вірно", JOptionPane.PLAIN_MESSAGE);
            jButton1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Не вірно!!! Проаналізуйте підказку і дайте відповідь на питання.", "Помилка", JOptionPane.WARNING_MESSAGE);
            prompt6 frame = new prompt6();
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
            java.util.logging.Logger.getLogger(step11Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(step11Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(step11Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(step11Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new step11Form().setVisible(true);
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
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable step11Table;
    // End of variables declaration//GEN-END:variables
}
