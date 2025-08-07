import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        while (true){
            try{
                String input=JOptionPane.showInputDialog("Enter the number of seconds:");


                if (input == null) {
                    System.out.println("Program terminated.");
                   break;}

                double time =Double.parseDouble(input );


                double distance= freefallcalculator.freefall(time);
                //System.out.println("The distance travelled is: "+distance+" m");
                System.out.printf("The distance travelled is: %.2f m%n", distance);


            }
            catch (Exception e){
             System.out.println("Enter a valid number");
            }
        }


    }
}