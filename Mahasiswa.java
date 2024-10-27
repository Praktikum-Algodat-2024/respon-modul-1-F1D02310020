
public class Mahasiswa extends Node {

    public Mahasiswa(String nama) {
        super(nama);
    }

    public void setNama(String nama) {
        this.data = nama;
    }

    public String getNama() {
        return this.data;
    }

    public boolean isEqual(Mahasiswa m) {
        return this.data.equals(m.getNama());
    }

    @Override
    public boolean isEqual(Node n) {
        return this.data.equals(((Mahasiswa) n).getNama());
    }
}
