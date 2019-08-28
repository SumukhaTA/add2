package unit.test.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AddTest {

	Add add1;
	@Before
	public void setUp() throws Exception {
		add1  = new Add (2,3);
	}

	
	@Test
	public void test1() {
		Assert.assertEquals(5, add1.addthis());
	}

	@Test
	public void test2(){
		Assert.assertEquals(6, add1.addthis());
	}
	
}
