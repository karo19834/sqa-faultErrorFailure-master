package at.campus02.example;

import org.junit.Assert;
import org.junit.Test;

public class TestFaultTwo {
    @Test
    //Fault (Bug) vorhanden
    //Error vorhanden: i startet bei 1, nicht bei 0
    //Failure: ja (Resultat stimmt nicht)
    public void findNumber() {
        int pos = FaultTwo.findLast(new int[] {2, 3, 5, 8}, 2);
        Assert.assertEquals(0, pos);
    }

    //b
    @Test(expected = NullPointerException.class)
    //Fault (Bug) vorhanden
    //Error nicht vorhanden: Exception wird vorher ausgelöst(mit if abfrage)
    //Failure: nein
    public void expectetException() {
        int pos = FaultTwo.findLast(null, 1);
    }

    //c
    @Test
    public void findNumberAtRightPosition(){
        //Fault (Bug) vorhanden
        //Error: nein (wird ausgeführt, aber i immer richtig)
        //Failure: nein (weil Resultat troztdem,stimmt)
        int pos = FaultTwo.findLast(new int[] {0, 2, 3, 5, 8}, 3);
        Assert.assertEquals(2,pos);
    }


    //d
    @Test
    public void errorNutNoFAilure(){
        //Fault (Bug) vorhanden
        //Error: ja (i ist nie 0)
        //Failure: nein (weil Resultat troztdem,stimmt)
        int pos = FaultTwo.findLast(new int[] {0, 2, 5, 8}, 3);
        Assert.assertEquals(-1,pos);
    }
}
