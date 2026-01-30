/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmos.de.busqueda;

/**
 *
 * @author mauricio
 */
public class AlgoritmosDeBusqueda {

    public static void main(String[] args) {
        int[] arregloOrdenado = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int buscar = 70;

        System.out.println("=== 1. Búsqueda Interpolada ===");
        int resInt = BusquedasAvanzadas.busquedaInterpolada(arregloOrdenado, buscar);
        System.out.println("Elemento " + buscar + " encontrado en índice: " + resInt);

        System.out.println("\n=== 2. Búsqueda Exponencial ===");
        int resExp = BusquedasAvanzadas.busquedaExponencial(arregloOrdenado, buscar);
        System.out.println("Elemento " + buscar + " encontrado en índice: " + resExp);

        System.out.println("\n=== 3. Búsqueda en Árbol (BST) ===");
        BusquedasAvanzadas.NodoArbol raiz = new BusquedasAvanzadas.NodoArbol(50);
        raiz.izquierdo = new BusquedasAvanzadas.NodoArbol(30);
        raiz.derecho = new BusquedasAvanzadas.NodoArbol(70);
        raiz.izquierdo.izquierdo = new BusquedasAvanzadas.NodoArbol(20);
        raiz.izquierdo.derecho = new BusquedasAvanzadas.NodoArbol(40);

        BusquedasAvanzadas.NodoArbol resultadoBST = BusquedasAvanzadas.buscarEnBST(raiz, 40);
        System.out.println("Buscando 40 en BST: " + (resultadoBST != null ? "Encontrado" : "No encontrado"));

        System.out.println("\n=== 4. Búsqueda Hash ===");
        boolean resHash = BusquedasAvanzadas.buscarHash(arregloOrdenado, 90);
        System.out.println("Buscando 90 con Hash: " + (resHash ? "Encontrado" : "No encontrado"));

        System.out.println("\n=== 5. Búsqueda en Grafos ===");
        BusquedasAvanzadas.Grafo g = new BusquedasAvanzadas.Grafo(4);
        g.agregarArista(0, 1);
        g.agregarArista(0, 2);
        g.agregarArista(1, 2);
        g.agregarArista(2, 0);
        g.agregarArista(2, 3);
        g.agregarArista(3, 3);

        System.out.print("Recorrido BFS empezando desde el nodo 2: ");
        g.BFS(2);
        System.out.print("\nRecorrido DFS empezando desde el nodo 2: ");
        g.DFS(2);
        System.out.println();
    }
}
