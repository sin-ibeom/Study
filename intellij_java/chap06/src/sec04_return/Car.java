package sec04_return;

public class Car {

    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(this.gas == 0){
            System.out.println("Gas is empty");
            return false;
        } else{
            System.out.println("Gas is left");
            return true;
        }
    }

}
