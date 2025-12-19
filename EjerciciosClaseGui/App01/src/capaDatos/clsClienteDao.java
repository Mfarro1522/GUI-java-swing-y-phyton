package capaDatos;

import CapaLogica.clsCliente;

/**
 * Clase DAO para gestionar los datos de Cliente
 * 
 * @author mauricio
 */
public class clsClienteDao {

    private static clsCliente[] clientes = new clsCliente[0];
    private static int cantidad;
    private static final String[] TIPOS_CLIENTE = { "Persona Natural", "Persona Jurídica" };

    public clsClienteDao() {
        cantidad = 0;
    }

    // Agregar un cliente
    public static void agregar(clsCliente cliente) {
        cliente.setNombre(cliente.getNombre().toUpperCase());
        clsCliente[] nuevoArray = new clsCliente[clientes.length + 1];
        for (int i = 0; i < clientes.length; i++) {
            nuevoArray[i] = clientes[i];
        }
        nuevoArray[clientes.length] = cliente;
        clientes = nuevoArray;
        cantidad++;
    }

    // Eliminar un cliente por índice
    public static boolean eliminar(int indice) {
        if (indice < 0 || indice >= cantidad) {
            return false;
        }

        clsCliente[] nuevoArray = new clsCliente[clientes.length - 1];

        for (int i = 0; i < indice; i++) {
            nuevoArray[i] = clientes[i];
        }

        for (int i = indice; i < cantidad - 1; i++) {
            nuevoArray[i] = clientes[i + 1];
        }

        clientes = nuevoArray;
        cantidad--;
        return true;
    }

    public static clsCliente[] obtener() {
        return clientes;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static String[] getTiposCliente() {
        return TIPOS_CLIENTE;
    }

    public static clsCliente getElemento(int index) {
        if (index >= 0 && index < cantidad) {
            return clientes[index];
        }
        return null;
    }

        public static clsCliente buscarPorDniRuc(String dniRuc) {
            if (dniRuc == null) {
                return null;
            }
            for (int i = 0; i < cantidad; i++) {
                if (clientes[i] != null && dniRuc.equals(clientes[i].getDniRuc())) {
                    return clientes[i];
                }
            }
            return null;
        }

    public static int buscarIndicePorDniRuc(String dniRuc) {
        if (dniRuc == null) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (clientes[i] != null && dniRuc.equals(clientes[i].getDniRuc())) {
                return i;
            }
        }
        return -1;
    }

    public static boolean validarAgregar(String dniRuc, String nombre) {
        if (dniRuc == null || dniRuc.trim().isEmpty()) {
            return false;
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        if (buscarPorDniRuc(dniRuc) != null) {
            return false;
        }
        return true;
    }

    public static boolean actualizar(String dniRucOriginal, clsCliente clienteActualizado) {
        int index = buscarIndicePorDniRuc(dniRucOriginal);
        if (index != -1) {
            clientes[index] = clienteActualizado;
            return true;
        }
        return false;
    }

    public static boolean darBaja(String dniRuc) {
        clsCliente cliente = buscarPorDniRuc(dniRuc);
        if (cliente != null) {
            cliente.setEstado(false);
            return true;
        }
        return false;
    }

    public static clsCliente[] obtenerPorTipo(String tipo) {
        int contadorPorTipo = 0;
        for (int i = 0; i < cantidad; i++) {
            if (clientes[i] != null && tipo.equals(clientes[i].getTipoCliente())) {
                contadorPorTipo++;
            }
        }

        clsCliente[] clientesPorTipo = new clsCliente[contadorPorTipo];
        int indice = 0;
        for (int i = 0; i < cantidad; i++) {
            if (clientes[i] != null && tipo.equals(clientes[i].getTipoCliente())) {
                clientesPorTipo[indice] = clientes[i];
                indice++;
            }
        }
        return clientesPorTipo;
    }
}
