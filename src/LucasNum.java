public class LucasNum {
    public static int lucasNum(int n) {
        // hard code case for 0 and 1
        if (n == 0) {
            return 2;
        }
        if (n == 1) {
            return 1;
        }
        // recurse
        return lucasNum(n - 1) + lucasNum(n - 2);
    }
}
