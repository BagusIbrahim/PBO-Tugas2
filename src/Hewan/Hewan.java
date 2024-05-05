import java.util.Random;

//Parent class Hewan
public abstract class Hewan {
    private String nama;

    // Konstruktor untuk membuat objek Hewan dengan nama
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Metode abstract suara yang harus diimplementasikan oleh subclass
    public abstract void bersuara();

    // Metode untuk nama hewan
    public String getNama() {
        return nama;
    }

    // Metode untuk memperkencang suara
    public void perkencangSuara() {
        System.out.println("Memperkencang suara " + getNama());

        Random random = new Random();
        int chance = random.nextInt(2); // 0 atau 1
        if (chance == 0) {
            System.out.println("Suara " + getNama() + " menjadi lebih keras!");
        } else {
            System.out.println("Suara " + getNama() + " menjadi lebih tinggi!");
        }
    }

    // Finalizer untuk melakukan operasi sebelum garbage collection
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Objek " + getNama() + " sudah tidak terpakai.");
        } finally {
            super.finalize();
        }
    }
}