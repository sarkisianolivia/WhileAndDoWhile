public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count !=6) {
            System.out.println("Count Value Is " + count);
            count ++;
        }
//identical for loop to the above while loop
        for(count =1; count !=6; count++) {
            System.out.println("Count Value Is " + count);
        }
        //also can be written as:
        while(true) { //loop will keep going forever unless you give it a test
            if(count ==6) {
                break;
            }
            System.out.println("Count Value Is " + count);
            count ++;
        }

        //do while statements:

        count = 1;
        do {
            System.out.println("Count Value Was " + count);
            count ++;
            if (count > 100) {
                break;
            }
        } while(count !=6);

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //goes back to the start of the loop instead of running code beneath it
            }
            System.out.println("Even Number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }

        }
        System.out.println("Total Even Numbers Found = " + evenNumbersFound);


    }

    public static boolean isEvenNumber (int number) {



        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }



    }


}
