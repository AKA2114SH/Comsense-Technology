package Abstraction;

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();  
        obj.education();
        obj.job();

        
        Child childObj = (Child) obj;
        childObj.business();
    }
}
