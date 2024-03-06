public class TwelveDaysOfChristmas {

    public static void main(String[] args){



        for (int day = 1; day <= 12; day++) {

            System.out.println("On the " + DayXmass.getDay(day) + "Of Christmass My true love gave to me: ");

            Verse.printVerse(day);

        }
    }

}