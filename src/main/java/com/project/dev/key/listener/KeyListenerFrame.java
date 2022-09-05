/*
 * @fileoverview {KeyListenerFrame} se encarga de realizar tareas especificas.
 *
 * @version             1.0
 *
 * @author              Dyson Arley Parra Tilano <dysontilano@gmail.com>
 * Copyright (C) Dyson Parra
 *
 * @History v1.0 --- La implementacion de {KeyListenerFrame} fue realizada el 31/07/2022.
 * @Dev - La primera version de {KeyListenerFrame} fue escrita por Dyson A. Parra T.
 */
package com.project.dev.key.listener;

import com.project.dev.tray.setter.TrayIconSetter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * TODO: Definición de {@code KeyListenerFrame}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class KeyListenerFrame extends JFrame implements KeyListenerConstant, KeyListener {

    /* Referencia a la ventana */
    private final JFrame frame = this;

    /**
     * TODO: Definición de {@code KeyListenerFrame}.
     *
     */
    public KeyListenerFrame() {
        initComponents();

        // Agrega keyListener al JFrame.
        frame.addKeyListener(this);

        // Agrega imagen al JFrame usando ruta relativa.
        //frame.setIconImage(new ImageIcon(KEY_ICON_PROJ_PATH).getImage());
        // Agrega imagen al JFrame usando un resource.
        frame.setIconImage(new ImageIcon(JFrame.class.getResource(KEY_ICON_RES_PATH)).getImage());

        // Pone titulo al JFrame.
        frame.setTitle("KeyListener Demo");

        // Agrega el JFrame a la barra de tareas.
        TrayIconSetter.setTrayIconToFrame(frame);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * TODO: Definición de {@code keyTyped}.
     *
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * TODO: Definición de {@code keyPressed}.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();
        int keyInt = keyChar;
        System.out.println(keyCode + " " + keyInt + " " + "'" + keyChar + "'");
    }

    /**
     * TODO: Definición de {@code keyReleased}.
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}