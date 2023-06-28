package ch07.course.employee;

public class Employee {
    String calculateSalary() {

        System.out.println("급여계산방법");
        return calculateSalary();
    }
}
    class FullTimeEmployee extends Employee {

        int annualIncome;
        public void FullTimeEmployee(int annualIncome) {
            this.annualIncome = annualIncome;
        }
        @Override
        String calculateSalary() {
            System.out.println("금월 급여 정보를 알려드리겠습니다.");
            System.out.println(annualIncome/12);
            System.out.println("입니다.");
            return calculateSalary();
        }
    }
    class PartTimeEmployee extends Employee {
        int hourlyWage;
        int workTime;

        public void setHourlyWage(int hourlyWage, int workTime) {
            this.hourlyWage = hourlyWage;
            this.workTime = workTime;
        }
        @Override
        String calculateSalary() {
            System.out.println("금월 급여 정보를 알려드리겠습니다.");
            System.out.println(hourlyWage*workTime);
            System.out.println("입니다.");
            return calculateSalary();
        }
    }
