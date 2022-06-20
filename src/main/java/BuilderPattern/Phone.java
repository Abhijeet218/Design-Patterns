package BuilderPattern;

public class Phone {

    public static class Builder {
        private String camera;
        private String processor;

        public Phone build(){
            return new Phone(this);
        }

        public Builder camera(String camera){
            this.camera=camera;
            return this;
        }

        public Builder processor(String processor){
            this.processor=processor;
            return this;
        }
    }

    private String camera;
    private String processor;

    public Phone(Builder builder){
        this.camera=builder.camera;
        this.processor=builder.processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "camera='" + camera + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
