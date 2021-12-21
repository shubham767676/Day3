
public class UC4
{
    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;


    public static void main(String[] args) {


        //Variables
        int emphrs = 0;
        int empwages = 0;

        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int)empCheck) {
            case IS_FULL_TIME:
                emphrs = 8;
                break;

            case IS_PART_TIME:
                emphrs = 4;
                break;

            default:
                emphrs = 0;
        }
        empwages = emphrs * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage " + empwages);
    }
}
