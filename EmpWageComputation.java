public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
	}
}
//Check Employee is Present or absent
public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
		// Constants
		int IS_FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME){
			System.out.println("Employee is Present");
			}
		else{
			System.out.println("Employee is Absent");
		     }
}
}

//Calculate Daily Employee Wage 
public class EmpWageComputation{

   public static void main(String[ ] args) {
      //Constants
      int IS_PART_TIME = 0;
      int IS_FULL_TIME = 1;
      int EMP_RATE_PER_HOUR = 20;
      //variables
      int empHrs = 0;
      int empWage = 0;
      double empCheck = Math.floor(Math.random() * 10) % 2;
      if(empCheck == IS_PART_TIME)
         empHrs = 4;
      else if (empCheck == IS_FULL_TIME)
         empHrs = 8;
      else
         empHrs = 0;
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Daily Emp Wage:" + empWage);
   }
}

//Part Time
public class EmpWageComputation{

   public static void main(String[ ] args) {
      //Constants
      int IS_PART_TIME = 0;
      int IS_FULL_TIME = 1;
      int EMP_RATE_PER_HOUR = 20;
      //variables
      int empHrs = 0;
      int empWage = 0;
      double empCheck = Math.floor(Math.random() * 10) % 2;
      if(empCheck == IS_PART_TIME)
         empHrs = 4;
      else if (empCheck == IS_FULL_TIME)
         empHrs = 8;
      else
         empHrs = 0;
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Emp Wage:" + empWage);
   }
}

//Switch Case
public class EmpWageComputation{
      public static final int IS_PART_TIME = 0;
      public static final int IS_FULL_TIME = 1;
      public static final int EMP_RATE_PER_HOUR = 20;
      public static final int empPresent = 1;


   public static void main(String[ ] args) {
            //variables
      int empHrs = 0;
      int empWage = 0;
      if (empPresent == (int) (Math.random() * 10) % 2)
      {
         System.out.println("Employee is Present");
         int empCheck = (int) Math.floor(Math.random() * 10) % 2;
         switch (empCheck) {
            case IS_PART_TIME:
               System.out.println("Part Time Working");
               empHrs = 4;
               break;
            case IS_FULL_TIME:
               System.out.println("Full Time Working");
               empHrs = 8;
               break;
         default:
            empHrs = 0;
}
         empWage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Daily Emp Wage:" + empWage);
      }
      else
          System.out.println("Employee is Absent");

}
}
