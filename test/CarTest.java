/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebas
 */
public class CarTest {
    
    public CarTest() {
    }

    @Test
    public void testPredictPicoPlaca1() {
        System.out.println("predictPicoPlaca Car1 Scenario1 - PBX-4321");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-17"));
        LocalTime time = LocalTime.parse("12:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4321");
        boolean expResult = true;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca2() {
        System.out.println("predictPicoPlaca Car1 Scenario2 - PBX-4321");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-13"));
        LocalTime time = LocalTime.parse("08:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4321");
        boolean expResult = false;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should not be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca3() {
        System.out.println("predictPicoPlaca Car1 Scenario3 - PBX-4321");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-13"));
        LocalTime time = LocalTime.parse("23:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4321");
        boolean expResult = true;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca4() {
        System.out.println("predictPicoPlaca Car2 Scenario1 - PBX-0443");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-14"));
        LocalTime time = LocalTime.parse("07:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-0443");
        boolean expResult = false;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should not be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca5() {
        System.out.println("predictPicoPlaca Car2 Scenario2 - PBX-0443");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-14"));
        LocalTime time = LocalTime.parse("09:20", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-0443");
        boolean expResult = false;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should not be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca6() {
        System.out.println("predictPicoPlaca Car2 Scenario3 - PBX-0443");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-14"));
        LocalTime time = LocalTime.parse("13:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-0443");
        boolean expResult = true;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca7() {
        System.out.println("predictPicoPlaca Car3 Scenario1 - PBX-4355");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-15"));
        LocalTime time = LocalTime.parse("04:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4355");
        boolean expResult = true;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca8() {
        System.out.println("predictPicoPlaca Car3 Scenario2 - PBX-4355");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-01"));
        LocalTime time = LocalTime.parse("07:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4355");
        boolean expResult = false;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should not be allowed to be on the road\n");
    }
    
    @Test
    public void testPredictPicoPlaca9() {
        System.out.println("predictPicoPlaca Car3 Scenario3 - PBX-4355");
        DayOfWeek dayOfWeek = DayOfWeek.from(java.time.LocalDate.parse("2023-02-28"));
        LocalTime time = LocalTime.parse("07:30", DateTimeFormatter.ofPattern("HH:mm"));
        Car instance = new Car("PBX-4355");
        boolean expResult = true;
        boolean result = instance.predictPicoPlaca(dayOfWeek, time);
        assertEquals(expResult, result);
        System.out.println("The car should be allowed to be on the road\n");
    }

    
    
    @Test
    public void testAssignDayDigit1() {
        System.out.println("assignDayDigit Car1 Scenario1 - PBX-4321");
        Car instance = new Car("PBX-4321");
        String expResult = "MONDAY";
        String result = instance.assignDayDigit();
        assertEquals(expResult, result);
        System.out.println("1,2 = MONDAY\n");
    }
    
    @Test
    public void testAssignDayDigit2() {
        System.out.println("assignDayDigit Car2 Scenario1 - IBB-0443");
        Car instance = new Car("PBX-0443");
        String expResult = "TUESDAY";
        String result = instance.assignDayDigit();
        assertEquals(expResult, result);
        System.out.println("3,4 = TUESDAY\n");
    }
    
    @Test
    public void testAssignDayDigit3() {
        System.out.println("assignDayDigit Car3 Scenario1 - CSV-4355");
        Car instance = new Car("PBX-4355");
        String expResult = "WEDNESDAY";
        String result = instance.assignDayDigit();
        assertEquals(expResult, result);
        System.out.println("5,6 = WEDNESDAY\n");
    }
    
    @Test
    public void testAssignDayDigit4() {
        System.out.println("assignDayDigit Car4 Scenario1 - GWA-1258");
        Car instance = new Car("PBX-1258");
        String expResult = "THURSDAY";
        String result = instance.assignDayDigit();
        assertEquals(expResult, result);
        System.out.println("7,8 = THURSDAY\n");
    }
    
    @Test
    public void testAssignDayDigit5() {
        System.out.println("assignDayDigit Car5 Scenario1 - MSW-9480");
        Car instance = new Car("PBX-9480");
        String expResult = "FRIDAY";
        String result = instance.assignDayDigit();
        assertEquals(expResult, result);
        System.out.println("9,0 = FRIDAY\n");
    }
    
    
}
