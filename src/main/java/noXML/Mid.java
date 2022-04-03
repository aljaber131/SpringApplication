package noXML;

import noXML.Exam;
import org.springframework.beans.factory.annotation.Value;

public class Mid implements Exam {
    @Value("${my.user.email}")
    private String date;
    @Override
    public String result() {
        return "noXML.Mid Class";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
