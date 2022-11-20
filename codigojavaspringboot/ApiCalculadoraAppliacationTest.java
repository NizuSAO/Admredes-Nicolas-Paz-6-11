package apiCalculadora.apiCalculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
//import ApiCalculadoraApplication.ApiCalculadoraApplication;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiCalculadoraApplicationTests {

   ApiCalculadoraApplication calc = new ApiCalculadoraApplication();
   @Test
   void contextLoads() {
   }

   @Test
	void sumar() {

		assertEquals(calc.sumar(1, 2), 3);
		assertNotEquals(calc.sumar(1, 2), 4);
	}

	@Test
	void resta() {
		assertEquals(calc.restar(3, 1), 2);
		assertNotEquals(calc.restar(3, 2), 2);
	}
	
	@Test
	public void multiplicar(){
		assertEquals(Calcu.multiplicar(5,2),10);
		assertNotEquals(Calcu.multiplicar(10,7),50);
	}

	@Test
	void dividir() {
		assertEquals(calc.dividir(4, 2), 2);
		assertNotEquals(calc.dividir(3, 3), 3);
	}

	@Test //(expected = ArithmeticException.class)
	public void expecionDividir() {
		Assertions.assertThrows(ArithmeticException.class, ()-> {calc.dividir(2, 0);});

	}
	
}
