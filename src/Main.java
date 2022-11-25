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

    }

    public static void main(String[] args) {
        initialQuestions();
    }

}
