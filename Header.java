
public class Header {
    private static String key;
    private static String keyValue;
    public Header(String headerKey, String headerValue) {
        key = headerKey;
        keyValue = headerValue;
    }
    public static String Key() {
        return key;
    }
    public static String Value() {
        return keyValue;
    }
}
