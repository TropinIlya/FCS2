import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "fighter")
public class fighter {
    public String type;
    public String serial_number;
    public int id;
    public String text;
}