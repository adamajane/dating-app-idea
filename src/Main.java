import java.util.Scanner;

public class Main {

    public static void initialQuestions() {
        Scanner input = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello! Welcome to our app!");
        System.out.println("We'll be asking you a few questions to find you the perfect match.");

        System.out.println("First, how old are you: ");
        int userAge = input.nextInt();
        System.out.println("Alright! You're " + userAge + " years old");

        System.out.println("What gender do you identify as?");
        String userGender = myObj.nextLine();
        System.out.println("Alright! You're a " + userGender);

        System.out.println("What is your sexual orientation?");
        String userSexOrientation = myObj.nextLine();
        System.out.println("Alright! You're into " + userSexOrientation);

        System.out.println("How much older or younger can your ideal partner be?");
        int userAgeGap = input.nextInt();
        System.out.println("Alright! Your maximum age gap is " + userAgeGap);

        System.out.println("How tall are you?");
        int Height = input.nextInt();
        System.out.println("Alright! you're" + Height);
    }

    public static void main(String[] args) {
        initialQuestions();
    }

}
