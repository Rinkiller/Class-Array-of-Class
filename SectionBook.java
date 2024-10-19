
import java.util.ArrayList;
import java.util.List;

public class SectionBook {
    private List<Sotrudnic> spisoc;
    private static Integer id = 1;
    public SectionBook() {this.spisoc = new ArrayList<Sotrudnic>(10);}

    public List<Sotrudnic> getAgeOfSotrudnic(int workAge){
        List<Sotrudnic> result = new ArrayList<Sotrudnic>(10);
        for (Sotrudnic unit : spisoc) {
            if(unit.getWorkAge() == workAge){
                result.add(unit);
            }
        }
        return result;
    }
    public List<String> getTelephoneNumberOfSotrudnikName(String name){
        List<String> result = new ArrayList<String>(10);
        for (Sotrudnic unit : spisoc) {
            if(unit.getName().equals(name)){
                for(String elem : unit.getTelephoneList()) {
                    result.add(elem);
                } 
            }
        }
        return result;
    }

    public Sotrudnic getSotrudnicOfID(int id){
        for (Sotrudnic unit : spisoc) {
            if(unit.getunitID() == id){
                return unit;
            }
        }
        return  null;
    }
    public List<Sotrudnic> getSotrudnicOfName(String name){
        
        List<Sotrudnic> result = new ArrayList<Sotrudnic>();
        for (Sotrudnic unit : spisoc) {
            if(unit.getName().equals(name)){
                result.add(unit);
            }
        }
        return result;
    }
    public void addNewSotrudnic(Sotrudnic unit){
        unit.setunitID(id++);
        spisoc.add(unit);
    }

    @Override
    public String toString() {
        String res = "";
        for (Sotrudnic unit : spisoc) {
            res += unit.toString() + "\n";
        }
        return  res;
    }
    
    public static void main(String[] args) {
        SectionBook book = new SectionBook();
        book.addNewSotrudnic(new Sotrudnic("Rinat", 38, "8-910-888-777-90"));
        book.addNewSotrudnic(new Sotrudnic("Lena", 18, "8-910-888-777-90"));
        System.out.println(book);

    }
}
