import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.Date;

public class Shahd {
    private String fullName = "shahd yousef hersh";
    private String placeOfBirth="Amman";
    private int nationalID=2000496898;
    private LocalDate dateOfBirth= LocalDate.of(2002,06,13);
    boolean exist=false;


    public Shahd( int nationalID) {
        if(check(nationalID))
            exist=true;
    }
    public boolean check(int nationalID){
        if(this.nationalID==nationalID)
            return true;
        else
            return false;
    }

    public String toString(){
        if(exist)
        return String.format("fullName : "+ fullName + "\nplaceOfBirth : " + placeOfBirth +"\ndateOfBirth : " + dateOfBirth+"\nnationalID : " + nationalID);
        else
            return "id is not existed";
    }

}
