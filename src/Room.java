import java.util.ArrayList;
import java.util.List;

abstract public class Room {

    protected  int roomNo;
    protected  int  baserate;
    private int cost;
    protected List<Service> servies= new ArrayList<> ();

    public Room(int roomNo, int baserate) {
        this.roomNo = roomNo;
        this.baserate = baserate;

    }
    public void addService(Service service){
        servies.add(service);

    }
    public int getTotalCost(){
        for(Service s : servies){
             cost += s.getCost() + this.baserate;
        }
        return cost;


    }
   abstract public  String   getDescription();

    public int getRoomNumber(){
        return roomNo;
    }





}
