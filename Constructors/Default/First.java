//Class
class First {
    String cName , sName;
    int cCode , rollNo;
  //Constructor
    First() {
        cName = "TBC";
        sName = "AKASH";
        cCode = 101;
        rollNo = 13;
    }
    //Method
    void display(){
        System.out.println("College Name: "+cName);
        System.out.println("Student Name: "+sName);
        System.out.println("College Code: "+cCode);
        System.out.println("Roll No: "+rollNo);
    }
    //Main method
    public static void main(String[] args) {
        First obj = new First();
        obj.display();
        
    }
}