class Num{
    int n=77;
    void shownum()
    {
        System.out.println("Integer: "+n);
    }
}
class OctNum extends Num{
    void shownum()
    {
        super.shownum();
        System.out.println("It's Octal Equivalent: "+Integer.toOctalString(n));
    }
}
class Base_Change{
    public static void main(String args[])
    {
        OctNum ob=new OctNum();
        ob.shownum();
    }
}
