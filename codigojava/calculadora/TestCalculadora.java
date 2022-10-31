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
	public void testeRestar () {
		escenario();
		assertEquals(3, calculadora.resta(5, 2));;
	}
	public void testMultiplicar (){
		escenario();
		assertTrue(calculadora.multiplicar(2,2)==(2*2));
	}
	public void testDividir () {
		escenario();
		assertTrue(calculadora.division(4, 2)==(4/2));
	}
}
