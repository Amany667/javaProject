import java.util.HashMap;

public class Hotel {
    private HashMap<Integer, Room> rooms = new HashMap<>();
    public void addRoom(Room room){
        rooms.put(room.getRoomNumber(), room);
        System.out.println("room added");
    }
    public String getRoom(int roomNumber){
        if(rooms.containsKey(roomNumber)){
            return rooms.get(roomNumber).getDescription();
        }
        return "not found";


    }
    public void bookRoom(int roomNumber, Service service){
        if (rooms.containsKey(roomNumber)) {

            Room room = rooms.get(roomNumber);
            room.addService(service);
            System.out.println("Added"+"  " +service.getName() +"  "+"to"+" "+ room.getDescription() +" "+ room.getRoomNumber());


        }else{
            System.out.println("room not found");
        }



    }

    public  void displayBookingDetails(int roomNumber){
        System.out.println("Booking for "+rooms.get(roomNumber).getDescription()+"  "+"number "+rooms.get(roomNumber).getRoomNumber()+" total cost : $ "+rooms.get(roomNumber).getTotalCost());
    }


}
