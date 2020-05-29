package vinculacion.educamoises.view.estudios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static vinculacion.educamoises.utils.FrameUtil.changeJPanel;
import static vinculacion.educamoises.utils.FrameUtil.containerViews;
import vinculacion.educamoises.view.ViewController;


/**
 *
 * @author Ana
 */
public class SocialViewCourseController7 extends ViewController implements ActionListener, MouseListener {

    private final SocialViewCourse7 view = new SocialViewCourse7();
    int[] numbers1, numbers2;
    int finalizo = 0;
    Boolean game = false;
    private int im1, im2;
    private JButton[] pbtn = new JButton[2];

    public SocialViewCourseController7() {
        initEvent();
        recargar();
    }
    
    public void recargar(){
        numbers1 = getCardNumbers();
        numbers2 = getCardNumbers();

        view.btnE1.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[0] + ".png"));
        view.btnE2.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[0] + ".png"));
        view.btnE3.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[1] + ".png"));
        view.btnE4.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[1] + ".png"));
        view.btnE5.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[2] + ".png"));
        view.btnE6.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[2] + ".png"));
        view.btnE7.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[3] + ".png"));
        view.btnE8.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[3] + ".png"));
        view.btnE9.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[4] + ".png"));
        view.btnE10.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[4] + ".png"));
        view.btnE11.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[5] + ".png"));
        view.btnE12.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[5] + ".png"));
        view.btnE13.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[6] + ".png"));
        view.btnE14.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[6] + ".png"));
        view.btnE15.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\ca" + numbers1[7] + ".png"));
        view.btnE16.setDisabledIcon(new ImageIcon("C:\\Users\\ANA\\Downloads\\educamoises\\src\\main\\java\\imagenes\\pr" + numbers2[7] + ".png"));
        view.btnE1.setEnabled(true);
        view.btnE2.setEnabled(true);
        view.btnE3.setEnabled(true);
        view.btnE4.setEnabled(true);
        view.btnE5.setEnabled(true);
        view.btnE6.setEnabled(true);
        view.btnE7.setEnabled(true);
        view.btnE8.setEnabled(true);
        view.btnE9.setEnabled(true);
        view.btnE10.setEnabled(true);
        view.btnE11.setEnabled(true);
        view.btnE12.setEnabled(true);
        view.btnE13.setEnabled(true);
        view.btnE14.setEnabled(true);
        view.btnE15.setEnabled(true);
        view.btnE16.setEnabled(true);
    }

    private void compare() {
        if (im1 != 0 && im2 != 0) {
            if (im1 != im2) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
            }else{
                finalizo += 1;
                if (finalizo == 8){
                    JOptionPane.showMessageDialog(view, "Felicidades, usted ha ganado.");
                }
            }
            im1 = 0;
            im2 = 0;
        }

    }

    public int[] getCardNumbers() {
        int[] numbers = new int[8];
        int cont = 0;
        while (cont < 8) {
            Random r = new Random();
            int numero = 1 + r.nextInt(8);
            Boolean enc = false;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numero) {
                    enc = true;
                }
            }
            if (enc != true) {
                if (numero != 0) {
                    numbers[cont] = numero;
                    cont += 1;
                }
            }
        }
        return numbers;
    }

    @Override
    public JPanel getView() {
        return view;
    }

    @Override
    public void initEvent() {
        view.btnE1.addActionListener(this);
        view.btnE2.addActionListener(this);
        view.btnE3.addActionListener(this);
        view.btnE4.addActionListener(this);
        view.btnE5.addActionListener(this);
        view.btnE6.addActionListener(this);
        view.btnE7.addActionListener(this);
        view.btnE8.addActionListener(this);
        view.btnE9.addActionListener(this);
        view.btnE10.addActionListener(this);
        view.btnE11.addActionListener(this);
        view.btnE12.addActionListener(this);
        view.btnE13.addActionListener(this);
        view.btnE14.addActionListener(this);
        view.btnE15.addActionListener(this);
        view.btnE16.addActionListener(this);
        view.volver.addActionListener(this);
        view.nuevo.addActionListener(this);

        view.btnE1.addMouseListener(this);
        view.btnE2.addMouseListener(this);
        view.btnE3.addMouseListener(this);
        view.btnE4.addMouseListener(this);
        view.btnE5.addMouseListener(this);
        view.btnE6.addMouseListener(this);
        view.btnE7.addMouseListener(this);
        view.btnE8.addMouseListener(this);
        view.btnE9.addMouseListener(this);
        view.btnE10.addMouseListener(this);
        view.btnE11.addMouseListener(this);
        view.btnE12.addMouseListener(this);
        view.btnE13.addMouseListener(this);
        view.btnE14.addMouseListener(this);
        view.btnE15.addMouseListener(this);
        view.btnE16.addMouseListener(this);
        view.volver.addMouseListener(this);
        view.nuevo.addMouseListener(this);
    }

    @Override
    public void removeView() {
        containerViews.removeAll();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.btnE1)) {
            boolean ent = false;
            view.btnE1.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[0];
                pbtn[1] = view.btnE1;
            } else {
                im1 = numbers1[0];
                pbtn[0] = view.btnE1;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE2)) {
            boolean ent = false;
            view.btnE2.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[0];
                pbtn[1] = view.btnE2;
            } else {
                im1 = numbers2[0];
                pbtn[0] = view.btnE2;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE3)) {
            boolean ent = false;
            view.btnE3.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[1];
                pbtn[1] = view.btnE3;
            } else {
                im1 = numbers1[1];
                pbtn[0] = view.btnE3;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE4)) {
            boolean ent = false;
            view.btnE4.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[1];
                pbtn[1] = view.btnE4;
            } else {
                im1 = numbers2[1];
                pbtn[0] = view.btnE4;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE5)) {
            boolean ent = false;
            view.btnE5.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[2];
                pbtn[1] = view.btnE5;
            } else {
                im1 = numbers1[2];
                pbtn[0] = view.btnE5;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE6)) {
            boolean ent = false;
            view.btnE6.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[2];
                pbtn[1] = view.btnE6;
            } else {
                im1 = numbers2[2];
                pbtn[0] = view.btnE6;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE7)) {
            boolean ent = false;
            view.btnE7.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[3];
                pbtn[1] = view.btnE7;
            } else {
                im1 = numbers1[3];
                pbtn[0] = view.btnE7;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE8)) {
            boolean ent = false;
            view.btnE8.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[3];
                pbtn[1] = view.btnE8;
            } else {
                im1 = numbers2[3];
                pbtn[0] = view.btnE8;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE9)) {
            boolean ent = false;
            view.btnE9.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[4];
                pbtn[1] = view.btnE9;
            } else {
                im1 = numbers1[4];
                pbtn[0] = view.btnE9;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE10)) {
            boolean ent = false;
            view.btnE10.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[4];
                pbtn[1] = view.btnE10;
            } else {
                im1 = numbers2[4];
                pbtn[0] = view.btnE10;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE11)) {
            boolean ent = false;
            view.btnE11.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[5];
                pbtn[1] = view.btnE11;
            } else {
                im1 = numbers1[5];
                pbtn[0] = view.btnE11;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE12)) {
            boolean ent = false;
            view.btnE12.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[5];
                pbtn[1] = view.btnE12;
            } else {
                im1 = numbers2[5];
                pbtn[0] = view.btnE12;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE13)) {
            boolean ent = false;
            view.btnE13.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[6];
                pbtn[1] = view.btnE13;
            } else {
                im1 = numbers1[6];
                pbtn[0] = view.btnE13;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE14)) {
            boolean ent = false;
            view.btnE14.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[6];
                pbtn[1] = view.btnE14;
            } else {
                im1 = numbers2[6];
                pbtn[0] = view.btnE14;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE15)) {
            boolean ent = false;
            view.btnE15.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers1[7];
                pbtn[1] = view.btnE15;
            } else {
                im1 = numbers1[7];
                pbtn[0] = view.btnE15;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.btnE16)) {
            boolean ent = false;
            view.btnE16.setEnabled(false);
            if (game == true) {
                ent = true;
                im2 = numbers2[7];
                pbtn[1] = view.btnE16;
            } else {
                im1 = numbers2[7];
                pbtn[0] = view.btnE16;
            }
            if (ent == true) {
                game = false;
            } else {
                game = true;
            }
        }
        if (e.getSource().equals(view.volver)) {
            removeView();
            changeJPanel(new SocialViewCourseController());
        }
        if (e.getSource().equals(view.nuevo)) {
            recargar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if (me.getSource().equals(view.volver)) {
            System.out.println("hola");
            view.volver.setForeground(new Color(255, 255, 255));
        }
        if (me.getSource().equals(view.nuevo)) {
            view.nuevo.setForeground(new Color(255, 255, 255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource().equals(view.btnE1)) {
            compare();
        }
        if (me.getSource().equals(view.btnE2)) {
            compare();
        }
        if (me.getSource().equals(view.btnE3)) {
            compare();
        }
        if (me.getSource().equals(view.btnE4)) {
            compare();
        }
        if (me.getSource().equals(view.btnE5)) {
            compare();
        }
        if (me.getSource().equals(view.btnE6)) {
            compare();
        }
        if (me.getSource().equals(view.btnE7)) {

            compare();
        }
        if (me.getSource().equals(view.btnE8)) {

            compare();
        }
        if (me.getSource().equals(view.btnE9)) {
            compare();
        }
        if (me.getSource().equals(view.btnE10)) {
            compare();
        }
        if (me.getSource().equals(view.btnE11)) {
            compare();
        }
        if (me.getSource().equals(view.btnE12)) {
            compare();
        }
        if (me.getSource().equals(view.btnE13)) {
            compare();
        }
        if (me.getSource().equals(view.btnE14)) {
            compare();
        }
        if (me.getSource().equals(view.btnE15)) {
            compare();
        }
        if (me.getSource().equals(view.btnE16)) {
            compare();
        }
        if (me.getSource().equals(view.volver)) {
            view.volver.setForeground(new Color(0, 0, 0));
        }
        if (me.getSource().equals(view.nuevo)) {
            view.nuevo.setForeground(new Color(0, 0, 0));
        }
    }

}
