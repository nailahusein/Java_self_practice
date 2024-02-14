package additional_practice_tasks;
/*
Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5
 */
public class FrequencyOfAWord {
    public static void main(String[] args) {

        String word = "java";
        String sentence = "Java Java Java JAVA Java";

        word = word.toLowerCase();
        sentence = sentence.toLowerCase();

        int frequency = 0;
        int index = sentence.indexOf(word);

        while (!(index < 0)) {
            frequency++;
            index = sentence.indexOf(word, index + 1);
        }

        System.out.println("Frequency is " + frequency);
    }

}

