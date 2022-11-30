import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Admin extends User {

    private String name;
    final private String BITSEmailId;

    private String password;

    public String getBITSEmailId() {
        return BITSEmailId;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Station> stations = new ArrayList<>();

    public static ArrayList<Student> students = new ArrayList<Student>();

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
            if (station.name.equals(name)) {
                station.location = location;
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
                if (station.branches.contains(student.getBranch()) && station.cgpaCutoff <= student.getCGPA()) {
                    if (Status.AcceptanceStatus.getStatus() != 0) {
                        student.station = station;
                        System.out.println("Station Alloted ! ");
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public static void printStations() {
        for (int i = 0; i < stations.size(); i++) {
            System.out.println(stations.get(i));
        }
    }

}
