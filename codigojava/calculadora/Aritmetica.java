package calculadora;

public class Aritmetica {
	int numero1 = 10;
	int numero2 = 5;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	public Aritmetica(){
		
	}
	
	public void suma() {
		 suma= numero1+numero2;
		 System.out.print("La suma es:" + suma);
	}
	
	public void resta() {
		resta= numero1-numero2;
		System.out.print("La resta es:" + resta);
	}
	
	public void multiplicacion() {
		multiplicacion= numero1*numero2;
		System.out.print("La multiplicacion es:" + multiplicacion);
	}
	
	public void division() {
		division= numero1/numero2;
		System.out.print("La division es:" + division);
	}
}
