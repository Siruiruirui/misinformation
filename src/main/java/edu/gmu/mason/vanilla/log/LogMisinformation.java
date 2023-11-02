//package edu.gmu.mason.vanilla.log;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//
//public class LogMisinformation {
//    public static void record(String str) throws IOException {
//        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/Misinformation.txt", true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//            p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//
//    public static void recordSpread(String str) throws IOException {
//        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/misinformation/misinformation_edges.txt", true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//             p.print(str+"\n");
//
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//    public static void recordCurve(String str) throws IOException {
//        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/MisinformationCurve.txt", true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//            p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//    public static void recordSocialNetwork(String str) throws IOException {
//        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/misinformation/complete_social_network_edges.txt", true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//             p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//    public static void recordObservedSocialNetwork(String str) throws IOException {
//        String filePath = "/Users/tt/Documents/pol-master/logs/misinformation/observed_social_network_edges.txt";
//
//        try (FileWriter f = new FileWriter(filePath, true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//            p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//    public static void recordCoLocationNetwork(String str) throws IOException {
//        String filePath = "/Users/tt/Documents/pol-master/logs/misinformation/complete_colocation_network_edges.txt";
//
//        try (FileWriter f = new FileWriter(filePath, true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//            p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//    public static void recordObservedCoLocationNetwork(String str) throws IOException {
//        String filePath = "/Users/tt/Documents/pol-master/logs/misinformation/observed_colocation_network_edges.txt";
//
//        try (FileWriter f = new FileWriter(filePath, true);
//             BufferedWriter b = new BufferedWriter(f);
//             PrintWriter p = new PrintWriter(b);) {
//            p.println(str);
//        }
//        catch (IOException i) { i.printStackTrace(); }
//
//    }
//
//}

package edu.gmu.mason.vanilla.log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class LogMisinformation {
    public static void record(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        try (FileWriter f = new FileWriter(currentDirectory + "/logs/Misinformation.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }


    public static void recordSpread(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        try (FileWriter f = new FileWriter(currentDirectory + "/logs/misinformation/misinformation_edges.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.print(str+"\n");

        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordCurve(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        try (FileWriter f = new FileWriter(currentDirectory + "/logs/MisinformationCurve.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordSocialNetwork(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        try (FileWriter f = new FileWriter(currentDirectory + "/logs/misinformation/complete_social_network_edges.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordObservedSocialNetwork(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "/logs/misinformation/observed_social_network_edges.txt";

        try (FileWriter f = new FileWriter(filePath, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordCoLocationNetwork(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "/logs/misinformation/complete_colocation_network_edges.txt";

        try (FileWriter f = new FileWriter(filePath, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordObservedCoLocationNetwork(String str) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + "/logs/misinformation/observed_colocation_network_edges.txt";

        try (FileWriter f = new FileWriter(filePath, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

}

