import javax.swing.*;
import java.util.*;
public class juego_adivinar_numero {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner (System.in);
		
		int numero=0;
		int intentos=0;
		
		 do {
			
			intentos++;
			
			System.out.println("introduce un numero");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				
				System.out.println("el numero es menor, intentalo de nuevo");
			}
			
			else if (aleatorio>numero) {
				
				System.out.println("el numero es mayor, intentalo de nuevo");
			}
			
			
		} while (numero!=aleatorio);
		
		System.out.println("el numero es correcto, lo has conseguido en " + intentos + " intentos");
		
		
		
		
		
		

		
	
		}
	}


