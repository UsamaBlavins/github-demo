
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class ResponseMessage extends Message {
    public ResponseMessage(String line, ArrayList<Header> headers, JSONObject content) {
        super(line, headers, content);
    }
}
