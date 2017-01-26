package Task6;

/**
 * Created by User on 26.01.2017.
 */
public class Boat {
    private String brand;
    private Engine engine;

    public Boat(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public Boat() {
        engine=new Engine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(Boat boat){
        if (boat.isStarted()){
            System.out.println("Boat is started.Model of engine is "+boat.engine.getModel()+
                    "\n Power of engine is "+boat.engine.getPower());

        }
    }
    public boolean isStarted() {
        if(engine.getPower()>0)
            return true;
        else
            return false;
    }

    class Engine{
        private String model;
        private double power;


        public Engine(String model, double power) {
            this.model = model;
            this.power = power;
        }

        public Engine() {
            this.model="";
            this.power=0;
        }


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }

            }
}
