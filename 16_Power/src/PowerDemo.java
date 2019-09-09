import java.math.BigDecimal;

public class PowerDemo {
    boolean isInvalidInput = false;

    public double power(double base, int exponent) {

        if (exponent == 0) { // 0^0 = 0;
            return 1.0;
        }
        if ((new BigDecimal(String.valueOf(base))).compareTo(new BigDecimal("0.0")) == 0) {
            if (exponent < 0) {
                isInvalidInput = true;
                return 0.0;
            } else {
                return 0.0;
            }
        }
        if ((new BigDecimal(String.valueOf(base))).compareTo(new BigDecimal("1.0")) == 0) {
            return 1.0;
        }
        if ((new BigDecimal(String.valueOf(base))).compareTo(new BigDecimal("-1.0")) == 0) {
            if ((exponent & 0x1) == 1) {
                return -1.0;
            } else {
                return 1.0;
            }
        }
//        double result = powerWithUnsignedExponentSolution1(base, Math.abs(exponent));
        double result = powerWithUnsignedExponentSolution2(base, Math.abs(exponent));
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }

    private double powerWithUnsignedExponentSolution1(double base, int unsignedExponent) {
        double result = 1.0;
        for (int i = 1; i <= unsignedExponent; i++) {
            result *= base;
        }
        return result;
    }

    private double powerWithUnsignedExponentSolution2(double base, int unsignedExponent) {
        if (unsignedExponent == 1) {
            return base;
        }
        double result = powerWithUnsignedExponentSolution1(base, unsignedExponent >> 1);
        result *= result;
        if ((unsignedExponent & 0x1) == 1){
            result *= base;
        }
        return result;
    }
}
