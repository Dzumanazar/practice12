public class Person {
    private String fulName;
    private String nation;
    private int age;

    void setFulName(String fulName){
        this.fulName=fulName;
    }
    void setNation(String nation){
        this.nation=nation;
    }
    void setAge(int age){
        this.age=age;
    }
    String getFulName(){
        return fulName;
    }
    String getNation(){
        return nation;
    }
    int getAge(){
        return age;
    }
}
