/**
 * 
 */
package planner;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



/**
 * @author Jovana
 *
 */
public class PredmetTest {

	
	private Predmet predmet;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		predmet = new Predmet();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		predmet = null;
	}

	/**
	 * Test method for {@link planner.Predmet#setNaziv(java.lang.String)}.
	 */
	@Test
	public void testSetNaziv() {
		predmet.setNaziv("Matematika");
		assertEquals("Matematika", predmet.getNaziv());
		
	}
	
	/**
	 * Test method for {@link planner.Predmet#setNaziv(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNazivNull() {
		predmet.setNaziv(null);
		
	}
	

	/**
	 * Test method for {@link planner.Predmet#setNaziv(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNazivPraznaString() {
		predmet.setNaziv("");
		
	}

	/**
	 * Test method for {@link planner.Predmet#setESPB(int)}.
	 */
	@Test
	public void testSetESPB() {
		predmet.setESPB(6);
		assertEquals(6, predmet.getESPB());
	}
	
	
	/**
	 * Test method for {@link planner.Predmet#setOcena(int)}.
	 */
	@Test
	public void testSetOcena() {
		predmet.setOcena(8);
		assertEquals(8, predmet.getOcena());
	}
	
	/**
	 * Test method for {@link planner.Predmet#setESPB(int)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetESPBVanGranica() {
		predmet.setESPB(3);
		
	}
	
	
	
	/**
	 * Test method for {@link planner.Predmet#setOcena(double)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetOcenaVanGranica() {
		predmet.setOcena(3);
		
		
	}


	

	/**
	 * Test method for {@link planner.Predmet#setDatumIspita(java.util.GregorianCalendar)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetDatumIspitaNull() {
	predmet.setDatumIspita(null);
	}


	/**
	 * Test method for {@link planner.Predmet#setSemestar(int)}.
	 */
	@Test
	public void testSetSemestar() {
		predmet.setSemestar(6);
		assertEquals(6, predmet.getSemestar());
	}
	
	/**
	 * Test method for {@link planner.Predmet#setSemestar(int)}.
	 */
	@Test (expected = java.lang.RuntimeException.class) 
	public void testSetSemestarVanGranica() {
		predmet.setSemestar(10);
		
	}

}
