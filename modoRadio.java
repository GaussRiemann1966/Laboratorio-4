
public interface modoRadio {

    public boolean estadoRadio();
    public int cambiarVolumen(boolean arriba);
    public String cambiarFrecuencia(String frecuencia);
    public float cambiarEmisoras(boolean arriba);
    public void guardarEmisoras(String nombre, String numero, boolean aM);
    public String cargarEmisoras(int i);
}