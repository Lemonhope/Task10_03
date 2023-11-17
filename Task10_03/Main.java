package Task10_03;

import java.lang.reflect.Method;

public class Main {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        Main myClass=new Main();
        Class<?> c=Main.class;
        try{
            Method m = c.getDeclaredMethod("mathSum", int.class, int.class);
            Math anno=m.getAnnotation(Math.class);
            myClass.mathSum(anno.num1(), anno.num2());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
