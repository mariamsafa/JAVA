class Box
{
    private double length,width;
    Box()
    {
        length = 2;
        width = 4;
        System.out.println("length and width: "+length+" "+width);
    }
    Box(double l,double w)
    {
        length = l;
        width = w;
        System.out.println("length and width: "+length+" "+width);
    }
    Box(Box b)
    {
        length = b.length;
        width = b.width;
        System.out.println("length and width: "+length+" "+width);
    }
    
}
class Boxweight extends Box
{
    private double weight;
    Boxweight()
    {
        super();
        weight = 5;
        System.out.println("weight: "+weight);
    }
    Boxweight(double l,double w,double h)
    {
        super(l,w);
        weight = h;
        System.out.println("weight: "+weight);
    }
    Boxweight(Boxweight b)
    {
        super(b);
        weight = b.weight;
        System.out.println("weight: "+weight);
    }
    
}
class Boxcolor extends Boxweight
{
    private String color;
    Boxcolor()
    {
        super();
        color = "red";
        System.out.println("color: "+color);
    }
    Boxcolor(double l,double w,double h,String p)
    {
        super(l,w,h);
        color = p;
        System.out.println("color: "+color);
    }
    Boxcolor(Boxcolor c)
    {
        super(c);
        color = c.color;
        System.out.println("color: "+color);
    }
}
class superj {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10,20);
        Box b3 = new Box(b1);
        
        Boxweight w1 = new Boxweight();
        Boxweight w2 = new Boxweight(10,20,30);
        Boxweight w3 = new Boxweight(w1);
        
        Boxcolor c1 = new Boxcolor();
        Boxcolor c2 = new Boxcolor(10,20,30,"Blue");
        Boxcolor c3 = new Boxcolor(c1);
       
        
    }
}
