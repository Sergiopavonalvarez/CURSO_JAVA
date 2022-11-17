import java.util.*;
import javax.swing.*;
public class areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Opciones: \n1: Cuadrado \n2: Triangulo \n3: Rectangulo \n4: circulo");
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int base_cuadrado=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base")) ;
			
			System.out.println("El area del cuadrado es " + Math.pow(base_cuadrado, 2));
			
			break;
			
		case 2:
			
			int altura_triangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			int base_triangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			System.out.println("El area del triangulo es " + altura_triangulo * base_triangulo);
			
			
			break;
			
		case 3:
			
			int altura_rectangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			int base_rectangulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			System.out.println("El area del rectangulo es " + altura_rectangulo * base_rectangulo);
			
			break;
			 
			
		case 4:
			
			int radio_circulo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el redio"));
			
			System.out.printf("El area del circulo es " + Math.pow(radio_circulo, 2) * Math.PI );
			
			break;
			
		default: 
			
			System.out.println("la opcion no es correcta");
			
		
		}
		
		
				

		
	
		
		
	}

}
