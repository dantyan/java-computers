package models.dto;

public class ModelSpeedHdDto {
    private String model;
    private int speed;
    private double hd;

    public ModelSpeedHdDto() {
    }

    public ModelSpeedHdDto(String model, int speed, double hd) {
        this.model = model;
        this.speed = speed;
        this.hd = hd;
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

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "ModelSpeedHdDto{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", hd=" + hd +
                '}';
    }
}
