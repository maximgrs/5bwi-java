package at.gru.demo;

public class Lens {
    private float focalLength;
    private Producer producer;

    public Lens(float focalLength, Producer producer) {
        this.focalLength = focalLength;
        this.producer = producer;
    }

    public float getFocalLength() {
        return focalLength;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setFocalLength(float focalLength) {
        this.focalLength = focalLength;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
