
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class MessageParser {
    public String encode(Message message) {
        String encodeString = "";
        encodeString += message.FirstLine();
        ArrayList<Header> headers = message.Headers();
        for (int i = 0; i < headers.size(); i++) {
            encodeString += (((headers.get(i)).Key()) + ": " + ((headers.get(i)).Value()) + "\n");
        }
        encodeString += "\n";
        encodeString += message.Body();
        return encodeString;
    }
    public Message decode(String messageString) {
        String firstLine = "";
        ArrayList<Header> headerList = new ArrayList<>();
        JSONObject body = new JSONObject();
        Message message = new Message(firstLine, headerList, body);
        return message;
    }
}
