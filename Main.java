import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Main {
    public static void main(String[] args) {
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") 
                || b.cargo.equalsIgnoreCase("Petroleum"));

        if (isSafe) {
            System.out.println("Train is safety compliant");
        } else {
            System.out.println("Train is NOT safety compliant");
        }
    }
}