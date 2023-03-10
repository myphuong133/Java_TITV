package Java84_JTextField_Ex;

public class CalculatorModel {
    private double fistValue,secondValue,result;

    public CalculatorModel() {
        this.fistValue = 0;
        this.secondValue = 0;
        this.result = 0;
    }

    public double getFistValue() {
        return fistValue;
    }

    public void setFistValue(double fistValue) {
        this.fistValue = fistValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void sum(){
        this.result = this.fistValue + this.secondValue;
    }
    public void minus(){
        this.result = this.fistValue - this.secondValue;
    }
    public void multiply(){
        this.result = this.fistValue*this.secondValue;
    }
    public void divide(){
        this.result = this.fistValue/this.secondValue;
    }
    public void power(){
        this.result = Math.pow(this.fistValue,this.secondValue);
    }
    public void mod(){
        this.result = this.fistValue%this.secondValue;
    }



}
