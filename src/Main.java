import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        AlgorithmComparator algorithmComparator = new AlgorithmComparator();
        FileWriter fw = new FileWriter("Input and output/stats.txt");
        FileReader fr1 = new FileReader("Input and output/input1.txt");
        FileReader fr2 = new FileReader("Input and output/input2.txt");
        FileReader fr3 = new FileReader("Input and output/input3.txt");
        FileReader fr4 = new FileReader("Input and output/input4.txt");
        Scanner scanner1 = new Scanner(fr1);
        Scanner scanner2 = new Scanner(fr2);
        Scanner scanner3 = new Scanner(fr3);
        Scanner scanner4 = new Scanner(fr4);
        String text1;
        String text2;
        String text3;
        String text4;
        StringBuilder sb1 = new StringBuilder();
        for (;scanner1.hasNext();){
            sb1.append(scanner1.next());
        }
        text1 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        for (;scanner2.hasNext();){
            sb2.append(scanner2.next());
        }
        text2 = sb2.toString();

        StringBuilder sb3 = new StringBuilder();
        for (;scanner3.hasNext();){
            sb3.append(scanner3.next());
        }
        text3 = sb3.toString();

        StringBuilder sb4 = new StringBuilder();
        for (;scanner4.hasNext();){
            sb4.append(scanner4.next());
        }
        text4 = sb4.toString();

        String pattern1 = "for";
        String pattern2 = "fames";
        String pattern3 = "aaaaa";
        String pattern4 = "aabaa";

        fw.write("At input1 and pattern 'for'");
        fw.write(" KnuthMorrisPratt | Horspool | QuickSearch ");
        fw.write(Arrays.toString(algorithmComparator.compare(text1.toCharArray(),pattern1.toCharArray())));
        fw.write("\n");

        fw.write("At input2 and pattern 'fames'");
        fw.write(" KnuthMorrisPratt | Horspool | QuickSearch ");
        fw.write(Arrays.toString(algorithmComparator.compare(text2.toCharArray(),pattern2.toCharArray())));
        fw.write("\n");

        fw.write("At input3 and pattern 'aaaaa'");
        fw.write(" KnuthMorrisPratt | Horspool | QuickSearch ");
        fw.write(Arrays.toString(algorithmComparator.compare(text3.toCharArray(),pattern3.toCharArray())));
        fw.write("\n");

        fw.write("At input4 and pattern 'aabaa'");
        fw.write(" KnuthMorrisPratt | Horspool | QuickSearch ");
        fw.write(Arrays.toString(algorithmComparator.compare(text4.toCharArray(), pattern4.toCharArray())));
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
