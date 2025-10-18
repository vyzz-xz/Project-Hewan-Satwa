package Model;

public class Bird extends Pet {
    public Bird(String nama, int umur) { super(nama, umur); }
    
    @Override public String jenis() { return "Burung"; }
    @Override public String suara() { return "Cuit-Cuit"; }
}
