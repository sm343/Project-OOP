import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin extends User {

    private String name;
    final private String BITSEmailId;

    public static ArrayList<Student> getStudents() {
        return students;
    }

    private String password;

    public String getBITSEmailId() {
        return BITSEmailId;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Station> getStations() {
        return stations;
    }

    public static ArrayList<Station> stations = new ArrayList<>();

    public static ArrayList<Student> students = new ArrayList<>();

    public Admin(String name, String BITSEmailId, String id, String password) {
        super(id, password);
        this.BITSEmailId = BITSEmailId;
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void addStation(Station station) {
        stations.add(station);


    }

    public static void removeStation(Station station) {

        stations.remove(station);

    }

    public static void editStation(String name, String location) {
        for (Station station : stations) {
            if (station.getName().equals(name)) {
                station.setLocation(location);
            }
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", BITSEmailId='" + BITSEmailId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void allocate(Student s) {
        for (Student student : students) {
            for (Station station : student.preferenceList) {
                if (station.branches.contains(student.getBranch()) && station.getCgpaCutoff() <= student.getCGPA()) {
                    System.out.println( "Congratulations!," +station.getName() + " Allotted  to "+ student.getName());
                    return;
                }else{
                    continue;
                }
            }
        }
    }

    public static Station getStation(String stationName) {
        for(Station station: stations) {
            if (station.getName().equals(stationName)) {
                return station;
            }
        }
        return null;
    }

    public static void printStations() {
        for (int i = 0; i < stations.size(); i++) {
            System.out.println(stations.get(i));
        }
    }

}
