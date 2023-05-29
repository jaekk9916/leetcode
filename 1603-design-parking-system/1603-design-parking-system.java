class ParkingSystem {
    int[] parkingArray;
    
    public ParkingSystem(int big, int medium, int small) {
        parkingArray = new int[]{0, big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(parkingArray[carType] == 0) return false;
        else {
            parkingArray[carType]--;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */