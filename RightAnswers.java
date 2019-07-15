package Quiz;

public class RightAnswers {

	public String equivalent;

	public String rightAnswer;

	public RightAnswers(String equivalent, String rightAnswer) {
		super();
		this.equivalent = equivalent;
		this.rightAnswer = rightAnswer;
	}

	public String getEquivalent() {
		return equivalent;
	}

	public void setEquivalent(String equivalent) {
		this.equivalent = equivalent;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}
