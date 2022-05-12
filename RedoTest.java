import static org.junit.Assert.*;
import org.junit.*;

public class RedoTest{
    @Test
    public void test(){
        assertEquals("We expect 4 to be divided by 2", 
        2, Redo.divide(4,2));

    }
    
}