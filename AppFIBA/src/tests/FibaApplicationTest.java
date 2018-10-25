package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.FibaApplication;

class FibaApplicationTest extends TestCase {

	private FibaApplication fiba;
	
	
	public void stageOne() {
		fiba=new FibaApplication();
	}
	
	
	@Test
	public void testSearchByCriteriaAge() {
		stageOne();
		assertEquals(1602, fiba.searchByCriteriaAge(26).size());
	}
	
	@Test
	public void testSearchByCriteriaAST() {
		stageOne();
		assertEquals(10, fiba.searchByCriteriaAST(26).size());
	}
	
	@Test
	public void testSearchByCriteriaDefense() {
		stageOne();
		assertEquals(49, fiba.searchByCriteriaDefense(-1.12).size());
	}
	
	@Test
	public void testSearchByCriteriaDRB() {
		stageOne();
		assertEquals(80, fiba.searchByCriteriaDRB(16).size());
	}
	
	@Test
	public void testSearchByCriteriaHeight() {
		stageOne();
		assertEquals(1807, fiba.searchByCriteriaHeight(79).size());
	}
	
	@Test
	public void testSearchByCriteriaName() {
		stageOne();
		assertEquals(226, fiba.searchByCriteriaName("Kevin").size());
	}
	
	@Test
	public void testSearchByCriteriaOffense() {
		stageOne();
		assertEquals(31, fiba.searchByCriteriaOffense(-0.37).size());
	}
	
	@Test
	public void testSearchByCriteriaTeam() {
		stageOne();
		assertEquals(28, fiba.searchByCriteriaTeam("NOJ").size());
	}
	
	@Test
	public void testSearchByCriteriaUSG() {
		stageOne();
		assertEquals(52, fiba.searchByCriteriaUSG(26).size());
	}
	
	@Test
	public void testSearchByCriteriaWeight() {
		stageOne();
		assertEquals(877, fiba.searchByCriteriaWeight(225).size());
	}
	
	@Test
	public void testSearchByCriteriaYear() {
		stageOne();
		assertEquals(526, fiba.searchByCriteriaYear(2008).size());
	}
	
	
}
