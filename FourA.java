 class One {
    void display(){
        System.out.println("this method is Used to display");
    }
}
class Two extends One {
    void print(){
        System.out.println("this method is used to print");
    }
}
class FourA{
    public static void main(String[] args) {
        // access with one class to another
        Two obj = new Two();
        obj.display();
        obj.print();
    }
}
