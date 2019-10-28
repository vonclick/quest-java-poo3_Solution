public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    
    /**
     * takeOff, must be on the ground
     */    
    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes up to the air.%n", this.getName());
        }
    }
    
        
    
    /**
     * Fly downward
     * @param meters altitude decrease
     * @return altitude
     */
    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 325);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    
        
    
    /**
     * Fly ascending
     * @param meters altitude increase
     * @return depth
     */
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    
    
    
    /**
     * Is Landing, must be on the
     */
    @Override
    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    }   
    
       
}

