class First{
    int age;
    String name;
    First(int age, String name){
        this.age = age;
        this.name = name;
    }
    First(First obj){
        this.age = obj.age;
        this.name = obj.name;
    }
    public static void main(String[] args) {
        First f1 = new First(24,"Akash");
        First f2 = new First(f1);
        System.out.println(f1.age + " " + f1.name);
        System.out.println(f2.age + " " + f2.name);
    }
}