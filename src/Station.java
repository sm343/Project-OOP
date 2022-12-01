import java.util.*;

public class Station {

    //Variables
    private String name;
    private String location;

    ArrayList<Student> AcceptedStudent;

    private double cgpaCutoff;

    List<String> branches;

    //Setter
    public void setLocation(String location) {
        this.location = location;
    }

    //Getters

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


    //Constructor of Station

    public Station(String name, String location, double cgpaCutoff, List<String> branches) {
        this.name = name;
        this.location = location;
        this.cgpaCutoff = cgpaCutoff;
        this.branches = branches;
    }

    //toString Override

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cgpaCutoff=" + cgpaCutoff +
                ", branches=" + branches +
                '}';
    }

    //Method to print station.

    void printStation() {
        System.out.println("Name: " + name + " Location: " + location);
    }


}
