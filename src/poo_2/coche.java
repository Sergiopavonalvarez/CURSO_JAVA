package poo_2;

public class coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;

	public coche() {

		setRuedas(4);
		setLargo(2000);
		setAncho(300);
		setMotor(1600);
		setPeso(500);
	}

	public void setPeso(int peso) {
		this.peso = peso;
		// TODO Auto-generated method stub

	}

	public int getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		coche Renault = new coche();

		System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas");

		System.out.println("este coche pesa " + Renault.getPeso());

		System.out.println("Tiene de largo: " + Renault.getLargo() + " cm");
		
		System.out.println(Renault.getMotor() + " de mmotor");

	}
	
}
