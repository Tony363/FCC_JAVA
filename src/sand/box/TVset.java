package src.sand.box;

public class TVset{
    String brand;
    int price;
    TVset(){
        this.brand = null;
        this.price = 0;
    }
    TVset(String b,int p){
        this.brand = b;
        this.price = p;
    }
    String getBrand(){
        return this.brand;
    }
    int getPrice(){
        return this.price;
    }
    void setBrand(String b){
        this.brand = b;
    }
    void setPrice(int p){
        this.price = p;
    }
    @Override
    public String toString(){
        return String.format("%s,%02d",this.brand,this.price);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof TVset){
            TVset t = (TVset)o;
            return (t.getBrand() == this.getBrand()) && (t.getPrice() == this.getPrice());
        }
        return false;
    }
    @Override
    public int hashCode(){
        Integer price = this.price;
        return (price.hashCode() * 31) + this.brand.hashCode();
    }
    public static void main(String[] args){
        TVset t = new TVset();
        t.setBrand("over 9000");
        t.setPrice(9999);
        System.out.println(t);
        TVset s = new TVset("under 9000", 8999);
        System.out.println(t == s);
        TVset T = t;
        System.out.println(T == t);
    }
}