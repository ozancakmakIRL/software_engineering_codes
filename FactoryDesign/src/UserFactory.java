public class UserFactory {

    public static User getUser(String type, String number, String name, String location) {
        if ("NormalUser".equalsIgnoreCase(type)) return new NormalUser(number, name, location);
        else if ("Moderator".equalsIgnoreCase(type)) return new Moderator(number, name, location);
        return null;
    }
}
