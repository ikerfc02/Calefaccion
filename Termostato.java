
public class Termostato{
    
    private int temperaturaActual;
    
    private int temperaturaArranque;
    
    public Termostato(int temperaturaAhora, int temperaturaInicio){
        temperaturaActual = temperaturaAhora;
        temperaturaArranque = temperaturaInicio;
    }
    
    
    public int getTempActual(){
        return temperaturaActual;
    }
    
    public int getTempArranque(){
        return temperaturaArranque;
    }
    
    public void setTemperaturaAhora(int temperatura){
        temperatura = temperaturaActual;
    }
    
    public void setArranque(int tempArranque){
        tempArranque = temperaturaArranque;
    }
    
}