package com.example.simpleboot.Service;

import com.example.simpleboot.Model.MobileBot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class ImageService {



    MobileBot mobileBot = new MobileBot();
    String[] supported_extensions = new String[]{"jpg", "png", "gif"};

    String path = "D:\\images";


    //Mapping between image size and pixels needed. Don't ask me how did I get these values! ;)
    HashMap<Integer, Integer> jpgHashmap = new HashMap<Integer, Integer>() {
        {
            put(100, 290);
            put(200, 415);
            put(500, 660);
            put(1000, 935);
            put(2000, 1325);
            put(3000, 1625);
            put(4000, 1880);
            put(5000, 2100);
            put(10000, 2970);
            put(20000, 4205);
        }
    };

    //Mapping between image size and pixels needed. Don't ask me how did I get these values! ;)
    HashMap<Integer, Integer> pngHashmap = new HashMap<Integer, Integer>() {
        {
            put(100, 160);
            put(200, 225);
            put(500, 355);
            put(1000, 505);
            put(2000, 705);
            put(3000, 875);
            put(4000, 1015);
            put(5000, 1135);
            put(10000, 1595);
            put(20000, 2265);
        }
    };

    int width = 1000;
    int height = 1000;

//    public static void drawer(int x, int y, int end_x, int end_y){
//        int width = 1000;
//        int height = 1000;
//        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g = img.createGraphics();
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.setStroke(new BasicStroke(50));
//        g2D.drawRect(x, y, end_x, end_y);
//    }

    public long generateImage(String path_name, int x, int y, int end_x, int end_y) {
        Random rand = new Random();
        String extension = supported_extensions[rand.nextInt(supported_extensions.length)];

        long timeTracker = System.currentTimeMillis();

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        File f = null;

//        Graphics2D g = img.createGraphics();
//
//        Graphics2D g2D = (Graphics2D) g;
//
//        g2D.setStroke(new BasicStroke(50));
//        g2D.drawRect(1, 1, 1100, 1100);

        int width = 1000;
        int height = 1000;
        Graphics2D g = img.createGraphics();
        Graphics2D g2D = (Graphics2D) g;
        g2D.setStroke(new BasicStroke(50));
        g2D.drawRect(x, y, end_x, end_y);



        try {
            if (!(new File(path_name).exists())) {
                new File(path_name).mkdir();
            }

            f = new File(path_name + File.separator
                    + generateName() + "." + extension);
            ImageIO.write(img, extension, f);

            display("Generated file: " + f.getAbsolutePath() + ""
                    + "\nSize (bytes): " + f.length() + "\tTime (secs): " + (System.currentTimeMillis() - timeTracker)/1000 + "\tDimensions: " + height + " x " + width );

            dimensionEngine(width, height, f.length());

            return f.length();
        } catch (IOException e) {
            display("Error while writing to file: " + e, true);
            return -1;
        }
    }


    int jumpInPixels[] = new int[] {100, 50, 25, 10, 5};

    public void dimensionEngine(int widthIn, int heightEngineIn, long sizeInBytes) {
        //Not implemented
    }

    //Always generate unique name
    private Set<String> identifiers = new HashSet<>();

    public String generateName() {
        String imageName = "roadimg";
        return imageName;
    }

    private void display(String msg) {
        System.out.println(msg);
    }

    private void display(String msg, boolean exit) {
        System.out.println(msg);
        if (exit) {
            System.exit(0);
        }
    }



}
