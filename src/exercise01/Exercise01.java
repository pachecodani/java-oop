package exercise01;

/**
 * Primer ejercicio de la guia de POO.
 * Se trata de respetar la consigna del ejercicio.
 *
 * @author Daniel Pacheco
 */
public class Exercise01 {
    public static void main(String[] args) {
        app();
    }

    /**
     * Inicializa una instancia a partir del constructor vacio.
     * Se llama a un metodo para cargar la información de book001.
     * Se muestra la información de book001 por consola.
     */
    private static void app(){
        Book book001 = new Book();
        book001.loadBook();
        book001.showData();
    }
}
