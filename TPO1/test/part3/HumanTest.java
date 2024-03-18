package part3;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class HumanTest {
    Human human1;
    Human human2;

    

    @Before
    public void initHumans() {
        human1 = new Human(50, 180, 2000);
        human2 = new Human(20, 170, 50);
    }

    @Test(expected = Exception.class)
    public void ExceptionMoneyTest() throws Exception{
        human1.giveMoney(3000, human2);
    }

    @Test(expected = Exception.class)
    public void ExceptionCryTest() throws Exception{
        human1.cry("aaaa");
    }

    @Test
    public void workMoneyTest() throws Exception{
        human1.giveMoney(1000, human2);
        assertEquals(1000, human1.getMoney());
        assertEquals(1050, human2.getMoney());
    }

    @Test
    public void workCryTest() throws Exception {

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        human1.cry("AAAAAAA");

        String consoleOutput = outputStreamCaptor.toString().trim();

        assertEquals("AAAAAAA", consoleOutput);
    }

}