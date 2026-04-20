 
    import java.util.*;
    public enum JO{
    RIO_2024("Rio de Janeiro",2024,10221),
    PARIS_2024("Paris",2024,10222),
    LOS_ANGELES_2028("Los Angeles",2028,10223);
    private String city;
    private int year;
    private int id;

    JO(String city, int year, int id) {
        this.city = city;
        this.year = year;
        this.id = id;
    }

    // public String getCity() {
    //     return city;
    // }

    // public int getYear() {
    //     return year;
    // }

    // public int getId() {
    //     return id;
    // }
public String toString(){
    return"le JO de "+city+" aura lieu en "+year+" et son id est "+id;
}
}