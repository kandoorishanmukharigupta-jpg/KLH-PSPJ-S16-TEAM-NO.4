 import java.util.Scanner;
import java.util.ArrayList;

class Solar {
    String panelId;
    double power;
    
    Solar(String panelId, double power) {
        this.panelId = panelId;
        this.power = power;
    }
}

public class RooftopSolarMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Module 1 & 2: Input and If-Else
        System.out.print("Enter voltage: ");
        double voltage = sc.nextDouble();
        
        System.out.print("Enter current: ");
        double current = sc.nextDouble();
        
        double totalPower = voltage * current;
        
        if(totalPower > 400) {
            System.out.println("Status: Good");
        } else {
            System.out.println("Status: Low");
        }
        
        // Module 3: Method Call
        showPower(totalPower);
        
        // Module 4: Exception Handling
        try {
            int x = Integer.parseInt("100");
            System.out.println("Parsed value: " + x);
        } catch(Exception e) {
            System.out.println("Error in parsing");
        }
        
        // Module 5: String Operations
        String msg = "solar system";
        System.out.println("Upper: " + msg.toUpperCase());
        System.out.println("Length: " + msg.length());
        
        // Module 6: Collections (ArrayList)
        ArrayList<Solar> list = new ArrayList<>();
        list.add(new Solar("P1", totalPower));
        
        System.out.println("--- Collection List ---");
        for(Solar s : list) {
            System.out.println("Panel: " + s.panelId + " Power: " + s.power + "W");
        }
        
        sc.close();
    }
    
    // Module 3 Method Definition
    public static void showPower(double p) {
        System.out.println("Total Power: " + p + "W");
    }
}