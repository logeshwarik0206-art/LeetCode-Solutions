class Solution {
    public int countDigitOne(int n) {
        int count = 0;

        for (long place = 1; place <= n; place *= 10) {
            long divisor = place * 10;
            long quotient = n / divisor;
            long remainder = n % divisor;

            count += quotient * place;

            if (remainder >= place) {
                count += Math.min(remainder - place + 1, place);
            }
        }

        return count;
    }
}