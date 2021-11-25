public class Calefaccion {

    
    private boolean encendido;
    private int temperaturaMaxima;
    private Termostato termostato;


    public Calefaccion(boolean calefaccionEncendida, int tempMax, Termostato termostatoCalefaccion){
    
        encendido = calefaccionEncendida;
        temperaturaMaxima = tempMax;
        termostato = termostatoCalefaccion;
    }


    public void setEncendido(boolean calefaccionEncendida){
        encendido = calefaccionEncendida;
    }

    public void setTemperaturaMaxima(int tempMax){
        temperaturaMaxima = tempMax;
    }

    public void setTermostato(Termostato termostatoCalefaccion){
        termostato = termostatoCalefaccion;
    }

    public boolean getEncendido(){
        return encendido;
    }

    public int getTemperaturaMaxima(){
        return temperaturaMaxima;
    }

    public Termostato getTermostato(){
        return termostato;
    }

    public void imprimirDetalles(){
        System.out.println("Encendido: " + encendido + ". Temperatura máxima: " + temperaturaMaxima + ". Temperatura actual: " + termostato.getTempActual() + ". Temperatura arranque del termostato: " + termostato.getTempArranque());
    }
}