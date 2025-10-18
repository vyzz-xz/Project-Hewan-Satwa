package Model;
public class Cat extends Pet {
    public Cat(String nama, int umur) { super(nama, umur); }
    
    @Override public String jenis() { return "Kucing"; }
    @Override public String suara() { return "Meong"; }
}

