/*
*   @author: Manuel Jesus Flores Montaño
*   @date: 14/12/2021
*   @description: Fichero de implementacion de heaps
*   @version: 1.0
*/

public class heaps {
    private int[] heap;
    private int tam;
    private int maxTamano;

    public heaps(int maxTamano) {
        this.maxTamano = maxTamano;
        this.tam = 0;
        heap = new int[this.maxTamano];
    }

    public void insertar(int contenido) {
        if (tam >= maxTamano) {
            System.out.println("El monticulo esta lleno");
            return;
        }
        tam++;
        heap[tam] = contenido;
        int i = tam;
        while (i > 1 && heap[i] > heap[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    public int eliminar() {
        if (tam == 0) {
            System.out.println("El monticulo esta vacio");
            return -1;
        }
        int raiz = heap[1];
        heap[1] = heap[tam];
        tam--;
        int i = 1;
        while (i * 2 <= tam) {
            int leftChild = i * 2;
            int rightChild = i * 2 + 1;
            int maxChild = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
            if (heap[i] < heap[maxChild]) {
                swap(i, maxChild);
                i = maxChild;
            } else {
                break;
            }
        }
        return raiz;
    }

    public void imprimir() {
        for (int i = 1; i <= tam; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}