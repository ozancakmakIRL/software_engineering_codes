public class Main {
    public static void main(String[] args) {

        User basic = UserFactory.getUser("NormalUser", "12312312","Suleyman","Ankara");
        User mod   = UserFactory.getUser("Moderator","231321332","Ozan","Samsun");

        System.out.println("User Data: " + basic);
        System.out.println("Mod Data: " + mod);

    }
}