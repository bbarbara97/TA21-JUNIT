package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	Geometria geometria = new Geometria();
	
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

}
