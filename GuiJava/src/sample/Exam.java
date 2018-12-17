package sample;

public class Exam {
    private String examSolution;
    private String examName;
    private String examNumber;
    private String examId;
    public Exam(){}
    public Exam(String examId, String examNumber, String examName, String examSolution){
        this.examId = examId;
        this.examName = examName;
        this.examNumber = examNumber;
        this.examSolution = examSolution;
    }
    public String getExamSolution() {
        return this.examSolution;
    }

    public String getExamName() {
        return this.examName;
    }

    public String getExamNumber() {
        return this.examNumber;
    }

    public String getExamId() {
        return this.examId;
    }
}
