package Variables;

public class P01 {
    int a = 10; //variable is 'a' defined in class block
    int b;

    {
      int a = 10; //variable is 'a', defined in block
        int v;
    }

    public static void main(String[] args) {
        int a = 10; //variable is 'a' defined in main block
        int b = 4;
    }
}
