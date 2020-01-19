public class Shuffle implements IIpod{
    public double stationFM=90.1;
    public int stationAM=550;
    public boolean currentFrequency=true;
    public boolean saveButton=false;
    //array de hotkeys
    public boolean isOn=false;
    // override de comments

    @Override
    public double cambioEstacion(boolean tipo, boolean tipoFrecuencia) {
        if(tipoFrecuencia){
            if(tipo){
                stationAM+=10;
            }else{
                stationAM-=10;
            }
            System.out.println("Station is "+stationAM);
            return stationAM;
        }else {
            if (tipo) {
                stationFM += 0.2;
            } else {
                stationAM -= 0.2;
            }
            System.out.println("Station is "+stationFM);
            return stationFM;
        }
    }

    @Override
    public void cambioTipoFrecuencia() {
        currentFrequency=!currentFrequency;
        if (currentFrequency){
            System.out.println("Frecuency is AM.");
        }else{
            System.out.println("Frequency is FM.");
        }
    }

    @Override
    public void onButton() {
        isOn=!isOn;
        if (isOn){
            System.out.println("It is on.");
        }else{
            System.out.println("It is off.");
        }
    }

    @Override
    public double guardarEstacion(double estacion, boolean tipoFrecuencia, int boton) {
        return 0;
    }

    @Override
    public double seleccionarEstacion(boolean tipoFrecuencia, int boton) {
        return 0;
    }


    //getters and constructor

    public Shuffle(double stationFM, int stationAM, boolean currentFrequency, boolean saveButton, boolean isOn) {
        this.stationFM = stationFM;
        this.stationAM = stationAM;
        this.currentFrequency = currentFrequency;
        this.saveButton = saveButton;
        this.isOn = isOn;
    }

    public double getStationFM() {
        return stationFM;
    }

    public int getStationAM() {
        return stationAM;
    }

    public boolean isCurrentFrequency() {
        return currentFrequency;
    }

    public boolean isSaveButton() {
        return saveButton;
    }

    public boolean isOn() {
        return isOn;
    }
}
