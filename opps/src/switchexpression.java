import java.time.MonthDay;

public class switchexpression {
    public static void main(String[] args) {
        int dayofweek=3;
        switch(dayofweek){
          //using lemda expression
            // case 1-> System.out.println("monday");

          //  case 2-> System.out.println("tuesday");
          //  case 3-> System.out.println("wednesday");
          //  case 4-> System.out.println("thursday");
            //narmal way
            case 1: monday:
            System.out.println("day is monday");
            break;
            case 2: tuesday:
            System.out.println("day is tuesday");
            break;

            case 3: wednesday:
            System.out.println("day is wednesday");
            break;
            case 4: thursday:
            System.out.println("day is thursday");
            break;
            case 5: friday:
            System.out.println("day is friday");
            break;

        }
    }
}
