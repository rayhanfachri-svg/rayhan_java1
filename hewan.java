public class hewan{
    String nama;
    String jenis;
    int umur;

    public hewan(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    public void tampilkanData() {
        System.out.println("Nama Hewan  : " + nama);
        System.out.println("Jenis Hewan : " + jenis);
        System.out.println("Umur Hewan  : " + umur + " tahun");
        System.out.println("-----------------------------");
    }
}
