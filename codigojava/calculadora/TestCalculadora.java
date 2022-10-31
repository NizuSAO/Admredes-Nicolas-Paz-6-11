import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	private Calculadora calculadora;
	
	public void escenario() {
		calculadora = new Calculadora();
	}
	
	public void testSumar () {
		escenario();
		assertTrue(calculadora.sumar(2,2)==(2+2));
	}
	public void testSumarFail () {
		escenario();
		assertNotEquals(calculadora.sumar(2,2),5);
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
		assertNotEquals(calculadora.resta(3,2),3);
	}
	public void testRestar () {
		escenario();
		assertTrue(calculadora.resta(5,3),2);
	
	public void testMultiplicar (){
		escenario();
		assertTrue(calculadora.multiplicar(2,2)==(2*2));
	}
		
	public void testMultiplicarFail (){
		escenario();
		assertNotEquals(calculadora.multiplicar(2,2),1);
	}
		
	public void testMultiplicarEqual (){
		escenario();
		assertEquals(calculadora.multiplicar(2,2)4);
	}
		
	public void testDividir () {
		escenario();
		assertTrue(calculadora.division(4, 2)==(4/2));
	}
		
	public void testDividirFail (){
		escenario();
		assertNotEquals(calculadora.division(4,2),3);
	}
		
	public void testDividirEquals (){
		escenario();
		assertEquals(calculadora.division(4,2)2);
	}
}
