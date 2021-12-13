package Projects_04.example;

public class CostumerClass {

    String name;
    String electricityAccountname;

    public  void print(int num){
        ElectricityAccount electricityAccount = new ElectricityAccount();
        electricityAccount.totalWph=num;

        System.out.println("name = " + name + " electricityAccount = " + electricityAccountname + " bill = " + electricityAccount.calculate());

    }

}
