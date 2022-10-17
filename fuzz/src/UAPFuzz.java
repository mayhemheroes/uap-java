import ua_parser.Parser;
import ua_parser.Client;

public class UAPFuzz {
    public static void fuzzerInitialize() {

    }

    public static void fuzzerTestOneInput(byte[] data) {
        String input = new String(data);
        Parser uaParser = new Parser();
        Client c = uaParser.parse(input);
    }
}