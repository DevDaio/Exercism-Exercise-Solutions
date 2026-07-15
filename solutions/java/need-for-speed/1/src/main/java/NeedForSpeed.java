class NeedForSpeed {
	int speed;
	int battery = 100;
	int batteryDrain;
	int distance = 0;
	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
    	if (this.battery == 0 || (this.battery < this.batteryDrain )){
    		return true;
    	}
    	return false;
    }
    
    public int distanceDriven() {
    	return this.distance;
    }

    public void drive() {
    	if (!this.batteryDrained()) {
    		this.battery -= this.batteryDrain;
    		this.distance += this.speed;
    	}
    }

    public static NeedForSpeed nitro() {
    	int speed = 50;
     	int batteryDrain = 4;
      	return new NeedForSpeed(speed, batteryDrain);
    }
}

class RaceTrack {
	int distance; 
    RaceTrack(int distance) {
    	this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance = (car.battery / car.batteryDrain) * car.speed;
        return maxDistance >= this.distance;
    }
}
