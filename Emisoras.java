/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Emisoras: crea diferentes emisoras de la radio. 
 */
public class Emisoras{
    private String nombre;
    private float numero;
    private boolean aM;

    //contructor sin parametros
    public Emisoras() {
        nombre = "";
        numero = 0;
        aM = false;
    }

    //constructor con parametros
    public Emisoras(String nombre, float numero, boolean aM) {
        this.nombre = nombre;
        this.numero = numero;
        this.aM = aM;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public float getNumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(float numero) {
        this.numero = numero;
    }

    
    /** 
     * @return boolean
     */
    public boolean isAM() {
        return this.aM;
    }

    
    /** 
     * @return boolean
     */
    public boolean getAM() {
        return this.aM;
    }

    
    /** 
     * @param aM
     */
    public void setAM(boolean aM) {
        this.aM = aM;
    }

    
    /** 
     * @param nombre
     * @return Emisoras
     */
    public Emisoras nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param numero
     * @return Emisoras
     */
    public Emisoras numero(float numero) {
        setNumero(numero);
        return this;
    }

    
    /** 
     * @param aM
     * @return Emisoras
     */
    public Emisoras aM(boolean aM) {
        setAM(aM);
        return this;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }
    
}