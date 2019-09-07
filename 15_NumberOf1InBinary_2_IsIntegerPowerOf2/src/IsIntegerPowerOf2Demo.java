public class IsIntegerPowerOf2Demo {
    public boolean isIntegerPowerOf2(int n){
        if(n <= 0){
            System.out.println("Error: invalid input.");
            return false;
        }
        if(((n-1)&n) == 0){
            return true;
        }
        return false;
    }
}
