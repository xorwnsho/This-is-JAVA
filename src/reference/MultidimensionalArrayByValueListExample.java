package reference;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        System.out.println("1차원 배열 길이 ( 반의 수 ) : " + scores.length);
        System.out.println("2차원 배열 길이 ( 첫 번째 반의 학생 수) : " + scores[0].length);
        System.out.println("2차원 배열 길이 ( 두 번째 반의 학생 수) : " + scores[1].length);

        // 첫 번째 반의 세번째 학생의 점수 읽기
        System.out.println("score[0][2] = " + scores[0][2]);

        // 첫 번째 반의 평균 점수 구하기
        int sumScore1 = 0;
        for (int i = 0; i < scores[0].length; i++) {
            sumScore1 += scores[0][i];
        }
        double avgScore1 = (double) sumScore1 / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + avgScore1);

        // 두 번째 반의 평균 점수 구하기
        int sumScore2 = 0;
        for (int i = 0; i < scores[1].length; i++) {
            sumScore2 += scores[1][i];
        }
        double avgScore2 = (double) sumScore2 / scores[1].length;
        System.out.println("두 번쨰 반의 평균 점수 :  " + avgScore2);

        // 전체 학생의 평균 점수 구하기
        int score =0;
        int totalStudent = 0;
        for(int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for(int j = 0; j < scores[i].length; j++) {
                score+=scores[i][j];
            }
        }
        double avgScore = (double) score / totalStudent;
        System.out.println("전체 학생의 평균 점수 : " + avgScore);
    }
}
