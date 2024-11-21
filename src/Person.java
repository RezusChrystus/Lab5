public class Person {
    String name;
    int ocenaZPrzedmiotu;

    public Person(String name, int ocenaZPrzedmiotu) {
        this.name = name;
        this.ocenaZPrzedmiotu = ocenaZPrzedmiotu;
    }
    public void wyswietlInfo(){
        System.out.println("Imie : "+name.split(" ")[0]+" Nazwisko : "+name.split(" ")[1]+" ocena : "+ocenaZPrzedmiotu);
    }
}
