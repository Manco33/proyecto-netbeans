/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reproductoheins.reproductorfinal;

//Clase crea objeto tipo Cancion con atributos para acceder y modificar
public class Cancion {
   
    private String titulo;
    private String artista; 
    private String album;      
    private String duracion;
    private String rutadelarchivo;

    //Constructor vacio no toma ningun argumento y no se realiza ninguna accion, 
    //Que cuando crea un objeto Cancion utiliza este constructor todas las variables de instancia
    Cancion()
    {
    }
    
    //Constructor se encarga de inicializar las variables de instacia del objeto con valores, ya que se llama automaticamente.
    Cancion(
        String titulo,
        String artista,
        String album,
        String duracion,
        String rutadelarchivo
    ){
        this.titulo = titulo;  //llamando variable dentro del objeto.
        this.artista = artista;
        this.album  = album;
        this.duracion = duracion;
        this.rutadelarchivo = rutadelarchivo;
    }
    
    /*los metodos de acceso y modificacion de la clase lee los valores del atributo sin acceder directamente a el
    se mantiene encapsulada para poder interactuar las variables de instancia*/
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @param album the album to set
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the rutadelarchivo
     */
    public String getRutadelarchivo() {
        return rutadelarchivo;
    }

    /**
     * @param rutadelarchivo the rutadelarchivo to set
     */
    public void setRutadelarchivo(String rutadelarchivo) {
        this.rutadelarchivo = rutadelarchivo;
    }
}
