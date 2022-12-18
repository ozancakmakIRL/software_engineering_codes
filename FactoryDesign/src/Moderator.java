public class Moderator extends User {

    private String number;
    private String name;
    private String location;

    public Moderator(String number, String name, String location) {
        this.number = number;
        this.name = name;
        this.location = location;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

}
