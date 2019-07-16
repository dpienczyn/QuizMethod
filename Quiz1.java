package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1{
	
	public void Start() {
		System.out.println("**********Quiz Przyrodniczy**********");
		System.out.println("Na ekranie bed¹ wyœwietlaæ siê pytania na które trzeba odpowiadaæ: a, b, c lub d.");
		System.out.println("Odpowiedz jest tylko jedna!");
		System.out.println("Do dzie³a -->");
		System.out.println();
	}

	public String MyAnswer() {
		Scanner in = new Scanner(System.in);
		String r;
		r = in.nextLine();
		return r;
	}
	
	int score = 0;
	int i=0;
	
	public int AddScore( String r, List<RightAnswers> p) {
		
		if(r.equals(p.get(i).getEquivalent())) {
			System.out.println("Odpowiedz jest prawid³owa! Brawo!");
			score++;
		}else {
			System.out.println("Twoja odpowiedz nie jest dobra");
			System.out.println();
		}
		i++;
		return score;
	}
	
	public void Score(int score) {
		char newLine = '\n';
		System.out.println(newLine + "Twoja liczba punktów: " + score);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();
		DataAllList data = new DataAllList();
		quiz.Start();
		List<Questions> questions = data.DownloadQuestion();
		List<Answers> answer = data.DownloadAnswer();
		List<RightAnswers> rightAnswer = data.DownloadRightAnswer();
		String myAnswer;
		int score;
		char newLine = '\n';
		for(int i=0; i<questions.size(); i++) {
			System.out.println(questions.get(i).getQuestion());
			System.out.println(newLine + answer.get(i).getAnswer1() + newLine +answer.get(i).getAnswer2() + newLine + answer.get(i).getAnswer3() + newLine + answer.get(i).getAnswer4());
			myAnswer = quiz.MyAnswer();
			score = quiz.AddScore(myAnswer, rightAnswer);
			quiz.Score(score);
		}
	}

}
	