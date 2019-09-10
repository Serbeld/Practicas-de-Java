import java.util.Scanner;

public class Matrices{
	public static void main(String args[]){
		int filas = 0;
		int columnas = 0;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.print("\nMatrices\n");

		System.out.print("\nCuantas filas deseas? ");
		filas = entrada.nextInt();

		System.out.print("\nCuantas columnas deseas? ");
		columnas = entrada.nextInt();

		System.out.println(" ");

		int numeros [][] = new int [filas][columnas];

		for(int j = 0; j < filas; j++){
			for(int i = 0; i < columnas; i++){
				numeros[j][i] = contador;
				contador++;
				System.out.print("[ " + numeros[j][i] + " ]");
			}
		System.out.println(" ");
		}
	}
}