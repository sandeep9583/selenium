package TestNG;

public class JavaHi {
    private String pname;

    public JavaHi(String a){
        pname = a;
    }
    public void printPersonName(){
        System.out.println(pname);
    }
    public String sayHi(){
        String msg = "Hi " + pname;
        System.out.println(msg);
        return msg;
    }
}
