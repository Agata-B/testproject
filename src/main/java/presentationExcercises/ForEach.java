package presentationExcercises;

public class ForEach {

    //Zad 1:
//Stwórz tablicę zawierającą 5 imion.
//Napisz za pomocą pętli for each drukowanie kolejno przywitań imion.
//Zad 2:
//Stwórz tablicę zawierającą produkty na zakupy.
//Napisz za pomocą pętli for each utwór
// String z produktami wymienionymi po przecinku.


    public static void ex1(String[] tableOfNames) {
        for (String name : tableOfNames) {
            System.out.println("Cześć " + name + ". ");
        }
    }

    public static String ex2(String[] tableOfProducts) {
        String list = "";
        for (String product : tableOfProducts) {
            list += product + ", ";
        }
        return list;
    }

    /*public static String ex2(String[] products){
    StringBuilder productsStr = new StringBuilder();
    String lists = "";
    for (String product: products){
        // String builder szybciej wykonuje operacje niż zwykła kontatenacja plusem
        productsStr.append(product).append(", ");
        lists += product;
    }
    System.out.println(lists);
    return String.valueOf(productsStr);
}
*/
    public static void main(String[] args) {


        String[] names = {"Ola", "Kamil", "Agata"};
        String[] products = {"szynka", "masło", "ser"};

        ex1(names);
        System.out.println();
        String result = ex2(products);
        System.out.println(result);
    }
}
