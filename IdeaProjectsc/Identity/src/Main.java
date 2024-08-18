import java.time.LocalDate;
import java.util.Date;
import java.util.*;

public class Main {
    public Shahd getIdInfo(int nationalID){
     return new Shahd(nationalID);
    }
    public List printUserInfo(UserInfo uI){



     return List.of(uI.getName(),uI.getUserName(),uI.getId());
    }
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.getIdInfo(2000496898));


        UserInfo uI=new UserInfo(123,"ahmad","ahmad123");
        System.out.println(main.printUserInfo(uI));


        Account account=new Account("1231435456",100088);

        Animal cat=new Cat();
        cat.move();
    }
}