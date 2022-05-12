import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        // a-c 0-2

        String[] possible = {"a", "b", "0", "1"};

        String passcode = "0b";

        for (int i = 0; i < possible.length; ++i) { // an extra value to the comination
            for (int j = 0; j < possible.length; ++j) {
                String tmp = possible[i] + possible[j];
                if (passcode.equals(tmp)) {
                    System.out.println(tmp);
                }
            }
        }
    }
}


/*
import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        // a-c 0-2

        String[] possible = {"a", "b", "0", "1"};

        String passcode = "0b";

        //String[] combos = new String[possible.length*possible.length];

        int size = 0;

        for (int i = 0; i < possible.length; ++i) { // an extra value to the comination
            for (int j = 0; j < possible.length; ++j) {
                ++size;
            }
        }

        String[] combos = new String[size];

        int itr = 0;

        for (int i = 0; i < possible.length; ++i) { // an extra value to the comination
            for (int j = 0; j < possible.length; ++j) {
                combos[itr++] = possible[i] + possible[j];
            }
        }

        System.out.println(Arrays.toString(combos));
    }
}

 */