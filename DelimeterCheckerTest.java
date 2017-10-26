import lab9.DelimeterChecker;

public class DelimeterCheckerTest {
	

	
	public void testCheck() {
		DelimeterChecker dc = new DelimeterChecker();
		
		boolean s1 = dc.check("()");
		assertEquals(s1, true);
		
		
	}

}
