import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		

		String Nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre, por favor");
		
		String Edad=JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int Edad_usuario=Integer.parseInt(Edad);
		
		System.out.println("Hola " + Nombre_usuario + 
				" el año que viene tendras "+ (Edad_usuario + 1) + " años");
		
		String pregunta_aburrimiento=JOptionPane.showInputDialog("Te aburres, si o no?");
		
	
		if (pregunta_aburrimiento.equalsIgnoreCase("si")) {
	
		System.out.println("pues jodete");
	
		
		}else  {
			
			System.out.println("enhorabuena");
		}
		
		

		
		
		
	
	
		
				
	}

}
