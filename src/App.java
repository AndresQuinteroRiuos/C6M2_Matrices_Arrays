import java.util.Scanner;
            
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas: ");
        var len = scanner.nextInt(); // Numero filas

        int[][] board = new int[len][]; // Se define la primera dimension (filas)

        for (int row = 0; row < board.length; row++) { // Recorriendo cada fila del tablero

            System.out.printf("Ingrese el numero de columnas de la fila %d: ", (row + 1));
            len = scanner.nextInt();

            board[row] = new int[len]; // Se define el tamaño del array para la segunda dimension (columnas)

            for (int column = 0; column < board[row].length; column++) { // recorriendo las columnas de la fila del
                                                                         // tablero

                System.out.printf("Ingrese el len para la fila %d, columna %d: ",
                        (row + 1), (column + 1));

                board[row][column] = scanner.nextInt(); // Asignar el valor del teclado a la fila, columna del tablero
            }
        }
        scanner.close();

        // Imprimir el array creado anteriormente

        System.out.println("=== Contenido del tablero ===");
        for (int row = 0; row < board.length; row++) { // Recorro cada fila del tablero
            for (int column = 0; column < board[row].length; column++) { // Recorro cada columna de la fila del tablero
                System.out.print(board[row][column] + " "); // Imprimir el contenio de esa fila, columna
            }
            System.out.println();
        }

        System.out.println(board[2][2]);
    }
}
