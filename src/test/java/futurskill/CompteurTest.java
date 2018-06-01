package futurskill;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*public class CompteurTest extends TestCase {
	Compteur cpt ;
	protected void setUp() {
		
		cpt =new Compteur ();
	}
	
	public void testIncrement() {
        assertEquals ( 1, cpt.Increment());
	    assertEquals (2, cpt.Increment());
	}
	
	public void testDecrementer() {
		
	  assertEquals (-1, cpt.Decrement());
	}

}*/


public class CompteurTest  {
Compteur cpt1 ;

@Before
public void setUp() {
	
	cpt1 =new Compteur ();
}

@Test
public void testIncrement() {
    Assert.assertEquals ( 1, cpt1.Increment());
    // Faire un premier test avec le cas suivant
    //Assert.assertEquals (2, cpt.Increment());
 // Faire un deuxieme test avec le cas suivant
  //  Assert.assertEquals (3, cpt.Increment());
}
@Test 
public void testDecrementer() {
  Assert.assertEquals (-1, cpt1.Decrement());
}

}


