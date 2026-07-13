public class JedliksToyCar {
    	public int distance = 0;
     	public int battery = 100;

    public static JedliksToyCar buy() {
   	JedliksToyCar car = new JedliksToyCar();
    return car;
    }

    public String distanceDisplay() {
    String result = String.valueOf("Driven " + distance + " meters");
    return result;
    }

    public String batteryDisplay() {
    StringBuilder result = new StringBuilder();
    if (battery == 0) {
    	result.append("Battery empty");
    	return result.toString();
    } else {
    	result.append("Battery at " + battery + "%");
     return result.toString();
    }
}

    public void drive() {
    if (battery == 0){
    return;
    } else {
    distance += 20;
    battery -=1;
    }
    }
}
