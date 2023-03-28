// This is the QUIZ FILE
public class Quiz { // Change the class name here to Main if you want to run the program. This will
                    // be called Quiz but replit has a limitation
  //// *********************************************
  public static void main(String[] args) {
    MultipleChoiceQuestion question = new MultipleChoiceQuestion("How Many Questions will I ask?", "One Question",
        "Two Questions", "Three Questions", "Four Questions", "Five Questions", "e");
    question.check();
    MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("How Many Questions are left?", "One Question",
        "Two Questions", "Three Questions", "Four Questions", "Five Questions", "d");
    question1.check();
    MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("How Many Questions remain?", "One Question",
        "Two Questions", "Three Questions", "Four Questions", "Five Questions", "c");
    question2.check();
    MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("How Many Questions to go?", "One Question",
        "Two Questions", "Three Questions", "Four Questions", "Five Questions", "b");
    question3.check();
    MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Is there one or more questions left?",
        "One Question", "Two Questions", "Three Questions", "Four Questions", "Five Questions", "a");
    question4.check();
    question.showResults();
  }

}