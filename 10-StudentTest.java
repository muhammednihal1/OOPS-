import java.util.Scanner;

interface Student {
    void getAcademicScore();
}

interface Sports {
    void getSportsScore();
}

class Result implements Student, Sports {
    Scanner sc = new Scanner(System.in);
    int academicScore;
    int sportsScore;

    public void getAcademicScore() {
        System.out.print("Enter academic score: ");
        academicScore = sc.nextInt();
    }

    public void getSportsScore() {
        System.out.print("Enter sports score: ");
        sportsScore = sc.nextInt();
    }

    public void display() {
        getAcademicScore();
        getSportsScore();
        System.out.println("\n--- Student Scores ---");
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Result studentResult = new Result();
        studentResult.display();
    }
}
