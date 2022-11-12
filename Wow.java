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
    private ArrayList<Emisoras> emisorasFAv;
    private ArrayList<Playlist> playlists;
    

    //Constructor sin parametros.
    public Wow() {
        this.radio = new Radio();
        this.contacto = new Telefono();
        this.playlist = new Playlist();
        this.playlists = new ArrayList<Playlist>();
        this.emisorasFAv = new ArrayList<Emisoras>();
        this.conectado = false;
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
        this.playlist = playlists.get(decision-1);
        return this.playlist.toString();
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
                    radio.setNumCancion(radio.getNumCancion()-1);
                    cadena = playlist.getCanciones().get(radio.getNumCancion()).toString();
                
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
            if (frecuencia.equalsIgnoreCase("AM")){
                radio.setAM(true);
            }
            if (frecuencia.equalsIgnoreCase("FM")){
                radio.setAM(false);
            }
            return "Ha cambiado a "+frecuencia+"\n";
        }

    @Override
    public String cambiarEmisoras(boolean arriba) {
        try {
            if (radio.isAM()==true){
                if (arriba==true && radio.getEmisoraNum() < radio.getEmisorasAM().size()){
                    radio.setEmisoraNum(radio.getEmisoraNum()+1);
                    return radio.getEmisorasAM().get(radio.getEmisoraNum()).toString();
                }
                if (arriba==false && radio.getEmisoraNum()>0){
                    radio.setEmisoraNum(radio.getEmisoraNum()-1);
                    return radio.getEmisorasAM().get(radio.getEmisoraNum()).toString();
                }
            }
            if (radio.isAM()==false){
                if (arriba==true && radio.getEmisoraNum() < radio.getEmisorasFM().size()){
                    radio.setEmisoraNum(radio.getEmisoraNum()+1);
                    return radio.getEmisorasAM().get(radio.getEmisoraNum()).toString();
                }
                if (arriba==false && radio.getEmisoraNum()>0){
                    radio.setEmisoraNum(radio.getEmisoraNum()-1);
                    return radio.getEmisorasAM().get(radio.getEmisoraNum()).toString();
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            radio.setEmisoraNum(0);
            return "Ingrese una opcion correcta";
            
        }
        
        
        
        return "";
    }

    @Override
    public void guardarEmisoras() {
        
        if(radio.isAM()==true && radio.getEmisorasAM().size() < 50){
            Emisoras emi = new Emisoras();
            emisorasFAv.add(emi);
        }
        if(radio.isAM()==false && radio.getEmisorasFM().size() < 50){
            Emisoras emi = new Emisoras();
            emisorasFAv.add(emi);
        }
    }
    @Override
    public String cargarEmisoras(int i) {

        for (Emisoras emisora : emisorasFAv) {
            if (emisorasFAv.get(i)!=null) {
                return emisora.toString();
                
            }
        }
        return "Ingrese una opción válida";
    }




    
    public String mostrarPlaylist() {
        // TODO Auto-generated method stub
        int i = 1;
        String cadena = "";
        for (Playlist playList : playlists) {
            
            cadena = cadena + i+" "+playList.toString()+"\n";
            i++;
        }
        return cadena;
    }

    /**
     * @return boolean return the conectado
     */
    public boolean isConectado() {
        return conectado;
    }

    /**
     * @param conectado the conectado to set
     */
    public void setConectado(boolean conectado) {
        this.conectado = conectado;
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
     * @param contacto the contacto to set
     */
    public void setContacto(Telefono contacto) {
        this.contacto = contacto;
    }

    /**
     * @param playlist the playlist to set
     */
    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    /**
     * @return int return the termLLam
     */
    public int getTermLLam() {
        return termLLam;
    }

    /**
     * @param termLLam the termLLam to set
     */
    public void setTermLLam(int termLLam) {
        this.termLLam = termLLam;
    }


    /**
     * @return ArrayList<Emisoras> return the emisorasFAv
     */
    public ArrayList<Emisoras> getEmisorasFAv() {
        return emisorasFAv;
    }

    /**
     * @param emisorasFAv the emisorasFAv to set
     */
    public void setEmisorasFAv(ArrayList<Emisoras> emisorasFAv) {
        this.emisorasFAv = emisorasFAv;
    }



    /**
     * @param playlists the playlists to set
     */
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }


    /**
     * @return Playlist return the playlist
     */
    public Playlist getPlaylist() {
        return playlist;
    }

    /**
     * @return ArrayList<Playlist> return the playlists
     */
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

}