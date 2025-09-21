class Demo
{
public int val;
public void get(Demo d)
{
d.val++;
}
}
public class Test1
{
public static void main(String[] args)
{
Demo d = new Demo();
d.val = 1;
d.get(d);
System.out.println(d.val);
}
}