class Marks
{   
    /*These variables are instance variables.
    These variables are in a class and are not inside any function*/
    int sub1;
    int sub2;
    int sub3;
}
public class InstanceVariablesExample {
	
	public static void main(String args[])
    {   //first object
        Marks obj1 = new Marks();
        obj1.sub1 = 50;
        obj1.sub2 = 80;
        obj1.sub3 = 90;
 
        //second object
        Marks obj2 = new Marks();
        obj2.sub1 = 80;
        obj2.sub2 = 60;
        obj2.sub3 = 85;
 
        //displaying marks for first object
        System.out.println("Marks for first object:");
        System.out.println(obj1.sub1);
        System.out.println(obj1.sub2);
        System.out.println(obj1.sub3);
     
        //displaying marks for second object
        System.out.println("Marks for second object:");
        System.out.println(obj2.sub1);
        System.out.println(obj2.sub2);
        System.out.println(obj2.sub3);
    }

}
