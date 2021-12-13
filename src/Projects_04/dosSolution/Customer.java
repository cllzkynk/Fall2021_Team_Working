package Projects_04.dosSolution;

public class Customer {

    String name;
    ElectricityAccount electricityAccount;

    public void consumeElectricity(double wph){
        electricityAccount.totalWph+=wph;
    }

}
