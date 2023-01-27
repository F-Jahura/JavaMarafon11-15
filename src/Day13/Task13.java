package Day13;

public class Task13 {
    public static void main(String[] args) {
        User user1 = new User("Mark");
        User user2 = new User("Adam");
        User user3 = new User("David");

        user1.sendMessage(user2, "Hello Adam, how are you?");
        user1.sendMessage(user2, "I just would like to remind you about our meeting on Thursday.");

        user2.sendMessage(user1, "Hello Mark, I am fine. Thank you.");
        user2.sendMessage(user1, "How are you doing?");
        user2.sendMessage(user1, "Yes, I remember about our date. Will see you soon.");

        user3.sendMessage(user1, "Hi Mark, I hope you are doing well.");
        user3.sendMessage(user1, "On Saturday I wish to got out.");
        user3.sendMessage(user1, "It will be very lovely if you can join me.");

        user1.sendMessage(user3, "Hey David, it is very nice to hear you after so long time.");
        user1.sendMessage(user3, "I would love to join you.");
        user1.sendMessage(user3, "Please let me know when we will meet.");

        user3.sendMessage(user1, "I will come to pick up you at 11am.");

        MessageDatabase.showDialog(user1, user3);

    }
}
