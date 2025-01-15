package at.gru.demo;

import java.util.Date;

public class Camera {
    private SDcard sdCard;
    private Lens lens;
    private Producer producer;
    private float pixel;
    private float weight;
    private String color;

    public Camera(SDcard sdCard, Lens lens, Producer producer, float pixel, float weight, String color) {
        this.sdCard = sdCard;
        this.lens = lens;
        this.producer = producer;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
    }

    public void takePicture(Resolution resolution, String name, Date currentDate, SDcard sdCard) {
        int size = 0;

        switch (resolution) {
            case low:
                size = 2;
                break;
            case medium:
                size = 4;
                break;
            case high:
                size = 6;
                break;
        }

        int currentCapacity = sdCard.getCurrentCapacity();
        int maxCapacity = sdCard.getCapacity().getSizeInGB();

        if (!checkIfFull(size, currentCapacity, maxCapacity)) {
            Picture picture = new Picture(name, currentDate, size);
            sdCard.addPicture(picture);
        } else {
            System.out.println("SD-Karte ist voll");
        }

        
    }

    public boolean checkIfFull(int pictureSize, int currentCapacity, int maxCapacity) {
        return currentCapacity + pictureSize >= maxCapacity;
    }

    public Lens getLens() {
        return lens;
    }

    public Producer getProducer() {
        return producer;
    }

    public SDcard getSdCard() {
        return sdCard;
    }

    public String getColor() {
        return color;
    }

    public float getPixel() {
        return pixel;
    }

    public float getWeight() {
        return weight;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
    public void setSdCard(SDcard sdCard) {
        this.sdCard = sdCard;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPixel(float pixel) {
        this.pixel = pixel;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
