package Quiz;

import java.util.ArrayList;
import java.util.List;

public class DataAllList {

    public List < Questions > DownloadQuestion() {
        List < Questions > q = new ArrayList < Questions > ();
        q.add(new Questions("1. Ile lat ¿yje pawian gwinejski?"));
        q.add(new Questions("2. Rekin bia³y ma bardzo czu³y wêch. Potrafi wyczuæ jedn¹ kroplê krwi w ____ wody."));
        q.add(new Questions("3. Wieloryby s¹ najwiêkszymi zwierzêtami zamieszkuj¹cymi _____?"));
        q.add(new Questions("4. Gatunek wê¿a z rodziny dusicieli, wystêpuj¹cy w ___________?"));
        q.add(new Questions("5. U du¿ych krokodyli mózg zajmuje do _____ objêtoœci puszki mózgowej."));
        return q;
    }

    public List < Answers > DownloadAnswer() {
        List < Answers > answer = new ArrayList < Answers > ();
        answer.add(new Answers("a 30-40", "b 50-60", "c 15-20", "d 10-15"));
        answer.add(new Answers("a 115 l", "b 50 l", "c 100 l", "d 200 l"));
        answer.add(new Answers("a Ziemiê", "b Ocean", "c Atlantyk", "d Morze"));
        answer.add(new Answers("a Ameryce Pó³nocnej", "b Ameryce Po³udniowej", "c Afryce", "d Azji"));
        answer.add(new Answers("a 60%", "b 20%", "c 30%", "d 80%"));
        return answer;
    }

    public List < RightAnswers > DownloadRightAnswer() {
        List < RightAnswers > answer = new ArrayList < RightAnswers > ();
        answer.add(new RightAnswers("c", "15-20"));
        answer.add(new RightAnswers("a", "115 l"));
        answer.add(new RightAnswers("a", "Ziemiê"));
        answer.add(new RightAnswers("b", "Ameryce Po³udniowej"));
        answer.add(new RightAnswers("a", "60%"));
        return answer;
    }
}
