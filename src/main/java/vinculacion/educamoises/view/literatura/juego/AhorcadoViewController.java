package vinculacion.educamoises.view.literatura.juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.MainViewController;
import vinculacion.educamoises.view.ViewController;
import vinculacion.educamoises.view.literatura.LiteratureViewCourseController;

/**
 *
 * @author Edinson Ayui
 */
public class AhorcadoViewController extends ViewController implements ActionListener {

    private final AhorcadoView view = new AhorcadoView();
    private Ahorcado juego = new Ahorcado();
    private Color color = new Color(200, 0, 0);

    public AhorcadoViewController() {
        initEvent();
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        this.view.btnResolver.setEnabled(false);
        this.view.btnIniciar.addActionListener(this);
        this.view.btnResolver.addActionListener(this);
        this.view.btnSalir.addActionListener(this);
        this.view.btnIniciar.setActionCommand("INICIAR");
        this.view.btnResolver.setActionCommand("RESOLVER");
        this.view.btnSalir.setActionCommand("SALIR");
        this.view.button_A.addActionListener(this);
        this.view.button_B.addActionListener(this);
        this.view.button_C.addActionListener(this);
        this.view.button_D.addActionListener(this);
        this.view.button_E.addActionListener(this);
        this.view.button_F.addActionListener(this);
        this.view.button_G.addActionListener(this);
        this.view.button_H.addActionListener(this);
        this.view.button_I.addActionListener(this);
        this.view.button_J.addActionListener(this);
        this.view.button_K.addActionListener(this);
        this.view.button_L.addActionListener(this);
        this.view.button_M.addActionListener(this);
        this.view.button_N.addActionListener(this);
        this.view.button_Ñ.addActionListener(this);
        this.view.button_O.addActionListener(this);
        this.view.button_P.addActionListener(this);
        this.view.button_Q.addActionListener(this);
        this.view.button_R.addActionListener(this);
        this.view.button_S.addActionListener(this);
        this.view.button_T.addActionListener(this);
        this.view.button_U.addActionListener(this);
        this.view.button_V.addActionListener(this);
        this.view.button_W.addActionListener(this);
        this.view.button_X.addActionListener(this);
        this.view.button_Y.addActionListener(this);
        this.view.button_Z.addActionListener(this);

        this.view.button_A.setActionCommand("A");
        this.view.button_B.setActionCommand("B");
        this.view.button_C.setActionCommand("C");
        this.view.button_D.setActionCommand("D");
        this.view.button_E.setActionCommand("E");
        this.view.button_F.setActionCommand("F");
        this.view.button_G.setActionCommand("G");
        this.view.button_H.setActionCommand("H");
        this.view.button_I.setActionCommand("I");
        this.view.button_J.setActionCommand("J");
        this.view.button_K.setActionCommand("K");
        this.view.button_L.setActionCommand("L");
        this.view.button_M.setActionCommand("M");
        this.view.button_N.setActionCommand("N");
        this.view.button_Ñ.setActionCommand("Ñ");
        this.view.button_O.setActionCommand("O");
        this.view.button_P.setActionCommand("P");
        this.view.button_Q.setActionCommand("Q");
        this.view.button_R.setActionCommand("R");
        this.view.button_S.setActionCommand("S");
        this.view.button_T.setActionCommand("T");
        this.view.button_U.setActionCommand("U");
        this.view.button_V.setActionCommand("V");
        this.view.button_W.setActionCommand("W");
        this.view.button_X.setActionCommand("X");
        this.view.button_Y.setActionCommand("Y");
        this.view.button_Z.setActionCommand("Z");
    }

    private void restaurar_color() {
        Color c = new Color(240, 240, 240);
        this.view.button_A.setBackground(c);
        this.view.button_B.setBackground(c);
        this.view.button_D.setBackground(c);
        this.view.button_C.setBackground(c);
        this.view.button_E.setBackground(c);
        this.view.button_F.setBackground(c);
        this.view.button_G.setBackground(c);
        this.view.button_H.setBackground(c);
        this.view.button_I.setBackground(c);
        this.view.button_J.setBackground(c);
        this.view.button_K.setBackground(c);
        this.view.button_L.setBackground(c);
        this.view.button_M.setBackground(c);
        this.view.button_N.setBackground(c);
        this.view.button_Ñ.setBackground(c);
        this.view.button_O.setBackground(c);
        this.view.button_P.setBackground(c);
        this.view.button_Q.setBackground(c);
        this.view.button_R.setBackground(c);
        this.view.button_S.setBackground(c);
        this.view.button_T.setBackground(c);
        this.view.button_U.setBackground(c);
        this.view.button_V.setBackground(c);
        this.view.button_W.setBackground(c);
        this.view.button_X.setBackground(c);
        this.view.button_Y.setBackground(c);
        this.view.button_Z.setBackground(c);
    }

    @Override
    public void removeView() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "INICIAR":
                juego = new Ahorcado(this.view.txtPalabra, this.view.Dibujo, this.view.Erorres);
                restaurar_color();
                this.view.btnResolver.setEnabled(true);
                return;
            case "RESOLVER":
                JOptionPane.showMessageDialog(view, "No hagas trampa!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                return;
            case "SALIR":
                containerViews.removeAll();
                changeJPanel(new LiteratureViewCourseController());
                return;
        }
        juego.evaluar(e.getActionCommand().toCharArray()[0]);
    }

}
