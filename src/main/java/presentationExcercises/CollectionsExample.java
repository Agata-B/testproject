package presentationExcercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

    public static void exList() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Mikołaj");
        nameList.add("Wiola");
        nameList.add("Ola");
        System.out.println("Rozmiar pierwotny tablicy: " + nameList.size());
        nameList.add("Mikołaj");
        System.out.println("rozmiar tablicy po dodaniu zmiennej: " + nameList.size());
    }

    public static void exSet() {
        Set<String> nameList = new HashSet<>();
        nameList.add("Mikołaj");
        nameList.add("Wiola");
        nameList.add("Ola");
        System.out.println("Rozmiar pierwotny tablicy: " + nameList.size());
        nameList.add("Mikołaj");
        System.out.println("rozmiar tablicy po dodaniu zmiennej: " + nameList.size());
    }

    public static void main(String[] args) {
        exList();
        exSet();
    }
}
