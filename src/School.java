public class School {
    private String name;
    private int okuuchununsaany;
    private int phonNumber;

    void setName(String name){
        this.name=name;
    }
    void setOkuuchununsaany(int okuuchununsaany){
        this.okuuchununsaany=okuuchununsaany;
    }
    void setPhonNumber(int phonNumber){
        this.phonNumber=phonNumber;
    }
    String getName(){
        return name;
    }
    int getOkuuchununsaany(){
        return okuuchununsaany;
    }
    int getPhonNumber(){
        return phonNumber;
    }
}
