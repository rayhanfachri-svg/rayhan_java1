public class MainClass {
    public static void main(String[] args) {
        hewan hewan1 = new hewan("Capybara", "Mamalia", 4);
        hewan hewan2 = new hewan("Platypus", "Mamalia", 3);

        System.out.println("=== Data Hewan ===");
        hewan1.tampilkanData();
        hewan2.tampilkanData();
    }
}
