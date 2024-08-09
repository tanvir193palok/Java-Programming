package Basic;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}