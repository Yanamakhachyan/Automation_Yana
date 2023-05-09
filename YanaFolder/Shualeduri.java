
public class Shualeduri {
    public static void main(String[] args) {
        // task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello World");
        }



        // task 2
        compareValues(5, 3);
        compareValues(2, 2);
        compareValues(14, 41);



        // task 3
        String[] cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};

        for (String city : cityArray) {
            System.out.println(city);
        }



        // task 4
        BCalculator calculator = new BCalculator();
        calculator.x(100, 5);
        calculator.x(200, 10);

       ;

        // task 5
        int[] myArray = {0, 7, 7, 2, 7, 3, 5};
        int mode = calculateMode(myArray);
        System.out.println("Mode: " + mode);
    }

    public static void compareValues(int a, int b) {
        if (a == b) {
            System.out.println(a + " = " + b);
        } else {
            System.out.println(a + " != " + b);
        }
    }

    public static int calculateMode(int[] numbers) {
        int maxCount = 0;
        int mode = numbers[0];

        for (int a : numbers) {
            int count = 0;
            for (int b : numbers) {
                if (a == b) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = a;
            }
        }

        return mode;
    }
}



class ACalculator {
    public void x(double initialPrice, double discountPercentage) {
        double discountedPrice = initialPrice * (1 - discountPercentage / 100);
        System.out.println("Discounted price: " + discountedPrice);
    }
}

class BCalculator extends ACalculator {
    public void x(double initialPrice, double discountPercentage) {
        super.x(initialPrice, discountPercentage);
    }
}