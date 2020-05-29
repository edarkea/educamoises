package vinculacion.educamoises.view.ciencias;

import javax.swing.JFrame;
import javax.swing.JPanel;
import vinculacion.educamoises.utils.FrameUtil;

/**
 *
 * @author Edinson Ayui
 */
public class ScienceViewCourse extends javax.swing.JPanel {

    /**
     * Creates new form MainView
     */
    public ScienceViewCourse() {
        initComponents();
     //  setBackground(new JPanel().getBackground());

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
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        containerPanels = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        containerBtn = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        right = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

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
        text.setText("Ciencias Naturales");
        text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.add(text, new java.awt.GridBagConstraints());

        containerPanels.add(header, java.awt.BorderLayout.NORTH);

        footer.setBackground(new java.awt.Color(245, 201, 130));
        footer.setPreferredSize(new java.awt.Dimension(800, 100));

        volver.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        volver.setText("Volver");
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setFocusable(false);

        Siguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.setContentAreaFilled(false);
        Siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Siguiente.setFocusable(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addComponent(volver)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Siguiente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCursos.png"))); // NOI18N
        jButton3.setText("3° Basica");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton3);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCursos.png"))); // NOI18N
        jButton4.setText("5° Basica");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton4);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnCursos.png"))); // NOI18N
        jButton5.setText("7° Basica");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(150, 185));
        jButton5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        containerBtn.add(jButton5);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Siguiente;
    private javax.swing.JPanel center;
    public javax.swing.JPanel containerBtn;
    private javax.swing.JPanel containerPanels;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    public javax.swing.JLabel text;
    public javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
