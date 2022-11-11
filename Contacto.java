/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase contacto: crea los contactos de los usuarios. 
 */
public class Contacto{
    private String nombre;
    private String numero;
    private boolean espera;
    private boolean activo;

    //constructo sin parametros.
    public Contacto() {
        nombre = "";
        numero = "";
        espera = false;
        activo = false;
    }

    //constructor con parametros
    public Contacto(String nombre, String numero, boolean espera, boolean activo) {
        this.nombre = nombre;
        this.numero = numero;
        this.espera = espera;
        this.activo = activo;
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
    public String getNumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEspera() {
        return this.espera;
    }

    
    /** 
     * @return boolean
     */
    public boolean getEspera() {
        return this.espera;
    }

    
    /** 
     * @param espera
     */
    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    
    /** 
     * @return boolean
     */
    public boolean isActivo() {
        return this.activo;
    }

    
    /** 
     * @return boolean
     */
    public boolean getActivo() {
        return this.activo;
    }

    
    /** 
     * @param activo
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    /** 
     * @param nombre
     * @return Contacto
     */
    public Contacto nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param numero
     * @return Contacto
     */
    public Contacto numero(String numero) {
        setNumero(numero);
        return this;
    }

    
    /** 
     * @param espera
     * @return Contacto
     */
    public Contacto espera(boolean espera) {
        setEspera(espera);
        return this;
    }

    
    /** 
     * @param activo
     * @return Contacto
     */
    public Contacto activo(boolean activo) {
        setActivo(activo);
        return this;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "nombre: " + getNombre() + "\n" +
            "numero: " + getNumero() + "\n";
    }
}