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
	
	public List<Questions> DownloadQuestion(){
		List<Questions> q = new ArrayList<Questions>();
		q.add(new Questions("1. Ile lat ¿yje pawian gwinejski?"));
		q.add(new Questions("2. Rekin bia³y ma bardzo czu³y wêch. Potrafi wyczuæ jedn¹ kroplê krwi w ____ wody."));
		//q.add(new Questions(""));
		//for(int i = 0; i<q.size(); i++) {
		//
		//int i =0;
		//System.out.print(q.get(i).getQuestion());
		//}
		return q;	
	}
	
	public List<Answers> DownloadAnswer(){
		char newLine = '\n';
		List<Answers> answer = new ArrayList<Answers>();
		answer.add(new Answers("a 30-40", "b 50-60", "c 15-20", "d 10-15"));
		answer.add(new Answers("a 115 l", "b 50 l", "c 100 l", "d 200 l"));
		//for(int i=0; i<answer.size(); i++) {
		//int i = 0;
		//System.out.println(newLine + answer.get(i).getAnswer1() + newLine + answer.get(i).getAnswer2() + newLine + answer.get(i).getAnswer3() + newLine + answer.get(i).getAnswer4());
		//}
		return answer;
	}

	public List<RightAnswers> DownloadRightAnswer(){
		List<RightAnswers> answer = new ArrayList<RightAnswers>();
		answer.add(new RightAnswers("c", "15-20"));
		answer.add(new RightAnswers("a", "115 l"));
		return answer;
	}
	
	public String MyAnswer() {
		Scanner in = new Scanner(System.in);
		String r;
		r = in.nextLine();
		return r;
	}
	
	public void View(List<Questions> question, List<Answers> answer, String myAnswer) {
		for(int i=0; i<5; i++) {
			System.out.println(question.get(i).getQuestion());
			System.out.println(answer.get(i).getAnswer1()+answer.get(i).getAnswer2()+answer.get(i).getAnswer3()+answer.get(i).getAnswer4());
			System.out.println(myAnswer);
		}
	}
	
	int score = 0;
	
	public int AddScore( String r, List<RightAnswers> p) {
		
		for(int i=0; i<p.size(); i++) {
		if(r.equals(p.get(i).getEquivalent())) {
			System.out.print("Odpowiedz jest prawid³owa! Brawo!");
			score++;
		}else
			System.out.println("Twoja odpowiedz nie jest dobra");
			System.out.println();
		}
		return score;
	}
	
	public void Score(int score) {
		char newLine = '\n';
		System.out.println(newLine + "Twoja liczba punktów: " + score);
	}
	
	
	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();
		quiz.Start();
		List<Questions> questions = quiz.DownloadQuestion();
		List<Answers> answer = quiz.DownloadAnswer();
		List<RightAnswers> rightAnswer = quiz.DownloadRightAnswer();
		String myAnswer;
		int score;
		for(int i=0; i<questions.size(); i++) {
			System.out.println(questions.get(i).getQuestion());
			System.out.println(answer.get(i).getAnswer1()+answer.get(i).getAnswer2()+answer.get(i).getAnswer3()+answer.get(i).getAnswer4());
			myAnswer = quiz.MyAnswer();
			score = quiz.AddScore(myAnswer, rightAnswer);
			quiz.Score(score);
		}
		
		//quiz.View(questions, answer, myAnswer);
		
		
	}

}
	