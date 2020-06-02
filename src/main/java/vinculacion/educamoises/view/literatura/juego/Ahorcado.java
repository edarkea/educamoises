package vinculacion.educamoises.view.literatura.juego;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HERNAN
 */
public class Ahorcado {

    JTextField txtPalabra;//Jtext Field donde se guarda la palabra 
    JLabel lblErrores;//JLabel para poner los iconos de error
    JLabel lblDibujo;//JLabel para poner los iconos de Ahorcado
    private boolean play = false;
    //Array de palabras disponibles para jugar.
    //Pueden agregar mas palabras (en MAYUSCULA y sin espacios)
    private String[] diccionario = {"ESCALOFRIO", "ORNITORRINCO", "PROGRAMACION", "PERIODICO", "CUMPLEAÑOS", "HTML", "OCEANO", "SILENCIO",
        "DICCIONARIO", "EPISODIO", "SERVIDOR", "SERPIENTE", "AMERICA", "SOLARIS", "MANZANAS", "UBUNTO", "PRIMAVERA", "BINARIO", "OCTAL",
        "INTELIGENCIA", "ARTIFICIAL", "COMPUTADORAS", "WINDOWS", "TRANSFORMACION", "INGENIERIA", "ANGELES", "ZEUS", "LIBERTAD", "SISTEMAS", "ALGORITMO",
        "ASTERISCO", "EXPRESATE", "LEYENDA", "DEPREDADORES", "ECLIPSE", "CABELLO", "MINISTERIO", "COSTA", "RICA", "NAVIDAD"};
    private char[] palabra_secreta;
    private char[] palabra;
    int intentos = 0;
    boolean cambios = false;

    public Ahorcado() {
    }

    public Ahorcado(JTextField texto, JLabel dibujo, JLabel errores) {

        this.palabra_secreta = Random().toCharArray();
        String s = "";
        //llena un string con "_" 
        for (int i = 0; i <= this.palabra_secreta.length - 1; i++) {
            s = s + "_";
            //System.out.print(this.palabra_secreta[i]); //no haga trampa
        }
        //convierte este en un array
        this.palabra = s.toCharArray();

        this.txtPalabra = texto;
        this.lblDibujo = dibujo;
        this.lblErrores = errores;

        txtPalabra.setText(s);
        lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/Ahorcado0.png")));
        lblErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/fallo0.png")));
        lblErrores.setToolTipText("No tienes errores!!");
        this.play = true;
    }

    public void evaluar(char word) {
        if (play) {
            String p = "";
            //controla que aun se pueda jugar
            if (this.intentos == 7) {
                JOptionPane.showMessageDialog(null, "Ya has perdido!!");
            } else {
                //evalua caracter por caracter
                for (int j = 0; j <= this.palabra_secreta.length - 1; j++) {
                    //si el caracter se encuentra en la palabra secreta            
                    if (this.palabra_secreta[j] == word) {
                        this.palabra[j] = word;//se asigna para que se pueda ver en pantalla
                        this.cambios = true;
                    }
                    p = p + this.palabra[j];
                }//fin for
                //si no se produjo ningun cambio, quiere decir que el jugador se equivoco
                if (this.cambios == false) {
                    this.intentos += 1; //se incrementa            
                    lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/Ahorcado" + this.intentos + ".png")));
                    lblErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/fallo" + this.intentos + ".png")));
                    if (this.intentos == 1) {
                        lblErrores.setToolTipText("Tienes " + this.intentos + " error!! Te quedan " + (7 - this.intentos) + " intentos más");
                    } else {
                        lblErrores.setToolTipText("Tienes " + this.intentos + " errores!! Te quedan " + (7 - this.intentos) + " intentos más");
                    }
                    if (this.intentos < 7) {
                        JOptionPane.showMessageDialog(null, "Has Fallado!! Te quedan " + (7 - this.intentos) + " intentos más");
                    }
                } else {
                    this.cambios = false;
                }
                this.txtPalabra.setText(p);
                //comprobamos el estado del juego
                gano();
            }
        }
    }

    private void gano() {
        boolean win = false;
        for (int i = 0; i <= this.palabra_secreta.length - 1; i++) {
            if (this.palabra[i] == this.palabra_secreta[i]) {
                win = true;
            } else {
                win = false;
                break;
            }
        }
        if (win) {

            if (this.intentos == 0) {
                lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/ganaste_1.png")));
                JOptionPane.showMessageDialog(null, "Perfecto, cero errores!!" + "\n" + "Felicidades!!! Has Ganado!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.intentos == 1) {
                lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/ganaste_2.png")));
                JOptionPane.showMessageDialog(null, "Tuviste " + (this.intentos) + " error." + "\n" + "Pero has ganado!! Felicidades!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                lblDibujo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ahorcado/ganaste_" + (this.intentos + 1) + ".png")));
                JOptionPane.showMessageDialog(null, "Tuviste " + (this.intentos) + " errores." + "\n" + "Pero has ganado!! Felicidades!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    private String Random() {
        int num = (int) (Math.random() * (diccionario.length));
        return diccionario[num];
    }
}
