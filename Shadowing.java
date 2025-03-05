public class Shadowing {
   static int x=10;
    public static void main(String[] args){
        System.out.println(x);
        int x=98;
        System.out.println(x);
        shadow();
    }
    static void shadow(){
        System.out.println(x);
    }
}
