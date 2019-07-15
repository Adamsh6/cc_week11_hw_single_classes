import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
         printer = new Printer(20, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void printMethodWorksIfEnoughPaper(){
        printer.print(2, 10);
        assertEquals(0, printer.getSheetsLeft());
    }

    @Test
    public void printMethodFailsIfNotEnoughPaper(){
        printer.print(3, 10);
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void tonerReducedWhenPrinting(){
        printer.print(2, 5);
        assertEquals(40, printer.getToner());
    }

}