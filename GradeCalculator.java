import java.util.Scanner;

public class GradeCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Maths: ");
            float maths = sc.nextFloat();

            System.out.print("Physics: ");
            float physics = sc.nextFloat();

            System.out.print("Chemistry: ");
            float chemistry = sc.nextFloat();

            System.out.print("ComputerSc: ");
            float computerSc = sc.nextFloat();

            System.out.print("Biology: ");
            float biology = sc.nextFloat();

            System.out.print("Sum of the marks obtained: ");
            float sum = maths + physics + chemistry + computerSc + biology;
            System.out.println(sum);

            System.out.print("Average Percentage: ");
            float percentage = (sum / 500)*100;

            System.out.println(percentage + "%: ");


            System.out.print("Your grade is: ");
            if(percentage > 90){
                System.out.println("A+");
            }
            else if (percentage > 80) {
                System.out.println("A");
            }
            else if(percentage > 70){
                System.out.println("B");
            }
            else if(percentage > 60){
                System.out.println("C");
            }
            else if(percentage > 50){
                System.out.println("D");
            }
            else if(percentage > 40){
                System.out.println("E");
            }
            else if(percentage < 40){
                System.out.println("F");
            }


        }
}


