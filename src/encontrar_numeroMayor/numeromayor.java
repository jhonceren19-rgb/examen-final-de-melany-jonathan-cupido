

	package encontrar_numeroMayor;
	import java.util.Scanner;

		public class numeromayor {

		    public static int encontrarMayor(int[] arreglo) {
		        if (arreglo == null || arreglo.length == 0) {
		            throw new IllegalArgumentException("El arreglo no puede estar vacío");
		        }

		        int mayor = arreglo[0];

		        for (int i = 1; i < arreglo.length; i++) {
		            if (arreglo[i] > mayor) {
		                mayor = arreglo[i];
		            }
		        }

		        return mayor;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("¿Cuántos números desea ingresar? ");
		        int cantidad = scanner.nextInt();

		        int[] arreglo = new int[cantidad];

		        System.out.println("Ingrese los " + cantidad + " números:");
		        for (int i = 0; i < cantidad; i++) {
		            System.out.print("Número [" + (i + 1) + "]: ");
		            arreglo[i] = scanner.nextInt();
		        }

		        int mayor = encontrarMayor(arreglo);

		        System.out.println("\nArreglo ingresado:");
		        for (int num : arreglo) {
		            System.out.print(num + " ");
		        }

		        System.out.println("\nEl número mayor es: " + mayor);

		        scanner.close();
		    }
		
			
				
			    
			
			}

			

		




