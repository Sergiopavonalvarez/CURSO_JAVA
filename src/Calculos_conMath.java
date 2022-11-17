
public class Calculos_conMath {

	public static void main(String[] args) {
		
		
	//double raiz=Math.sqrt(9);
		
		double base=5;

		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);
		
		Double Pi=Math.PI;
		
		int raiz=(int)Math.sqrt(base);
		
		int numero5=8;
		int numero6=6;
		double raiz2=Math.sqrt(numero5);
		long raizde8redondeada=Math.round(raiz2);
	
		
    System.out.println(numero5 + numero6);
		
		
		
	System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado + " y el numero Pi es " + Pi );
	System.out.println("La raiz cuadrada de cinco es " + base);
	System.out.println(raiz2);
	System.out.println(raiz2 * raiz2);
	System.out.println(raizde8redondeada);
    System.out.println(numero5 + raiz2);
	System.out.println ((numero5 + raiz2) / 2);
	System.out.printf ("%1.3f", (numero5 + raiz2) / 2);
	
	
	

	
	

	}

}
