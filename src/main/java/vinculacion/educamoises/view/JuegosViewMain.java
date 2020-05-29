package vinculacion.educamoises.view;

import javax.swing.JPanel;

/**
 *
 * @author Edinson Ayui
 */
public class JuegosViewMain extends javax.swing.JPanel {

    /**
     * Creates new form MainView
     */
    public JuegosViewMain() {
        initComponents();
        setBackground(new JPanel().getBackground());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        containerPanels = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        profesor = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        containerBtn = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        right = new javax.swing.JPanel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridLayout(1, 0));

        containerPanels.setMinimumSize(new java.awt.Dimension(800, 600));
        containerPanels.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(245, 201, 130));
        header.setMinimumSize(new java.awt.Dimension(800, 80));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        text.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        text.setForeground(new java.awt.Color(255, 102, 102));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Aprende Jugando");
        text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.add(text, new java.awt.GridBagConstraints());

        containerPanels.add(header, java.awt.BorderLayout.NORTH);

        footer.setBackground(new java.awt.Color(245, 201, 130));
        footer.setPreferredSize(new java.awt.Dimension(800, 50));

        profesor.setBackground(new java.awt.Color(0, 0, 0));
        profesor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        profesor.setText("Login");
        profesor.setBorderPainted(false);
        profesor.setContentAreaFilled(false);
        profesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profesor.setFocusable(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGap(0, 711, Short.MAX_VALUE)
                .addComponent(profesor))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addComponent(profesor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        containerPanels.add(footer, java.awt.BorderLayout.SOUTH);

        left.setBackground(new java.awt.Color(245, 201, 130));
        left.setPreferredSize(new java.awt.Dimension(100, 400));

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        containerPanels.add(left, java.awt.BorderLayout.WEST);

        center.setMinimumSize(new java.awt.Dimension(600, 370));
        center.setPreferredSize(new java.awt.Dimension(400, 400));
        center.setLayout(new java.awt.GridLayout(1, 0));

        containerBtn.setBackground(new java.awt.Color(245, 201, 130));
        containerBtn.setMinimumSize(new java.awt.Dimension(629, 370));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCiencias.png"))); // NOI18N
        jButton3.setText("Ciencias");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        containerBtn.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnLiteratura.png"))); // NOI18N
        jButton4.setText("Literatura");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnSociales.png"))); // NOI18N
        jButton5.setText("Sociales");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton5);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnMatematicas.png"))); // NOI18N
        jButton2.setText("Matematicas");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton2);

        center.add(containerBtn);

        containerPanels.add(center, java.awt.BorderLayout.CENTER);

        right.setBackground(new java.awt.Color(245, 201, 130));
        right.setPreferredSize(new java.awt.Dimension(100, 400));

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rightLayout.setVerticalGroup(
            rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        containerPanels.add(right, java.awt.BorderLayout.EAST);

        add(containerPanels);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel center;
    private javax.swing.JPanel containerBtn;
    private javax.swing.JPanel containerPanels;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel left;
    public javax.swing.JButton profesor;
    private javax.swing.JPanel right;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}