import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
class Teacher_GUI {
    //********************************Declaration of Variables*******************//
    private JFrame frame = new JFrame();
    private JPanel mainpanel, tutorpanel, lecturerpanel, designpanel;
    private JLabel Teacher_id, Teacher_name, Address, Work_type, Employment_stat, Working_hours,
    Department, Experience, Graded_score, Salary, Specialization, Qualification, Perf_index, Teach, Tutor, Lecture,
    image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13, image14, Welcome,
    lec1, lec2, lec3, lec4, image15;
    
    private JTextField idfield, namefield, addressfield, workingtypefield, employmentfield, workingfield, 
    departmentfield, expfield, scorefield, salaryfield, specializationfield, qualificationfield, performancefield;
    
    private JButton tutorbtn, lecturerbtn , addtutor, removetutor, salarybtn, tutdisplaybtn, lecdisplaybtn, addLecturer,
    switch_to_lecturerbtn, switch_to_tutorbtn, gradebtn, clearbtn, back;
    
    private static ArrayList <Teacher> Teacherlist = new ArrayList<Teacher>(); //makking array list of class Teacher using generics
    
    public Teacher_GUI(){
        //*****************Front Frame****************//
        Teach = new JLabel("Who do you want to register for?");
        Teach.setFont(new Font("Helvetica",Font.ITALIC, 30));
        Welcome = new JLabel("MY THIRD TEACHER");
        Welcome.setFont(new Font("Helvetica",Font.BOLD, 30));
        Welcome.setForeground(Color.decode("#2ca6b1"));
        tutorbtn = new JButton("Tutor");
        lecturerbtn = new JButton("Lecturer");
        mainpanel = new JPanel();
        mainpanel.setBackground(Color.decode("#135D66"));
        designpanel =  new JPanel();
        designpanel.setBackground(Color.decode("#f3f3e3"));
        
        tutorbtn.setForeground(Color.WHITE);
        tutorbtn.setBackground(Color.BLACK);
        tutorbtn.setOpaque(true);
        tutorbtn.setBorderPainted(false);
        
        lecturerbtn.setForeground(Color.WHITE);
        lecturerbtn.setBackground(Color.BLACK);
        lecturerbtn.setOpaque(true);
        lecturerbtn.setBorderPainted(false);


        mainpanel.setVisible(true);
        mainpanel.setSize(1450,1600);
        mainpanel.setLayout(null);
    
        
        designpanel.setSize(950,900);
        
        ImageIcon icon1 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture1.png");
        image1 = new JLabel(icon1);
        image1.setBounds(200,90,600,600);
        mainpanel.add(image1);
        
        ImageIcon icon2 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture2.png");
        image2 = new JLabel(icon2);
        image2.setBounds(-7,550,348,432);
        mainpanel.add(image2);
        
        ImageIcon icon4 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture4.png");
        image4 = new JLabel(icon4);
        image4.setBounds(-30,320,300,200);
        mainpanel.add(image4);
        
        ImageIcon icon5 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture5.png");
        image5 = new JLabel(icon5);
        image5.setBounds(550,430,450,400);
        mainpanel.add(image5);
        
        ImageIcon icon6 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture6.png");
        image6 = new JLabel(icon6);
        image6.setBounds(-55,52,300,200);
        mainpanel.add(image6);
        
        ImageIcon icon9 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/Line.png");
        image9 = new JLabel(icon9);
        image9.setBounds(550,-340,1000,950);
        mainpanel.add(image9);

        Teach.setBounds(980,0,800,800);
        Welcome.setBounds(120, 30, 500,150);
        tutorbtn.setBounds(1280, 470, 120,60);
        lecturerbtn.setBounds(1000,470,120,60);

        frame.add(mainpanel);
        mainpanel.add(Teach);
        mainpanel.add(Welcome);
        mainpanel.add(designpanel);
        mainpanel.add(tutorbtn);
        mainpanel.add(lecturerbtn);
        

        frame.setLayout(null);
        frame.setVisible(true);

        frame.setSize(1450,1600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //***************Panels*******************//

        tutorpanel = new JPanel();
        tutorpanel.setVisible(false);
        tutorpanel.setBackground(Color.decode("#C6EBC5"));
        tutorpanel.setSize(1450,1600);
        frame.add(tutorpanel);
        tutorpanel.setLayout(null);

        lecturerpanel = new JPanel();
        lecturerpanel.setVisible(false);
        lecturerpanel.setBackground(Color.decode("#DFD0B8"));
        lecturerpanel.setSize(1450,1600);
        frame.add(lecturerpanel);
        lecturerpanel.setLayout(null);
        
        ImageIcon icon7 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture7.png");
        image7 = new JLabel(icon7);
        image7.setBounds(400,70,600,600);
        lecturerpanel.add(image7);
        
        ImageIcon icon10 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/Picture10.png");
        image10 = new JLabel(icon10);
        image10.setBounds(1230, 570, 280,530);
        lecturerpanel.add(image10);
        
        ImageIcon icon11 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture11.png");
        image11 = new JLabel(icon11);
        image11.setBounds(800, 300, 500,500);
        lecturerpanel.add(image11);
        
        ImageIcon icon12 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/picture12.png");
        image12 = new JLabel(icon12);
        image12.setBounds(800, 390, 500,500);
        lecturerpanel.add(image12);
        
        ImageIcon icon8 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/money.png");
        image8 = new JLabel(icon8);
        image8.setBounds(800, 300, 500,500);
        tutorpanel.add(image8);
        
        ImageIcon icon13 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/salary2.png");
        image13 = new JLabel(icon13);
        image13.setBounds(800, 400, 500,500);
        tutorpanel.add(image13);
        
        ImageIcon icon3 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/tutor.png");
        image3 = new JLabel(icon3);
        image3.setBounds(400,50,600,600);
        tutorpanel.add(image3);
        
        ImageIcon icon14 = new ImageIcon("../23048581_Rushav_Sthapit_AI1/images/tapes.png");
        image14 = new JLabel(icon14);
        image14.setBounds(1230, 570, 280,540);
        tutorpanel.add(image14);
                
        lec1 = new JLabel("Become a Lecturer!");
        lec1.setFont(new Font("Helvetica",Font.BOLD, 20));
        lec1.setBounds(1120, 300, 500,500);
        lecturerpanel.add(lec1);
        
        lec2 = new JLabel("Get Graded!");
        lec2.setFont(new Font("Helvetica",Font.BOLD, 20));
        lec2.setBounds(1120, 390, 500,500);
        lecturerpanel.add(lec2);
        
        lec3 = new JLabel("GET BONUSES!");
        lec3.setFont(new Font("Helvetica",Font.BOLD, 20));
        lec3.setBounds(1120, 300, 500,500);
        tutorpanel.add(lec3);
        
        lec4 = new JLabel("BECOME A TUTOR");
        lec4.setFont(new Font("Helvetica",Font.BOLD, 20));
        lec4.setBounds(1120, 400, 500,500);
        tutorpanel.add(lec4);
        //****************Declaration for Panels********************//
        Tutor = new JLabel("Tutor");
        Tutor.setFont(new Font("Helvetica", Font.ITALIC, 50));
        
        Lecture = new JLabel("Lecturer");
        Lecture.setFont(new Font("Helvetica", Font.ITALIC, 50));

        Tutor.setBounds(590, 30, 300, 50);
        Lecture.setBounds(590, 30, 300, 50);
        
        tutorpanel.add(Tutor);
        lecturerpanel.add(Lecture);
        
        Teacher_id = new JLabel("Teacher ID: ");
        idfield = new JTextField();

        Teacher_id.setBounds(80,120,100,30);
        idfield.setBounds(165,120,100,30);

        Teacher_name = new JLabel("Teacher Name: ");
        namefield = new JTextField();

        Teacher_name.setBounds(130,180,100,30);
        namefield.setBounds(240,180,100,30);

        Address = new JLabel("Address: ");
        addressfield = new JTextField();

        Address.setBounds(80,240,100,30);
        addressfield.setBounds(150,240,100,30);

        Work_type = new JLabel("Working Type: ");
        workingtypefield = new JTextField();

        Work_type.setBounds(130,300,100,30);
        workingtypefield.setBounds(235,300,100,30);

        Employment_stat = new JLabel("Employment Status: ");
        employmentfield = new JTextField();

        Employment_stat.setBounds(80,360,150,30);
        employmentfield.setBounds(220,360,100,30);

        Working_hours = new JLabel("Working Hours: ");
        workingfield = new JTextField();

        Working_hours.setBounds(130,420,150,30);
        workingfield.setBounds(245,420,100,30);

        Department = new JLabel("Department: ");
        departmentfield = new JTextField();

        Department.setBounds(80,480,100,30);
        departmentfield.setBounds(180,480,100,30);

        addtutor = new JButton("Add Tutor");
        addtutor.setBounds(60,560,130,50);
        addtutor.setForeground(Color.WHITE);
        addtutor.setBackground(Color.GRAY);
        addtutor.setOpaque(true);
        addtutor.setBorderPainted(false);

        removetutor = new JButton("Remove Tutor");
        removetutor.setBounds(210,560,150,50);
        removetutor.setForeground(Color.WHITE);
        removetutor.setBackground(Color.GRAY);
        removetutor.setOpaque(true);
        removetutor.setBorderPainted(false);
        tutorpanel.add(removetutor);

        addLecturer = new JButton("Add Lecturer");
        addLecturer.setBounds(130,560,130,50);
        addLecturer.setForeground(Color.WHITE);
        addLecturer.setBackground(Color.GRAY);
        addLecturer.setOpaque(true);
        addLecturer.setBorderPainted(false);
        
        //****************Right Column*******************//
        Experience = new JLabel("Years of Experience: ");
        expfield = new JTextField();

        Experience.setBounds(950,150,150,30);
        expfield.setBounds(1090,150,100,30);

        Graded_score = new JLabel("Score: ");
        scorefield = new JTextField();

        Graded_score.setBounds(950,210,150,30);
        scorefield.setBounds(1090,210,100,30);

        Salary = new JLabel("Salary: ");
        salaryfield = new JTextField();

        Salary.setBounds(950,120,100,30);
        salaryfield.setBounds(1090,120,100,30);

        Specialization = new JLabel("Specialization: ");
        specializationfield = new JTextField();

        Specialization.setBounds(950,180,100,30);
        specializationfield.setBounds(1090,180,100,30);

        Qualification = new JLabel("Qualification: ");
        qualificationfield = new JTextField();

        Qualification.setBounds(950,240,100,30);
        qualificationfield.setBounds(1090,240,100,30); 

        Perf_index = new JLabel("Performance Index: ");
        performancefield = new JTextField();

        Perf_index.setBounds(950,300,150,30);
        performancefield.setBounds(1090,300,100,30);

        salarybtn = new JButton("Set Salary");
        salarybtn.setBounds(1050,360,140,50);
        salarybtn.setForeground(Color.WHITE);
        salarybtn.setBackground(Color.GRAY);
        salarybtn.setOpaque(true);
        salarybtn.setBorderPainted(false);
        
        clearbtn = new JButton("Clear");
        clearbtn.setBounds(1220, 280, 100,50);
        clearbtn.setForeground(Color.WHITE);
        clearbtn.setBackground(Color.GRAY);
        clearbtn.setOpaque(true);
        clearbtn.setBorderPainted(false);

        tutdisplaybtn = new JButton("Display");
        tutdisplaybtn.setBounds(1220,190,100,50);
        tutdisplaybtn.setForeground(Color.WHITE);
        tutdisplaybtn.setBackground(Color.GRAY);
        tutdisplaybtn.setOpaque(true);
        tutdisplaybtn.setBorderPainted(false);
                
        lecdisplaybtn = new JButton("Display");
        lecdisplaybtn.setBounds(1220,190,100,50);
        lecdisplaybtn.setForeground(Color.WHITE);
        lecdisplaybtn.setBackground(Color.GRAY);
        lecdisplaybtn.setOpaque(true);
        lecdisplaybtn.setBorderPainted(false);

        switch_to_lecturerbtn = new JButton("Switch to Lecturer");
        switch_to_lecturerbtn.setBounds(570,650,200,50);
        switch_to_lecturerbtn.setForeground(Color.WHITE);
        switch_to_lecturerbtn.setBackground(Color.GRAY);
        switch_to_lecturerbtn.setOpaque(true);
        switch_to_lecturerbtn.setBorderPainted(false);
        
        switch_to_tutorbtn = new JButton("Switch to Tutor");
        switch_to_tutorbtn.setBounds(590,650,150,50);
        switch_to_tutorbtn.setForeground(Color.WHITE);
        switch_to_tutorbtn.setBackground(Color.GRAY);
        switch_to_tutorbtn.setOpaque(true);
        switch_to_tutorbtn.setBorderPainted(false);
        
        
        gradebtn = new JButton("Grade");
        gradebtn.setBounds(1000,300,100,50);
        gradebtn.setForeground(Color.WHITE);
        gradebtn.setBackground(Color.GRAY);
        gradebtn.setOpaque(true);
        gradebtn.setBorderPainted(false);
        
        
        back = new JButton("Back");
        back.setBounds(20, 20, 100, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.GRAY);
        back.setOpaque(true);
        back.setBorderPainted(false);
        
        

        //**************************BackEnd*******************************//

        lecturerbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Button to go to lecturer panel 
                     * Hides all the other panels and sets lecruer panel visible
                     */
                    lecturerpanel.setVisible(true);
                    mainpanel.setVisible(false);
                    lecturerpanel.add(Teacher_id);
                    lecturerpanel.add(idfield);
                    lecturerpanel.add(Teacher_name);
                    lecturerpanel.add(namefield);
                    lecturerpanel.add(Address);
                    lecturerpanel.add(addressfield);
                    lecturerpanel.add(Work_type);
                    lecturerpanel.add(workingtypefield);
                    lecturerpanel.add(Employment_stat);
                    lecturerpanel.add(employmentfield);
                    lecturerpanel.add(Working_hours);
                    lecturerpanel.add(workingfield);
                    lecturerpanel.add(Department);
                    lecturerpanel.add(departmentfield);
                    lecturerpanel.add(addLecturer);
                    lecturerpanel.add(Experience);
                    lecturerpanel.add(expfield);
                    lecturerpanel.add(Graded_score);
                    lecturerpanel.add(scorefield);
                    lecturerpanel.add(gradebtn);
                    lecturerpanel.add(lecdisplaybtn);
                    lecturerpanel.add(switch_to_tutorbtn);
                    lecturerpanel.add(clearbtn);
                    lecturerpanel.add(back);
                    idfield.setText(null);
                    namefield.setText(null);
                    addressfield.setText(null);
                    workingtypefield.setText(null);
                    employmentfield.setText(null);
                    workingfield.setText(null);
                    departmentfield.setText(null);
                    salaryfield.setText(null);
                    specializationfield.setText(null);
                    expfield.setText(null);
                    qualificationfield.setText(null);
                    performancefield.setText(null);
                    scorefield.setText(null);
                }
        });

        tutorbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Button to go to tutor panel 
                     * Hides all the other panels and sets tutor panel visible
                     */
                    tutorpanel.setVisible(true);
                    mainpanel.setVisible(false);
                    
                    tutorpanel.add(Teacher_id);
                    tutorpanel.add(idfield);
                    tutorpanel.add(Teacher_name);
                    tutorpanel.add(namefield);
                    tutorpanel.add(Address);
                    tutorpanel.add(addressfield);
                    tutorpanel.add(Work_type);
                    tutorpanel.add(workingtypefield);
                    tutorpanel.add(Employment_stat);
                    tutorpanel.add(employmentfield);
                    tutorpanel.add(Working_hours);
                    tutorpanel.add(workingfield);
                    tutorpanel.add(Department);
                    tutorpanel.add(departmentfield);
                    tutorpanel.add(addtutor);
                    tutorpanel.add(Salary);
                    tutorpanel.add(salaryfield);
                    tutorpanel.add(Specialization);
                    tutorpanel.add(specializationfield);
                    tutorpanel.add(Qualification);
                    tutorpanel.add(qualificationfield);
                    tutorpanel.add(Perf_index);
                    tutorpanel.add(performancefield);
                    tutorpanel.add(salarybtn);
                    tutorpanel.add(tutdisplaybtn);
                    tutorpanel.add(switch_to_lecturerbtn);
                    tutorpanel.add(clearbtn);
                    tutorpanel.add(back);
                    idfield.setText(null);
                    namefield.setText(null);
                    addressfield.setText(null);
                    workingtypefield.setText(null);
                    employmentfield.setText(null);
                    workingfield.setText(null);
                    departmentfield.setText(null);
                    salaryfield.setText(null);
                    specializationfield.setText(null);
                    expfield.setText(null);
                    qualificationfield.setText(null);
                    performancefield.setText(null);
                    scorefield.setText(null);
                }

        });

        switch_to_lecturerbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Button that takes the user straight to the other panel instead of having to go through
                     * the home screen.
                     * 
                     */
                    lecturerpanel.setVisible(true);
                    mainpanel.setVisible(false);
                    tutorpanel.setVisible(false);
                    
                    lecturerpanel.add(Teacher_id);
                    lecturerpanel.add(idfield);
                    lecturerpanel.add(Teacher_name);
                    lecturerpanel.add(namefield);
                    lecturerpanel.add(Address);
                    lecturerpanel.add(addressfield);
                    lecturerpanel.add(Work_type);
                    lecturerpanel.add(workingtypefield);
                    lecturerpanel.add(Employment_stat);
                    lecturerpanel.add(employmentfield);
                    lecturerpanel.add(Working_hours);
                    lecturerpanel.add(workingfield);
                    lecturerpanel.add(Department);
                    lecturerpanel.add(departmentfield);
                    lecturerpanel.add(addLecturer);
                    lecturerpanel.add(Experience);
                    lecturerpanel.add(expfield);
                    lecturerpanel.add(Graded_score);
                    lecturerpanel.add(scorefield);
                    lecturerpanel.add(gradebtn);
                    lecturerpanel.add(lecdisplaybtn);
                    lecturerpanel.add(switch_to_tutorbtn);
                    lecturerpanel.add(clearbtn);
                    lecturerpanel.add(back);
                    idfield.setText(null);
                    namefield.setText(null);
                    addressfield.setText(null);
                    workingtypefield.setText(null);
                    employmentfield.setText(null);
                    workingfield.setText(null);
                    departmentfield.setText(null);
                    salaryfield.setText(null);
                    specializationfield.setText(null);
                    expfield.setText(null);
                    qualificationfield.setText(null);
                    performancefield.setText(null);
                    scorefield.setText(null);
                }
        });
            
        switch_to_tutorbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Button to go straight to tutor panel without having to go through the 
                     * home screen.
                     */
                    lecturerpanel.setVisible(false);
                    mainpanel.setVisible(false);
                    tutorpanel.setVisible(true);
                    
                    tutorpanel.add(Teacher_id);
                    tutorpanel.add(idfield);
                    tutorpanel.add(Teacher_name);
                    tutorpanel.add(namefield);
                    tutorpanel.add(Address);
                    tutorpanel.add(addressfield);
                    tutorpanel.add(Work_type);
                    tutorpanel.add(workingtypefield);
                    tutorpanel.add(Employment_stat);
                    tutorpanel.add(employmentfield);
                    tutorpanel.add(Working_hours);
                    tutorpanel.add(workingfield);
                    tutorpanel.add(Department);
                    tutorpanel.add(departmentfield);
                    tutorpanel.add(addtutor);
                    tutorpanel.add(Salary);
                    tutorpanel.add(salaryfield);
                    tutorpanel.add(Specialization);
                    tutorpanel.add(specializationfield);
                    tutorpanel.add(Qualification);
                    tutorpanel.add(qualificationfield);
                    tutorpanel.add(Perf_index);
                    tutorpanel.add(performancefield);
                    tutorpanel.add(salarybtn);
                    tutorpanel.add(tutdisplaybtn);
                    tutorpanel.add(switch_to_lecturerbtn);
                    tutorpanel.add(clearbtn);
                    tutorpanel.add(back);
                    idfield.setText(null);
                    namefield.setText(null);
                    addressfield.setText(null);
                    workingtypefield.setText(null);
                    employmentfield.setText(null);
                    workingfield.setText(null);
                    departmentfield.setText(null);
                    salaryfield.setText(null);
                    specializationfield.setText(null);
                    expfield.setText(null);
                    qualificationfield.setText(null);
                    performancefield.setText(null);
                    scorefield.setText(null);
                }
        });

        
        
        addtutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for adding a new tutor.
                     * Checks for empty fields, validates inputs, and adds a tutor to the list of type teacher.
                     */
                    try{
                        if(idfield.getText().isEmpty() || namefield.getText().isEmpty() || addressfield.getText().isEmpty() || workingtypefield.getText().isEmpty() || employmentfield.getText().isEmpty()
                        || salaryfield.getText().isEmpty() || specializationfield.getText().isEmpty() || workingfield.getText().isEmpty() || qualificationfield.getText().isEmpty() || performancefield.getText().isEmpty()){
                            JOptionPane.showMessageDialog(frame,"Enter All Values","Alert",JOptionPane.WARNING_MESSAGE);   
                        }else{
                            try{
                                int id = Integer.parseInt(idfield.getText());
                                String name = namefield.getText();
                                String address = addressfield.getText();
                                String wt = workingtypefield.getText();
                                String emp = employmentfield.getText();
                                int wh = Integer.parseInt(workingfield.getText());
                                double sal = Integer.parseInt(salaryfield.getText());
                                String spec = specializationfield.getText();
                                String qual = qualificationfield.getText();
                                int perf = Integer.parseInt(performancefield.getText());
                                
                                if(id > 999){
                                    JOptionPane.showMessageDialog(frame,"Input correct values for id","Error",JOptionPane.ERROR_MESSAGE);
                                }else if(perf < 5 || perf > 10){
                                    JOptionPane.showMessageDialog(frame,"Performance index should be between 5 and 10","Error",JOptionPane.ERROR_MESSAGE);
                                }else if(wh > 75){
                                    JOptionPane.showMessageDialog(frame,"Work hours must be below 75!","Error",JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                    if(Teacherlist.isEmpty()){
                                        Tutor tutorobj = new Tutor(id,name,address,wt,emp,wh,sal,spec,qual,perf);
                                        Teacherlist.add(tutorobj);
                                        JOptionPane.showMessageDialog(frame,"Tutor Added","Welcome",JOptionPane.INFORMATION_MESSAGE);
                                     }else{
                                        boolean dupli = false;
                                        for(Teacher teach : Teacherlist){
                                            if(teach.getTeacher_id() == id){
                                                dupli = true;
                                                break;
                                            }
                                        }
                                        if(dupli == false){
                                            Tutor tutorobj = new Tutor(id,name,address,wt,emp,wh,sal,spec,qual,perf);
                                            Teacherlist.add(tutorobj);
                                            JOptionPane.showMessageDialog(frame,"Tutor Added","Welcome",JOptionPane.INFORMATION_MESSAGE);
                                        }else{
                                            JOptionPane.showMessageDialog(frame,"Duplicate ID","ALERT",JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                }
                            }catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(frame,"Invalid Input for one of the following: \n Teacher Id, Working Hours, Salary or Performance Index","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
        });
            
        addLecturer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for adding a new lecturer.
                     * Checks for empty fields, validates inputs, shows what is wrong in a popup and adds a lecturer
                     * to the list of type teacher.
                     */
                    try{
                        if(idfield.getText().isEmpty() || namefield.getText().isEmpty() || addressfield.getText().isEmpty() || workingtypefield.getText().isEmpty() || employmentfield.getText().isEmpty()
                        || workingfield.getText().isEmpty() || departmentfield.getText().isEmpty() || expfield.getText().isEmpty() || scorefield.getText().isEmpty()){
                            JOptionPane.showMessageDialog(frame,"Enter All Values","Alert",JOptionPane.WARNING_MESSAGE);   
                        }else{
                            try{
                                int id = Integer.parseInt(idfield.getText());
                                String name = namefield.getText();
                                String address = addressfield.getText();
                                String wt = workingtypefield.getText();
                                String emp = employmentfield.getText();
                                String dep = departmentfield.getText();
                                int xp = Integer.parseInt(expfield.getText());
                                int wh = Integer.parseInt(workingfield.getText());
                                int score = Integer.parseInt(scorefield.getText());
                                if(id > 999){
                                    JOptionPane.showMessageDialog(frame,"ID must be three digits only!","Error",JOptionPane.ERROR_MESSAGE);
                                }else if(score > 100 || score < 0){
                                    JOptionPane.showMessageDialog(frame,"Score should be between 0 and 100","Error",JOptionPane.ERROR_MESSAGE);
                                }else if(xp > 70){
                                    JOptionPane.showMessageDialog(frame,"Years of experience cannot exceed 70!","Error",JOptionPane.ERROR_MESSAGE);
                                }else if(wh > 75){
                                    JOptionPane.showMessageDialog(frame,"Work hours must be below 75!","Error",JOptionPane.ERROR_MESSAGE);
                                }
                                else{
                                    if(Teacherlist.isEmpty()){
                                        Lecturer lecturerobj = new Lecturer(id,name,address,wt,emp,dep,xp,wh);
                                        lecturerobj.setGraded_score(score);
                                        Teacherlist.add(lecturerobj);
                                        JOptionPane.showMessageDialog(frame,"Lecturer Added","Welcome",JOptionPane.INFORMATION_MESSAGE);
                                    }else{
                                        boolean dupli = false;
                                        for(Teacher teach : Teacherlist){
                                            if(teach.getTeacher_id() == id){
                                                dupli = true;
                                                break;
                                            }
                                        }
                                        if(dupli == false){
                                            Lecturer lecturerobj = new Lecturer(id,name,address,wt,emp,dep,xp,wh);
                                            Teacherlist.add(lecturerobj);
                                            JOptionPane.showMessageDialog(frame,"Lecturer Added","Welcome",JOptionPane.INFORMATION_MESSAGE);
                                        }else{
                                            JOptionPane.showMessageDialog(frame,"Duplicate ID","ALERT",JOptionPane.WARNING_MESSAGE);
                                        }
                                    }
                                }
                            }catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(frame,"Invalid Input for one of the following: \n Teacher Id, Working Hours, Years of experience or Score","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
        });
        
        clearbtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Prompts a popup asking the user if they are sure if they want to clear all data or not,
                     * if yes, it clears all the present fields.
                     */
                    int confirm = JOptionPane.showConfirmDialog(frame,"Are you sure you want to clear all data?","Confirmation",JOptionPane.YES_NO_OPTION);
                    if(confirm == JOptionPane.YES_OPTION){
                        idfield.setText(null);
                        namefield.setText(null);
                        addressfield.setText(null);
                        workingtypefield.setText(null);
                        employmentfield.setText(null);
                        workingfield.setText(null);
                        departmentfield.setText(null);
                        salaryfield.setText(null);
                        specializationfield.setText(null);
                        expfield.setText(null);
                        qualificationfield.setText(null);
                        performancefield.setText(null);
                        scorefield.setText(null);
                    }
                }
        });
        
        gradebtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for grading an assignment.
                     * Validates input and grades the assignment based on the marking scheme.
                     */
                    try{
                        if(!Teacherlist.isEmpty()){
                            Teacher teach = Teacherlist.get(Teacherlist.size()-1);
                            if(teach instanceof Lecturer){
                                Lecturer lec = (Lecturer) teach;
                                int id = lec.getTeacher_id();
                                String name = lec.getTeacher_name();
                                String dep = departmentfield.getText();
                                System.out.println(dep);
                                String depart = lec.getDepartment();
                                System.out.println(depart);
                                int xp = lec.getYears_of_experience();
                                int score = Integer.parseInt(scorefield.getText());
                                int graded_score = lec.getGraded_score();
                                boolean isteacher = false;
                                String grade;
                                if(dep.equals(depart)){
                                    if(id > 999 || xp > 70){
                                        JOptionPane.showMessageDialog(frame,"Input correct values for id and years of experience","Error",JOptionPane.ERROR_MESSAGE);
                                    }
                                    else{
                                        if(teach.getTeacher_id() == id && teach instanceof Lecturer){
                                            lec.gradeAssignment(score, dep, xp);
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
                                            isteacher = true;
                                            JOptionPane.showMessageDialog(frame, "Your grade is: " + grade ,"Grading",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                    if(isteacher == false){
                                        JOptionPane.showMessageDialog(frame,"Teacher Not Found","ALERT",JOptionPane.WARNING_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(frame,"Different Departments","ALERT",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }else{
                        JOptionPane.showMessageDialog(null, "No Tutor added!");
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Check values for id, department, years of experience and score","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                }
        });
        
        salarybtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for updating a tutor's salary.
                     * Validates input and updates the salary if the tutor is found.
                     */
                    try{
                        int id = Integer.parseInt(idfield.getText());
                        int sal = Integer.parseInt(salaryfield.getText());
                        int perf = Integer.parseInt(performancefield.getText());
                        boolean isteacher = false;
                        if(id > 999){
                            JOptionPane.showMessageDialog(frame,"Input correct values for id and years of experience","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            for(Teacher teach: Teacherlist){
                                if(teach.getTeacher_id() == id && teach instanceof Tutor){
                                    Tutor tut = (Tutor) teach; 
                                    tut.setSalary(sal,perf);
                                    isteacher = true;
                                    JOptionPane.showMessageDialog(frame, "New salary is set" ,"Salary",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                        }
                        if(isteacher == false){
                            JOptionPane.showMessageDialog(frame,"Teacher Not Found","ALERT",JOptionPane.WARNING_MESSAGE);
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame,"Invalid input","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                }
        });

        lecdisplaybtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for displaying details of the last added lecturer.
                     * Retrieves and displays information about the lecturer added.
                     */
                    if(!Teacherlist.isEmpty()){
                        Teacher teach = Teacherlist.get(Teacherlist.size()-1);
                        if(teach instanceof Lecturer){
                            Lecturer lec = (Lecturer) teach;
                            int id = lec.getTeacher_id();
                            String name = lec.getTeacher_name();
                            String dep = lec.getDepartment();
                            int xp = lec.getYears_of_experience();
                            int graded_score = lec.getGraded_score();
                            String grade;
                            if(teach.getTeacher_id() == id && teach instanceof Lecturer){
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
                                String msg = "Teacher ID: " + id + "\n" + "Name: " + name + "\n" + "Deartment: " + dep + "\n" + 
                                                "Exerience: " + xp + "\n" + "Score: " + graded_score + "\n" + "Grade: " + grade + "\n";
                                JOptionPane.showMessageDialog(frame, msg ,"Grading",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
        });
        
        tutdisplaybtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * ActionListener for displaying details of the last added tutor.
                     * Retrieves and displays information about the tutor added.
                     */
                    if(!Teacherlist.isEmpty()){
                        Teacher teach = Teacherlist.get(Teacherlist.size() - 1);
                        if(teach instanceof Tutor){
                            Tutor tut = (Tutor) teach;
                            int id = tut.getTeacher_id();
                            String name = tut.getTeacher_name();
                            int perf = tut.getPerf_index();
                            double salar = tut.getSalary();
                            String msg = "Teacher ID: " + id + "\n" + "Name: " + name + "\n"
                                         + "Performance: " + perf + "\n" + "Your new salary is: " + salar;
                            JOptionPane.showMessageDialog(frame, msg ,"Setting Salary",JOptionPane.INFORMATION_MESSAGE);
                        
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No Tutor added!");
                    }
                }
        });

        removetutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    /*
                     * Prompts the user to ask for the the id of the tutor they want to remove.
                     * Iterates over the objects in the Teachelist and removes the tutor if found. 
                     */
                    try{
                        String idString = JOptionPane.showInputDialog(frame,"Enter tutor id you want to remove: ");
                        if(!idString.isEmpty()){
                            int tutorid = Integer.parseInt(idString);
                            
                            boolean noexist = false;
                            Iterator <Teacher> iterator = Teacherlist.iterator();
                            while(iterator.hasNext()){
                                Teacher teach = iterator.next();
                                if(teach instanceof Tutor && teach.getTeacher_id() == tutorid){
                                    iterator.remove();
                                    idfield.setText(null);
                                    namefield.setText(null);
                                    addressfield.setText(null);
                                    workingtypefield.setText(null);
                                    employmentfield.setText(null);
                                    workingfield.setText(null);
                                    departmentfield.setText(null);
                                    salaryfield.setText(null);
                                    specializationfield.setText(null);
                                    expfield.setText(null);
                                    qualificationfield.setText(null);
                                    performancefield.setText(null);
                                    scorefield.setText(null);
                                    noexist = true;
                                    break;
                                }
                            }
                            if(noexist){
                                JOptionPane.showMessageDialog(frame, "Tutor removed" ,null,JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(frame, "Tutor not found" ,"Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame, "Please input valid Teacher ID" ,"Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Invalid input" ,"Error",JOptionPane.ERROR_MESSAGE);
                        }
                }
        });
        
        back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    /*
                     * Goes back to the home screen from the two panels. 
                     */
                    tutorpanel.setVisible(false);
                    lecturerpanel.setVisible(false);
                    mainpanel.setVisible(true);
                }
        });
    }
    
    public static void main(String[] args){
        /*
         * Main method to initiate the gui
         */
        Teacher_GUI gui = new Teacher_GUI();
    }
}
