package encapsulation;

public class Address {
    private int fno, pinCode;
    private String houseName, area, city, state;

    // Methods
    // Setters and Getters
    public int getFno() {
        return fno;
    }
    public void setFno(int fno) {
        this.fno = fno;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public String getHouseName() {
        return houseName;
    }
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    // toString
    @Override
    public String toString() {
        return "Address{" +
                "fno=" + fno +
                ", pinCode=" + pinCode +
                ", houseName='" + houseName + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
