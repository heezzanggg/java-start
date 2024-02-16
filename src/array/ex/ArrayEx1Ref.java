package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] studentScores = {90, 80, 70, 60, 50};
        int total = 0;
        for (int studentScore : studentScores) {
            total += studentScore;
        }
        double avg = (double) total / studentScores.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + avg);
    }
}
