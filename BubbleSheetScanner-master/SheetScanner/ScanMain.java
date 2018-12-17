package SheetScanner;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import java.io.File;
import java.util.ArrayList;
import static SheetScanner.Util.*;

public class ScanMain {

    static {

        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) throws Exception {

//        Mat source = Imgcodecs.imread(getInput("ex_1.jpg"));
//        findQuad.Quadrilateral quad = findQuad.findDocument(source);
//        findQuad.setTrans(quad, findQuad.mark4Point(source, quad.points));
//        String[] Answers = findQuad.findBubble(quad);
//        System.out.println("finished");
    }
    public String[] validate(File file){
        Mat source = Imgcodecs.imread(file.getAbsolutePath());
        ArrayList<String> ans = new ArrayList<>();
        findQuad.Quadrilateral quad = findQuad.findDocument(source);
        findQuad.setTrans(quad, findQuad.mark4Point(source, quad.points));
        String[] Answers = findQuad.findBubble(quad);
        System.out.println("finished");
        return Answers;
    }
}
