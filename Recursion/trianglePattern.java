public class trianglePattern {
    public static void main(String[] args) {
triangle(4, 0);  
  }
    static void triangle(int row,int col){
        if (row==0) {
            return;
        }
        if (row>col) {
            System.out.print("*");
            triangle(row, col+1);
        }
        else
        {
            System.out.println();
            triangle( row-1,0);
        }
    }
}
