import java.util.*;

public class Grade {
    List<Integer> failGrades(List<Integer> grades) {
        List<Integer> fail = new ArrayList<>();
        for(int grade : grades) {
            if(grade < 40){
                fail.add(grade);
            }
        }
        return fail;
    }

    double average(List<Integer> grades) {
        double sum = 0;
        int count = 0;
        for(int grade : grades) {
            sum += grade;
            count++;
        }
        return sum / count;
    }

    List<Integer> roundGrades(List<Integer> grades) {
        List<Integer> roundGrades = new ArrayList<>();
        for(int grade : grades) {
            if(grade < 38){
                roundGrades.add(grade);
            }
            else if(5-(grade%5)<3){
                roundGrades.add(grade +(5-(grade%5)));
            }
            else {
                roundGrades.add(grade);
            }
        }
        return roundGrades;
    }

    int maxGrade(List<Integer> grades) {
        int max = 0;
        grades = roundGrades(grades);
        for(int grade : grades) {
            if(grade > max){
                max = grade;
            }
        }
        return max;
    }
}