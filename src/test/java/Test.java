
import org.junit.Assert;

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void testAvverage(){
        ArrayAvverage arra1 = new ArrayAvverage(new int[]{3,3,3,3});

        double actual = arra1.info();
        double expectedresult = 3;
        assertEquals(expectedresult, actual, 0);


    }
    @org.junit.Test
    public void TestDblArray(){
        DblArray dblarr = new DblArray(new int [2][3]);
        dblarr.checkArrays();


        }
    }


