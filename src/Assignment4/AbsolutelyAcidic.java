/*
 * Author: Owen Lu
 * Date: Dec 11, 2025
 * Problem: CCC '12 S3 - Absolutely Acidic
 * Description: Finding the maximum difference between the most frequent acidity readings.
 */
package Assignment4;
import java.util.*;

public class AbsolutelyAcidic {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        // scan inputted readings
        int N = scan.nextInt();

        // declares the frequency array 
        int[] freq = new int[1001];  
        
        for (int i = 0; i < N; i++) {
            int R = scan.nextInt();
            freq[R]++;
        }
        
        // find the highest frequency and the corresponding reading(s)
        int maxFreq = 0;
        List<Integer> winners = new ArrayList<>();
        
        for (int i = 1; i <= 1000; i++) {
            if (freq[i] > maxFreq) {
                // found a new highest frequency, clear previous winner
                maxFreq = freq[i];
                winners.clear();
                winners.add(i);
            } else if (freq[i] == maxFreq) {
                // if theres a tie for first place, add to arraylist
                winners.add(i);
            }
        }
        

        
        if (winners.size() > 1) {
            // Case A: multiple winners
            // find the largest difference between any two winners
            // list is already sorted (looped from 1 to 1000)
            int lowest = winners.get(0);
            int highest = winners.get(winners.size() - 1);
            
            System.out.println(highest - lowest);
            
        } else {
            // Case B: one winner
            // find the second highest frequency (or runner-ups)
            int winner = winners.get(0);
            
            int secondMaxFreq = 0;
            List<Integer> runnerUps = new ArrayList<>();
            
            // find the secondhighest frequency and the corresponding reading(s)
            for (int i = 1; i <= 1000; i++) {
                // make sure it ignore the most frequent reading
                if (freq[i] < maxFreq) {
                    if (freq[i] > secondMaxFreq) {
                        // found a new second highest, clear previous runner-up
                        secondMaxFreq = freq[i];
                        runnerUps.clear();
                        runnerUps.add(i);
                    } else if (freq[i] == secondMaxFreq) {
                        // if theres a tie for second place, add to arraylist
                        runnerUps.add(i);
                    }
                }
            }
            
            // calculate difference between the winner and all runner-up to find the biggest gap
            int maxDiff = 0;
            for (int runner : runnerUps) {
                int diff = Math.abs(winner - runner);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            System.out.println(maxDiff);
        }
    }
}