package Clases;

public enum Mano {

    PIEDRA(0),
    PAPEL(1),
    TIJERA(2);
    
    private int indice;

    private Mano(int indice) {
        this.indice=indice;
    }

    public int getIndice() {
        return indice;
    }

}