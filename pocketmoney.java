class A
{
int money;
private int pocketMoney;
void fill (int money, int pocketMoney)
{
this.money = money;
this.pocketMoney = pocketMoney;
}
int getpocketmoney()
{
return pocketMoney;
}
}
class B extends A
{
int total;
void sum()
{
total = money + getpocketmoney();
}
public static void main(String args[])
{
sum();
}
}