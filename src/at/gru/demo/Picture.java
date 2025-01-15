package at.gru.demo;
import java.util.Date;

public class Picture {
    private String name;
    private Date date;
    private int size;

    public Picture(String name, Date date, int size) {
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

    public int getSize() {
        return size;
    }

    //setters
    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
