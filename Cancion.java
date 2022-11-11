/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase cancion: crea las playlist de los usuarios
 */
public class Cancion{
    private String nombre;
    private String autor;
    private String genero;

    //constructor sin parametros
    public Cancion() {
        nombre = "";
        autor = "";
        genero = "";
    }

    //contructor con parametros
    public Cancion(String nombre, String autor, String genero) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
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
    public String getAutor() {
        return this.autor;
    }

    
    /** 
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    /** 
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    /** 
     * @param nombre
     * @return Cancion
     */
    public Cancion nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    
    /** 
     * @param autor
     * @return Cancion
     */
    public Cancion autor(String autor) {
        setAutor(autor);
        return this;
    }

    
    /** 
     * @param genero
     * @return Cancion
     */
    public Cancion genero(String genero) {
        setGenero(genero);
        return this;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Sonando: \n" +
            " nombre: " + getNombre() + "\n" +
            " autor: " + getAutor() + "\n" +
            " genero: " + getGenero() + "\n";
    }
    
}