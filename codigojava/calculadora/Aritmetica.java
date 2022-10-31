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
		double determinante=Math.pow(numero2,2) - (4*a*c);
		if(determinante>0)
		{
			double x1=( (b*(-1))+Math.sqrt(determinante))/(2*a);
			double x2=( (b*(-1))-Math.sqrt(determinante))/(2*a);
			System.out.print("El valor de x1="+x1" y el valor de x2="x2");
	}
		else System.out.print("El determinante es negativo y no se puede completar la operaciones")			 
}
}
