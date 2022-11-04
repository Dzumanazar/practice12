public class Car {
    private String name;
    private String color;
    private int price;

    void setName(String name){
        this.name=name;
    }
    void setColor(String color){
        this.color=color;
    }
    void setPrice(int price){
        this.price=price;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    int getPrice(){
        return price;
    }
}
