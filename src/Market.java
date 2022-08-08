import java.util.ArrayList;
import java.util.List;

public class Market {
    private String name;
    private List<Country> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCountry(Country c){
        countries.add(c);
    }

    public Market (String marketName) {
        name = marketName;
        countries = new ArrayList<Country>();
    }


}
