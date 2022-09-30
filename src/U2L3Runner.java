import java.util.Scanner;
public class U2L3Runner {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ChatBot.greeting();
        String greet = s.nextLine();
        ChatBot.help();
        String answer = s.nextLine();
        if (answer == "w")
        {
            ChatBot.weather();
        }
        else {
            if (answer == "f")
            {
                System.out.print("What is your favorite number?");
                int favNum = s.nextInt();
                ChatBot.favoriteNumber(favNum);
            }
            else {
                if (answer == "d")
                {
                    ChatBot.distanceInfo();
                }
            }
        }
        ChatBot.goodbye();
    }
}
