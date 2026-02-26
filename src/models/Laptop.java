package models;
//code, model, speed, ram, hd, price, screen
public class Laptop {
    private Integer code;
    private String model;
    private int speed;
    private int ram;
    private double hd;
    private double price;
    private int screen;

    public Laptop(Integer code, String model, int speed, int ram, double hd, double price, int screen) {
        this.code = code;
        this.model = model;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.price = price;
        this.screen = screen;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", price=" + price +
                ", screen=" + screen +
                '}';
    }
}
