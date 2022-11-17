import java.util.*;
public class flujo_de_ejeccucion_condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		
		
		System.out.println("Introduce tu edad, por favor");
		
	
		
		int edad=entrada.nextInt();
		
		if (edad<=18){
			
			System.out.println("Eres un jovenzuelo");
		}
		
		else if(edad<30) {
			
			System.out.println("Eres un poco viejo");
		}
			
		else if(edad<40) {
			
			System.out.println("hazte una colonoscopia");
		}
		
		
		


	}

}
