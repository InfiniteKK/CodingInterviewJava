public class FrogJumpDemo {
    public double frogJumpRecursion(int n){
        if(n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return 2*frogJumpRecursion(n-1);
    }

    public double frogJumpNonRecursion(int n){
        if(n <= 0){
            return 0;
        }else {
            return Math.pow(2, n - 1);
        }
    }
}
