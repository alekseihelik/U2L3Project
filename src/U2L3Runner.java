import java.util.Scanner;
public class U2L3Runner {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ChatBot.greeting();
        String howAreYou = s.nextLine();
        ChatBot.help();
    }
}
