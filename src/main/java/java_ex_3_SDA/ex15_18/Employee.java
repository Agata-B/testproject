package java_ex_3_SDA.ex15_18;

public class Employee extends Person {

    private int salary;

    public void yearBorn(int yearOfBirth) {
        if (yearOfBirth <= 2020 && yearOfBirth >= 1900) {
            System.out.println("Rok urodzenia " + yearOfBirth);
        } else {
            System.out.println("Rok urodzenia 0.");
        }
    }

    public void whoIAm(String name, String surname, int salary){
        System.out.println("Nazywam się " + name + " " + surname + " i zarabiam " + salary + "zł.");
    }


    public int getSalary() {
        return salary;
    }
}
