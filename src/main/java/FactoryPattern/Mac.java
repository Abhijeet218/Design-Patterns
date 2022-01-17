package FactoryPattern;

public class Mac extends Laptop{

    public String ram;
    public String processor;
    public String storage;

    public Mac(String ramSize, String processorType, String storageSize){
        this.ram=ramSize;
        this.processor=processorType;
        this.storage=storageSize;
    }

    @Override
    public String getConfiguration() {
        return "Mac config Ram: "+this.ram+" Processor: "+this.processor+" Storage: "+this.storage;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
