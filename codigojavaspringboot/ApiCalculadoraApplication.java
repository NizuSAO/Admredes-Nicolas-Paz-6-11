package apiCalculadora.apiCalculadora;
/*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCalculadoraApplication {

   public static void main(String[] args) {
      SpringApplication.run(ApiCalculadoraApplication.class, args);
      //System.out.println("Hola mundo");
   }

}*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiCalculadoraApplication {

   public static void main(String[] args) {
      SpringApplication.run(ApiCalculadoraApplication.class, args);
   }

   @GetMapping("/hola")
   public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
   }

   @GetMapping("/sumar")
   public int sumar(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
      return numero1 + numero2;
   }

   @GetMapping("/restar")
   public int restar(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
      return numero1 - numero2;
   }

   @GetMapping("/multiplicar")
   public int multiplicar(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
      return numero1 * numero2;
   }

   @GetMapping("/dividir")
   public int dividir(@RequestParam(value="a") int numero1,@RequestParam(value = "b")int numero2) {
      if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir por 0");
		}
		return num1 / num2;
   }

}
