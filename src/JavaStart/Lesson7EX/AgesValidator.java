package JavaStart.Lesson7EX;

public class AgesValidator {
    public static void main(String[] args) {
        int [] ages = {30, -15, 10};
        System.out.println(isAges(ages));
    }

    public static boolean isAges(int ages []){
        boolean itAges = true;
        for (int i = 0; i < ages.length; i++){
            if(0<ages[i] && ages[i]<121){
               itAges = true;
            }else if(ages[i]<=0 || ages[i]>=121){
                itAges = false;
                break;
            }
        }
        return itAges;
    }
}
