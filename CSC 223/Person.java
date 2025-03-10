public abstract class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    // Getters for name and address
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
