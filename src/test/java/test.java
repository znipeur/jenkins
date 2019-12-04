import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class test {
    @Test
    public void testmain(){
        HelloWorld h = new HelloWorld();
        assertEquals("HelloWorld",h.Hello());
    }
}
