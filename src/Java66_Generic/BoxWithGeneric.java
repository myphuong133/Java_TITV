package Java66_Generic;

public class BoxWithGeneric <Generic>{
    private Generic value;
    public BoxWithGeneric(Generic value){
        this.value = value;
    }

    public Generic getValue(){
        return value;
    }
    public void setValue(Generic value){
        this.value = value;
    }
}
