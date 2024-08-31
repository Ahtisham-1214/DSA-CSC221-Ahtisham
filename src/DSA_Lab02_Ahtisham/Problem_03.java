package DSA_Lab02_Ahtisham;

/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * <p>
 * Return the maximum number of words that appear in a single sentence.
 * <p>
 *
 *
 * Example 1:
 * <p>
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation:
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 * Example 2:
 * <p>
 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
 * Output: 3
 * Explanation: It is possible that multiple sentences contain the same number of words.
 * In this example, the second and third sentences (underlined) have the same number of words.
 * <p>
 *
 * Constraints:
 * <p>
 * 1 <= sentences.length <= 100
 * 1 <= sentences[i].length <= 100
 * sentences[i] consists only of lowercase English letters and ' ' only.
 * sentences[i] does not have leading or trailing spaces.
 * All the words in sentences[i] are separated by a single space.
 */
public class Problem_03 {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        int k = 0;
        for (String sentence : sentences) {
            String[] word = sentence.split(" ");
            for (String w : word) {
                k++;
            }
            if (k > maxWords) {
                maxWords = k;
            }
            k = 0;
        }
        return maxWords;
    }
    public static void main(String[] args) {

        String []sentences =  {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));

    }
}
