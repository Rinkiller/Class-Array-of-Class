import java.util.ArrayList;
import java.util.List;

public class Sotrudnic {
    private String name;
    private int workAge;
    private int unitID;
    private List<String> telephoneLst;

    public Sotrudnic(String name,int workAge,String telephone) {
        this.name = name;
        this.workAge = workAge;
        this.telephoneLst = new ArrayList<String>();
        this.telephoneLst.add(telephone);
    }
    public String getName(){
        return name;
    }
    public int getWorkAge(){
        return workAge;
    }
    public int getunitID(){
        return unitID;
    }
    
    public List<String> getTelephoneList(){
        return telephoneLst;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWorkAge(int age){
        this.workAge = age;
    }
    public void setunitID(int unitID){
        this.unitID = unitID;
    }
    public void settelephone(String telephone){
        this.telephoneLst.add(telephone);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age : "+ workAge + " telephone : " + telephoneLst + " ID : " + unitID;
    }
}
