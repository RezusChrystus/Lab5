public class Main {
    public static void main(String[] args) {
        Person filip = new Person("Filip Manowski",5);
        Person przemek = new Person("Przemyslaw Naja",5);
        Person bartek = new Person("Bartosz Pytka",5);
        PersonService osoby = new PersonService(filip,przemek,bartek);
       osoby.addP(new Person("jakis len kompletny",2));
        osoby.displayAll();
    }
}