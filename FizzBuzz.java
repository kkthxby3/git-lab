public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) 
        {
        	if (i%3==0)
        		for (int i=0; i<2; i++)
        			System.out.println(i);
            System.out.println(i);
            
            if( i % 5 == 0)
                System.out.println("Buzz");
       
    }
}