public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String senderName;
    private String receiverName;

    public Letter(String fromName) {
        senderName = fromName;
    }

    public void writeLetter(String toName)
    {
        receiverName = toName;
        greeting();
        specialMessage();
        closing();
    }

    public void greeting()
    {
        System.out.println("Hello, " + receiverName);
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn’t you say?");
    }

    public void closing()
    {
        System.out.println("From, " + senderName);
    }
}

