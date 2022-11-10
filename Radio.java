/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Radio: clase moduladora; llama todas las utilidades que tiene un radio. 
 */
import java.util.ArrayList;

public class Radio{
    private ArrayList<Cancion> cancion;
    private ArrayList<Emisoras> emisoras;
    private int volumen;
    private boolean encendido;

    //constructor sin parametros
    public Radio() {
        cancion = new ArrayList<Cancion>();
        emisoras = new ArrayList<Emisoras>();
        volumen = 0;
        encendido = false;
    }

    //constructor con parametros
    public Radio(ArrayList<Cancion> cancion, ArrayList<Emisoras> emisoras, int volumen, boolean encendido) {
        this.cancion = cancion;
        this.emisoras = emisoras;
        this.volumen = volumen;
        this.encendido = encendido;
    }

    
    /** 
     * @return ArrayList<Cancion>
     */
    public ArrayList<Cancion> getCancion() {
        return this.cancion;
    }

    
    /** 
     * @param cancion
     */
    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
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
    public Radio cancion(ArrayList<Cancion> cancion) {
        setCancion(cancion);
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
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " cancion='" + getCancion() + "'" +
            ", emisoras='" + getEmisoras() + "'" +
            ", volumen='" + getVolumen() + "'" +
            ", encendido='" + isEncendido() + "'" +
            "}";
    }

}