package me.chbshoot.ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// (1) create TestStrings
public class TestStrings {
    static final String PALE_BLUE_DOT = "Look again at that dot. That's here. That's home. That's us. On it everyone you love, everyone you know, everyone you ever heard of, every human being who ever was, lived out their lives. The aggregate of our joy and suffering, thousands of confident religions, ideologies, and economic doctrines, every hunter and forager, every hero and coward, every creator and destroyer of civilization, every king and peasant, every young couple in love, every mother and father, hopeful child, inventor and explorer, every teacher of morals, every corrupt politician, every \"superstar,\" every \"supreme leader,\" every saint and sinner in the history of our species lived there--on a mote of dust suspended in a sunbeam.The Earth is a very small stage in a vast cosmic arena. Think of the rivers of blood spilled by all those generals and emperors so that, in glory and triumph, they could become the momentary masters of a fraction of a dot. Think of the endless cruelties visited by the inhabitants of one corner of this pixel on the scarcely distinguishable inhabitants of some other corner, how frequent their misunderstandings, how eager they are to kill one another, how fervent their hatreds.Our posturings, our imagined self-importance, the delusion that we have some privileged position in the Universe, are challenged by this point of pale light. Our planet is a lonely speck in the great enveloping cosmic dark. In our obscurity, in all this vastness, there is no hint that help will come from elsewhere to save us from ourselves.The Earth is the only world known so far to harbor life. There is nowhere else, at least in the near future, to which our species could migrate. Visit, yes. Settle, not yet. Like it or not, for the moment the Earth is where we make our stand.It has been said that astronomy is a humbling and character-building experience. There is perhaps no better demonstration of the folly of human conceits than this distant image of our tiny world. To me, it underscores our responsibility to deal more kindly with one another, and to preserve and cherish the pale blue dot, the only home we've ever known.-- Carl Sagan, Pale Blue Dot, 1994";
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.println("===============    Part One   =========================================");
        System.out.println("=======================================================================");

        try {
            // (2) set and reset a str
            String tempStr = "example.doc";
            tempStr = "example.bak";

            // (3) enter two str and compare their lexicographical position
            String a, b;
            System.out.print("Enter first string: ");
            a = reader.nextLine();

            System.out.print("Enter second string: ");
            b = reader.nextLine();

            if (a.compareTo(b) < 0) {
                System.out.println("The string \"" + b + "\" is ahead of string \"" + a + "\"");
            } else if (a.compareTo(b) > 0) {
                System.out.println("The string \"" + a + "\" is ahead of string \"" + b + "\"");
            } else {
                System.out.println("They are actually identical");
            }

            // (4) find ow in str
            String hungryFox = "the quick brown fox swallowed down the lazy chicken";
            System.out.println("\"ow\" occurs " + (hungryFox.split("ow").length - 1) + " times");

            // (5) check if it is a palindrome
            boolean isPalindrome = true;
            int iter;
            System.out.print("Enter a string to check palindrome: ");
            a = reader.nextLine();

            for (iter = 0; iter < a.length(); iter++) {
                if (a.charAt(iter) != a.charAt(a.length() - iter - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("\"" + a + "\" is " + (isPalindrome ? "" : "not") + " a palindrome");
        } finally {
            reader.close(); // clean up after yourself
        }

        System.out.println("=======================================================================");
        System.out.println("===============    Part Two   =========================================");
        System.out.println("=======================================================================");
        // (1) todays date
        DateFormat dateFormatter = DateFormat.getDateTimeInstance();
        Date today = new Date();
        String format;

        format = "dd/MM/yyyy hh:mm:ss";
        dateFormatter = new SimpleDateFormat(format);
        System.out.println("[" + format + "] " + dateFormatter.format(today));

        format = "EEEE, MMMM d, yyyy";
        dateFormatter = new SimpleDateFormat(format);
        System.out.println("[" + format + "] " + dateFormatter.format(today));

        format = "'Today is the 'D' day of the year!'";
        dateFormatter = new SimpleDateFormat(format);
        System.out.println("[" + format + "] " + dateFormatter.format(today));

        System.out.println("=======================================================================");
        System.out.println("===============    Part Three  ========================================");
        System.out.println("=======================================================================");
        // (1) split sentences
        int iter, iter2, totalWords = 0;
        String[] words;
        String[] sentences = PALE_BLUE_DOT.split("\\.");
        System.out.println("There are a total of " + (sentences.length - 1) + " sentences in the essay Pale Blue Dot by Carl Sagan");

        System.out.println("Printing out the sentences!");
        for (iter = 0; iter < sentences.length; iter++) {
            System.out.println("[" + (iter + 1) + "/" + sentences.length + "]" + sentences[iter].trim());
        }
        
        System.out.println("Exploding the sentences too!");
        for (iter = 0; iter < sentences.length; iter++) {
            words = sentences[iter].split(" ");
            System.out.println("Printing all words for sentence #" + (iter + 1));
            for (iter2 = 0, totalWords += words.length; iter2 < words.length; iter2++) {
                System.out.println("[" + (iter2 + 1) + "/" + words.length + "]" + words[iter2].trim());
            }
        }

        System.out.println("Exploding the whole thing by words");
        words = PALE_BLUE_DOT.split(" ");
        System.out.println("Printing out the words!");
        for (iter = 0; iter < words.length; iter++) {
            System.out.println("[" + (iter + 1) + "/" + words.length + "]" + words[iter].trim());
        }

        System.out.println("Total word count by splitting main text: " + words.length);
        System.out.println("Total word count by splitting sentences " + totalWords);
        // 20 words got lost?
    }
}