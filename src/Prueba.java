import javax.swing.*;

import java.util.*;

public class Prueba {



	public static void main(String[] args) {
		
		int numero=(int)(Math.random()*100);
		int numero_adivinar;
		
		System.out.println(numero);
		
		
		numero_adivinar=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		
		while (numero!=numero_adivinar) {
			
			numero_adivinar=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de nuevo"));
			
			if (numero_adivinar<numero) {
				
				System.out.println("el numero es mayor");
			}else {
				
				System.out.println("el numero es menor");
			}
			
			
		}
		
		System.out.println("el numero es correcto");
		

			
			
			
			
			
		}
		
	
	}
	

