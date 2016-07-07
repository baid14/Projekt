package pr;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class SokobanViewTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSizeY() {
		SokobanView SV = new SokobanView();
		int y = SV.getSizeY();
		Assert.assertEquals(y,10*40);
	}

	@Test
	public void testGetSizeX() {
		SokobanView SV = new SokobanView();
		int x = SV.getSizeX();
		Assert.assertEquals(x,14*40);
	}
/*
	@Test
	public void testGetf() {
		SokobanView SV = new SokobanView();
		int f = SV.getf();
		Assert.assertEquals(f,0);
	}

	@Test
	public void testGetw() {
		SokobanView SV = new SokobanView();
		int w = SV.getw();
		Assert.assertEquals(w,0);
	}
*/
}
