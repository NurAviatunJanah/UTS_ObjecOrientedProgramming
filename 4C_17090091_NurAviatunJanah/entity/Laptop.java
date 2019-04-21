package entity;

public class Laptop {

    private String id;
    private String nama;
    private String merk;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Laptop(String id, String nama, String merk) {
        this.id = id;
        this.nama = nama;
        this.merk = merk;
    }


    public boolean equals(Object object) {
        Laptop temp = (Laptop) object;
        return id.equals(temp.getId());
    }

}