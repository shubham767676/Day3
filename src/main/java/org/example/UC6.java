public class UC6
{
    //Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS = 100;


    public static void main(String[] args) {


        //Variables
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= MAX_HOURS && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {

            int emphrs = 0;
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;

                case IS_PART_TIME:
                    emphrs = 4;
                    break;

                default:
                    emphrs = 0;
            }
            totalEmpHrs += emphrs;
            int empwages = emphrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empwages;
            System.out.println("Emp wage: " + empwages);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);


    }
}
