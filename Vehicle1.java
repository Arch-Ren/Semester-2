<<<<<<< HEAD
public class Vehicle1 {
    private double load, maxLoad;
    public Vehicle1 (double max) {
        this.maxLoad = max;
    }

    public double getLoad(){
        return this.load;
    }

    public double getMaxLoad(){
        return this.maxLoad;
    }

    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
=======
public class Vehicle1 {
    private double load, maxLoad;
    public Vehicle1 (double max) {
        this.maxLoad = max;
    }

    public double getLoad(){
        return this.load;
    }

    public double getMaxLoad(){
        return this.maxLoad;
    }

    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
>>>>>>> 17c73b0ded14f6eeec4479b892a59bb387446624
