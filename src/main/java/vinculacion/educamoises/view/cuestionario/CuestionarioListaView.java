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
public class CuestionarioListaView extends javax.swing.JPanel {

    /**
     * Creates new form CuestionarioView1
     */
    public CuestionarioListaView() {
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

        view1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(1, 0));

        view1.setBackground(new java.awt.Color(245, 201, 130));
        view1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setBackground(new java.awt.Color(245, 201, 130));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Cuestionarios");
        jPanel2.add(jLabel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TITULO", "CURSO", "PARALELO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);

        view1.add(jPanel2);

        add(view1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable2;
    public javax.swing.JPanel view1;
    // End of variables declaration//GEN-END:variables
}