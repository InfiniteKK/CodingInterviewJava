public class NumberOf1Demo {
    public int getNumberOf1(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
