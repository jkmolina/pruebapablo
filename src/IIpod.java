public interface IIpod {
    double cambioEstacion(boolean tipo, boolean tipoFrecuencia);

    void cambioTipoFrecuencia();

    void onButton();

    double guardarEstacion(double estacion, boolean tipoFrecuencia, int boton);

    double seleccionarEstacion(boolean tipoFrecuencia,int boton);

}
