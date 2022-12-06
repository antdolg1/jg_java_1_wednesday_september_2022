package students.student_oskars_popens.lesson_8.level1_level5;

class Trader {

    private String fullName;
    private String city;
    private String country="";

    Trader(String fullName, String city){
        this.fullName = fullName;
        this.city = city;
    }

    Trader(String fullName, String city, String country){
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
