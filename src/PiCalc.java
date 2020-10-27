public class PiCalc {


    public static double appr = (double) 0.0000005;
    public static int stepsf;

    public static void main(String[] args) {
            stepsf = (int) ((2 - (2%appr)) / appr)/2;
            double sum = 0;
        for (int i = 0; i < stepsf; i++) {
            double a = getArea(i);
            sum += a;
            System.out.println(a);
        }
        System.out.println(sum * 4);
    }

    public static double getArea(int step){
        double x = step * appr;
        double x2 = (step + 1) * appr;
        double xd = Math.abs(getCycle(x2) - getCycle(x));
        return (getCycle(x) * appr + xd * appr );


    }
    public static double getCycle(double x) {

        double y = (double) Math.sqrt(1 - x * x);
        return y;


    }


}
