package FactoryPattern;

public class Hp extends Laptop{

    public String ram;
    public String processor;

    public Hp(String ramSize, String processorType){
        this.ram=ramSize;
        this.processor=processorType;
    }

    @Override
    public String getConfiguration() {
        return "Hp config Ram: "+this.ram+" Processor: "+this.processor;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }

}
