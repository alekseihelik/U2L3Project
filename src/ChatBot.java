public class ChatBot
{
    public static void greeting() {
        System.out.println("Hello, I am a chat bot!");
        System.out.println("How are you today?");
    }

    public static void help() {
        System.out.println("You can ask me about the weather by typing in 'w'.");
        System.out.println("You can tell me your favorite number by typing 'f'");
        System.out.println("I can even convert feet to meters if you type in 'd'!");
    }

    public static void weather() {
        System.out.println("I actually don't know much about the weather");
        System.out.println("But it is always warm and dry inside this computer.");
    }

    public static void distanceInfo() {
        System.out.println("There are 5280 feet in a mile");
        System.out.println("There are " + feetToMeters(1) + "meters in a foot");
        System.out.println("There are " + feetToMeters(5280) + " meters in a mile");
    }

    public static double feetToMeters(double feet) {
        double meters = feet * 0.3048;
        return meters;
    }

    public static void goodbye() {
        System.out.println("It was nice talking with you.");
        System.out.println("Have a great day!");
    }

    public static void favoriteNumber(int yourNumber) {
        System.out.println("My favorite number is 8");
        System.out.print("That is " );
        System.out.print(yourNumber - 8);
        System.out.println(" away from your number.");
    }
}
