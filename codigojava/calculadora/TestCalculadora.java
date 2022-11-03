import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	private calculadora calculadora;
	
	public void escenario() {
		calculadora = new calculadora();
	}
	
	public void testSumar () {
		escenario();
		assertTrue(calculadora.sumar(2,2)==(2+2));
	}
	public void testSumarFail () {
		escenario();
		assertNotSame(calculadora.sumar(2,2),5);
	}
	public void testSumarEqual(){
		escenario();
		assertEquals(calculadora.sumar(2,2),(4));
	}
	
	public void testeRestarEqual () {
		escenario();
		assertEquals(3, calculadora.resta(5, 2));;
	}
	public void testRestarFail () {
		escenario();
		assertNotNull(calculadora.resta(3,2));
	}
	public void testRestar () {
		escenario();
		assertTrue(calculadora.resta(5,3)==(5-3));
	}
	public void testMultiplicar (){
		escenario();
		assertTrue(calculadora.multiplicar(2,2)==(2*2));
	}
		
	public void testMultiplicarFail (){
		escenario();
		assertNotNull(calculadora.multiplicar(2,2));
	}
		
	public void testMultiplicarEqual (){
		escenario();
		assertEquals(calculadora.multiplicar(2,2), 04);
	}
		
	public void testDividir () {
		escenario();
		assertTrue(calculadora.division(4, 2)==(4/2));
	}
		
	public void testDividirFail (){
		escenario();
		assertNotNull(calculadora.division(0,2));
	}
		
	public void testDividirEquals1(){
		escenario();
		assertEquals(calculadora.division(4,2), 02);
	}
		
	
	public void testCuadratica () {
		escenario();
		assertTrue(calculadora.Cuadratica(1,2,1)==(-1));
	}
		
	public void testCuadraticaFail (){
		escenario();
		assertNotSame(calculadora.Cuadratica(0, 20, 1),null);
	}
		
	public void testCuadraticaEquals (){
		escenario();
		assertEquals(calculadora.Cuadratica(5,1,3),null);
	}
}
