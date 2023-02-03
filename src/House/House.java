package House;

import House.rooms.*;

public class House {
    public static final int MAX_REST_ROOMS =10;
    public static final int MAX_BED_ROOMS =10;
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[]restRooms= new RestRoom[MAX_REST_ROOMS];
    private BedRoom[]bedRooms= new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public void addRoom(BedRoom bedRoom){
        int index=0;
        for(int i=0;i<MAX_BED_ROOMS;i++){
            bedRooms[i]=bedRoom;
        }
    }
    public void addRoom(RestRoom restRoom){
        int index=0;
        for(int j=0;j<MAX_REST_ROOMS;j++){
            restRooms[j]=restRoom;
        }
    }
}
