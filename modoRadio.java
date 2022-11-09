
public interface modoRadio {

    public boolean estadoRadio();
    public int cambiarVolumen(boolean arriba);
    public String cambiarFrecuencia(String frecuencia);
    public float cambiarEmisoras(boolean arriba);
    public void guardarEmisoras();
    public void cargarEmisoras();
}