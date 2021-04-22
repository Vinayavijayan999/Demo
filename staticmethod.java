class stacls{
    static int i = 100;
    static String s = "Birds will fly";
    static void display()
    {
       System.out.println("i:"+i);
       System.out.println("i:"+s);
    }
    void bbb()
    {
        display();
    }
    public static void main(String args[])
    {
        stacls obj = new stacls();
        obj.bbb();
        display();
     }
  }