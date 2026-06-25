class Box {
    int length;
    int breadth;
    Box(int x , int y){
        this.length = x;
        this.breadth = y;
    }
    int area(){
        return length*breadth;
    }
}
class Box3D extends Box{
   int height;

    public Box3D(int x , int y , int z) {
        super(x, y);
        this.height = z;
    }
    int volume(){
        return length*breadth*height;
    }
}
public class Main{
    public static void main(String[] args) {
        Box3D b = new Box3D(10, 8, 12);
        System.out.println("Length : "+b.length);
        System.out.println("Breadth : "+b.breadth);
        System.out.println("Height : "+b.height);
        System.out.println("Area : "+ b.area());
        System.out.println("Volume : "+b.volume());
    }
}
