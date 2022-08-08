import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    private int year;
    private String color;
    private String producent;
    private boolean isAutomaticGear;
    private String segment;
    Producent producents;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }


    public boolean isAutomaticGear() {
            return isAutomaticGear;
    }
    public void setAutomaticGear(boolean automaticGear) {
            this.isAutomaticGear = automaticGear;
    }

    public String getSegment() {
            return segment;
    }
    public void setSegment(String segment) {
            this.segment = segment;
    }

//    List<Producent> producents;
    Producent X7 = new Producent("BMW", "X7");

    public Car (int year, String color, Producent producent){
        this.year = year;
        this.color = color;
        this.producent = producent;

    }
//    List<Car> cars = new ArrayList<>();
//        cars.add(new Car(2000, "Red", getProducent());

    public static void main(String[] args) {
        List<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Poland", 'P'));
        countries.add(new Country("Germany", 'G'));
        countries.add(new Country("Japan", 'J'));
        countries.add(new Country("USA", 'U'));
        countries.add(new Country("Korea", 'K'));

        List<Market> markets = new ArrayList<>();

        String[] marketNames = new String[]{"business", "cargo", "taxi", "transport", "bus"};
        for (int i = 0; i < marketNames.length; i++) {
            Market m = new Market(marketNames[i]);
            int a = randomIndex(5);
            m.addCountry(countries.get(a));
            m.addCountry(countries.get(a));
            m.addCountry(countries.get(a));
            markets.add(m);
        }

        List<Dimension> dimensions = new ArrayList<Dimension>();


    }

    public static int randomIndex(int end) {
        Random random = new Random();
        return random.nextInt(end);

    }
}
