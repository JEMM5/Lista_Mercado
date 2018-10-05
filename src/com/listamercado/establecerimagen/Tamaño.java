/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listamercado.establecerimagen;

import com.listamercado.interfazgrafica.Ventana_Principal;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author JONATHAN
 */
public class Tamaño {
    public static ImageIcon EstablecerTamaño(String rutaImagen, byte[] pic){
       //Ventana_Principal vp = new Ventana_Principal();
        //
        ImageIcon miImagen = null;
        if(rutaImagen != null){
            miImagen = new ImageIcon(rutaImagen);
        }else{
            miImagen = new ImageIcon(pic);
        }
        Image img = miImagen.getImage();
        Image img2 = img.getScaledInstance(Ventana_Principal.label_imagen.getWidth(), Ventana_Principal.label_imagen.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
}
