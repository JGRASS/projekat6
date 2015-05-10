/**
 * 
 */
package planner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Jovana
 *
 */
public class StudentTest {
	
	Student student;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		student = new Student();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		student = null;
	}
	
	/**
	 * Test method for {@link planner.Student#setIme(java.lang.String)}.
	 */
	@Test
	public void testSetIme() {
		student.setIme("Jovana");
		assertEquals("Jovana", student.getIme());
	}


	/**
	 * Test method for {@link planner.Student#setIme(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImeNull() {
		student.setIme(null);
		
	}
	/**
	 * Test method for {@link planner.Student#setIme(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetImePrazanString() {
		student.setIme("");
		
	}

	

	/**
	 * Test method for {@link planner.Student#setPrezime(java.lang.String)}.
	 */
	@Test
	public void testSetPrezime() {
		student.setPrezime("Veljovic");
		assertEquals("Veljovic", student.getPrezime());
	}

	/**
	 * Test method for {@link planner.Student#setPrezime(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimeNull() {
		student.setPrezime(null);
	
	}
	/**
	 * Test method for {@link planner.Student#setPrezime(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrezimePrazanString() {
		student.setPrezime("");
		
	}
	/**
	 * Test method for {@link planner.Student#setBrIndexa(java.lang.String)}.
	 */
	@Test
	public void testSetBrIndexa() {
		student.setBrIndexa("29/13");
		assertEquals("29/13", student.getBrIndexa());
	}

	
	/**
	 * Test method for {@link planner.Student#setBrIndexa(java.lang.String)}.
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetBrIndexaPrazanString() {
		student.setBrIndexa("");
		
	}

}
