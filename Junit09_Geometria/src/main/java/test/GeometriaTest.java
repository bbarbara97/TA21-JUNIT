package test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import JUnit.Junit09_Geometria.dto.Geometria;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geometria;
	
  private static Stream<Arguments> getFormatFixture() {
		return Stream.of(
				Arguments.of(1, "cuadrado"),
				Arguments.of(2, "Circulo"),
				Arguments.of(3, "Triangulo"),
				Arguments.of(4, "Rectangulo"),
				Arguments.of(5, "Pentagono"),
				Arguments.of(6, "Rombo"),
				Arguments.of(7, "Romboide"),
				Arguments.of(8, "Trapecio"),
				Arguments.of(9, "Default"));
	}
  
	@BeforeEach
	public void before() {
		geometria = new Geometria();
	}

	@Test
	public void testAreaCuadrado() {
		System.out.println("testAreaCuadrado()");
		int resul = geometria.areacuadrado(2);
		int esper = 4;
		assertEquals(esper, resul);
	}

	@Test
	public void testAreaCirculo() {
		System.out.println("testAreaCirculo()");
		double resul = geometria.areaCirculo(3);
		double esper = 28.2744;
		assertEquals(esper, resul);
	}

	@Test
	public void testAreaTriangulo() {
		System.out.println("testAreaTriangulo()");
		int resul = geometria.areatriangulo(2, 3);
		int esper = 3;
		assertEquals(esper, resul);

	}

	@Test
	public void testAreaRectangulo() {
		int entrada = geometria.arearectangulo(5, 5);
		int salida = 25;
		assertEquals(salida, entrada);
	}

	@Test
	public void testAreaPentagono() {
		int entrada = geometria.areapentagono(3, 2);
		int salida = 3;
		assertEquals(salida, entrada);
	}

	@Test
	public void testAreaRombo() {
		int entrada = geometria.arearombo(4, 5);
		int salida = 10;
		assertEquals(salida, entrada);
	}
  
	@Test
	public void testAreaRomboide() {
		int result = geometria.arearomboide(2, 3);
		int expected = 6;
		assertEquals(expected, result);
	}
	
	@Test
	public void testAreaTrapecio() {
		int result = geometria.areatrapecio(5, 3, 4);
		int expected = 16;
		assertEquals(expected, result);
	}
	
	@ParameterizedTest
	@MethodSource("getFormatFixture")
	public void testFigura(int a, String b) {
		String result = geometria.figura(a);
		assertEquals(b, result);
	}
	
	@Test
	public void testConstructor1() {
		int a = 5;
		String b = geometria.figura(a);
		Geometria geometria2 = new Geometria(a);
		
		assertEquals(a, geometria2.getId());
		assertEquals(b, geometria2.getNom());		
	}
	
	@Test
	public void testConstructor2() {
		int a = 9;
		String b = "Default";
		assertEquals(a, geometria.getId());
		assertEquals(b, geometria.getNom());
	}	
	
	@Test
	public void testGetSetId() {
		int a = 10;
		geometria.setId(a);
		assertEquals(a, geometria.getId());
	}
	
	@Test
	public void testGetSetNom() {
		String b = "Custom";
		geometria.setNom(b);
		assertEquals(b, geometria.getNom());
	}
	
	@Test
	public void testGetSetArea() {
		int a = geometria.areacuadrado(5);
		geometria.setArea(a);
		assertEquals(a, geometria.getArea());
	}
	
	@Test
	public void testToString() {
		int a = 5;
		String b = "Custom";
		double c = 25;
		String d = "Geometria [id=" + a + ", nom=" + b + ", area=" + c + "]";
		
		geometria.setId(a);
		geometria.setNom(b);
		geometria.setArea(c);
		
		String result = geometria.toString();
		
		assertEquals(d, result);
	}
}
