/*
*   @author: Manuel Jesus Flores Montaño
*   @date: 14/12/2021
*   @description: Fichero principal para demo de heaps
*   @version: 1.0
*
*/

public class principal{
    public static void main(String[] args) {
        //Creamos un monticulo de 10 elementos
        heaps h = new heaps(10);
        //Insertamos los elementos
        h.insertar(5);
        h.insertar(3);
        h.insertar(7);
        h.insertar(1);
        h.insertar(9);
        h.insertar(8);
        h.insertar(6);
        h.insertar(4);
        h.insertar(2);
        //Imprimimos el monticulo actual
        h.imprimir();
        //Eliminamos el elemento raiz
        h.eliminar();
        //Imprimimos el monticulo despues de quitar la raiz
        h.imprimir();
    }
}