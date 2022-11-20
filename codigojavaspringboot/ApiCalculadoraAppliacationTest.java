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
	void dividir() {
		assertEquals(calc.dividir(4, 2), 2);
		assertNotEquals(calc.dividir(3, 3), 3);
	}

	@Test //(expected = ArithmeticException.class)
	public void expecionDividir() {
		Assertions.assertThrows(ArithmeticException.class, ()-> {
			calc.dividir(0, 0);
		});

	}

	@Test
	void multiplicar() {
		assertEquals(calc.multiplicar(2, 2), 4);
		assertNotEquals(calc.multiplicar(2, 3), 5);
	}

	@Test
	void cuadratica() {
		assertEquals(calc.cuadratica(1, 2, 1),(-1));
		assertNotEquals(calc.cuadratica(0, 20, 1), null);
	}

	@Test
	public void ExcepcionCuadratica() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.cuadratica(5, 1, 3);
		});

	}
}
