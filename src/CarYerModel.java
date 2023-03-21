public class CarYerModel {
    private double YerOfRelease;
    private String model;
    private int price;
    private String color;

    public CarYerModel(double yerOfRelease, String model, int price, String color) {
        YerOfRelease = yerOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public double getYerOfRelease() {
        return YerOfRelease;
    }

    public void setYerOfRelease(double yerOfRelease) {
        YerOfRelease = yerOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "  CarYerModel : " +
                "  YerOfRelease : " + YerOfRelease +
                "  Model : " + model +
                "   price : " + price +
                "   color='" + color;

    }
}
