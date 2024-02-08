package Domain;

public class HotDrink extends Product {
    private float cupCapacity;
    private int temperature;
    public HotDrink(int price, int place, String name, long id, float cupCapacity, int temperature) {
        super(price, place, name, id);
        this.cupCapacity = cupCapacity;
        this.temperature = temperature;

    }

    public float getCupCapacity() {
        return cupCapacity;
    }

    public void setCupCapacity(float cupCapacity) {
        this.cupCapacity = cupCapacity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "CupCapacity = " + this.cupCapacity + "ml\n" + "Temperature = " + this.temperature + "°C\n";
    }
}
