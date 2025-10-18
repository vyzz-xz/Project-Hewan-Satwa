package Model;

public abstract class Pet {
    String nama;
    int umur;

    public Pet(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String Nama() { 
        return nama; 
    }
    public int getUmur() { 
        return umur; 
    }

    // aksi umum (sama untuk semua hewan)
    public void makan() { System.out.println(nama + " sedang makan."); }
    public void tidur() { System.out.println(nama + " sedang tidur."); }

    // aksi khusus (polymorphism)
    public abstract String jenis();
    public abstract String suara();

    @Override
    public String toString() {
        return jenis() + " - " + nama + " (" + umur + " th)";
    }
}



