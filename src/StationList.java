import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


interface Search {

    void ByName();

    void ByLocation();

}

public class StationList implements Search {


    static Map<String, ArrayList<Student>> StationName=new HashMap<>();
    static Map<String, ArrayList<Student>> StationLocation=new HashMap<>();

    @Override
    public String toString() {
        return "StationList{" +
                "StationName=" + StationName +
                ", StationLocation=" + StationLocation +
                '}';
    }

    @Override
    public void ByName() {

    }

    @Override
    public void ByLocation() {

    }
}
