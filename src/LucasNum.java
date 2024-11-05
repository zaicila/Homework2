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

    public static int aliciaNum(int n){
        if (n == 0) {
            return 6;
        }

        if (n == 1) {
            return 4;
        }
        return aliciaNum(n - 2) - aliciaNum(n - 1);
    }
}
