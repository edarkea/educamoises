package vinculacion.educamoises.view.cuestionario;

/**
 *
 * @author Edinson Ayui
 */
public class CuestionarioView extends javax.swing.JPanel {

    /**
     * Creates new form CuestionarioView
     */
    public CuestionarioView() {
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

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        siguiente = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        right = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(245, 201, 130));
        header.setPreferredSize(new java.awt.Dimension(800, 100));
        header.setLayout(new java.awt.GridBagLayout());

        text.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        text.setForeground(new java.awt.Color(255, 102, 102));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Lista de Cuestionarios");
        text.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.add(text, new java.awt.GridBagConstraints());

        jPanel1.add(header, java.awt.BorderLayout.NORTH);

        footer.setBackground(new java.awt.Color(245, 201, 130));
        footer.setPreferredSize(new java.awt.Dimension(800, 100));

        siguiente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        siguiente.setText("Crear");
        siguiente.setContentAreaFilled(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.setFocusable(false);

        volver.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        volver.setText("Salir");
        volver.setContentAreaFilled(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setFocusable(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siguiente)
                    .addComponent(volver))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        jPanel1.add(footer, java.awt.BorderLayout.SOUTH);

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

        jPanel1.add(right, java.awt.BorderLayout.EAST);

        left.setBackground(new java.awt.Color(245, 201, 130));
        left.setPreferredSize(new java.awt.Dimension(100, 400));

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(left, java.awt.BorderLayout.WEST);

        container.setBackground(new java.awt.Color(255, 153, 153));
        container.setLayout(new java.awt.BorderLayout());
        jPanel1.add(container, java.awt.BorderLayout.CENTER);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel container;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    public javax.swing.JButton siguiente;
    private javax.swing.JLabel text;
    public javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
