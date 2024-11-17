
import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal() {
        int sum=0;
        for (int i=1; i<=10; i++) {
            sum+=i ;
        }
        return sum;
    }
    public int getStreakGoal(int numWeeks) {
        int sum=0;
        for (int i=1; i<=numWeeks; i++) {
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] lineItems) {
        double total=0.0;
        for ( int i=0; i<lineItems.length; i++) {
            total+=lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        
        for (int i=0; i<menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> costumers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello," +username + "!");
        System.out.println("There are " + costumers.size() + " people in front of you.");
        costumers.add(username);
        System.out.println(costumers);
    }
}
