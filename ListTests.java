import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests{
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<String>();
        input1.add("blue");
        input1.add("yellow");
        input1.add("green");
        StringChecker sc = new StringChecker();
        
        
        List<String> output = ListExamples.filter(input1, sc);

        
        assertEquals(input1,output);
    }


















}