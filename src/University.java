public class University {
    private String name;
    private String adress;
    public String kanchaStudentOkuit;

    void setName(String name){
        this.name = name;
    }
    void setAdress(String adress){
        this.adress = adress;
    }
    void setStudentOkuit(String kanchaStudentOkuit){
        this.kanchaStudentOkuit = kanchaStudentOkuit;
    }

    String getName(){
        return name;
    }
    String getAdress(){
        return adress;
    }
    String getKanchaStudentOkuit(){
        return kanchaStudentOkuit;
    }
}

