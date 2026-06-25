interface Test{
    int square(int n);
}
class Arithmetic implements  Test{
    public int square(int n){
        return n*n;
    } 
    class ToTestInt{
     public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        System.out.println(a.square(5));
    }
}
}
