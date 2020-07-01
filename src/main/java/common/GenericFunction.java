package common;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.annotation.Nullable;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public final class GenericFunction {

    //<editor-fold desc="Check String isNullOrEmpty">
    /**
     * Check String is Empty or Null with whitespace.
     * @param str
     * @return true if empty or null
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    //</editor-fold>

    //<editor-fold desc="Get OS Name and Architecture">
    /**
     * Get OS Name and Architecture
     */
    public static String getOSNameAndArch(){
        String osname = System.getProperty("os.name");
        String osarchitecture = System.getProperty("os.arch").endsWith("64") ? "64 bit" : "32 bit";
        return osname.concat(" ").concat(osarchitecture);
    }
    //</editor-fold>

    //<editor-fold desc="getMessageBody">
    /**
     * Based on showMsgBody msgBodyContent content returned as HTML or parsed format.
     * @param objMsgBody
     * @param showMsgBody
     * @return msgBodyContent
     */
    public static String getMessageBody(Object objMsgBody, @Nullable String showMsgBody) {
        Document doc;
        String msgBodyContent;
        if (isNullOrEmpty(showMsgBody)) {
            msgBodyContent = objMsgBody.toString();
        }
        else {
            msgBodyContent = objMsgBody.toString();
            doc = Jsoup.parse(msgBodyContent);
            String str1 = Jsoup.clean(doc.html(), "", Whitelist.none().addTags("p"), new Document.OutputSettings().prettyPrint(true));
            String str2 = Jsoup.clean(str1, "", Whitelist.none(), new Document.OutputSettings().prettyPrint(false));
            msgBodyContent = Parser.unescapeEntities(str2, true);
        }
        return msgBodyContent;
    }
    //</editor-fold>
}
