class Outer {
    void display(){
        System.out.println("This is display() method of outer class");
    }
    class Inner{
        void display(){
            System.out.println("This is display() method of inner class");
        }
    }
}
public class Main{
        public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
        Outer.Inner i = obj.new Inner();
        i.display();

    }
}
