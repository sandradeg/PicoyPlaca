import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebas
 */
public class InterfaceTest {

    public InterfaceTest() {
    }

    @Test
    public void testValidationLengthLetter1() {
        System.out.println("validationLengthLetter License Plate1");
        String field = "IBB";
        int num = 3;
        char charAux = 'B';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthLetter(field, num, charAux);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationLengthLetter2() {
        System.out.println("validationLengthLetter License Plate2");
        String field = "PDA";
        int num = 3;
        char charAux = 'D';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthLetter(field, num, charAux);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationLengthLetter3() {
        System.out.println("validationLengthLetter License Plate3");
        String field = "GDF";
        int num = 3;
        char charAux = 'G';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthLetter(field, num, charAux);
        assertEquals(expResult, result);
    }

    
    @Test
    public void testValidationLengthNum1() {
        System.out.println("validationLengthNum License Plate1");
        String field = "3412";
        int num = 4;
        char charAux = '2';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthNum(field, num, charAux);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationLengthNum2() {
        System.out.println("validationLengthNum License Plate2");
        String field = "24";
        int num = 2;
        char charAux = '2';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthNum(field, num, charAux);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationLengthNum3() {
        System.out.println("validationLengthNum License Plate3");
        String field = "30";
        int num = 2;
        char charAux = ' ';
        Interface instance = new Interface();
        boolean expResult = true;
        boolean result = instance.validationLengthNum(field, num, charAux);
        assertEquals(expResult, result);
    }

}
