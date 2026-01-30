package algoritmos.de.busqueda;

import java.util.*;

/**
 * Clase que contiene ejemplos de diferentes tipos de algoritmos de búsqueda.
 */
public class BusquedasAvanzadas {

    // --- 1. BÚSQUEDA INTERPOLADA ---
    // Funciona en arreglos ordenados y con valores uniformemente distribuidos.
    public static int busquedaInterpolada(int[] arr, int x) {
        int low = 0, high = (arr.length - 1);

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) return low;
                return -1;
            }

            // Fórmula de interpolación
            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            if (arr[pos] == x) return pos;

            if (arr[pos] < x) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }

    // --- 2. BÚSQUEDA EXPONENCIAL ---
    // Utiliza búsqueda binaria después de encontrar el rango.
    public static int busquedaExponencial(int[] arr, int x) {
        int n = arr.length;
        if (arr[0] == x) return 0;

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
    }

    // --- 3. BÚSQUEDA DE ÁRBOL (BST - Binary Search Tree) ---
    static class NodoArbol {
        int valor;
        NodoArbol izquierdo, derecho;

        public NodoArbol(int item) {
            valor = item;
            izquierdo = derecho = null;
        }
    }

    public static NodoArbol buscarEnBST(NodoArbol raiz, int clave) {
        if (raiz == null || raiz.valor == clave) return raiz;
        if (raiz.valor < clave) return buscarEnBST(raiz.derecho, clave);
        return buscarEnBST(raiz.izquierdo, clave);
    }

    // --- 4. BÚSQUEDA HASH ---
    // En Java usamos HashMap o estructuras similares.
    public static boolean buscarHash(int[] arr, int x) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : arr) hashSet.add(num);
        return hashSet.contains(x);
    }

    // --- 5. BÚSQUEDA EN GRAFOS (BFS y DFS) ---
    static class Grafo {
        private int V;
        private LinkedList<Integer> adj[];

        Grafo(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) adj[i] = new LinkedList();
        }

        void agregarArista(int v, int w) {
            adj[v].add(w);
        }

        // Búsqueda en Anchura (BFS)
        void BFS(int s) {
            boolean visitado[] = new boolean[V];
            LinkedList<Integer> cola = new LinkedList<>();

            visitado[s] = true;
            cola.add(s);

            while (cola.size() != 0) {
                s = cola.poll();
                System.out.print(s + " ");

                for (int n : adj[s]) {
                    if (!visitado[n]) {
                        visitado[n] = true;
                        cola.add(n);
                    }
                }
            }
        }

        // Búsqueda en Profundidad (DFS)
        void DFSUtil(int v, boolean visitado[]) {
            visitado[v] = true;
            System.out.print(v + " ");

            for (int n : adj[v]) {
                if (!visitado[n]) DFSUtil(n, visitado);
            }
        }

        void DFS(int v) {
            boolean visitado[] = new boolean[V];
            DFSUtil(v, visitado);
        }
    }
}
