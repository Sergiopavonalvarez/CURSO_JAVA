
public class manipula_cadenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo dia para programar en Java";
		
		String frase_resumen=frase.substring(19, 46) + " sentado " + frase.substring(0, 3);
		
		System.out.println(frase_resumen);

	}

}
