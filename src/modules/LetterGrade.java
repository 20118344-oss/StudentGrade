package modules;

public class LetterGrade extends StudentGrade {
    private char grade;

    public LetterGrade(String studentName, String moduleName, char grade){
        super(studentName, moduleName);
        this.grade = grade;
    }


    public char getLetterGrade() {
        return grade;
    }

    @Override
    public int getGrade(){
        if(grade == 'A') return 1;
        else if (grade == 'B') return 2;
        else if (grade == 'C') return 3;
        else if (grade == 'D') return 4;
        else return 5;
    }

    public void setGrade(char grade){
        char upper = Character.toUpperCase(grade);
        if(upper != 'A' && upper != 'B' && upper != 'C' && upper != 'D' && upper != 'E')
            throw new IllegalArgumentException("Invalid grade: " + grade);
        this.grade = upper;
    }





    @Override
    public String classifyGrade() {
        if (grade == 'A' || grade == 'B') return "Distinction";
        else if (grade == 'C') return "Merit";
        else if (grade == 'D') return "Pass";
        else return "Fail"; // grade == 'E'
    }




}
