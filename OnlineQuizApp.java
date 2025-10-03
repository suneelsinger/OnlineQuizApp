import java.util.*;
class Question
{
    private String questionText;
    private String[] options;
    private int correctAnswer;
    public Question(String questionText,String[] options,int correctAnswer)
    {
        this.questionText=questionText;
        this.options=options;
        this.correctAnswer=correctAnswer;
    }
    public void displayQuestion()
    {
        System.out.println(questionText);
        for(int i=0;i<options.length;i++)
        {
            System.out.println((i+1)+ ". "+options[i]);
        }
    }
    public boolean checkAnswer(int userAnswer)
    {
        return userAnswer==correctAnswer;
    }
}
public class OnlineQuizApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<Question> quiz=new ArrayList<>();
        quiz.add(new Question("Which language is platform independent?",new String[]{"C", "C++", "Java", "Python"}, 3));
        quiz.add(new Question("Which keyword is used to inherit a class in Java?",new String[]{"super", "this", "extends", "implements"}, 3));
        quiz.add(new Question("Which of the following is not OOP concept?",new String[]{"Polymorphism", "Encapsulation", "Compilation", "Inheritance"}, 3));
        quiz.add(new Question("Which company developed Java?",new String[]{"Microsoft", "Sun Microsystems", "Google", "Oracle"}, 2));
        int score=0;
        System.out.println("===== Welcome to Online Quiz App =====\n");
        for(int i=0;i<quiz.size();i++)
        {
            Question q=quiz.get(i);
            System.out.println("Q"+(i+1)+ ": ");
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer=sc.nextInt();
            if(q.checkAnswer(userAnswer))
            {
                System.out.println("✅ Correct!\n");
                score++;
            }
            else
            {
                System.out.println("❌ Wrong!\n");
            }
        }
        System.out.println("===== Quiz Finished =====");
        System.out.println("Your Score: "+score+"/"+quiz.size());
        if(score==quiz.size())
        {
            System.out.println("🎉 Excellent! Perfect Score!");
        }
        else if(score>=quiz.size()/2)
        {
            System.out.println("👍 Good Job! Keep practicing.");
        }
        else
        {
            System.out.println("📘 Keep learning. You'll improve!");
        }
        sc.close();
    }
}
