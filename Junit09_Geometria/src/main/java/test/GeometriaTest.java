package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geometria = new Geometria();
	
	@Test
	public void testAreaCuadrado() {
		System.out.println("testAreaCuadrado()");
		int resul = geometria.areacuadrado(2);
		int esper = 4;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreaCirculo() {
		System.out.println("testAreaCirculo()");
		double resul = geometria.areaCirculo(3);
		double esper = 28.2744;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAreaTriangulo() {
		System.out.println("testAreaTriangulo()");
		int resul = geometria.areatriangulo(2,3);
		int esper = 3;
		assertEquals(esper,resul);

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
