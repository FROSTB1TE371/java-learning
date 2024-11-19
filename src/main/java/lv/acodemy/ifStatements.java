package lv.acodemy;

public class ifStatements {
    public static void main(String[] args) {

        // EVen or odd (if)

        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }

        // Check if a number positive or negative (Assume 0 is positive)

        number = -10;

        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        // Grande checker (if - else - if)
        // 90 >  = A
        // 75-> 89 = B
        // 50 -> 74 = C
        // < 50 = F

        // 1) Create score variable;
        // 2) Create logic (if score >= 90 ) = A
        //  else - if( score >= 75) -> B
        // else-if( score >= 50( -> C
        // else -> F

        int score = 68;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


        // Task 1: Check if a person is eligible to buy an alcohol;

        int age = 15;
        if (age >= 18) {
            System.out.println("You can to buy");
        } else if (age < 18) {
            System.out.println("Go home");
        }

        // Task 2: Check if a number can be divided by 5;

        int number1 = 10;
        if (number1 % 5 == 0)
            System.out.println("ok");

        // Task 3: Check pass of fail
        // if score >= 50 (passed)
        // all ather cases (failed)

        int score1 = 50;
        if (score >= 50) {
            System.out.println("passed");
        } else {
            System.out.println("Failed");
        }

        // Temperature message (if-else-if)
        // Above 30 (It's hot)
        // Temperature between 15 and 30 (nice weather)
        // Below 15 ( It's cold )

        int temperature = 10;
        if (temperature > 30) {
            System.out.println("It's hot.");
        } else if (temperature >= 15) {
            System.out.println("Nice weather.");
        } else {
            System.out.println("It's cold.");
        }

        // Traffic light system
        // Green -> GO
        // Yellow -> Slow down
        // Red -> Stop
        // String color;
        // if(color.equals("Green")) { }

        String color = "Green";
        if (color.equals("Green")) {
            System.out.println("GO");
        } else if (color.equals("Yellow")) {
            System.out.println("Slow down");
        } else if (color.equals("Red")) {
            System.out.println("Stop");
        } else
            System.out.println("подумай");


    }
}

