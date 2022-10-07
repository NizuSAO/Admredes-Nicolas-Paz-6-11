package calculadora;

public class Aritmetica {
	int numero1 = 2;
	int numero1negativo = -2;
	int numero2 = 5;
	int numero3 = 3;
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
	public void cuadratica() {
		 double potencia = numero1-4*numero2*numero3;
		 
         double x1 = (numero1negativo - Math.sqrt(potencia)/ 2*numero2);

         double x2 = (numero1negativo + Math.sqrt(potencia)/ 2*numero2);
		
		System.out.printf("la x1 es: \n" + x1);
		System.out.printf("la x2 es: \n" + x2);
	}
}
}
