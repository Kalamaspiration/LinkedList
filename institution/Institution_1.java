
package institution;

import java.util.Scanner;


public class Institution {

    private static void nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
      String Institutionname = "Karunya University";
    
    
    class Student
    {
        String StudentName;
        
        int rollno;
        
        int[] marks;
        
        float average;
        
        char grade;
        
        
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Institution i = new Institution();
        
        System.out.println("Enter the No of Students ");
        
        int s = sc.nextInt();
        
        Institution.Student[] Students = new Institution.Student[s];
        
        int count =0;
        
        boolean system = true;
        
        do 
        {
            System.out.println("=================================================================");
            
            System.out.println("--------------------Student Management System---------------------------------------");
            
            System.out.println("MENU DRIVEN");
            
            System.out.println("1. ADD STUDENT");
            
            System.out.println("2. ADD MARKS ");
            
            System.out.println("3.CALCULATE GRADE ");
            
            System.out.println("4.Display Student Details");
            
            System.out.println("5. EXIT");
            
            int choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 1 -> {
          
                    System.out.println("Enter the Roll No ");
                    
                    int rollno = sc.nextInt();
                    
                    nextLine();
                    
                    System.out.println("Enter the Name ");
                    
                    String name = sc.nextLine();
                    
                    System.out.println("Enter the  No of Subjects");
                    
                    int sub = sc.nextInt();
                    
                    Institution.Student m = i.new  Student();
                    
                    m.StudentName=name;
                    
                    m.rollno=rollno;
                    
                    m.marks = new int[sub];
                    
                    Students[count]=m;
                    
                    count++;
                    
                    System.out.println("Student Added SuccessFully");
                    
                    
                    
                }
                
                
                
                case 2 -> {
                    
                    System.out.println("Enter the roll no to add marks");
                    
                    int r = sc.nextInt();
                    
                    for(int j=0; j<count; j++)
                    {
                        
                        if(Students[j].rollno==r)
                        {
                            
                            for(int k =0;k<Students[k].marks.length;k++)
                            {
                                
                                System.out.println("Enter marks for subjects" + (k+1)+ " :");
                                
                                Students[j].marks[k]=sc.nextInt();
                                
                                
                                
                            }
                            
                            System.out.println("Marks Added SuccessFully");
                            
                            break;
                            
                            
                        }
                        
                        
                        
                    }
            }
                
                
                case 3 -> {
                    
                            System.out.println("Enter roll no to calculate grade ");
                            
                            int grade = sc.nextInt();
                            
                            for(int l=0;l<count;l++)
                                
                            {
                                if(Students[l].rollno==grade)
                                    
                                {
                                    
                                    int total =0;
                                    
                                    for(int m =0;m<Students[l].marks.length;m++)
                                    {
                                        
                                        total+=Students[l].marks[m];
                                        
                                        
                                    }
                                    
                                    Students[l].average = total/Students[l].marks.length;
                                    
                                    
                                    if(Students[l].average>=90)
                                        
                                    {
                                        
                                        System.out.println(Students[l].grade = 'A');
                                        
                                        
                                    }
                                    
                                    
                                    else if(Students[l].average>=75)
                                        
                                    {
                                        
                                        System.out.println(Students[l].grade='B');
                                        
                                    }
                                    
                                    else if(Students[l].average>=50)
                                    {
                                        
                                        System.out.println(Students[l].grade='C');
                                    }
                                    
                                    else
                                    {
                                        
                                        System.out.println(Students[l].grade='E');
                                    }
                                    
                                    System.out.println("GRADE CALCULATED "  + Students[l].grade);
                                    
                                    break;
                                }
                            }
                    
                }
                
                
                case 4 -> {
                    
                    System.out.println("Enter the Roll No to Display ");
                    
                    int display = sc.nextInt();
                    
                    for(int x =0;x<count;x++)
                        
                    {
                        
                        if(Students[x].rollno==display)
                            
                        {
                            
                            System.out.println("Student Details..");
                            
                            System.out.println("Institution Name"+i.Institutionname );
                            
                            System.out.println("ROLL NO "  + Students[x].rollno);
                            
                            System.out.println("Name "  + Students[x].StudentName);
                            
                            System.out.println("Marks ");
                            
                            for(int y=0;y<Students[y].marks.length;y++)
                            {
                                
                                System.out.println(Students[x].marks[x]);
                                
                                System.out.println("Average" + Students[x].average);
                                
                                System.out.println("Grade" + Students[x].grade);
                                
                                break;
                            }
                        }
                    }
                    
                    
                    
                    
                }
                
                
                
                case 5 ->                 {
                    
                    system = false;
                    
                    
                    
                    System.out.println("EXIT");
                    
                    
                    
                }
                
                
                default -> {
                    
                    System.out.println("Invalid Choice");
                }
                
                
            }
            
        }while(system);
        
    }
    
    
}
