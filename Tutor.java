public class Tutor extends Teacher{
    //Private variablees for Tutor class for encapsulation
    private double salary;
    private String specialization;
    private String academic_qualification;
    private int perf_index;
    private boolean is_certified;
    
    //Constructor 
    public Tutor(int teacher_id,String teacher_name,String address, String working_type,
    String employment_status,int working_hours, double salary, String specialization,String academic_qualification,
    int perf_index){
        /*
            Calling the super class to use the variables stored in the parent class as well as
            the setter method that sets the value for working hours. 
        */
        super(teacher_id,teacher_name,address,working_type,employment_status);
        super.setWorking_hours(working_hours);
        this.salary = salary; 
        this.specialization = specialization;
        this.academic_qualification = academic_qualification;
        this.perf_index = perf_index;
        this.is_certified = false;
    }
    
    //Getter(Accessor) methods
    public double getSalary(){
        return this.salary;
    }
    
    public String getSpecialization(){
        return this.specialization;
    }
    
    public String getAcademic_qualification(){
        return this.academic_qualification;
    }
    
    public int getPerf_index(){
        return this.perf_index;
    }
    
    public boolean getIs_certified(){
        return this.is_certified;
    }
    
    //Setter(Mutator) method
    public void setSalary(double salary, int perf_index){
        this.salary = salary;
        this.perf_index = perf_index;
        /*
              This method takes in the salary and the performance
              index to calculate the amount by which the salary
              is to be increased. 
         */
        if(perf_index >= 5 && getWorking_hours() >= 20){
            if(perf_index >= 5 && perf_index <= 7){  
                double appraisal_amount = 0.05 * salary;
                this.salary = salary + appraisal_amount;
                is_certified = true;
            }else if(perf_index >= 8 && perf_index <= 9){
                double appraisal_amount = 0.10 * salary;
                this.salary = salary + appraisal_amount;
                is_certified = true;
                System.out.println(is_certified);
            }else if(perf_index == 10){
                double appraisal_amount = 0.20 * salary;
                this.salary  = salary + appraisal_amount;
                is_certified = true;
            }
        }else{
            System.out.println("Salary cannot be aproved since tutor is not certified yet"); 
        }  
    }
    
    /*
        This method removes the tutor by setting all the variables 
        to a 0/null/false value so that only the variables of the
        parent class are shown when it is called for display.
     */
    public void removeTutor(){
        if(is_certified == false){
            salary = 0;
            specialization = "";
            academic_qualification = "";
            perf_index = 0;
            is_certified = false;
        }else{
            System.out.println("Cannot remove a certified teacher");
        }
    }

    /*
      Since there is already a method named display()
      in the parent class we use method overriding 
      to ensure that this same method is called 
      when it is required to.
     */
    @Override
    public void display(){
        
        if(is_certified == false){
            super.display();
        }else{
            super.display();
            System.out.println("The salary is: " + salary);
            System.out.println("The specialization is: " + specialization);
            System.out.println("The academic qualifications are: " + academic_qualification);
            System.out.println("The performance index is: " + perf_index);
            
        }
    }
}
