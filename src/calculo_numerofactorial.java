import javax.swing.*;

public class calculo_numerofactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado=1;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		
		for (int i=numero ; 1>0; i--) {
			
			resultado=resultado*i;
			
		}
		
	     //System.out.println("el factorial");
	
	
		
	}

}
