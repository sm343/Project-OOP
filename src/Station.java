import java.util.*;

public class Station {

    private String name;
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    ArrayList<Student>AcceptedStudent;

    public ArrayList<Student> getAcceptedStudent() {
        return AcceptedStudent;
    }

    private double cgpaCutoff;

    List<String> branches;

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cgpaCutoff=" + cgpaCutoff +
                ", branches=" + branches +
                '}';
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



    public Station(String name, String location, double cgpaCutoff,List<String> branches) {
        this.name = name;
        this.location = location;
        this.cgpaCutoff = cgpaCutoff;
        this.branches=branches;
    }

     void printStation() {
        System.out.println("Name: " + name + " Location: " + location );
    }


}
