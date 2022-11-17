import javax.swing.JOptionPane;

public class comprueba_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("introduce mail");
		
		for (int i=0; i<mail.length();i++) {
			
			if(mail.charAt(i)== '@') {
				
				arroba=true;
			}
			
		
			}
		
		
		if (arroba==true) {
			
			System.out.println("es correcto");
		}

		else {
			
			System.out.println("No es correcto");
		}
	}

}
