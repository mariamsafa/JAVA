 class tos {
    int w,h,d;

     tos(int w,int h,int d) {
        this.h=h;
        this.d=d;
        this.w=w;
    }


    public String toString() {
        return "Dimentions are " + w + " by " + d + " by " + h;
    }

   
}

public class tostringg{
    public static void main(String[] args) {
        tos b = new tos(12,45, 30);
        String s= "BOX " +b;
        System.out.println(b);
        System.out.println(b.toString()); 
        System.out.println(s); 
    }
}