
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class Message {
    private static String firstLine;
    private ArrayList<Header> headerList;
    private JSONObject body;
    public Message(String line, ArrayList<Header> headers, JSONObject content) {
        firstLine = line;
        headerList = headers;
        body = content;
    }
    public static String FirstLine() {
        return firstLine;
    }
    public ArrayList<Header> Headers() {
        return headerList;
    }
    public JSONObject Body() {
        return body;
    }
}

