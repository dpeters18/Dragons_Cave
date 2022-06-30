import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DragonMainTest {
    @BeforeEach
    void setUp()
    {
    }
    @Test
    void readable()
    {  String str="The string was either not a valid input or was neither 1 nor 2.";
        assertEquals(str, Dragon_Main.readable(null),"Yeah, no.");
        assertEquals(str, Dragon_Main.readable("e"),"Yeah, no.");
     assertEquals("1", Dragon_Main.readable("1"),"Yeah, no.");
     assertEquals("2", Dragon_Main.readable("2"),"Yeah, no.");
    }
    @AfterEach
    void tearDown()
    {

    }
}