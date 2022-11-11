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
    private boolean conectado;
    private Radio radio;
    private Telefono contacto;
    private Playlist playlist;
    private int termLLam;

    //Constructor sin parametros.
    public Wow() {
        this.radio = new Radio();
        this.contacto = new Telefono();
        this.playlist = new Playlist();
        this.conectado = false;
    }

    public Wow(boolean conectado, Radio radio, Telefono contacto, Playlist playlist) {
        this.conectado = conectado;
        this.radio = radio;
        this.contacto = contacto;
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
        if (this.conectado == false){
            this.conectado = true;
        }
        else{
            this.conectado = false;
        }
    }

    @Override
    public String mostrarContactos() {
        // TODO Auto-generated method stub
        String mensaje = "";
        int i = 1;
        for (Contacto contact : contacto.getContactos()) {
            mensaje = mensaje + "1. " + contact.getNombre() + ": " + contact.getNumero() + "\n";
            i++;
        }
        return mensaje;
    }
    @Override
    public String llamarContactos(int decision) {
        // TODO Auto-generated method stub
        termLLam = decision-1;
        contacto.getContactos().get(termLLam).setEspera(false);
        return "Llamando a: " + contacto.getContactos().get(termLLam).getNombre();
    }

    @Override
    public String finalizarLlamadaEspera() {
        // TODO Auto-generated method stub
        return "Termino la llamada con:" + contacto.getContactos().get(termLLam).getNombre();
    }
    @Override
    public String cambiarLlamadaEspera() {
        // TODO Auto-generated method stub
        String mensaje = "";
        if (contacto.getContactos().get(termLLam).getEspera()){
            contacto.getContactos().get(termLLam).setEspera(false);
            mensaje = mensaje + "Se ha reanudado la llamada en espera. Hablando con: " + contacto.getContactos().get(termLLam).getNombre() + "\n";
        }
        else{
            contacto.getContactos().get(termLLam).setEspera(true);
            mensaje = mensaje + "La llamada se ha puesto en espera." + "\n";
        }
        return mensaje;
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
    public void guardarEmisoras(String nombre, String numero, boolean aM) {
        // TODO Auto-generated method stub
        if(radio.getEmisoras().size() < 50){
            Emisoras emi = new Emisoras(nombre, numero, aM);
            radio.getEmisoras().add(emi);
        }
    }
    @Override
    public String cargarEmisoras(int i) {
        // TODO Auto-generated method stub
        return radio.getEmisoras().get(i).toString();
    }
}