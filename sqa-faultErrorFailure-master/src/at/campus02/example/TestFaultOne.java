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


    @Test
    public void zeroAtEnd(){
        //Fault (Bug) vorhanden
        //Error vorhanden: i startet bei 1, nicht bei 0
        //Failure: nein (weil Resultat troztdem,stimmt)
        int res = FaultOne.numZero(new int []{1,2,3,0});
        Assert.assertEquals(1,res);
    }

    @Test
    public void zeroAtStart(){
        //Fault (Bug) vorhanden
        //Error vorhanden: i startet bei 1, nicht bei 0
        //Failure: nein (weil Resultat troztdem, stimmt)
        int res = FaultOne.numZero(new int []{0,1,2,3});
        Assert.assertEquals(1,res);
    }

    @Test(expected = NullPointerException.class)
    public void expectException(){
        //Fault (Bug) vorhanden
        //Error nicht vorhanden: Exception wird vorher ausgelöst(mit if abfrage)
        //Failure: nein
        int res = FaultOne.numZero(null);
        //we never reach this line
    }
}
