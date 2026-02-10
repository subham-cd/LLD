package Lesson1.employeeCode.problematicCode;



///issue in code ?
public class Employee {
    private int id;
    public int getId(){
        return this.id;
    }
    public String fetchBioData(){
        return "Some bio Data";
    }
    public double calculateSalary(){
        return 0;
    }
    public void printPerformanceData(){
        System.out.println("Some Performance related data");
    }
}


//here same problem in code that SRP->single responsibility Principle

//it make resusablity difficult and class method heavy