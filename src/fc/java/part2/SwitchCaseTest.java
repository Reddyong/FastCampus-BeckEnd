package fc.java.part2;

public class SwitchCaseTest {
    public static void main(String[] args) {


        String day = "Wed";
        switch (day){
            case "Mon" :
                System.out.println("basketball");
                break;
            case "Tue" :
            case "Wed" :
                System.out.println("swim");
                break;
            case "Sun" :
                System.out.println("baseball");
                break;
            default:
                System.out.println("break");
        }
    }
}
