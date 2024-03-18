package part3;

public class Human {
    private int age;
    private int height;
    private int money;

    public Human(int age, int height, int money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getMoney(){
        return this.money;
    }
    public void giveMoney(int sum, Human human2) throws Exception {
        if(sum > this.money)
            throw new Exception("Too low money");
        else {
            this.money -= sum;
            human2.money += sum;
        }
    }

    public void cry(String Vople) throws Exception{
        if(Vople.matches("^[A-Z]*$"))
            System.out.println(Vople);
        else
            throw new Exception("It's not a cry");
    }
}
