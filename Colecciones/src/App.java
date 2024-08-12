
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String, Double> conjunto1 = new HashMap<>();
        conjunto1.put("Uno", 1.3);
        conjunto1.put("Otro",14.3);
        conjunto1.put("Uno más",3.2);
        conjunto1.put("Algun otro",1.2);
        conjunto1.put("Otro más",5.2);

        

        for (String vegetal : conjunto1.keySet()) {
            System.out.println(vegetal + ": $" + conjunto1.get(vegetal) );
            // El HashSet no mantiene el orden de los elementos
        }

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
