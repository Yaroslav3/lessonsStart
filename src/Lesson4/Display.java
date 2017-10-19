package Lesson4;

/**
 * Created by Ярик on 19.10.2017.
 */
public class Display extends Servise {

    private int id ;
    private String color;
    private int size;



        public void show(){
            System.out.println("kvf");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
