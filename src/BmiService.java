public class BmiService {
    public int calculate(int a, float b) {   //76 170

       float c = b / 100;
       float f = c * c;
       float cost = a / f;
       return (int) cost;
    }
}