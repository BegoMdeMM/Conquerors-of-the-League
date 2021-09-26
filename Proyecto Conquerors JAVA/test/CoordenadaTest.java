package org.pmoo.proyecto;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoordenadaTest extends TestCase{
	Coordenada c1;
	Coordenada c2;
	
	@Before
	public void setUp() throws Exception {
		c1=new Coordenada(0,0);
		c2=new Coordenada(3,4);
	}


	@After
	public void tearDown() throws Exception {
		c1=null;
		c2=null;
	}

	@Test
	public void testCoordenada() {
		assertNotNull(c1);
		assertNotNull(c2);
	}

	@Test
	public void testGetPosFil() {
		assertEquals(c1.getPosCol(),0);
		assertEquals(c2.getPosCol(),3);
	}

	@Test
	public void testGetPosCol() {
		assertEquals(c1.getPosFil(),0);
		assertEquals(c2.getPosFil(),4);
	}

}
