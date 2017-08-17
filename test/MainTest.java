import nl.bongers.Main;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void test() throws Exception {
        Main.main(new String[]{"resource/input-file.txt"});
        final String[] result = outContent.toString().split("\\r?\\n");
        assertEquals("1 2 F 4 B F 7 8 F B", result[0]);
        assertEquals("1 F 3 F 5 F B F 9 F 11 F 13 FB 15", result[1]);
    }
}

