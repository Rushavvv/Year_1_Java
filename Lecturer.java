public class Lecturer extends Teacher{
    //Private variables for the class for encapsulation
    private String department;
    private int years_of_experience;
    private int graded_score; 
    private boolean has_graded;
    private String grade; //creating another variable to store the grade

    //Constructor
    public Lecturer(int teacher_id,String teacher_name,String address, String working_type,
    String employment_status,String department,int years_of_experience, int working_hours){
        /*
         Calling the super class to use the variables stored in the parent class as well as
         the setter method that sets the value for working hours. 
         */
        super(teacher_id,teacher_name,address,working_type,employment_status);
        super.setWorking_hours(working_hours);
        this.department = department;
        this.years_of_experience = years_of_experience;
        this.graded_score = 0;
        this.has_graded = false;
    
    }

    //Getter(Accessor) methods
    public String getDepartment(){
        return this.department;   
    }

    public int getYears_of_experience(){
        return this.years_of_experience;
    }
    
    public int getGraded_score(){
        return this.graded_score;
    }
    
    public boolean getHas_graded(){
        return this.has_graded;
    }

    //Setter(Mutator) method
    public void setGraded_score(int Grad_score){
        this.graded_score = Grad_score;
        
    }
    
    public void gradeAssignment(int graded_score, String department, int years_of_experience){
        this.graded_score = graded_score; 
        this.years_of_experience = years_of_experience;
        /*
         This method takes the graded score and if the conditions such as 
         years of exerience is above 5 and the department is the same as the one
         entered before then it sets the grade. 
         */
        if(years_of_experience >= 5 && this.department.equals(department)){   
            if(graded_score >= 70){
                grade = "A";
            }else if( graded_score >= 60){
                grade = "B";
            }else if( graded_score >= 50){
                grade = "C";
            }else if( graded_score >= 40){
                grade = "D";
            }else if(graded_score < 40){
                grade = "E";
            }else{
                grade = "Not graded yet";
            }
            has_graded = true;
        }else{
            System.out.println("Has not been graded yet");
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
        super.display();
        System.out.println("The department is: " + department);
        System.out.println("The years of experience is: " + years_of_experience);
        if(has_graded == true){
            System.out.println("Your grade is: " + grade);    
        }else{
            System.out.println("Has not been graded yet");
        }
        
        
    }
    
    

}