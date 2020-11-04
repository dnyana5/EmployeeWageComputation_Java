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
//Monthly Employee Wage
public class EmpWageComputation{
      public static final int IS_PART_TIME = 0;
      public static final int IS_FULL_TIME = 1;
      public static final int EMP_RATE_PER_HOUR = 20;
      public static final int empPresent = 1;
      public static final int NUM_OF_WORKING_DAYS = 20;

   public static void main(String[ ] args) {
            //variables
      int empHrs = 0, empWage = 0, totalEmpWage =0;
      if (empPresent == (int) (Math.random() * 10) % 2)
      {
         System.out.println("Employee is Present");
         for (int day =0; day < NUM_OF_WORKING_DAYS; day++){
         int empCheck = (int) Math.floor(Math.random() * 10) % 2;
         switch (empCheck) {
            case IS_PART_TIME:
               empHrs = 4;
               break;
            case IS_FULL_TIME:
               empHrs = 8;
               break;
         default:
            empHrs = 0;
         }
         empWage = empHrs * EMP_RATE_PER_HOUR;
         totalEmpWage += empWage;
         System.out.println("Emp Wage:" + empWage);
      }System.out.println("Total Emp Wage For Month:" + totalEmpWage);
}
      else
          System.out.println("Employee is Absent");

}
}
//Employee Wage Till Condition
public class EmpWageComputation{
  public static final int IS_PART_TIME = 0;
      public static final int IS_FULL_TIME = 1;
      public static final int EMP_RATE_PER_HOUR = 20;
      public static final int empPresent = 1;
      public static final int NUM_OF_WORKING_DAYS = 20;
      public static final int MAX_HRS_IN_MONTH = 100;
   public static void main(String[ ] args) {
            //variables
      int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
      if (empPresent == (int) (Math.random() * 10) % 2)
      {
         System.out.println("Employee is Present");
         while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKI>
         totalWorkingDays++;
         int empCheck = (int) Math.floor(Math.random() * 10) % 2;
         switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
               break;
            case IS_FULL_TIME:
               empHrs = 8;
               break;
         default:
            empHrs = 0;
         }
         totalEmpHrs += empHrs;
         System.out.println("Days:" + totalWorkingDays + "  Emp Hr:" +empHrs);
         }
         int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
         System.out.println("Total Emp Wage For Month:" + totalEmpWage);
}
      else
          System.out.println("Employee is Absent");

}
}

//Class Method
public class EmpWageComputation
{
      public static final int IS_PART_TIME = 0;
      public static final int IS_FULL_TIME = 1;
      public static final int EMP_RATE_PER_HOUR = 20;
      public static final int empPresent = 1;
      public static final int NUM_OF_WORKING_DAYS = 20;
      public static final int MAX_HRS_IN_MONTH = 100;

   public static int computeEmpWage()
   {
            //variables
      int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
               while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING>
               {
                  totalWorkingDays++;
                  int empCheck = (int) Math.floor(Math.random() * 10) % 2;
                  switch (empCheck)
                     {
                        case IS_PART_TIME:
                           empHrs = 4;
                           break;
                        case IS_FULL_TIME:
                           empHrs = 8;
                           break;
                        default:
                           empHrs = 0;
                     }
                  totalEmpHrs += empHrs;
                  System.out.println("Days:" + totalWorkingDays + "  Emp Hr:" +empHrs);
               }
                  int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
                  System.out.println("Total Emp Wage:" + totalEmpWage);
                  return totalEmpWage;
         }



      public static void main(String[] args)
      {
         computeEmpWage();
      }
}

//For Multiple Company 
public class EmpWageComputation
{
      public static final int IS_PART_TIME = 0;
      public static final int IS_FULL_TIME = 1;


   public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH)
   {
            //variables
      int empHrs = 0, totalEmpHrs = 0, totalWorkingDays =0;
               while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
               {
                  totalWorkingDays++;
                  int empCheck = (int) Math.floor(Math.random() * 10) % 2;
                  switch (empCheck)
                     {
                        case IS_PART_TIME:
                           empHrs = 4;
                           break;
                        case IS_FULL_TIME:
                           empHrs = 8;
                           break;
                        default:
                           empHrs = 0;
                     }
                  totalEmpHrs += empHrs;
                  System.out.println("Days:" + totalWorkingDays + "  Emp Hr:" +empHrs);
               }
                  int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
                  System.out.println("Total Emp Wage for company::"+company+" is:"+totalEmpWage);
                  return totalEmpWage;
         }



      public static void main(String[] args)
      {
         computeEmpWage("samsung",20,3,10);
         computeEmpWage("Apple",15,5,25);
      }
}


//UC9-save total wage of company
import java.util.Scanner;
public class EmpWageComputation {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private String company;
        private int wagePerHour;
        private int workingDays;
        private int workingHours;
        private int totalEmpWage;

        public EmpWageComputation(String company ,int wagePerHour,int workingDays,int workingHours){
                this.company=company;
                this.wagePerHour=wagePerHour;
                this.workingDays=workingDays;
                this.workingHours=workingHours;
        }

        //Calculating monthly wage of employee
        public void employeeMonthlyWage(){
                //variables
                int empHours=0;
                int totalWorkingDays=0, totalEmpHours=0;
                int empCheck=(int) Math.floor(Math.random() * 10) % 3;
                while (totalEmpHours <= workingHours && totalWorkingDays < workingDays){
                        totalWorkingDays++;
                        switch(empCheck){
                                case IS_PART_TIME:
                                        empHours=8;
                                        break;
                                case IS_FULL_TIME:
                                        empHours=4;
                                        break;
                                default:
                                        empHours=0;
                        }
                totalEmpHours += empHours;
                }
        System.out.println("total employee working hour - "+totalEmpHours);
        System.out.println("total employee working days - "+totalWorkingDays);
        totalEmpWage = totalEmpHours * wagePerHour;
        }

        public String toString(){
                return "Total employee wage for company : "+company+" is - "+totalEmpWage;
        }

        public static void main(String[] args){
                System.out.println("Welcome to Employee Wage Computation");
                //take user input for each company
                EmpWageComputation samsung = new EmpWageComputation("Samsung",20,20,100);
                EmpWageComputation apple = new EmpWageComputation("Apple",10,25,150);
                samsung.employeeMonthlyWage();
                System.out.println(samsung);
                apple.employeeMonthlyWage();
                System.out.println(apple);
        }
}

//UC10-Employee wage for multiple company

import java.util.Scanner;

public class EmpWageComputation {
        //constants
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageComputation() {
                companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company ,int wagePerHour,int workingDays,int workingHours){
                companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,wagePerHour,workingDays,workingHours);
                numOfCompany++;
        }

        private void computeEmpWage() {
                for (int i =0; i < numOfCompany; i++) {
                        companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                        System.out.println(companyEmpWageArray[i]);
                }
        }
        //Calculating monthly wage of employee
        private int computeEmpWage(CompanyEmpWage companyEmpWage){
                //variables
                int empHours=0, totalWorkingDays=0, totalEmpHours=0;
                while (totalEmpHours <= companyEmpWage.workingHours && totalWorkingDays < companyEmpWage.workingDays){
                        totalWorkingDays++;
                        int empCheck=(int) Math.floor(Math.random() * 10) % 3;
                        switch(empCheck){
                                case IS_PART_TIME:
                                        empHours=8;
                                        break;
                                case IS_FULL_TIME:
                                        empHours=4;
                                        break;
                                default:
                                        empHours=0;
                        }
                        totalEmpHours += empHours;
                }
                System.out.println("total employee working hour - "+totalEmpHours);
                System.out.println("total employee working days - "+totalWorkingDays);
                return totalEmpHours * companyEmpWage.wagePerHour;
        }
        public static void main(String[] args){
                System.out.println("Welcome to Employee Wage Computation");
                EmpWageComputation empWage = new EmpWageComputation();
                empWage.addCompanyEmpWage("Samsung",20,20,100);
                empWage.addCompanyEmpWage("Apple",10,25,150);
                empWage.computeEmpWage();
        }
}
//UC11 using Interface

import java.util.Scanner;

interface EmployeeWage {

	void addCompanyEmpWage(String company ,int wagePerHour,int workingDays,int workingHours);
	void computeEmpWage();
}

public class EmpWageComputation implements EmployeeWage {
	//constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmpWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company ,int wagePerHour,int workingDays,int workingHours){
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,wagePerHour,workingDays,workingHours);
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i =0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	//Calculating monthly wage of employee
	private int computeEmpWage(CompanyEmpWage companyEmpWage){
		//variables
		int empHours=0, totalWorkingDays=0, totalEmpHours=0;
		while (totalEmpHours <= companyEmpWage.workingHours && totalWorkingDays < companyEmpWage.workingDays){
                        totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() * 10) % 3;
			switch(empCheck){
				case IS_PART_TIME:
					empHours=8;
					break;
				case IS_FULL_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
			totalEmpHours += empHours;
		}
		System.out.println("total employee working hour - "+totalEmpHours);
        	System.out.println("total employee working days - "+totalWorkingDays);
        	return totalEmpHours * companyEmpWage.wagePerHour;
	}
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageComputation empWage = new EmpWageComputation();
		empWage.addCompanyEmpWage("Samsung",20,20,100);
		empWage.addCompanyEmpWage("Apple",10,25,150);
		empWage.computeEmpWage();
	}
}
