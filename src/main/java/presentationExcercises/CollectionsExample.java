package presentationExcercises;

import java.util.*;

public class CollectionsExample {

    public static void exList() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Mikołaj");
        nameList.add("Wiola");
        nameList.add("Ola");
        System.out.println("Rozmiar pierwotny tablicy: " + nameList.size());
        nameList.add("Mikołaj");
        System.out.println("Rozmiar tablicy po dodaniu zmiennej: " + nameList.size());
    }

    public static void exSet() {
        Set<String> nameList = new HashSet<>();
        nameList.add("Mikołaj");
        nameList.add("Wiola");
        nameList.add("Ola");
        System.out.println("Rozmiar pierwotny tablicy: " + nameList.size());
        nameList.add("Mikołaj");
        System.out.println("Rozmiar tablicy po dodaniu zmiennej: " + nameList.size());
    }

    public static void exMap() {
        Map<Integer, String> mapOfNames = new HashMap<Integer, String>();
        mapOfNames.put(1, "Mikołaj");
        mapOfNames.put(2, "Wiola");
        mapOfNames.put(3, "Ola");
        System.out.println(mapOfNames.get(3));
        System.out.println("Rozmiar pierwotny tablicy: " + mapOfNames.size());
        mapOfNames.put(3, "Mikołaj");
        System.out.println(mapOfNames.get(3));
        System.out.println("Rozmiar tablicy po dodaniu zmiennej: " + mapOfNames.size());
    }

    public static void main(String[] args) {
        exList();
        exSet();
        exMap();
    }
}
