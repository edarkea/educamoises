/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinculacion.educamoises.view.cuestionario;

import vinculacion.educamoises.model.Materia;

/**
 *
 * @author fredd
 */
public class CuestionarioView1 extends javax.swing.JPanel {

    /**
     * Creates new form CuestionarioView1
     */
    public CuestionarioView1() {
        initComponents();
        jComboBox2.addItem(Materia.MATEMATICAS);
        jComboBox2.addItem(Materia.LENGUA);
        jComboBox2.addItem(Materia.COMPUTACION);
        jComboBox2.addItem(Materia.ESTUDIOS);
        jComboBox2.addItem(Materia.CIENCIAS);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        view1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setLayout(new java.awt.GridLayout(1, 0));

        view1.setBackground(new java.awt.Color(245, 201, 130));
        view1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setBackground(new java.awt.Color(245, 201, 130));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("  Título:");
        jPanel2.add(jLabel1);

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 35));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);

        view1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 201, 130));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("  Grado:");
        jPanel3.add(jLabel2);

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tercero", "Quinto", "Septimo" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setFocusable(false);
        jComboBox1.setPreferredSize(new java.awt.Dimension(200, 35));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1);

        view1.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(245, 201, 130));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel4.setText("Materia:");
        jPanel5.add(jLabel4);

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jComboBox2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setFocusable(false);
        jComboBox2.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel5.add(jComboBox2);

        view1.add(jPanel5);

        jPanel4.setBackground(new java.awt.Color(245, 201, 130));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("Docente:");
        jPanel4.add(jLabel3);

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.setPreferredSize(new java.awt.Dimension(200, 35));
        jPanel4.add(jTextField3);

        view1.add(jPanel4);

        add(view1);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<Materia> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JPanel view1;
    // End of variables declaration//GEN-END:variables
}
