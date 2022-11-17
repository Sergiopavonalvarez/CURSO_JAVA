import javax.swing.*;
import java.util.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {

		String contraseña="Sergio";
		String pass="";
		
	
		
	while (contraseña.equals(pass)==false) {
		
		pass=JOptionPane.showInputDialog("introduce la contraseña");
		
		
		
		if (contraseña.equals(pass)==false) {
			
			System.out.println("introduce otra vez la contraseña");
		}
		
		
	}
	
	System.out.println("Contraseña correcta");
		
	}

}
