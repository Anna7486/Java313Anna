package dz.dz20;

import java.sql.Struct;

public class Automobile {
    private String modelName;
    private String year;
    private String manufacturer;
    private String enginePower;
    private String carColor;
    private String price;

    public Automobile(String fistModelName, String year, String manufacturer, String enginePower, String carColor, String price) {
        this.modelName = fistModelName;
        this.year = year;
        this.manufacturer = manufacturer;
        this.enginePower = enginePower;
        this.carColor = carColor;
        this.price = price;
    }
    public void setData(String year, String carColor){
        this.year = year;
        this.carColor = carColor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getPrice() {
        return price;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void printInfo(){
        System.out.println("********** Данные автомобиля **********");
        System.out.println("Название модели: " + this.modelName);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Производитель: " + this.manufacturer);
        System.out.println("Мощность двигателя: " + this.enginePower);
        System.out.println("Цвет машины: " + this.carColor);
        System.out.println("Цена: " + this.price);
        System.out.println("=======================================");
    }
}
