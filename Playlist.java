import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList<Cancion> canciones;
    
    public Playlist(){
        nombre = "";
        canciones = new ArrayList<Cancion>();

    }
    public Playlist(String nombre,ArrayList<Cancion> canciones){
        this.nombre = nombre;
        this.canciones = canciones;
        
    }
    

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return ArrayList<Cancion> return the canciones
     */
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    /**
     * @param canciones the canciones to set
     */
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " Playlist: " + getNombre() +
            ", emisoras='" + getCanciones() + "'";
    }

    
}
