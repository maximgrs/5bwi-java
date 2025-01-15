package at.gru.demo;
import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private Capacity capacity;
    private int currentCapacity;
    private List<Picture> pictures;

    public SDcard(Capacity capacity) {
        this.capacity = capacity;
        pictures = new ArrayList<>();
    }

    public void showPictures() {
        for (Picture picture : pictures) {
            System.out.println(picture);
        }
    }

    public void addPicture(Picture picture) {
        pictures.add(picture);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
