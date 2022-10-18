import java.util.Scanner;

public class TryingMethods2 {
    private string gender;
    private string female;
    

    public void name() {
        try (Scanner in = new Scanner(System.in)) {
            int dayNum;
            System.out.println("Enter a day number (1-7): ");
            dayNum = in.nextInt();
                 
            switch (dayNum) {
                    case 1:
                    System.out.println("Monday");
                        break;
    
                    case 2:
                        System.out.println("Teusday");
                        break;
                    case 3:
                        System.out.println("Wednesday");;
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;  
                    case 5:
                        System.out.println("Friday");
                        System.out.println("TGIF!");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;       
                      default:
                        System.out.println("Invalid day number.");
                        break;                      
                }
        
    }
if (gender == female) {
    System.out.println("Correct gender");
}else if(gender != female){
    System.out.println("Not correct gender");
}else{
    System.out.println("Kindly check the gender");
}
    }
}
