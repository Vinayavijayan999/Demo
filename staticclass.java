class stat{
    private static String str = "Life is beautiful";
    static class statcls{
     public void disp() 
    {
        System.out.println(str); 
    }
 
    }
    public static void main(String args[])
    {
     stat.statcls obj = new stat.statcls();
     obj.disp();
    }
 }