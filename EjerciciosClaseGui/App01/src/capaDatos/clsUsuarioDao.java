package capaDatos;

import CapaLogica.clsUsuario;

/**
 *
 * @author mauricio
 */
public class clsUsuarioDao {
    private static clsUsuario[] usuarios = new clsUsuario[20];
    private static int cantidad = 0;

    public static void agregar(clsUsuario usr) {
        usuarios[cantidad] = usr;
        cantidad++;
    }

    public static clsUsuario[] obtener() {
        return usuarios;
    }

    public static clsUsuario[] obtenerPorTipo(String tipo) {
        // primero contamos el numero por tipo
        int contadoUsrPorTipo = 0;
        for (int i = 0; i < cantidad; i++) {
            if (usuarios[i] != null && tipo.equals(usuarios[i].getTipo())) {
                contadoUsrPorTipo++;
            }
        }
        clsUsuario usuariosPorTipo[] = new clsUsuario[contadoUsrPorTipo];

        int indice = 0;
        for (int i = 0; i < cantidad; i++) {
            if (usuarios[i] != null && tipo.equals(usuarios[i].getTipo())) {
                usuariosPorTipo[indice] = usuarios[i];
                indice++;
            }
        }
        return usuariosPorTipo;
    }

    public static int getCantidad() {
        return cantidad;
    }

}
