import java.util.*;

public class Student implements Comparable<Student> {

    //Variables
    private final String name;
    final private double CGPA;
    private final int id;
    final private String Branch;
    private final List<String> subjectsCompleted;
    Station station;
    public ArrayList<Station> preferenceList = new ArrayList<>();

    //Getters
    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    public int getId() {
        return id;
    }

    public String getBranch() {
        return Branch;
    }

    public List<String> getSubjectsCompleted() {
        return subjectsCompleted;
    }

    public Station getStation() {
        return station;
    }

    public ArrayList<Station> getPreferenceList() {
        return preferenceList;
    }

    //Constructor of Student
    public Student(String name, double CGPA, int id, String Branch, List<String> subjectsCompleted) {
        //super(id, password);

        this.name = name;
        this.CGPA = CGPA;
        this.id = id;
        this.Branch = Branch;
        this.subjectsCompleted = subjectsCompleted;

    }

    //Comparing student's CG by over-riding compareTo of comparable.
    public int compareTo(Student s) {
        if (this.CGPA > s.CGPA) return -1;
        else if (this.CGPA < s.CGPA) return 1;
        else return 0;
    }

    //Printing station method.
    public void printStations() {
        Admin.printStations();
    }

    //Add Preference method.
    public void addPreference(String stationName) {

        Station station = Admin.getStation(stationName);
        if (preferenceList.contains(station)) {
            return;
        }
        preferenceList.add(station);

    }

    //toString Method


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", CGPA=" + CGPA +
                ", id=" + id +
                ", Branch='" + Branch + '\'' +
                ", subjectsCompleted=" + subjectsCompleted +
                '}';
    }

    //Check details of station method.
    public void checkDetails(String stationName) {
        //Check details
        Station station = Admin.getStation(stationName);
        if (Admin.stations.contains(station)) {
            assert station != null;
            System.out.println("Location of the station: " + station.getLocation());
            System.out.println("CGPA cutoff of station : " + station.getCgpaCutoff());
            System.out.println("Branches offered by station: " + station.getBranches());
        }

    }


}


