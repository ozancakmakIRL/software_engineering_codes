public abstract class User {

    public abstract String getNumber();

    public abstract String getName();

    public abstract String getLocation();

    @Override
    public String toString() {
        return "Number= " + this.getNumber() + ", Name=" + this.getName() + ", Location=" + this.getLocation();
    }
}
