public class Verse {

    public static void printVerse(int day){

        switch (day){
            case 12:
                System.out.println("Twelve Drummers Drumming");
            case 11:
                System.out.println("Eleven Pipers Piping");
            case 10:
                System.out.println("Ten Lords a-Leaping");
            case 9:
                System.out.println("Nine Ladies Dancing");
            case 8:
                System.out.println("Eight Maids a-Milking");
            case 7:
                System.out.println("Seven Swans a-Swimming");
            case 6:
                System.out.println("Six Geese a-Laying");
            case 5:
                System.out.println("Five Gold Rings");
            case 4:
                System.out.println("Four Calling Birds");
            case 3:
                System.out.println("Three French Hens");
            case 2:
                System.out.println("Two Turtle Doves, and");
            case 1:
                System.out.println("A Partridge in a Pear Tree.");
                break;
            default:
                System.out.println("Invalid day");
        }


    }



}

