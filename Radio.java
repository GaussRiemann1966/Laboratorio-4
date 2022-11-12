/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Radio: clase moduladora; llama todas las utilidades que tiene un radio. 
 */
import java.util.ArrayList;

public class Radio{
    
    private ArrayList<Emisoras> emisorasAM;
    private ArrayList<Emisoras> emisorasFM;
    private int emisoraNum;

    private int volumen;
    private boolean encendido;
    /*Se agrego el atributo AM para poner la radio en AM o FM */
    private boolean AM;
    /*Se agrego el atributo numCancion para saber que cancion se encuentra sonando */
    private int numCancion;

    //constructor sin parametros
    public Radio() {
        
        emisorasAM = new ArrayList<Emisoras>();
        emisorasAM.add(new Emisoras("No se", 85.5f, true));
        emisorasAM.add(new Emisoras("La mejor", 94.5f, true));

        emisorasFM = new ArrayList<Emisoras>();
        emisorasFM.add(new Emisoras("FM Joya", 15.5f, false));
        emisorasFM.add(new Emisoras("FM Norte", 105.0f, false));
        volumen = 50;
        encendido = false;
        AM = true;
        numCancion = 0;
        emisoraNum = 0;
    }

    //constructor con parametros
    public Radio( ArrayList<Emisoras> emisorasAM, ArrayList<Emisoras> emisorasFM, int volumen) {
        
        this.emisorasAM = emisorasAM;
        this.emisorasFM= emisorasFM;
        this.volumen = volumen;
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
            ", emisoras='" + getEmisorasAM() + "'" +
            ", volumen='" + getVolumen() + "'" +
            ", encendido='" + isEncendido() + "'" +
            "}";
    }


    


    





    /**
     * @return int return the numCancion
     */
    public int getNumCancion() {
        return numCancion;
    }

    /**
     * @param numCancion the numCancion to set
     */
    public void setNumCancion(int numCancion) {
        this.numCancion = numCancion;
    }


    /**
     * @return ArrayList<Emisoras> return the emisorasAM
     */
    public ArrayList<Emisoras> getEmisorasAM() {
        return emisorasAM;
    }

    /**
     * @param emisorasAM the emisorasAM to set
     */
    public void setEmisorasAM(ArrayList<Emisoras> emisorasAM) {
        this.emisorasAM = emisorasAM;
    }

    /**
     * @return ArrayList<Emisoras> return the emisorasFM
     */
    public ArrayList<Emisoras> getEmisorasFM() {
        return emisorasFM;
    }

    /**
     * @param emisorasFM the emisorasFM to set
     */
    public void setEmisorasFM(ArrayList<Emisoras> emisorasFM) {
        this.emisorasFM = emisorasFM;
    }


    /**
     * @return int return the emisoraNum
     */
    public int getEmisoraNum() {
        return emisoraNum;
    }

    /**
     * @param emisoraNum the emisoraNum to set
     */
    public void setEmisoraNum(int emisoraNum) {
        this.emisoraNum = emisoraNum;
    }

}