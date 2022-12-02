import java.util.*;

public class Station {

    //Variables
    private String name;

    private String number;
    private String location;


    int capacity;



    ArrayList<Student> AcceptedStudent;

    private double cgpaCutoff;

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

    public String getNumber() {
        return number;
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


    //Constructor of Station

    public Station(String number,String name, String location, int capacity,double cgpaCutoff, List<String> branches) {
        this.number=number;
        this.name = name;
        this.location = location;
        this.cgpaCutoff = cgpaCutoff;
        this.branches = branches;
        this.capacity=capacity;
    }

    //toString Override


    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", AcceptedStudent=" + AcceptedStudent +
                ", cgpaCutoff=" + cgpaCutoff +
                ", branches=" + branches +
                '}';
    }
}
