class First
{
    int a, b;   //Instance Variables
    First(int x, int y)  //Parameterized Constructor
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