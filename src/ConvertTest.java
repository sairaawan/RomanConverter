import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    @Test
    void getNumber(){
        //arrange
        Convert c=new Convert();
        //act=c.number(1) => given value

        //assert
        assertEquals("XX",c.number(20));
        assertEquals("II",c.number(2));
    }

}