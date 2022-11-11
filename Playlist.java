import java.util.ArrayList;

public class Playlist {
    private String nombre;
    private ArrayList<Cancion> canciones;
    
    public Playlist(){
        nombre = "";
        canciones = new ArrayList<Cancion>();

    }
    public Playlist(String nombre, int key ){
        this.nombre = nombre;
        switch (key) {
            case 1:
                this.canciones.add(new Cancion("November Rain", "Guns N' Roses", "Rock"));
                this.canciones.add(new Cancion("Welcome to the jungle", "Guns N' Roses", "Rock"));
                break;
        
            case 2:
            this.canciones.add(new Cancion("Without me", "Eminem", "Rap"));
            this.canciones.add(new Cancion("The Real Slim Shady", "Eminem", "Rap"));
                break;
        }
        
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
        String cadena = "";
        for (Cancion cancion : canciones) {
            cadena = cadena + cancion.getNombre()+"\n";
        }
        return
            "Playlist: " + getNombre() +"\n"+
            "Canciones: " + cadena+"\n" +
            getCanciones().get(0).toString()+"\n";
    }

    
}
