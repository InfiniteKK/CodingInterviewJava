public class IsOddNumber implements IsOdd {
    public boolean check(int n){
        return (n & 0x1) == 0;
    }
}
