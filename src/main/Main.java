package main;

import static informacion.Mensajes.*;
import static informacion.MensajesC.*;
import informacion.estudiantes.Calificaciones;

import javax.swing.*;
import java.text.DecimalFormat;


public class Main {


    /*1: Se crea un metodo*/
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");

        /*2: Se crea un package refrente a lo que vamos a trabajar
        * Y despues otro que dependerá de lo que nos esta pidiendo
        * Se crea tambien la clase de lo que nos estan pidiendo, ne este caso las calidficaciones
        * y se crea la de mensajes, cada una en su package especifico*/

        /*13: Se importa la libreria swing para mostrarle al usuario */

        /*14: Se hace la instancia de la clase calificaciones*/
        Calificaciones calificaciones = new Calificaciones();

        /*15: Se crea una variable de tipo string que serán para los mensajes
        * que el usuario verá y se importa la clase que tiene los mansajes como static*/
        String nota1 = JOptionPane.showInputDialog(null, MENSAJE_PETICION_NOTA1.getMensaje() );
        String nota2 = JOptionPane.showInputDialog(null, MENSAJE_PETICION_NOTA2.getMensaje());
        String nota3 = JOptionPane.showInputDialog(null, MENSAJE_PETICION_NOTA3.getMensaje());

        /*16: Se llama al objeto de la clase en este caso calificaciones
        * y se le asignan los valores llamando al set de la clase calificaciones*/
        calificaciones.setNota1(Double.parseDouble(nota1));
        calificaciones.setNota2(Double.parseDouble(nota2));
        calificaciones.setNota3(Double.parseDouble(nota3));

        /*17: Aqui es donde se mostrará la nota final*/
        /*Segudido se hacen las condicionales referente al resultado */
        if(calificaciones.notaFinal() >= 4.0 && calificaciones.notaFinal()<= 5.0)
        {
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION_CONDICION1.getMensaje() + df.format(calificaciones.notaFinal()));
        }
        else if(calificaciones.notaFinal() >= 3.0 && calificaciones.notaFinal() <= 3.9){

            JOptionPane.showMessageDialog(null, MENSAJE_PETICION_CONDICION2.getMensaje() + df.format(calificaciones.notaFinal()));
        }
        else if(calificaciones.notaFinal() >= 2.0 && calificaciones.notaFinal() <= 2.9){

            JOptionPane.showMessageDialog(null, MENSAJE_PETICION_CONDICION3.getMensaje() + df.format(calificaciones.notaFinal()));
        }
        else if(calificaciones.notaFinal() >= 1.0 && calificaciones.notaFinal() <= 1.99){

            JOptionPane.showMessageDialog(null, MENSAJE_PETICION_CONDICION4.getMensaje() + df.format(calificaciones.notaFinal()));
        }
        else if (calificaciones.notaFinal() >= 0.0 && calificaciones.notaFinal() <= 0.9){
            JOptionPane.showMessageDialog(null, MENSAJE_PETICION_CONDICION5.getMensaje() + df.format(calificaciones.notaFinal()));
        }
    }
}
