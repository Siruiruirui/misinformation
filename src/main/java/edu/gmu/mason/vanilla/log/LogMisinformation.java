package edu.gmu.mason.vanilla.log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogMisinformation {
    public static void record(String str) throws IOException {
        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/Misinformation.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }


    public static void recordGraph(String str) throws IOException {
        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/MisinformationGraph.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.print("( "+str+"),");
        }
        catch (IOException i) { i.printStackTrace(); }

    }

    public static void recordCurve(String str) throws IOException {
        try (FileWriter f = new FileWriter("/Users/tt/Documents/pol-master/logs/MisinformationCurve.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(str);
        }
        catch (IOException i) { i.printStackTrace(); }

    }

}
