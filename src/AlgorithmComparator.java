import algos.Horspool;
import algos.KnuthMorrisPratt;
import algos.QuickSearch;

public class AlgorithmComparator {
    public long[] compare(char[] text, char[] pattern){

        long stats[] = new long[3];
        long start;
        long finish;
        long timeConsumedMillis;

        System.out.println("KnuthMorrisPratt started");
        start = System.currentTimeMillis();

        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text.toString(),pattern.toString());

        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("KnuthMorrisPratt finished. Time: "+timeConsumedMillis + " ms");
        stats[0] = timeConsumedMillis;



        System.out.println("Horspool started");
        start = System.currentTimeMillis();

        Horspool.BoyerMooreHorspoolSearch(pattern,text);

        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("Horspool finished. Time: "+timeConsumedMillis + " ms");
        stats[1] = timeConsumedMillis;



        System.out.println("QuickSearch started");
        start = System.currentTimeMillis();

        QuickSearch.search(text, pattern);

        finish = System.currentTimeMillis();
        timeConsumedMillis = finish - start;
        System.out.println("QuickSearch finished. Time: "+timeConsumedMillis + " ms");
        stats[2] = timeConsumedMillis;

        return stats;
    }
}
