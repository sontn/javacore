package ExceptionLesson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testArrayHasTwoElements() {
        int[] mang = Main.getMang();
        assertEquals("Mảng phải có đúng 2 phần tử", 2, mang.length);
    }

}
