public class Book extends Person{
    private String MuellifAdi;
    private String janr;
    private int price;

    public String getMuellifAdi() {
        return MuellifAdi;
    }

    public void setMuellifAdi(String muellifAdi) {
        MuellifAdi = muellifAdi;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String name, String surname, int age, int id, String muellifAdi, String janr, int price) {
        super(name, surname, age, id);
        MuellifAdi = muellifAdi;
        this.janr = janr;
        this.price = price;
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "MuellifAdi='" + MuellifAdi + '\'' +
                ", janr='" + janr + '\'' +
                ", price=" + price +
                '}';
    }
}
