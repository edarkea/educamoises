package vinculacion.educamoises.view;

import javax.swing.JPanel;

/**
 *
 * @author Edinson Ayui
 */
public class LoginView extends javax.swing.JPanel {

    /**
     * Creates new form MainView
     */
    public LoginView() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        containerPanels = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        containerLogin = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        text.setText("Escuela Moises Arteaga Valdivieso");
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

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGap(0, 600, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addComponent(volver)
                .addGap(0, 50, Short.MAX_VALUE))
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

        containerLogin.setBackground(new java.awt.Color(245, 201, 130));
        containerLogin.setMinimumSize(new java.awt.Dimension(629, 370));

        jPanel2.setBackground(new java.awt.Color(249, 207, 146));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(237, 173, 57), 15, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(314, 350));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setBackground(new java.awt.Color(237, 173, 57));
        jPanel3.setPreferredSize(new java.awt.Dimension(312, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgUser.png"))); // NOI18N

        jPasswordField1.setBackground(new java.awt.Color(245, 201, 130));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextField3.setBackground(new java.awt.Color(245, 201, 130));
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("admin");
        jTextField3.setToolTipText("");
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField3.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        jButton1.setBackground(new java.awt.Color(245, 201, 130));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel3);

        containerLogin.add(jPanel2);

        center.add(containerLogin);

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
    private javax.swing.JPanel center;
    private javax.swing.JPanel containerLogin;
    private javax.swing.JPanel containerPanels;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    private javax.swing.JLabel text;
    public javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
