
class First
{
    int a;   //Instance Variables
    String b;
    First(int x, int y)  //Parameterized Constructor
    {
        a = x;
        b = Integer.toString(y);
    }
    First(int x, String y)  //Parameterized Constructor
    {
        a = x;
        b = y;
    }
    void sum()
    {
        System.out.println("sum of a + b = " + (a+b));
        
    }
}
class B
{
    public static void main(String[] args)
    {
        First obj = new First(10, 20);
        obj.sum();
    }
}