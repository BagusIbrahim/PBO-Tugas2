// Subclass hewan anjing
class Anjing extends Hewan {
    // Konstruktor untuk membuat objek Anjing dengan nama
    public Anjing(String nama) {
        super(nama);
    }

    // Implementasi metode bersuara Anjing
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara AugAug!");
    }
}