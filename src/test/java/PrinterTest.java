import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void beforeEach(){
        printer = new Printer(50, 80);
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(50, printer.getNumberOfSheets());
    }

    @Test
    public void canPrint(){
        printer.print(5, 2);
        assertEquals(70, printer.getToner());
        assertEquals(40, printer.getNumberOfSheets());
    }

}
