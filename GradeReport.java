public class GradeReport {

    public static void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    public static char calculateLetterGrade(double score) {
        if (score >= 80) return 'A';
        else if (score >= 70) return 'B';
        else if (score >= 60) return 'C';
        else if (score >= 50) return 'D';
        else return 'F';
    }

    public static void displayPerformanceMessage(char grade) {
        if (grade == 'A') {
            System.out.println("Excellent work!");
        } else if (grade == 'B') {
            System.out.println("Very good!");
        } else if (grade == 'C') {
            System.out.println("Good effort.");
        } else if (grade == 'D') {
            System.out.println("You passed, but can do better.");
        } else {
            System.out.println("You failed. Try harder next time.");
        }
    }

    public static void main(String[] args) {
        executeGradeReport(75); // You can change this value
    }
}

