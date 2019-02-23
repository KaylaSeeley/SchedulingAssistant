//Nurse object
//Look at file, retrieve info and put into database
import java.util.ArrayList;
public class Nurse extends Person {
    private ArrayList<Time> availableTimes;
  //  private Arraylist<times> bookedTimes;
    Boolean[] locations;
    private ArrayList<String> therapies;

    public Nurse(){
        super();
     //   this.availableTimes = new ArrayList<times>();
     //   this.bookedTimes = new ArrayList<times>();
        this.locations = new Boolean[]{false};
        this.therapies = new ArrayList<>();
    }
}
