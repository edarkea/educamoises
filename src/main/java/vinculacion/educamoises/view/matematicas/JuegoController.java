package vinculacion.educamoises.view.matematicas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vinculacion.educamoises.view.ViewController;

public class JuegoController extends ViewController implements MouseListener, MouseMotionListener {

    private final Juego view = new Juego();
    private MouseEvent myEvent;
    private Point location;
    private JLabel opcion1, opcion2, opcion3, opcion4;
    private JLabel pregunta1, pregunta2, pregunta3, pregunta4;
    private JPanel respuesta1, respuesta2, respuesta3, respuesta4;
    private String op1, op2, op3, op4;
    private String p1, p2, p3, p4;
    int alto, ancho;
    int posx, posy;
    String imagenurl;
    String grado;
    ImageIcon foto;
    JLabel imagen;
  

    public JuegoController(String grado) {
        this.grado = grado;
        initVariables(grado);
        initEvent();

    }

    public void initVariables(String grado) {

        switch (grado) {
            case "3":
                op1 = "Lado inicial";
                op2 = "Angulo";
                op3 = "Vertice";
                op4 = "Lado final";
                imagenurl = "imagen3.png";

                break;
            case "5":
                op1 = "<html><body>Gráfico<br>de lineas<br></body></html>";
                op2 = "<html><body>Gráfico<br>de barras<br></body></html>";
                op3 = "Histograma";
                op4 = "<html><body>Gráfico<br>circular<br></body></html>";
                imagenurl = "imagen5.png";
                break;
            case "7":
                Problemas po = new Problemas();
                po.respuesta();
                op1 = po.getRespuestas().get(0) + "";
                op2 = po.getRespuestas().get(1) + "";
                op3 = po.getRespuestas().get(2) + "";
                op4 = po.getRespuestas().get(3) + "";
                p1 = po.getPreguntas().get(0) + "";
                p2 = po.getPreguntas().get(1) + "";
                p3 = po.getPreguntas().get(2) + "";
                p4 = po.getPreguntas().get(3) + "";
                imagenurl = "imagen7.png";

                break;
            default:
                System.exit(0);
        }

    }

    @Override
    public void initEvent() {
        imagen = new JLabel();
        JLabel texto = new JLabel();
        texto.setText("Arrastra la respuesta correcta a cada rectangulo");

        respuesta1 = new JPanel();
        respuesta2 = new JPanel();
        respuesta3 = new JPanel();
        respuesta4 = new JPanel();

        respuesta1.setLayout(new java.awt.BorderLayout());
        respuesta2.setLayout(new java.awt.BorderLayout());
        respuesta3.setLayout(new java.awt.BorderLayout());
        respuesta4.setLayout(new java.awt.BorderLayout());
        if (grado.equals("7")) {
            pregunta1 = new JLabel(p1);
            pregunta2 = new JLabel(p2);
            pregunta3 = new JLabel(p3);
            pregunta4 = new JLabel(p4);

            pregunta1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
            pregunta2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
            pregunta3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
            pregunta4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

            pregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            pregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            pregunta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            pregunta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        }

        opcion1 = new JLabel(op1);
        opcion2 = new JLabel(op2);
        opcion3 = new JLabel(op3);
        opcion4 = new JLabel(op4);

        texto.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        opcion1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        opcion2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        opcion3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        opcion4.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        opcion1.setBackground(Color.white);
        opcion1.setOpaque(true);
        opcion2.setBackground(Color.white);
        opcion2.setOpaque(true);
        opcion3.setBackground(Color.white);
        opcion3.setOpaque(true);
        opcion4.setBackground(Color.white);
        opcion4.setOpaque(true);

        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        opcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        view.add(opcion1);
        view.add(opcion2);
        view.add(opcion3);
        view.add(opcion4);

        view.add(respuesta1);
        view.add(respuesta2);
        view.add(respuesta3);
        view.add(respuesta4);

        foto = new ImageIcon("src/main/resources/images/" + imagenurl);
        if (grado.equals("7")) {
            view.add(pregunta1);
            view.add(pregunta2);
            view.add(pregunta3);
            view.add(pregunta4);
        }
        view.add(texto);
        view.add(imagen);
        opcion1.addMouseListener(this);
        opcion1.addMouseMotionListener(this);
        opcion2.addMouseListener(this);
        opcion2.addMouseMotionListener(this);
        opcion3.addMouseListener(this);
        opcion3.addMouseMotionListener(this);
        opcion4.addMouseListener(this);
        opcion4.addMouseMotionListener(this);

        view.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                ancho = view.getWidth() / 11 * 2;
                alto = view.getHeight() / 11;
                texto.setBounds(0, 0, view.getWidth(), alto);

                switch (grado) {
                    case "3":
                        pintarImagen();
                        ubicacion3();
                        break;
                    case "5":
                        pintarImagen();
                        ubicacion5y7();
                        break;
                    case "7":
                        pintarImagen();
                        preguntas7();
                        ubicacion5y7();
                        break;
                    default:
                        System.exit(0);
                }

                opcion1.setBounds(view.getWidth() / 2 - (ancho * 2), view.getHeight() - alto, ancho, alto);
                opcion2.setBounds(view.getWidth() / 2 - ancho, view.getHeight() - alto, ancho, alto);
                opcion3.setBounds(view.getWidth() / 2, view.getHeight() - alto, ancho, alto);
                opcion4.setBounds(view.getWidth() / 2 + ancho, view.getHeight() - alto, ancho, alto);

            }

        });

    }

    @Override
    public JPanel getView() {

        return view;
    }

    @Override
    public void removeView() {

    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me
    ) {
        if (me.getSource().equals(opcion1)) {
            myEvent = me;
        }
        if (me.getSource().equals(opcion2)) {
            myEvent = me;
        }
        if (me.getSource().equals(opcion3)) {
            myEvent = me;
        }
        if (me.getSource().equals(opcion4)) {
            myEvent = me;
        }

    }

    @Override
    public void mouseReleased(MouseEvent me) {

        if (me.getSource().equals(opcion1)) {

            if (colision(opcion1, respuesta1)) {
                correcto(opcion1, respuesta1);
            } else {
                opcion1.setBounds(view.getWidth() / 2 - (ancho * 2), view.getHeight() - alto, ancho, alto);

            }
        }

        if (me.getSource().equals(opcion2)) {
            if (colision(opcion2, respuesta2)) {
                correcto(opcion2, respuesta2);
            } else {
                opcion2.setBounds(view.getWidth() / 2 - ancho, view.getHeight() - alto, ancho, alto);

            }
        }

        if (me.getSource().equals(opcion3)) {
            if (colision(opcion3, respuesta3)) {
                correcto(opcion3, respuesta3);
            } else {
                opcion3.setBounds(view.getWidth() / 2, view.getHeight() - alto, ancho, alto);

            }
        }

        if (me.getSource().equals(opcion4)) {
            if (colision(opcion4, respuesta4)) {
                correcto(opcion4, respuesta4);
            } else {
                opcion4.setBounds(view.getWidth() / 2 + ancho, view.getHeight() - alto, ancho, alto);
            }
        }

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    @Override
    public void mouseDragged(MouseEvent me) {

        if (me.getSource().equals(opcion1)) {
            movimiento(me, opcion1);
        }
        if (me.getSource().equals(opcion2)) {
            movimiento(me, opcion2);
        }
        if (me.getSource().equals(opcion3)) {
            movimiento(me, opcion3);
        }
        if (me.getSource().equals(opcion4)) {
            movimiento(me, opcion4);
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

    public void correcto(JLabel label, JPanel panel) {
        view.remove(label);
        panel.add(label);
        label.setCursor(null);
        label.removeMouseListener(this);
        label.removeMouseMotionListener(this);
        view.updateUI();
        
    }

    public void movimiento(MouseEvent me, JLabel label) {
        Component C = me.getComponent();
        location = C.getLocation(location);
        int x = location.x - myEvent.getX() + me.getX();
        int y = location.y - myEvent.getY() + me.getY();
        label.setLocation(x, y);

    }

    public boolean colision(JLabel label, JPanel panel) {

        return panel.getBounds().intersects(label.getBounds());
    }

    public void ubicacion5y7() {

        int margen = view.getWidth() / 19;
        posx = margen;
        posy = view.getHeight() - (alto * 5);
        respuesta2.setBounds(posx, posy, ancho, alto);
        posx = respuesta2.getX() + ancho + margen;
        respuesta4.setBounds(posx, posy, ancho, alto);
        posx = respuesta4.getX() + ancho + margen;
        respuesta3.setBounds(posx, posy, ancho, alto);
        posx = respuesta3.getX() + ancho + margen;
        respuesta1.setBounds(posx, posy, ancho, alto);

    }

    public void ubicacion3() {

        posx = view.getWidth() / 9;
        posy = view.getHeight() / 6;
        respuesta4.setBounds(posx, posy, ancho, alto);
        posx = view.getWidth() / 9;
        posy = view.getHeight() / 2;
        respuesta3.setBounds(posx, posy, ancho, alto);
        posx = view.getWidth() / 2 - (ancho / 2);
        posy = view.getHeight() - alto * 3;
        respuesta1.setBounds(posx, posy, ancho, alto);
        posx = view.getWidth() - ancho;
        posy = alto * 3;
        respuesta2.setBounds(posx, posy, ancho, alto);
    }

    public void preguntas7() {
        int margen = view.getWidth() / 19;
        posx = margen;
        posy = view.getHeight() - (alto * 5);
        pregunta2.setBounds(posx, posy - alto * 3, ancho, alto * 2);
        posx = pregunta2.getX() + ancho + margen;
        pregunta4.setBounds(posx, posy - alto * 3, ancho, alto * 2);
        posx = pregunta4.getX() + ancho + margen;
        pregunta3.setBounds(posx, posy - alto * 3, ancho, alto * 2);
        posx = pregunta3.getX() + ancho + margen;
        pregunta1.setBounds(posx, posy - alto * 3, ancho, alto * 2);
    }

    public void pintarImagen() {
        imagen.setBounds(0, alto, view.getWidth(), view.getHeight() - alto * 2);
        Icon icono = new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        imagen.setIcon(icono);
    }

}
