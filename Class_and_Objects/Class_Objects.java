package Class_and_Objects;
class calc{
    int a;
    public int add(int num1, int num2){
        int r = num1 + num2;
        return r;
    }
}

public class Class_Objects {
    static calc cal = new calc();
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        // System.out.println(num1 + num2);
        int res = cal.add(num1, num2);
        System.out.println(res);
    }
    
}
