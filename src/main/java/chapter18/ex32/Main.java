package chapter18.ex32;

import chapter18.io.TextFile;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pyvov on 23.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        String fileName = "src/main/java/chapter18/ex32/1.txt";
        for (String s : new TextFile(fileName, "\\W+")) {
           Integer value = map.get(s);
           map.put(s, value != null ? value + 1 : 1);
        }
        Element root = new Element("words");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Element word = new Element("word");
            Element text = new Element("text");
            text.appendChild(entry.getKey());
            Element count = new Element("count");
            count.appendChild(String.valueOf(entry.getValue()));
            word.appendChild(text);
            word.appendChild(count);
            root.appendChild(word);
        }
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/main/java/chapter18/ex32/1.xml"));
        Document document = new Document(root);
        Serializer serializer = new Serializer(out, "ISO-8859-1");
        serializer.write(document);
        serializer.flush();
    }

}
