//import java.util.ArrayList;
import java.util.Random;
//import java.util.concurrent.locks.ReadWriteLock;

/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Wow: clase constructora; crea todos los metodos necesitados para realizar un radio completo. 
 */
public class Wow implements modoRadio, modoReproduccion, modoTelefono, productividad{
    private Radio radio;
    private Telefono telefono ;
    /*Se agrego un atributo de playlilst para saber cual fue seleccionada */
    private Playlist playlist;

    //Constructor sin parametros.
    public Wow() {
        this.radio = new Radio();
        this.telefono = new Telefono() ;
        this.playlist = new Playlist();



    }

        /**
     * @return Radio return the radio
     */
    public Radio getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    /**
     * @return Telefono return the telefono
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

        /** 
     * @return ArrayList<Emisoras>
     */
    public Playlist getPlaylist() {
        return this.playlist;
    }

    
    /** 
     * @param emisoras
     */
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }


    @Override
    public String pronosticoClima() {
        // TODO Auto-generated method stub
        int clima = 0;
        Random random = new Random();
        clima =  (int)(random.nextDouble()*4);
        String cadena = "";
        switch (clima) {
            case 0:
            
            cadena="El día de hoy estará soleado\n";
                break;
            case 1:
                cadena = "Hoy será un día nublado\n";
                break;
            case 2:
                cadena = "Hoy va a llover durante todo el día\n";
                break;
            case 3:
                cadena = "Comenzará la época de nieve\n";
                break;
            case 4:
                cadena = "Hoy estaremos a temperatura menores de 0 C\n";
                break;
        }
        return cadena;
    }


    @Override
    public void conectado() {
        if (telefono.isConectado()==true){
            telefono.setConectado(false);
        }    
        else {
            telefono.setConectado(true);
        }
    }


    @Override
    public String mostrarConstactos() {
        for (Contacto contacto : telefono.getContactos()) {
            return contacto.toString();
        }
        return "Escoja uno de sus contactos";
    }


    @Override
    public String llamarContactos(int desicion) {
        return "Llamando a "+telefono.getContactos().get(desicion-1).getNombre();
    }

    @Override
    public String finalizarLlamadaEspera() {

        
        return null;
    }

    @Override
    public String cambiarLlamadaEspera() {
        
        return null;
    }


    @Override
    public String seleccionarPlaylist(int decision) {
        // TODO Auto-generated method stub
        if (decision > 0 && decision <= radio.getPlaylists().size()){
        setPlaylist(radio.getPlaylists().get(decision-1));
        return this.playlist.toString();
        }
        return "Ingrese una opcion correcta";
    }


    @Override
    public String cambiarCancion(boolean arriba) {
        // TODO Auto-generated method stub
        String cadena = "";
        try {
            if (arriba == true && radio.getNumCancion() < playlist.getCanciones().size()){
                    radio.setNumCancion(radio.getNumCancion()+1);
                    cadena = playlist.getCanciones().get(radio.getNumCancion()).toString();
            }
            if (arriba == false && radio.getNumCancion()> 0 ){
                if (radio.getNumCancion()> 0 ){
                    radio.setNumCancion(radio.getNumCancion()-1);
                    cadena = playlist.getCanciones().get(radio.getNumCancion()).toString();
                }
            }
    } catch (Exception e) {
        // TODO: handle exception
        radio.setNumCancion(0);
        return "Has reiniciado la playList";

    }
        return cadena;
    }
    @Override

    public boolean estadoRadio() {
        // TODO Auto-generated method stub
        if (radio.getEncendido()==true){
            radio.setEncendido(false);
        }    
        else {
            radio.setEncendido(true);
        }

        return radio.isEncendido();
    }

    @Override
    public int cambiarVolumen(boolean arriba) {
        int vol = radio.getVolumen();
        // TODO Auto-generated method stub

        if (arriba==true){
            radio.setVolumen(vol+1);
        }
        if (arriba==false){
            radio.setVolumen(vol-1);
        }
        
        return radio.getVolumen();
    }



    @Override
    public String cambiarFrecuencia(String frecuencia) {
        // TODO Auto-generated method stub
            if (frecuencia.equalsIgnoreCase("AM")){
                radio.setAM(true);
            }
            if (frecuencia.equalsIgnoreCase("FM")){
                radio.setAM(false);
            }
            return "Ha cambiado a "+frecuencia+"\n";
        }



        
    
    @Override
    public float cambiarEmisoras(boolean arriba) {
        float op = 50;
        if (arriba == true){
            op = op + 0.5f;
        }
        else {
            op = op - 0.5f;
        }
        return 0;
    }

    @Override
    public void guardarEmisoras() {
        
        
    }
    @Override
    public String cargarEmisoras() {
        
        return "";
    }


}