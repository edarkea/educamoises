package vinculacion.educamoises.view.matematicas;

import java.util.ArrayList;

public class Problemas {

    private ArrayList respuestas;
    private ArrayList preguntas;

    int cont;

    public Problemas() {
        cont = 0;
    }

    public void respuesta() {
        respuestas = new ArrayList<String>();
        preguntas = new ArrayList<String>();

        for (int i = 0; i < 4; i = cont) {
            int numerador = (int) Math.floor(Math.random() * 10 + 1);
            int denominador = (int) Math.floor(Math.random() * 10 + 1);

            if (!(numerador > denominador)) {

                double division = (double) numerador / denominador;
                String pregunta = porcentaje(division);
                if (!(preguntas.indexOf(pregunta) != -1)) {
                    preguntas.add(pregunta);
                    String respuesta = numerador + "/" + denominador;
                    respuestas.add(respuesta);
                    cont++;
                }

            }

        }

    }

    public String porcentaje(double valor) {
        int pregunta = (int) (valor * 100);
        return pregunta + "%";
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList respuestas) {
        this.respuestas = respuestas;
    }

}
