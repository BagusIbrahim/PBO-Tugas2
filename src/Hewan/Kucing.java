// Subclass hewan kucing
class Kucing extends Hewan {
    // Konstruktor untuk membuat objek Kucing dengan nama
    public Kucing(String nama) {
        super(nama);
    }

    // Implementasi metode bersuara untuk Kucing
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara MiawMiaw!");
    }
}