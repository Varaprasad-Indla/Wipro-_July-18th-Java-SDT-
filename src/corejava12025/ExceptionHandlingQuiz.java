package corejava12025;

public class ExceptionHandlingQuiz {

	public static void main(String[] args) {
		//1st code
		try
		
        {
            System.out.println("Try Block");
        }
        
        catch (Exception e) 
        {
        	System.out.println("Catch Block");
        }
            System.out.println("-----");
         //2nd code
         int i = 1;
         try
         {
         i++;
         }
         catch (Exception e) 
         {
         i++;
         }
         finally
         {
         i++;
         }
         System.out.println(i);
         //3rd code
         try
         {
        	 System.out.println(1);
             int i1 = 100 / 0;
           
             System.out.println(2);
         }
         catch (Exception e) 
         {
             System.out.println(3);
         }
         try
         {
        	 int i2 = 10;
             System.out.println(1);
         }
         catch (Exception e) 
         {
             System.out.println(2);
         }
         finally
         {
             System.out.println(3);
             System.out.println(4);
         }
         
         System.out.println(1);
         try
         {
             System.out.println(2);
             int i3 = Integer.parseInt("ABC");
             System.out.println(i3);
         }
         catch (Exception e) 
         {
             System.out.println(4);
         }
         finally
         {
             System.out.println(5);
         }
         System.out.println(6);
     }
 
     }

     

 

