import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int growth = 175; // рост
        int weight = 75; // вес
        int index = service.calculate(weight , growth);
        //System.out.println("Рост: " + growth);
        //System.out.println("Вес: " + weight);
        //System.out.println("Индекс массы тела: " + index);

        if (index < 18) {
            System.out.println("Рост: " + growth);
            System.out.println("Вес: " + weight);
            System.out.println("Индекс массы тела: " + index + " - недостаточный вес");
        }
        if (index >= 18 && index < 25){
            System.out.println("Рост: " + growth);
            System.out.println("Вес: " + weight);
            System.out.println("Индекс массы тела: " + index + " - нормальный вес");
        }
        if (index > 25 ) {
            System.out.println("Рост: " + growth);
            System.out.println("Вес: " + weight);
            System.out.println("Индекс массы тела: " + index + " - избыточный вес");
        }


    }

}
