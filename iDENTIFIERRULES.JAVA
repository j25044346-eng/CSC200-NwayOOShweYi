// Intentionally incorrect program to demonstrate invalid Java identifiers.
 //class switch{
class Switch{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	
    public static void start() { 
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {
     //int 2ndPlace= 2;
        int SecondPlace = 2;
    //int first name=10;
        int firstname = 10;
     //int price#=99;
        int price = 99;
        //int user-name=25;
		int username = 25;
		//int class= 1;
		int a = 1;
		//int double=3;
		int b = 3;

        int Score = 10;
        //System.out.prinln(score);
        System.out.println(Score);
		
		System.out.println("This program is executed after all errors are rectified.");

     //1start();
       start();
    }

}
