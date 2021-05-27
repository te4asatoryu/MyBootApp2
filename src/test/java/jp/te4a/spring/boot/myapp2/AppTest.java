package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_hello()
    {
	    String greeting = "hello";
    	HelloController hellocontroller = new HelloController();
		String actual =  hellocontroller.index();
	    assertEquals(greeting,actual);
    }

    @Test
    public void test_taro()
    {
	    String taro = "taro deat";
    	HelloController hellocontroller = new HelloController();
		String actual =  hellocontroller.taro();
	    assertEquals(taro,actual);
    }
    
    
}
