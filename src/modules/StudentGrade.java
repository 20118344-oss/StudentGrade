package modules;






    public abstract class StudentGrade {
        private String studentName;
        private String moduleName;

        public StudentGrade( String studentName, String moduleName){
        this.moduleName = moduleName;
        this.studentName = studentName;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getModuleName(){
            return moduleName;
        }

        public void setModuleName(String moduleName) {
            if( moduleName != null && !moduleName.isEmpty())
                this.moduleName = moduleName;

        }

        public void setStudentName(String studentName) {
            if(studentName != null && !studentName.isEmpty() )
                this.studentName = studentName;
        }

        public abstract String classifyGrade();
        public abstract int getGrade();











    }



