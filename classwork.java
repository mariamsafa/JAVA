/* //Different types of Constructors
class Box 
{
    double width,height,depth;
    Box()
    {
        System.out.println("Default");
        width=2;
        height=3;
        depth=4;
    }
    Box(double width,double height,double depth)
    {
        System.out.println("Parameterized");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box p)
    {
        System.out.println("Copy");
        width = p.width;
        height = p.height;
        depth = p.depth;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class BoxDemo
{
    public static void main(String [] args)
    {
        Box b1 = new Box();
        Box b2 = new Box(10,10,20);
        Box b3 = new Box(b1);
        Box b4 = b3; //reference of b3 assigned to b4
        double v = b4.volume();
        System.out.println(v);
    }
}

// Method Overloading 
class Test 
{
    void check()
    {
        System.out.println("No parameter");
    }
    void check(int i)
    {
        System.out.println("i: "+i);
    }
    void check(int i,int j)
   {
       System.out.println("i and j: "+i+" "+j);
   }
   double check(double i)
   {
       System.out.println("i is: "+i);
       return i*i;
   }
}
class TestDemo
{
    public static void main(String [] args)
    {
       Test ob1 = new Test();
       ob1.check();
       ob1.check(10);
       ob1.check(10,20);
       double p = ob1.check(6.4);
       System.out.println(p);
    }
}

//passing object as parameter
class Test 
{
   int a,b;
   Test(int a,int b)
   {
       this.a=a;
       this.b=b;
   }
   boolean equals(Test p) //passing object as parameter
   {
       if(a==p.a && b==p.b)
       return true;
       return false;
   }
}
class TestDemo
{
    public static void main(String [] args)
    {
       Test ob1 = new Test(10,20);
       Test ob2 = new Test(10,20);
       Test ob3 = new Test(3,4);
       System.out.println("ob1 and ob2: "+ob1.equals(ob2));
       System.out.println("ob1 and ob3: "+ob1.equals(ob3));
    }
}
class Sum
{
   int value;
   Sum(int value)
   {
       this.value=value;
   }
   void add(Sum a) //passing object as parameter
   {
      value=value+a.value;
      System.out.println(value);
   }
   void add(int p) //passing integer variable as parameter
   {
       value = value+p;
       System.out.println(value);
   }
   
}
class SumDemo
{
    public static void main(String [] args)
    {
      Sum s1 = new Sum(10);
      Sum s2 = new Sum(20);
      s1.add(s2);
      s2.add(7);
    }
}

//class Sum
{
   int value;
   Sum()
   {
       value = 5;
   }
   Sum(int value)
   {
       this.value=value;
   }
   Sum add(Sum a) //returning object
   {
      Sum temp = new Sum();
      temp.value=value+a.value;
      return temp;
   }
   Sum add(int p) //returning object
   {
       Sum temp = new Sum();
       temp.value = value+p;
       return temp;
   }
   void display()
   {
       System.out.println("Value: "+value);
   }
   
}
class BoxDemo
{
    public static void main(String [] args)
    {
      Sum s1 = new Sum(10);
      Sum s2 = new Sum(20);
      s1 = s1.add(s2);
      s1.display();
      //System.out.println(s1); //check this
      s2 = s2.add(7);
      s2.display();
    }
} */