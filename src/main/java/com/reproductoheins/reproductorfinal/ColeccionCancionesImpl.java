/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reproductoheins.reproductorfinal;

/**
 *
 * @author gman
 */
import java.util.ArrayList;
import java.util.List;

//aca Hereda todos los atributos y metodos de la clase Cancion creando la coleccion basada en la clase
public class ColeccionCancionesImpl extends Cancion {
    private List<Cancion> canciones = new ArrayList<>();  //declara lista de objeto Cancion, se inicializa como una instancia de ArrayList

    //Agrega una cancion a la coleccion, el objeto cancion pasando como argumento se agrega a la lista.
    public void setCancion(Cancion cancion) {
        canciones.add(cancion);
    }
    
    //Aca devuelve la lista completa de canciones almacenada en la coleccion
    public List<Cancion> getCanciones(){
        return canciones;
    }
    
    //Metodo que busca una cancion en la coleccion y la devuelve si la encuentra
    public Cancion getCancion(String rutadelarchivo) {
        
        Cancion cxanciones = new Cancion(); //Crea objeto cancion llamado cxanciones
        
        //iteracion que permite accedera a cada elemente canciones de la coleccion 
        for (Cancion cancion : canciones) {
            if (cancion.getRutadelarchivo().equals(rutadelarchivo)) {   // busca una cancion en la coleccion y si la encuentra con la ruta
                //del archivo proporcionada, muestra mensaje 
                System.out.println("Canción encontrada: " + cancion.getTitulo());
                cxanciones = cancion; // y almacena esa cancion en cxanciones
            }
        }        
        return cxanciones;
    }
    
    /*Metodo elimina una cancion especifica de la coleccion segun la ruta del archivo*/
    public void setEliminarCancion(String rutadelarchivo) {
        canciones.removeIf(cancion -> cancion.getRutadelarchivo().equals(rutadelarchivo));//verifica sila ruta del archivo de la cancion
        //coincide conla ruta proporcionada, si hay cancion se elimina de la lista.
        System.out.println("Eliminado: "+rutadelarchivo);
    }    
    
    public void SetActualizarCancion(String rutadelarchivo, Cancion cancionActual) {
        for (Cancion cancion : canciones) {
            if (cancion.getRutadelarchivo().equals(rutadelarchivo)) {
                cancion.setAlbum(cancionActual.getAlbum());
                cancion.setTitulo(cancionActual.getTitulo());
                cancion.setArtista(cancionActual.getArtista());
                cancion.setDuracion(cancionActual.getDuracion());
                cancion.setRutadelarchivo(cancionActual.getRutadelarchivo());
                break;
            }
        }
    }    
    
    
    
    
}
