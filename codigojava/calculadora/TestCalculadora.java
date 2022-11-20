package test;

import calcu.Calculator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
 Calculator calculator = new Calculator();

 @Test
 public void sumaTest() {
  assertEquals(calculator.suma(1, 2), 3);


 }
 
 @Test 
 public void sumaMalTest(){
   assertNotEquals(calculator.suma(5, 5), 9);

 }

 @Test
 public void restaTest() {
  assertEquals(calculator.resta(2, 1), 1);

 }
@Test
 public void restaMalTest(){
   assertNotEquals(calculator.resta(8, 5), 2);

 }
 
 @Test
 public void multiplicacionTest() {
  assertEquals(calculator.multiplicacion(3, 3), 9);


 }
 @Test 
 public void multiplicacionMalTest(){
   assertNotEquals(calculator.multiplicacion(5, 3), 10);

 }

 @Test
 public void dividirTest() {
  assertEquals(calculator.dividir(4, 2), 2);


 }
 @Test 
 public void dividirMalTest(){
 assertNotEquals(calculator.dividir(18, 3), 2);

 }
 
 @Test (expected = ArithmeticException.class)
 public void divTestExcep(){
      calculator.dividir(2,0);
 }

 @Test
 public void cuaTest() {
  double result[] = {1, -5};
  assertArrayEquals(calculator.cuadratica(1, 4, (-5)), result, 0);
 }

}

