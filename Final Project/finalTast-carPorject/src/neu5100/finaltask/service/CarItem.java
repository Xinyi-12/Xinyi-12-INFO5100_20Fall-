package neu5100.finaltask.service;


/**
 * CarItem Object
 */
public class CarItem {

    private String id;
    private String webId;
    private String category;
    private String year;
    private String make;
    private String model;
    private String trim;
    private String type;
    private Double price;
    private String picture;

    public CarItem(String id, String webId, String category, String year,
                   String make, String model, String trim, String type, Double price, String picture) {
        this.id = id;
        this.webId = webId;
        this.category = category;
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.type = type;
        this.price = price;
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "CarItem [" +
                "id='" + id + '\'' +
                ", webId='" + webId + '\'' +
                ", category='" + category + '\'' +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ']';
    }
}
