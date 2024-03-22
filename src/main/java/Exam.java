
import java.util.Scanner;


public class Exam {

    //Question 1
    public static void printOddNumbers() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    //Question 2
    public static int getSumOfNumbers (int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //Question 3
    public static void calculateAverage(int[] myNumbers) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum += myNumbers[i];
        }
        average = sum / myNumbers.length;
        System.out.println(average);
    }


    //Question 4
    public static void getRandomNumber() {
        int min = 1;
        int max = 6;
        int rangeOfNumbers = (max - min) + 1;
        int randomNumber = (int) (Math.random() * rangeOfNumbers) + min;
        System.out.println(randomNumber);
    }


    //Question 5
    public static void calculateSumOfEvenNumbers(int[] numbers) {
        int sumOfEvenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                sumOfEvenNumbers += numbers[i];
            }

        }
        System.out.println(sumOfEvenNumbers);
    }


    //Question 6
    public static void calculateVolumeOfCube(double sideLength){
        final int power = 3;
        double volumeOfCube = Math.pow(sideLength, power);
        System.out.println(volumeOfCube);
    }


    //Question 7
    public static void countCharInString(String str, char charToFind) {
        String newString = str.toLowerCase();
        int characterCount = 0;
        for(int i = 0; i < str.length(); i++) {
           if (newString.charAt(i) == charToFind) {
               characterCount++;
           }
        }
        System.out.println(characterCount);
    }


    //Question 8
    public static void checkPalindrome (String str) {
        boolean isPalindrome = true;
        int i = 0;
        int x = str.length() - 1;
        while (i < x) {
            if(str.charAt(i) != str.charAt(x)) {
                isPalindrome = false;
            }
            i++;
            x--;
        }
        System.out.println(isPalindrome);
    }



    //Question 9
    public static void checkIfLeapYear(int currentYear){
        boolean isLeapYear = false;

        if(currentYear % 4 == 0) {
            isLeapYear = true;
        }
        System.out.println(isLeapYear);

    }



    //Question 10
    public static void printTravelInfo() {
        System.out.println("Please enter your ticket number:");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        System.out.println("Please enter your destination:");
        String travelDestination = scanner.next();

        System.out.println("Now serving customer number " + ticketNumber + " . Enjoy your trip to " + travelDestination + ".");
    }





    public static void main(String[] args) {
        //Answer 1
        printOddNumbers();


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        //Answer 2
        int sumOfNumbers = getSumOfNumbers(numbers);
        System.out.println(sumOfNumbers);

        //Answer 3
        calculateAverage(numbers);

        //Answer 4
        getRandomNumber();

        //Answer 5
        calculateSumOfEvenNumbers(numbers);

        //Answer 6
        calculateVolumeOfCube(3);

        //Answer 7
        countCharInString("Tests are not very fun", 'e');


        //Answer 8
        checkPalindrome("news");


        //Answer 9
        int year = 2028;
        checkIfLeapYear(year);

        //Answer 10
        printTravelInfo();



    }
}
