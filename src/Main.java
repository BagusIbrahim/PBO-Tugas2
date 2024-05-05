
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Hewan kucing = new Kucing("Kucing");
        kucing.bersuara(); // Memanggil metode bersuara untuk Kucing
        kucing.perkencangSuara(); // Memanggil metode untuk memperkencang suara
        kucing = null; // Menjadikan objek kucing eligible for garbage collection

        // Membuat objek Anjing
        Hewan anjing = new Anjing("Anjing");
        anjing.bersuara(); // Memanggil metode bersuara untuk Anjing
        anjing.perkencangSuara(); // Memanggil metode untuk memperkencang suara
        anjing = null; // Menjadikan objek anjing eligible for garbage collection

        // Pemanggilan garbage collection secara langsung
        System.gc();
    }
}