import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result= com.javaCode.Addition.add(4,8);
        int correct=12;

        assertEquals(12,result);

    }
}