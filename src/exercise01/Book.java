package exercise01;

import java.util.Scanner;

/**
 * Book va a representar libros.
 * Cada libro va a tener distintos atributos. Tales como isbn (código comercial del libro), title (título del libro),
 * author (nombre del autor del libro), pages (cantidad de páginas que tiene el libro).
 */
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String pages;

    /**
     * Constructor vacío.
     * Crea un libro con los parámetros inicializados por defecto.
     */
    public Book() {
    }

    /**
     * Constructor con todos los parámetros.
     * Crea un libro inicializando todos los parámetros.
     * @param isbn Código de ISBN.
     * @param title Título del libro.
     * @param author Autor del libro.
     * @param pages Cantidad de páginas del libro. Debe ser un número entero positivo.
     */
    public Book(String isbn, String title, String author, String pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    /**
     * Carga todos los atributos que tiene una instancia de la clase Book.
     * Pide la información necesaria por consola, válida y actualiza cada uno de los atributos de la instancia.
     */
    public void loadBook(){
        loadData(requestData());
    }

    /**
     * Solicita la información del libro.
     * Necesita que por consola se ingrese la información de cada uno de los parámetros del libro.
     * @return Vector con los parámetros del libro en forma ordenada. [isbn, título , autor, número de páginas]
     */
    private String[] requestData(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        String[] arr = new String[4];
        System.out.println("***Ingresar datos del libro***");
        System.out.println("ISBN:");
        arr[0] = scan.next();
        System.out.println("Título:");
        arr[1] = scan.next();
        System.out.println("Autor:");
        arr[2] = scan.next();
        System.out.println("Número de páginas:");
        //TODO: Prevenir que se detenga el programa al ingresar un valor no numérico.
        int numberOfPages = scan.nextInt();
        arr[3] = Integer.toString(pagesNumberValidation(numberOfPages));
        return arr;
    }

    /**
     * Validación del número de páginas del libro.
     * Comprueba que el número de páginas sea un número entero positivo. En caso contrario pedirá que se ingrese
     * un nuevo número de páginas que cumpla con los requisitos.
     * @param numberOfPages Define el número de páginas que va a tener el libro.
     * @return Un número entero positivo.
     */
    private int pagesNumberValidation(int numberOfPages) {

        Scanner scan = new Scanner(System.in);
        if(numberOfPages < 1) {
            System.out.println("Valor inválido. Ingrese un número positivo.");
            while (numberOfPages < 1) {
                numberOfPages = scan.nextInt();
            }
        }
        return numberOfPages;
    }

    /**
     * Carga la información del libro.
     * Inicializa cada atributo del libro.
     * @param data es un vector con los valores de los atributos que va a tener el libro.
     */
    private void loadData(String[] data){
        setIsbn(data[0]);
        setTitle(data[1]);
        setAuthor(data[2]);
        setPages(data[3]);
    }

    /**
     * Muestra la información del libro.
     * Imprime por consola cada uno de los atributos del libro.
     * Aplica un formato de presentación.
     */
    public void showData() {
        System.out.println(
                "\n\tISBN: " + getIsbn() +
                        "\n\tTítulo: " + getTitle() +
                        "\n\tAutor: " + getAuthor() +
                        "\n\tNúmero de páginas: " + getPages()
        );
    }

}
