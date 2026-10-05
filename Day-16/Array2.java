class User {

    String name;
    String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

public class Array2 {

    public static void main(String[] args) {

        User user1 = new User("Pradhum", "8084267802");
        User user2 = new User("Akash", "9608244765");

        User users[] = new User[2];

        users[0] = user1;
        users[1] = user2;

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " : " + users[i].phoneNumber);
        }
    }
}