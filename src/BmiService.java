public class BmiService {
    public int calculate(int weight, float growth) {   //76 170

        //growthpath- часть роста
        //growthmultiplication- умноженный рост

        float growthpath = growth / 100;
        float growthmultiplication = growthpath * growthpath;
        float cost = weight / growthmultiplication;
        return (int) cost;
    }
}