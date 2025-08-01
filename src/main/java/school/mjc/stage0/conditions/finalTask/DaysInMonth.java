package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0 && year % 4 == 0 && year % 400 == 0) {
            System.out.println("Leap");
            if (month >= 1 && month <= 12) {
                if (month == 2) {
                    System.out.println(29);
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println(30);
                } else {
                    System.out.println(31);
                }
            }
        } else {
            System.out.println("Not leap");
            if (month >= 1 && month <= 12) {
                if (month == 2) {
                    System.out.println(28);
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println(30);
                } else {
                    System.out.println(31);
                }
            }
        }

        switch (month) {
            case 2:
                System.out.println(29);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }
        System.out.println(month);
    }
}
