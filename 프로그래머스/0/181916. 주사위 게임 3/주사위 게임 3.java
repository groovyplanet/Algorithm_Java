class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};

        int p = 0;
        int q = 0;
        int z = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 4) {
                return 1111 * arr[i];
            } else if (cnt == 3) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != arr[i]) {
                        q = arr[j];
                    }
                }
                return (10 * arr[i] + q) * (10 * arr[i] + q);
            } else if (cnt == 2) {
                z++;
                if (p == 0) {
                    p = arr[i];
                } else if (p != arr[i]) {
                    q = arr[i];
                }
            }
        }

        if (z == 4) {
            return (p + q) * Math.abs(p - q);
        } else if (z == 2) {
            int r = 0, s = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != p && arr[i] != q) {
                    if (r == 0) {
                        r = arr[i];
                    } else {
                        s = arr[i];
                    }
                }
            }
            return r * s;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
