/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.reproductoheins.reproductorfinal;

import conexion_db.Conexionoracle;
import javax.swing.SwingUtilities;
import uk.co.caprica.vlcj.factory.discovery.NativeDiscovery;

/**
 *
 * @author gman
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        SwingUtilities.invokeLater(() -> {
            Reproductor player = new Reproductor();
            player.setVisible(true);
        });

        boolean found = new NativeDiscovery().discover();
        if (found) {
            System.out.println("libvlc funciona!");
        } else {
            System.out.println("libvlc no funciona.");
            
        }
         Conexionoracle conexion1 = new  Conexionoracle();
         conexion1.desconectar();
    }
}
