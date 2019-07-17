package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1{
	
	public void start() {
		System.out.println("**********Quiz Przyrodniczy**********");
		System.out.println("Na ekranie bed¹ wyœwietlaæ siê pytania na które trzeba odpowiadaæ: a, b, c lub d.");
		System.out.println("Odpowiedz jest tylko jedna!");
		System.out.println("Do dzie³a -->");
		System.out.println();
	}

	public String userAnswer() {
		Scanner in = new Scanner(System.in);
		String r;
		r = in.nextLine();
		return r;
	}
	
	int score = 0;
	int i=0;
	
	public int addScore( String userAnswer, List<RightAnswers> rightAnswers) {
		
		if(userAnswer.equals(rightAnswers.get(i).getEquivalent())) {
			System.out.println("Odpowiedz jest prawid³owa! Brawo!");
			score++;
		}else {
			System.out.println("Twoja odpowiedz nie jest dobra");
			System.out.println();
		}
		i++;
		return score;
	}
	
	public void score(int score) {
		char newLine = '\n';
		System.out.println(newLine + "Twoja liczba punktów: " + score);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();
		DataAllList data = new DataAllList();
		quiz.start();
		List<Questions> questions = data.DownloadQuestion();
		List<Answers> answers = data.DownloadAnswer();
		List<RightAnswers> rightAnswers = data.DownloadRightAnswer();
		String userAnswer;
		int score;
		char newLine = '\n';
		for(int i=0; i<questions.size(); i++) {
			System.out.println(questions.get(i).getQuestion());
			System.out.println(newLine + answers.get(i).getAnswer1() + newLine +answers.get(i).getAnswer2() + newLine + answers.get(i).getAnswer3() + newLine + answers.get(i).getAnswer4());
			userAnswer = quiz.userAnswer();
			score = quiz.addScore(userAnswer, rightAnswers);
			quiz.score(score);
		}
	}

}
	