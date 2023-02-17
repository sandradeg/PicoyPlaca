

/**
 * Restriction will represent the range of hours and days in which the peak and plate apply.
 * The advantage of managing a class with time and day restrictions is that it is easier to maintain in case the regulations change
 * @author Sebas
 */
public class Restriction {

    /**
     * 2-dimensional array that stores the range of hours in which the peak and plate are active
     */
    private static final String hours[][] = {
        {"07:00", "09:30"},
        {"16:00", "19:30"}
    };

    /**
     * 2-dimensional array that stores the license plate number according to the day of the week
     */
    private static final int days[][] = {
        {1, 2}, //Monday
        {3, 4}, //Tuesday
        {5, 6}, //Wednesday
        {7, 8}, //Thursday
        {9, 0}  //Friday
    };

    /**
     * Contain the range of hours
     * @return range of hours
     */
    public String[][] getHOURS() {
        return hours;
    }

    /**
     * Contain the range of numbers. Depending on the day
     * @return range of days
     */
    public int[][] getDAYS() {
        return days;
    }

    
}
