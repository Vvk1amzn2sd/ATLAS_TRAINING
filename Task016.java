public class Task016 {


    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {     //enhnced for
            System.out.println(day + " -> " + day.getColorCode());
        }

        System.out.println("===================================");
        System.out.println("See below the wek no.");
        for(Weekday_number wn : Weekday_number.values()) {
            System.out.println(wn + " -> " + wn.getweeknum());
        }   

        colors c1 = colors.BLUE;
        colors c2 = colors.GREEN;
        System.out.println("Color 1: " + c1);
        System.out.println("Color 2: " + c2);
        
    }
    
    public enum Weekday {
        MONDAY("Blue"),
        TUESDAY("Green"),
        WEDNESDAY("Yellow"),
        THURSDAY("Orange"),
        FRIDAY("Red"),
        SATURDAY("Purple"),
        SUNDAY("Pink");

        private final String colorCode;

        Weekday(String colorCode) {
            this.colorCode = colorCode;
        }

        public String getColorCode() {
            return colorCode;
        }

}

public enum Weekday_number {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int weeknum;

    Weekday_number(int weeknum) {
        this.weeknum = weeknum;
    }

    public int getweeknum() {
        return weeknum;
    }


}

    enum colors {
        BLUE, GREEN, YELLOW, ORANGE, RED, PURPLE, PINK
    }


}
