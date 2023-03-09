package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultOne {

    @Test
    public void testMultipleZeros(){
        //given  setup
        int [] input = { 1,2,0,3,4,0,5};
        //when   execute
        int result = FaultOne.numZero(input);
        //then   validate/check
        Assert.assertEquals(2, result);
    }


}
