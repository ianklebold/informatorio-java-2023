package clases.colecciones.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApp {
    public static void main(String[] args) {
        treeSetExample();
    }

    private static void hashSetExample(){
        Set<String> set = new HashSet<>();

        set.add("manzana");
        set.add("naranja");
        set.add("pera");
        set.add("fruta1");
        set.add("fruta2");
        set.add("fruta3");
        set.add("fruta4");

        //For each
        for (String elemento : set) {
            System.out.println(elemento);
        }

    }

    private static void treeSetExample(){
        TreeSet<String> set = new TreeSet<>();
        set.add("manzana");
        set.add("naranja");
        set.add("pera");
        set.add("frutilla");

        Set subSet = set.subSet("frutilla", "naranja");
        System.out.println("subset : " + subSet);
    }
}
