public class HotelApp {
    public static void main(String [] args){
        boolean isClean = true;
        boolean isOccupied = true;
        int numberOfBeds = 2;
        Room r = new Room(isClean,isOccupied,numberOfBeds);
        boolean isRoomAvailable = r.isAvailable();
        if (isRoomAvailable)
        System.out.println("the code works!");
    }
}
