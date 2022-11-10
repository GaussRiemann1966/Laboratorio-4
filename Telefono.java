/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase telefono: crea una lista de todos los contactos dentro de un telefono. 
 */
import java.util.ArrayList;

public class Telefono{
    private ArrayList<Contacto> contactos;

    //constructor sin parametros
    public Telefono() {
        contactos = new ArrayList<Contacto>();
    }

    //constructor con parametros
    public Telefono(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    
    /** 
     * @return ArrayList<Contacto>
     */
    public ArrayList<Contacto> getContactos() {
        return this.contactos;
    }

    
    /** 
     * @param contactos
     */
    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    
    /** 
     * @param contactos
     * @return Telefono
     */
    public Telefono contactos(ArrayList<Contacto> contactos) {
        setContactos(contactos);
        return this;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " contactos='" + getContactos() + "'" +
            "}";
    }
    
}