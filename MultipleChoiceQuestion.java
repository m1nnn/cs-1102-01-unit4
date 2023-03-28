// This is the QUIZ FILE
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {  // 
	static int nQuestions = 0;
	static int nCorrect = 0;
  String question;  // created a variable to store the question received from String query
  String correctAnswer;

  MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
    question = query + "\n";
    question += "A. " + a + "\n";
    question += "B. " + b + "\n";
    question += "C. " + c + "\n";
    question += "D. " + d + "\n";
    question += "E. " + e + "\n";
    correctAnswer = answer.toUpperCase();
  }

	 String ask() {  // Here is method ASK
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
					|| answer.equals("E"));
			if (valid)
				return answer;
			JOptionPane.showMessageDialog(null, "Answer is not valid. Please enter A, B, C, D, or E.");
		}
	}

	 void check() {  // Here is method Check
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
   void showResults() { // Here is the method showResult
    JOptionPane.showMessageDialog(null, "You got "+ nCorrect + " correct out of " + nQuestions + " questions");
	  
  }
  
} // end of class MultipleChoiceQuestion
