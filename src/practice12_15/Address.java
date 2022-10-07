package practice12_15;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String housing;
    private String flat;

    public void getAddress(String s){
        String [] res = s.split("(, )|(. )|(; )|(- )|(/ )|(: )");
        country = res[0];
        region = res[1];
        city = res[2];
        street = res[3];
        building = res[4];
        housing = res[5];
        flat = res[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", housing='" + housing + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
