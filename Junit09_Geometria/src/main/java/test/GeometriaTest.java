package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geometria = new Geometria();
	
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
	
	//Test 7
	@Test
	public void testAreaRomboide() {
		int result = geometria.arearomboide(2, 3);
		int expected = 6;
		assertEquals(expected, result);
	}
	
	//Test 8
	@Test
	public void testAreaTrapecio() {
		int result = geometria.areatrapecio(5, 3, 4);
		int expected = 16;
		assertEquals(expected, result);
	}
	
	//Test 9
	@ParameterizedTest
	@MethodSource("getFormatFixture")
	public void testFigura(int a, String b) {
		String result = geometria.figura(a);
		assertEquals(b, result);
	}
}
