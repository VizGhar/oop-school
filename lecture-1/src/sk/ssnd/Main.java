package sk.ssnd;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.lastName = "Mrkvicka";
        p.firstName = "Jozef";
        System.out.println(p.getFullName());
    }

}
