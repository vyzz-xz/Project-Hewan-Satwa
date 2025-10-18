package Model;

public class Dog extends Pet {
    public Dog(String nama, int umur) { super(nama, umur); }
    
    @Override public String jenis() { return "Anjing"; }
    @Override public String suara() { return "Guk Guk"; }
}

