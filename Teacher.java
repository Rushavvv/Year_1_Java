public class Teacher{
    // private variables for the Teacher class for encapsulation
    private int teacher_id;
    private int working_hours;
    private String teacher_name;
    private String address; 
    private String working_type;
    private String employment_status; 
    
    //Constructor
    public Teacher( int teacher_id,String teacher_name,String address,String working_type,String employment_status){
        // Assigning each of the parameters to the instance variables
        this.teacher_name = teacher_name;
        this.teacher_id = teacher_id; 
        this.address = address; 
        this.working_type = working_type; 
        this.employment_status = employment_status; 
        
    }
    
    //Getter(Accessor) methods
    
    public int getTeacher_id(){
        return this.teacher_id;
    }
    
    public String getTeacher_name(){
        return this.teacher_name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getWorking_type(){
        return this.working_type;
    }
    
    public String getEmployent_status(){
        return this.employment_status;
    }
    
    public Integer getWorking_hours(){
        return this.working_hours;
    }
    
    //Setter(Mutator) method
    public void setWorking_hours(int Working_hours){
        this.working_hours = Working_hours;
    }
    
    /*
     This method is used to display all the variables stored in this class 
     if the working hours of a teacher is equal to 0 it prints a suitable 
     message if it isnt 0 it prints the working hours. 
     */
    public void display(){
        System.out.println("Teacher id: " + teacher_id);
        System.out.println("Teacher name: " + teacher_name);
        System.out.println("Address: " + address);
        System.out.println("Working Type: " + working_type);
        System.out.println("Employment Status: " + employment_status);
        if(working_hours == 0){
            System.out.println("Working hours has not been assigned");
        } else{
            System.out.println("Working Hours: " + working_hours);
        }
    }   
}


