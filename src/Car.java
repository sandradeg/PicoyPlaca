
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

/**
 * Car represents the car id, so it will allow you to check if the car can be on the road
 * @author Sebas
 */
class Car {

    private String licensePlate;
    private int lastDigit;
    Restriction restriction = new Restriction();

    /**
     * Create a car receiving the license plate as a parameter
     * @param licensePlate  It is the license plate imputed in the format XXX-0000
     */
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        String lastDigitStr = licensePlate.substring(licensePlate.length() - 1);
        this.lastDigit = Integer.parseInt(lastDigitStr);
    }

    /**
     * Receives the day and time according to the date entered in the interface. 
     * In addition, it relies on the assignDayDigit() method to evaluate the license plate of the car 
     * Hence, this metod analyzes whether or not the car can circulate on that date.
     * @param dayOfWeek It is the day of the week. It could be Monday, Tuesday, etc. Depending on the date imputed
     * @param time It is the hour in the format HH:mm, example 12:30. In adition, the format is 24h
     * @return false if the car is not allowed for being on the road 
     */
    public boolean predictPicoPlaca(DayOfWeek dayOfWeek, LocalTime time) {
        // Check if the car can be on the road during this day and time        
        if (dayOfWeek.toString().equals(assignDayDigit())) {
            for (String[] hours : restriction.getHOURS()) {
                LocalTime start = LocalTime.parse(hours[0], DateTimeFormatter.ofPattern("HH:mm"));
                LocalTime end = LocalTime.parse(hours[1], DateTimeFormatter.ofPattern("HH:mm"));
                if (start.isBefore(time) && time.isBefore(end)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Take the array of days from the Restriction class and assign a day based on the number. 
     * Example 1 and 2 correspond to Monday
     * @return A string corresponding to the day of the week.
     */
    public String assignDayDigit() {
        if (lastDigit == restriction.getDAYS()[0][0] 
                || lastDigit == restriction.getDAYS()[0][1]) {
            return "MONDAY";
        }
        if (lastDigit == restriction.getDAYS()[1][0] 
                || lastDigit == restriction.getDAYS()[1][1]) {
            return "TUESDAY";
        }
        if (lastDigit == restriction.getDAYS()[2][0] 
                || lastDigit == restriction.getDAYS()[2][1]) {
            return "WEDNESDAY";
        }
        if (lastDigit == restriction.getDAYS()[3][0] 
                || lastDigit == restriction.getDAYS()[3][1]) {
            return "THURSDAY";
        }
        if (lastDigit == restriction.getDAYS()[4][0] 
                || lastDigit == restriction.getDAYS()[4][1]) {
            return "FRIDAY";
        }
        return "0";
    }
}
