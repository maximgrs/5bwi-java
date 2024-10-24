package at.gru.demo;
import java.sql.Date;

public class Picture {
    private float resolution;
    private String name;
    private Date date;
    private float size;

    public Picture(float resolution, String name, Date date, float size) {
        this.resolution = resolution;
        this.name = name;
        this.date = date;
        this.size = size;
    }

    //getters
    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
    
    public float getResolution() {
        return resolution;
    }

    public float getSize() {
        return size;
    }

    //setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResolution(float resolution) {
        this.resolution = resolution;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
