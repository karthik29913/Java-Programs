
class Box
{
public static void main(String[] args)
{
Box b1 =new Box();
System.out.println("volume : "+b1.vol(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Double.parseDouble(args[2])));
}
Double vol(int l, int b, double d)
{
Double res=l*b*d;
return res;
}
}

