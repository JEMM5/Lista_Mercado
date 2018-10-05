package com.listamercado.establecerimagen;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.listamercado.interfazgrafica.Ventana_Principal;


/**
 *
 * @author JONATHAN
 */
public class EleccionImagen {
    
    public void elegirImagen(){
        //Ventana_Principal vp = null;
        //
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.imagenes","jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //System.out.println("**" + result + "--" + JFileChooser.APPROVE_OPTION);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            
            Ventana_Principal.label_imagen.setIcon(Tamaño.EstablecerTamaño(path, null));
            Ventana_Principal.rutaImagen = path;
        }else{
            System.out.println("Ninguna imagen fue seleccionado");
        }
    }
    
}
