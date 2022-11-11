import java.util.ArrayList;

/*
 * @autor: Paolo Consuegra y Alina Carías
 * Carnets: 221097, 22539
 * @date: 10/11/2022
 * Clase Wow: clase constructora; crea todos los metodos necesitados para realizar un radio completo. 
 */
public class Wow implements modoRadio, modoReproduccion, modoTelefono, productividad{
    Radio radio = new Radio();
    Telefono contacto = new Telefono();

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
        return null;
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
        return null;
    }
    @Override
    public String cambiarCancion(boolean arriba) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean estadoRadio() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public int cambiarVolumen(boolean arriba) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String cambiarFrecuencia(String frecuencia) {
        ArrayList<Emisoras> AM = new ArrayList<Emisoras>();
        ArrayList<Emisoras> FM = new ArrayList<Emisoras>();
        String cadena = "";
        // TODO Auto-generated method stub
            for (Emisoras emisoras : radio.getEmisoras()) {
                if (emisoras.getAM()==true) {
                    AM.add(emisoras);
                }
            }
            for (Emisoras emisoras : radio.getEmisoras()) {
                if (emisoras.getAM()==false) {
                    FM.add(emisoras);
                }
            }
            if(frecuencia.equalsIgnoreCase("AM")){
                for (Emisoras emisoras : AM) {
                    cadena = cadena + emisoras.toString();
                }
            }
            if(frecuencia.equalsIgnoreCase("FM")){
                for (Emisoras emisoras : FM) {
                    cadena = cadena + emisoras.toString();
                }
            }
        return cadena;
    }
    @Override
    public float cambiarEmisoras(boolean arriba) {
        // TODO Auto-generated method stub
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