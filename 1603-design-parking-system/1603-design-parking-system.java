class ParkingSystem {
    int bigSpace = 0;
    int mediumSpace = 0;
    int smallSpace = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        bigSpace = big;
        mediumSpace = medium;
        smallSpace = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && bigSpace == 0){
            return false;
        } else if(carType == 2 && mediumSpace == 0){
            return false;
        } else if(carType == 3 && smallSpace == 0){
            return false;
        } 
        
        if(carType == 1){
            bigSpace--;
        } else if(carType == 2){
            mediumSpace--;
        } else if(carType == 3){
            smallSpace--;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */