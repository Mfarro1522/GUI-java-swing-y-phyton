
package Clases;

public class Carta {
   
    private String palo;
    private int valor;
    private String rutaImg;

    public Carta(String palo, int valor , String rutaImg) {
        this.palo = palo;
        this.valor = valor;
        this.rutaImg = rutaImg;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }
    
    
    
}


