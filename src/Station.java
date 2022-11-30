import java.util.*;

public class Station {

    public String name;
    public String location;

    private float cgpaCutoff;
    ArrayList<String> branches;

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cgpaCutoff=" + cgpaCutoff +
                ", branches=" + branches +
                '}';
    }

    public float getCgpaCutoff() {
        return cgpaCutoff;
    }

    public ArrayList<String> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }



    public Station(String name, String location) {
        this.name = name;
        this.location = location;

    }

     void printStation() {
        System.out.println("Name: " + name + " Location: " + location );
    }

    public void updateDetails(){

    }



}
