import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the line you want to find the numbber of occurrences");
        Application ac = new Application();
        String input = sc.nextLine();
        if (input.equals("")){
            System.out.println("error input");
        }else{
            int[] occurance = ac.sortString(input.toLowerCase());
            ac.printData(occurance);
        }
    }

    public int[] sortString(String str){
        //char[] arr = toCharArray(input);
        int[] occurance = new int[26];

        for (int i=0;i< str.length();i++){
          if(str.charAt(i)!= ' '){
              occurance[(int)str.charAt(i)-97] = occurance[(int)str.charAt(i)-97] + 1;
          }
        }

        return occurance;
    }



    public void printData(int[] occurance){
        System.out.println("The no of Occurrences are");
        for (int i=0;i< occurance.length;i++){
            System.out.println( (char)(i+97)+" = "+ occurance[i]);
        }

    }
}
