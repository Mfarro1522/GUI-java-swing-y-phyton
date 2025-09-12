package Clases;

public class Juego{
    
    private int [][] tablero;
    
    public Juego() {
        this.inicializarTablero();
    }
    
    private void inicializarTablero() {
            /*
            piedra  papel  tijera
            --------------------
    piedra[   0   |  -1  |   1    ]
    papel [   1   |   0  |  -1    ]
    tijera[  -1   |   1  |   0    ]
            --------------------
    */
        
        
    int[][] t
                = {
                    {0, -1, 1},
                    {1, 0, -1},
                    {-1, 1, 0}
                };

        this.tablero = t;
    }
    
    public int ganador(Mano j1 , Mano j2){
      return this.tablero[j1.getIndice()][j2.getIndice()];
    }
}


