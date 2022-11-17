import javax.swing.*;

public class calculo_peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String masculino="Hombre";
		String femenino="Mujer";
		String genero="";
		
		

		do {
			
			genero=JOptionPane.showInputDialog("Eres Hombre o mujer?");	
			
		} while (genero.equalsIgnoreCase(masculino)==false && genero.equalsIgnoreCase(femenino)==false);
		
		
		
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
		
		if (genero.equalsIgnoreCase("Hombre")) {
			
			System.out.println("tu peso ideal es " +  (altura-110) + " kilos");
			
		}
		
		else if (genero.equalsIgnoreCase("Mujer")) {
			
			System.out.println("tu peso ideal es " + (altura-120) + " kilos");
			
		}
		
	}

}
