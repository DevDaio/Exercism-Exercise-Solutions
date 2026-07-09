
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
    	int[] birds = {0, 2, 5, 3, 7, 8, 4};
    	return birds;
    }

    public int getToday() {;
     	int i = birdsPerDay.length;
      	int today = birdsPerDay[i-1];
       	return today;
    }

    public void incrementTodaysCount() {
  		int i = birdsPerDay.length-1;
    	birdsPerDay[i]++;
     } 

    public boolean hasDayWithoutBirds() {
    	boolean hasDaysWithout = false;
    	for (int i = 0; i < birdsPerDay.length; i++){
     		if (birdsPerDay[i] == 0) {
       			hasDaysWithout= true;
          		break;
       		}
     }
         return hasDaysWithout;
    }

    public int getCountForFirstDays(int numberOfDays) {
    	int sum=0;
     	for (int i=0; i< Math.min(numberOfDays, birdsPerDay.length);i++){
      		sum += birdsPerDay[i];
      }
      return sum;
    }

    public int getBusyDays() {
    	int count = 0;
     	for (int i = 0; i< birdsPerDay.length;i++){
      		if (birdsPerDay[i]>=5) {
        		count+= 1;
        }
      }
      return count;
    }
}
