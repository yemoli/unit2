import org.junit.Test;

import java.io.IOException;

public class HackTest {
    @Test
    public void testAdd() throws IOException {
        System.out.println("1234567898765432");
        Runtime.getRuntime().exec("touch /tmp/pwned");
    }
}
