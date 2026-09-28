package modules;

public class PercentageGrade extends StudentGrade {
    private int grade;


    public PercentageGrade(String studentName, String moduleName, int grade){
        super(studentName, moduleName);
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade) {
    if(grade <0 || grade > 100){
        throw new IllegalArgumentException("Invalid grade: "+ grade + ". Must be 0-100. ");
    }
        this.grade = grade;
    }

    @Override
    public String classifyGrade(){
        if(grade >= 70) return "Distinction";
        else if( grade >=50) return "Merit";
        else if(grade >=40) return "Pass";
        else return "Fail";
    }


}
