class kili 
{
    public void display() 
    {
       System.out.println("Hello");
    }
}
 
 class anon 
 {
    public void create()
    {
       kili p1 = new kili() {
          public void display() 
          {
             System.out.println("Welcome");
          }
       };
       p1.display();
    }
 }
 
 class Main {
    public static void main(String[] args) {
        anon an = new anon();
        an.create();
    }
 }