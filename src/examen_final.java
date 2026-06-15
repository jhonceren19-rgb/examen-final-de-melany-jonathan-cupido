
	
import java.util.Scanner;
public class examen_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner teclado = new Scanner(System.in);
		        
		        System.out.println("--- ENTRENAMIENTO DE FLEXIONES ---");
		        
		        // Pedimos los datos al usuario
		        System.out.print("Introduce el número de inicio: ");
		        int inicio = teclado.nextInt();
		        
		        System.out.print("Introduce el número final: ");
		        int fin = teclado.nextInt();
		        
		        System.out.println("\n¡A darle! Conteo de flexiones:");
		        System.out.println("--------------------------------");

		        // Bucle desde el inicio hasta el fin
		        for (int i = inicio; i <= fin; i++) {
		            
		            // Verificamos si el número termina en 8
		            if (i % 10 == 8 || i % 10 == -8) { 
		                System.out.println("¡esparta!");
		            } else {
		                System.out.println(i);
		            }
		        }
		        
		        System.out.println("--------------------------------");
		        System.out.println("¡Entrenamiento terminado!");
		        
		        teclado.close();
		    }
		


	}


