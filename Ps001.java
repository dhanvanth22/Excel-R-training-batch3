public class Ps001 {
    private int id;
    private String firstName, lastName, address;
    public Ps001() {
        this(0, "jay", "Krishna", "Hyderabad");
    }
    public Ps001(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        Ps001 emp1 = new Ps001();
        System.out.println("Default Constructor:\nFull Name: " + emp1.getFullName() + "\nAddress: " + emp1.address);

        Ps001 emp2 = new Ps001(1, "ADARI", "DHANVANTH", "Hyderabad");
        System.out.println("\nParameterized Constructor:\nFull Name: " + emp2.getFullName() + "\nAddress: " + emp2.address);
    }
}

