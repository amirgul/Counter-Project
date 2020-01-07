import java.util.Scanner;

public class Counter
{
    private int count;
    private int value;
    Scanner keyboard = new Scanner(System.in);
    public void addingItems()
    {
        System.out.println("enter a value");
        value = keyboard.nextInt();
        while (value > 0)
        {
            count++;
            System.out.println("please enter another value");
            value = keyboard.nextInt();
        }
        System.out.println("current value of counter is: "+ count);
    }
    public void resetCountToZero()
    {
        count = 0;
    }
    public void incrementByOneCount()
    {
        count++;
        System.out.println("after increading counter: "+ count);
    }
    public void decreseCounterByOne()
    {
        if(count >0)
        {
            count--;
            System.out.println("after deducting 1 counter is: "+ count);
        }
        else
            System.out.println("counter: " +count +" can't be decreased");
    }
    public void currentCounter()
    {
        System.out.println("this method to display current counter value");
        System.out.println("Counter: "+ count);
    }
    public int getCount()
    {
        return count;
    }
}
