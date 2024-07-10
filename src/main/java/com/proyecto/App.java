package com.proyecto;

import com.proyecto.controlador.Controlador;
import com.proyecto.vista.InterfazGrafica;

public class App {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        InterfazGrafica interfaz = new InterfazGrafica(controlador);
        interfaz.setVisible(true);
    }
}
