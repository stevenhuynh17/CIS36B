import static org.junit.Assert.*;

import org.junit.Test;

public class SalesAppTest {
	double dummyData [][][] = {
			{{1.0, 1.0, 1.0}, {2.0, 2.0, 2.0}, {3.0, 3.0, 3.0}}, 
			{{4.0, 4.0, 4.0}, {5.0, 5.0, 5.0}, {6.0, 6.0, 6.0}}, 
			{{7.0, 7.0, 7.0}, {8.0, 8.0, 8.0}, {8.0, 9.0, 10.0}}
	};
	
	@Test
	public void testAddByProduct() {
		assertEquals("GTX products should total: ", 18.0, SalesApp.AddByProduct(dummyData, 1), 0.01);
		assertEquals("Titan products should total: ", 45.0, SalesApp.AddByProduct(dummyData, 2), 0.01);
		assertEquals("1080ati products should total: ", 72.0, SalesApp.AddByProduct(dummyData, 3), 0.01);
	}

	@Test
	public void testAddByQuarter() {
		assertEquals("Q1 should total: ", 36.0, SalesApp.AddByQuarter(dummyData, 1), 0.01);
		assertEquals("Q2 should total: ", 45.0, SalesApp.AddByQuarter(dummyData, 2), 0.01);
		assertEquals("Q3 should total: ", 54.0, SalesApp.AddByQuarter(dummyData, 3), 0.01);
	}

	@Test
	public void testAddByGeography() {
		assertEquals("West should total: ", 44.0, SalesApp.AddByGeography(dummyData, 1), 0.01);
		assertEquals("North should total: ", 45.0, SalesApp.AddByGeography(dummyData, 2), 0.01);
		assertEquals("South should total: ", 46.0, SalesApp.AddByGeography(dummyData, 3), 0.01);
	}

}
