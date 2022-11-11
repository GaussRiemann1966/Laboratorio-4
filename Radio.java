/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Radio: clase moduladora; llama todas las utilidades que tiene un radio. 
 */
import java.util.ArrayList;

public class Radio{
    private ArrayList<Playlist> playlists;
    private ArrayList<Emisoras> emisoras;
    private int volumen;
    private boolean encendido;
    private boolean AM;

    //constructor sin parametros
    public Radio() {
        playlists = new ArrayList<Playlist>();
        emisoras = new ArrayList<Emisoras>();
        volumen = 0;
        encendido = false;
        AM = true;
    }

    //constructor con parametros
    public Radio(ArrayList<Playlist> playlists, ArrayList<Emisoras> emisoras, int volumen) {
        this.playlists = playlists;
        this.emisoras = emisoras;
        this.volumen = volumen;
        
    }

    
    

    
    /** 
     * @return ArrayList<Emisoras>
     */
    public ArrayList<Emisoras> getEmisoras() {
        return this.emisoras;
    }

    
    /** 
     * @param emisoras
     */
    public void setEmisoras(ArrayList<Emisoras> emisoras) {
        this.emisoras = emisoras;
    }

    
    /** 
     * @return int
     */
    public int getVolumen() {
        return this.volumen;
    }

    
    /** 
     * @param volumen
     */
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEncendido() {
        return this.encendido;
    }

    
    /** 
     * @return boolean
     */
    public boolean getEncendido() {
        return this.encendido;
    }

    
    /** 
     * @param encendido
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    
    /** 
     * @param cancion
     * @return Radio
     */
    public Radio playlists(ArrayList<Playlist> playlists) {
        setPlaylists(playlists);
        return this;
    }

    
    /** 
     * @param emisoras
     * @return Radio
     */
    public Radio emisoras(ArrayList<Emisoras> emisoras) {
        setEmisoras(emisoras);
        return this;
    }

    
    /** 
     * @param volumen
     * @return Radio
     */
    public Radio volumen(int volumen) {
        setVolumen(volumen);
        return this;
    }

    
    /** 
     * @param encendido
     * @return Radio
     */
    public Radio encendido(boolean encendido) {
        setEncendido(encendido);
        return this;
    }

    /**
     * @return boolean return the AM
     */
    public boolean isAM() {
        return AM;
    }

    /**
     * @param AM the AM to set
     */
    public void setAM(boolean AM) {
        this.AM = AM;
    }

    

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " cancion='" + getPlaylists() + "'" +
            ", emisoras='" + getEmisoras() + "'" +
            ", volumen='" + getVolumen() + "'" +
            ", encendido='" + isEncendido() + "'" +
            "}";
    }


    


    /**
     * @return ArrayList<Playlist> return the playlists
     */
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    /**
     * @param playlists the playlists to set
     */
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

}