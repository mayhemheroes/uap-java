import ua_parser.Parser;
import ua_parser.Client;

public class UAPFuzz {
    private static Parser uaParser;

    public static void fuzzerInitialize() {
        uaParser = new Parser();
    }

    public static void fuzzerTestOneInput(byte[] data) {
        String input = new String(data);
        Client c = uaParser.parse(input);
    }
}