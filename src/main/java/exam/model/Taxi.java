package exam.model;

public class Taxi {

    private String model;
    private String country;
    private int year;
    private int millage;
    private boolean isSport;
    private int weight;
    private int topSpeed;
    private int numberOfSeats;
    private float cost;

    public Taxi(String model, String country, int year) {
        this.model = model;
        this.country = country;
        this.year = year;
    }

    public Taxi(String model, String country, int year, int millage, boolean isSport, int weight, int topSpeed, int numberOfSeats, float cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.millage = millage;
        this.isSport = isSport;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.numberOfSeats = numberOfSeats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.isEmpty()) {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.isEmpty()) {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1903 && year <= 2020) {
            this.year = year;
        }
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        if(millage >= 0 && millage <= 999999) {
            this.millage = millage;
        }
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight >= 1000 && weight <= 3000) {
            this.weight = weight;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if(numberOfSeats >= 0) {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if(cost >= 0) {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "model='" + model + '\'' +
                ", car='" + country + '\'' +
                ", year=" + year +
                ", millage=" + millage +
                ", isSport=" + isSport +
                ", weight=" + weight + "KG " +
                ", topSpeed=" + topSpeed + "km/h " +
                ", numberOfSeats=" + numberOfSeats +
                ", cost=" + cost + "$" +
                '}';
    }
}
