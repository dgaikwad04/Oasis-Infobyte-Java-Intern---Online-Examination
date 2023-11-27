import java.util.Scanner;
 public class Task4 {
 
    public static void main(String[] args){
        int ch =4;
        int choice;
        String name;
        int id=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter user name:");
        name=sc.next();
        System.out.print("Enter roll no:");
        id=sc.nextInt();
        int count=0;
        System.out.println("\t\tWelcome "+name+" to Oasis Online Examination");
do{
    System.out.println("1.Take Exam");
    System.out.println("2. View Marks");
    System.out.println("3. Exit");
    System.out.println("Enter your choice:");
    ch=sc.nextInt();
    if (ch==4) {
        System.out.println("Thank you for taking exam"); 
        break;      
    }
    switch (ch) {
        case 1:
         {
            System.out.println("Select programming language:");
            System.out.println("1. Html \n2. Java \n3.C++");
            System.out.println("Enter your choice:");
            int sub=sc.nextInt();
            System.out.println("There are 5 qestions in the examination");

            System.out.println("Each question consist of 4 option you have tochoose correct answer");
            if (sub==2) {
                count=0;
                System.out.println("Q.1. Java is developed by:");

                System.out.print("1. James Gosling \n2.Dennis Ritchie \n3.Steve Jobs \n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if (choice==1) {
                    ++count;
                }
                System.out.println("Q.2.Java is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.3.Java is:");
                System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==2)
                {
                    ++count;
                }
                  System.out.println("Q.4.Technical Name of Core Java is knon as:");
                System.out.println("1.JSE\n2.JEE\n3.J2SE\n4.J2EE");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.Java is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                
                  if(choice==3)
                {
                    ++count;
                }
                }
                else if(sub==1)
                {
                    count=0;
                    System.out.println("Q.1.Html is developed by:");
                
                System.out.println("1.Bjarne Strousrup\n2.Tim Berners-Lee\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==2)
                {
                    ++count;
                }
                System.out.println("Q.2.Html is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.3.Is there any need to change the web browsers to support HTML5?:");
                System.out.println("1.Chrome\n2.Firefox\n3.Opera\n4.All of the above");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==4)
                {
                    ++count;
                }
                  System.out.println("Q.4. Html is:");
                System.out.println("1.Hyper Text Markup Language\n2.Horizontal Text Markup Language\n3.Hyper Test Markup Language\n4.Hyper Text Makeup Language");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.What are some common lists that are used when designing a page:");
                System.out.println("1.Ordered List\n2.Unordered List\n3.Definition List \n4.All of the above");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   
                if(choice==4)
                {
                    ++count;
                }
                }
                else
                {
                    count=0;
                       System.out.println("Q.1.C++ is developed by:");
                
                System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q.2.C++ is:");
                System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q.3.C++ is:");
                System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.4. C++ is:");
                System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q.5.C++ is:");
                System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();   
                if(choice==1)
                {
                    ++count;
                }
                }
                
                
                break;
            }
            case 2:
            {
                System.out.println("Congrats  "+name+"  You scored "+count+" marks"+"out of 5");
            }
                    
        }
        
        
    }while(true);

}}

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           