import java.util.List;

public class Main {
    public static void main(String[] args) {   //grades
        Grade gradeIdentifier = new Grade();
        List<Integer> grades = List.of(29, 37, 38, 41, 84, 67);
        System.out.println("Fail: "+ gradeIdentifier.failGrades(grades));
        System.out.println("Average: "+ String.format("%.2f", gradeIdentifier.average(grades)));
        System.out.println("Rounded: "+ gradeIdentifier.roundGrades(grades));
        System.out.println("Max Rounded: "+ gradeIdentifier.maxGrade(grades));
    }
}