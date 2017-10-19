package Lesson4;

/**
 * Created by Ярик on 19.10.2017.
 */
public class Servise {
    public static void main(String[] args) {
        Sony sony = new Sony();
        sony.setColor("Blue");
        sony.setId(2353);
        sony.setSize(40);
        sony.show();
        showI(sony);

        System.out.println();
        Panasonic panasonic = new Panasonic();
        panasonic.setColor("Black");
        panasonic.setId(25866);
        panasonic.setSize(40);
        panasonic.show();
        showI(panasonic);

        System.out.println();
        Samsung samsung = new Samsung();
        samsung.setColor("Black");
        samsung.setId(56566);
        samsung.setSize(40);
        panasonic.show();
        showI(samsung);
    }
    private static void showI(Display o){
        System.out.println(o.getSize());
        System.out.println(o.getId());
        System.out.println(o.getColor());

    }
}
