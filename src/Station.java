import java.util.*;

public class Station {

    //Variables
    private final String number;

    private final String name;
    private String location;
    protected int capacity;


    private ArrayList<Student> AcceptedStudent;

    private final double cgpaCutoff;

    List<String> branches;

    //Setter
    public void setLocation(String location) {
        this.location = location;
    }

    //Getters
    public int getCapacity() {
        return capacity;

    }

    public ArrayList<Student> getAcceptedStudent() {
        return AcceptedStudent;
    }

    public double getCgpaCutoff() {
        return cgpaCutoff;
    }

    public List<String> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //Constructor of Station

    public Station(String number, String name, int capacity, double cgpaCutoff, List<String> branches) {
        this.number = number;
        this.name = name;
        this.capacity = capacity;
        this.branches = branches;
        this.cgpaCutoff = cgpaCutoff;
        this.AcceptedStudent = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Station{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", cgpaCutoff=" + cgpaCutoff +
                ", branches=" + branches +
                '}';
    }
}
