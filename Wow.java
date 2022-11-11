import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;

/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Wow: clase constructora; crea todos los metodos necesitados para realizar un radio completo. 
 */
public class Wow implements modoRadio, modoReproduccion, modoTelefono, productividad{
    Radio radio = new Radio();
    Telefono contacto = new Telefono();
    Playlist playlist = new Playlist();

    //Constructor sin parametros.
    public Wow() {
    }

    public Wow(Radio radio, Telefono contacto) {
        this.radio = radio;
        this.contacto =  contacto;
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
                cadena="El día de hoy estará soleado";
                break;
            case 1:
                cadena = "Hoy será un día nubleado";
                break;
            case 2:
                cadena = "Hoy va a llover durante todo el día";
                break;
            case 3:
                cadena = "Comenzará la época de nieve";
                break;
            case 4:
                cadena = "Hoy estaremos a temperatura menores de 0 C";
                break;
        }
        return cadena;
    }
    @Override
    public void conectado() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String mostrarConstactos() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String llamarContactos(int desicion) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String finalizarLlamadaEspera() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String cambiarLlamadaEspera() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String seleccionarPlaylist(int decision) {
        // TODO Auto-generated method stub
        this.playlist = radio.getPlaylists().get(decision-1);
        return this.playlist.toString();
    }
    @Override
    public String cambiarCancion(boolean arriba) {
        // TODO Auto-generated method stub
        String cadena = "";
        if (arriba == true){

            
        }

        return null;
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
        // TODO Auto-generated method stub

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
        // TODO Auto-generated method stub
        
    }
    @Override
    public String cargarEmisoras() {
        // TODO Auto-generated method stub
        return "";
    }
}