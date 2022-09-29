public class Student
{

        /* Instance Variables */

        private String firstNames;
        private String lastNames;
        private int gradYears;
        private double accumulatedTestScores;
        private int testScoreCount;
        private double average;

        /* Constructor; see note below */

        public Student(String firstName, String lastName, int gradYear){
                firstNames = firstName;
                lastNames = lastName;
                gradYears = gradYear;
        }

        /* Methods */

        // Sets gradYear to newGradYear
        public void updateGradYear(int newGradYear){
                gradYears = newGradYear;
        }

        // Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
        public void addTestScore(double newTestScore){
                accumulatedTestScores = accumulatedTestScores + newTestScore;
                testScoreCount = testScoreCount + 1;
        }

        // Returns the number of test scores that have been added
        public int getTestScoreCount(){
                return testScoreCount;
        }

        // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
        public double averageTestScore(){
                average = accumulatedTestScores/testScoreCount;
                return average;
        }

        // this method prints all info of a Student object to the console
        public void printStudentInfo(){
                System.out.println("Student Name: " + firstNames + " " + lastNames);
                System.out.println("Graduation Year: " + gradYears);
                System.out.println("Average Test Score: " + averageTestScore());
                System.out.println("Number of Tests Averaged: " + testScoreCount);
        }
}
