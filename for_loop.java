public class for_loop{
    public static void main(String[] args) {
        int i=0;
         do{
            if (i==5)
            {
                System.out.println("hello world prog end ");
                i++;
                break;
            }
            System.out.println(i);
            i++;

         }
        while(i<=10);
    }
}