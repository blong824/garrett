import java.util.Scanner;


//store correct answers
//store entered answers
//passing = 15/20
//4 methods, 1 boolean = hasPassed, totalCorrect, totalIncorrect, intArray that contains question number of wrong answers

public class DriverExam {

	String correctAnswers[] = new String[20];
	String enteredAnswers[] = new String[20];
	
	public DriverExam(String[] correct, String[] entered) {
		correctAnswers = correct;
		enteredAnswers = entered;
	}
	
	
	public boolean hasPassed() {
		
		double result = (double) totalCorrect() / correctAnswers.length;
		
		if (result >= .75) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public int totalCorrect() {
		
		int total = 0;
		
		for (int i = 0; i < correctAnswers.length; i++) {
			if (correctAnswers[i] == enteredAnswers[i]) {
				total++;
			}
		}
		
		return total;
		
	}
	
	public int totalIncorrect() {

		int total = 0;
		
		for (int i = 0; i < correctAnswers.length; i++) {
			if (correctAnswers[i] != enteredAnswers[i]) {
				total++;
			}
		}
		
		return total;
		
	}
	
	public int[] wrongQuestionNumbers() {

		int wrongAnswers[] = new int[totalIncorrect()];
		int wrongCount = 0;
		
		for (int i = 0; i < correctAnswers.length; i++) {
			if (correctAnswers[i] != enteredAnswers[i]) {
				wrongAnswers[wrongCount] = i+1;
				wrongCount++;
			}
		}
		
		return wrongAnswers;		
		
	}
	
	public static void main(String args[]) {
		
		String[] answerKey = new String[]{"a","b","c","d","a","b","c","d","a","b","c","d","a","b","c","d","a","b","c","d"};
		String[] enteredAnswersStudentA = new String[]{"a","b","c","d","a","c","c","d","a","b","c","d","a","b","c","d","a","b","c","d"};
		
		DriverExam driverExam = new DriverExam(answerKey, enteredAnswersStudentA);
		
		System.out.println("Student Passed? "+ driverExam.hasPassed());
		System.out.println("Total Correct: " + driverExam.totalCorrect());
		System.out.println("Total Incorrect: " + driverExam.totalIncorrect());
		
		System.out.print("Wrong Answer Numbers: ");
		for (int i = 0; i < driverExam.totalIncorrect(); i++) {
			System.out.print(driverExam.wrongQuestionNumbers()[i]+", ");
		}
	}
	
}