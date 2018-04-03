
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class RequestMessage extends Message {
    public RequestMessage(String line, ArrayList<Header> headers, JSONObject content) {
        super(line, headers, content);
    }
}
