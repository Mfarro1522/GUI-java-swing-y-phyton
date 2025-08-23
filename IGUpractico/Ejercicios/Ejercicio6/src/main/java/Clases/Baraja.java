package Clases;

import Enumerados.PalosBarajaEsp;
import Enumerados.PalosBarajaFrc;
import Enumerados.TipoBaraja;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    
    private ArrayList<Carta> cartas;
    private TipoBaraja tipoBaraja;
    private Carta cartaActual;
    private int cant;
    private int c=0;

    public Baraja(int cant, TipoBaraja tipoBaraja) {
        this.cartas = new ArrayList<>();
        this.tipoBaraja = tipoBaraja;
        crearBaraja(cant);
        cartaActual = cartas.get(c);
        
    }
    
    public void crearBaraja (int cant) {
        this.cant=cant;
        if (tipoBaraja == TipoBaraja.ESPANOLA) {
            if (cant == 48){
                for (int i = 0; i < PalosBarajaEsp.values().length; i++) {
                    for (int j = 0; j < 12; j++) {
                        String palo = PalosBarajaEsp.values()[i].toString();
                        cartas.add(new Carta(palo,j+1,"img/cartas_espanolas/"+palo.toLowerCase()+"/"+(j+1)+".jpg"));
                    }
                }
            } else if (cant == 40 ){
               for (int i = 0; i < PalosBarajaEsp.values().length; i++) {
                    for (int j = 0; j < 12; j++) {
                        if (j==7 || j==8){
                            
                        }else {
                            String palo = PalosBarajaEsp.values()[i].toString();
                            cartas.add(new Carta(palo,j+1,"img/cartas_espanolas/"+palo.toLowerCase()+"/"+(j+1)+".jpg"));
                        }
                       
                    }
                } 
            }
        } else if (tipoBaraja == TipoBaraja.FRANCESA) {
            for (int i = 0; i < PalosBarajaFrc.values().length; i++) {
                for (int j = 0; j < 13; j++) {
                    String palo = PalosBarajaFrc.values()[i].toString();
                    cartas.add(new Carta(palo,j+1,"img/cartas_francesas/"+palo.toLowerCase()+"/"+(j+1)+".jpg"));
                }
            }
            if (cant == 53){
                cartas.add(new Carta("JOKER", -1,"img/cartas_francesas/joker/-1.jpg"));
            }
        }
    }
    
    public  void ImprimirCartas (){
        for (Carta e: this.cartas){
            System.out.println(e.toString());
        }
    }
    
    public void barajar (){
        Collections.shuffle(cartas);
    }
    
    
public void siguienteCarta() {
    if (!cartas.isEmpty()) {
        cartaActual = cartas.get(0);
        cartas.remove(0);
        c++;  
    } else {
        crearBaraja(cant);
        cartaActual = cartas.get(0);
        c = 0;
    }
}
    
    
        public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }


    public Carta getCartaActual() {
        return cartaActual;
    }

    public void setCartaActual(Carta cartaActual) {
        this.cartaActual = cartaActual;
    }

    public TipoBaraja getTipoBaraja() {
        return tipoBaraja;
    }

    public void setTipoBaraja(TipoBaraja tipoBaraja) {
        this.tipoBaraja = tipoBaraja;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
    
    
    
    
}