package com.bytelegend;

public class Main {
    public static byte int2byte(int i) {
        return (byte)(i & 0xFF);;
    }

    public static short int2short(int i) {
        return (short)i;
    }

    public static char int2char(int i) {
        return (char) (i+'0');
    }

    // Cast an int to String, e.g. 123 -> "123"
    public static String int2String(int i) {
        return String.valueOf(i);
    }

    // Cast a String to int, e.g. "123" -> 123
    public static int string2int(String s) {
        return Integer.valueOf(s).intValue();;
    }

    // Cast a String to double, e.g. "1.23" -> 1.23
    public static double string2double(String s) {
        return Double.parseDouble(s);
    }

    public static int castLong2int(Long l) {
        return Integer.parseInt(l.toSring());
    }

    public static long double2Long(Double d) {
        return Double(d).longValue();;
    }
}
