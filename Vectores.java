import java.util.Scanner;
public class Vectores{
	
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	float numeros[] = new float[5];
	float acum=0;

	System.out.print("Vectores\n");
	
	for(int x = 0; x < 5; x++){
		System.out.print("\nIngresa la nota del estudiante"+" [ "+(x+1)+ " ]: ");
		numeros[x] = in.nextFloat();
		acum += numeros[x];
	}

	float promedio;
	promedio = acum/5;
	
	System.out.println("\nEl promedio de notas es: "+promedio);
  }

}