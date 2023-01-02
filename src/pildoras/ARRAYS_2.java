package pildoras;
import java.util.Iterator;
import javax.swing.JOptionPane;
public class ARRAYS_2 {

	public static void main(String[] args) {
		String[] paises = new String[5];

		/*paises[0] = "Spain";
		paises[1] = "Ecuador";
		paises[2] = "E.E.U.U.";
		paises[3] = "Venezuela";
		paises[4] = "Argentina";*/

		int numero = 0;	
		for (int i = 0; i <5; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce un pais");		
		}
		for (String elemento : paises) {

			System.out.println("Pais " + numero++ + " " + elemento);
		}
	}
}
