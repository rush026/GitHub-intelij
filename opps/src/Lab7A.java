import java.time.LocalDate;
import java.time.Period;

public class Lab7A {
    // Inner class Person
    public class Person {
        private long aadharNo;
        private String firstName;
        private String lastName;
        private long mobileNo;
        private String emailId;
        private LocalDate dob;

        public Person(long aadharNo, String firstName, String lastName, long mobileNo, String emailId, LocalDate dob) {
            this.aadharNo = aadharNo;
            this.firstName = firstName;
            this.lastName = lastName;
            this.mobileNo = mobileNo;
            this.emailId = emailId;
            this.dob = dob;
        }

        // Getter and Setter methods
        public long getAadharNo() {
            return aadharNo;
        }

        public void setAadharNo(long aadharNo) {
            this.aadharNo = aadharNo;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public long getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(long mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public LocalDate getDob() {
            return dob;
        }

        public void setDob(LocalDate dob) {
            this.dob = dob;
        }

        @Override
        public String toString() {
            return "aadharNo=" + aadharNo + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo="
                    + mobileNo + ", emailId=" + emailId + ", dob=" + dob + ", age=" + computeAge();
        }

        public String computeAge() {
            String age = "";
            LocalDate curDate = LocalDate.now();
            if (dob != null) {
                Period p = Period.between(dob, curDate);
                age = String.format("%d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());
            }
            return age;
        }
    }

    // Inner class Student extending Person
    public class Student extends Person {
        private long rollNo;
        private String branch;
        private String semester;
        private int numCourses;
        private String[] courses;
        private int[] grades;

        public static final String institutionName = "GCET";
        private static final int MAX_COURSES = 40;

        public Student(long aadharNo, String firstName, String lastName, long mobileNo, String emailId, LocalDate dob,
                       long rollNo, String branch, String semester) {
            super(aadharNo, firstName, lastName, mobileNo, emailId, dob);
            this.rollNo = rollNo;
            this.branch = branch;
            this.semester = semester;
            numCourses = 0;
            courses = new String[MAX_COURSES];
            grades = new int[MAX_COURSES];
        }

        public void addCourseGrade(String course, int grade) {
            if (numCourses < MAX_COURSES) {
                this.courses[numCourses] = course;
                this.grades[numCourses] = grade;
                numCourses++;
            } else {
                System.out.println("Cannot add more courses. Maximum limit reached.");
            }
        }

        @Override
        public String toString() {
            String strValue = institutionName + " | " + super.toString() + "\nRoll no: " + rollNo + "\nBranch: "
                    + branch + "\nSemester: " + semester + "\nNumber of courses: " + numCourses;
            if (this.numCourses > 0) {
                for (int i = 0; i < this.numCourses; i++) {
                    strValue += "\nCourse: " + courses[i] + " - Grade: " + grades[i];
                }
            }
            return strValue;
        }
    }

    // Main method to demonstrate single inheritance
    public static void main(String[] args) {
        Lab7A lab7A = new Lab7A();
        LocalDate dob = LocalDate.parse("2004-12-12");
        Student s1 = lab7A.new Student(540632775667L, "Joshua KS", " ", 7856038495L, " joshuaks@gmail.com", dob,
                2200971640027L, "AIML", "IV");
        s1.addCourseGrade("C++", 96);
        System.out.println(s1);
    }
}