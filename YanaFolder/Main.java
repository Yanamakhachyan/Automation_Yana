import java.util.*;

public class Main {
    public static void main(String[] args) {

        // first exercise
        String str = "yana";

        int number = 16;
        float fl = 16.16f;
        double dl = 16.16;

        char ch = '#';
        boolean bol = true;

        System.out.println(str);
        System.out.println(number);
        System.out.println("dl");
        System.out.println("ch");
        System.out.println("bol");
        System.out.printf("fl");

        // second exercize

        int  numb = 22;
        int numb1 = 33;
        int numb2 = numb + numb1;
        int numb3 = numb1 - numb;
        int numb4 = numb1 * numb;
        int numb5 = numb1 % numb;
        numb3 += 5;

        System.out.println(numb2);
        System.out.println(numb3);
        System.out.println(numb4);
        System.out.println(numb5);
        System.out.println(++numb);
        System.out.println(numb3);

        // third exercise

        boolean bb = 7>5 && 4<8;
        boolean ll = 8>4 || 3<5;
        boolean bl = !(8>4 || 3<5);


        System.out.println(bb);
        System.out.println(ll);
        System.out.println(bl);

        // fourth exercise

        String a = "my year of birth is 1984, my age is";
        int b = 2023;
        int c = 1984;
        int d = b - c;

        System.out.println(a);
        System.out.println(d);

        // Lec 3

        String txt = "Academy";
        txt.length();

        System.out.println(txt.length());
        int num  = txt.length();

        String txt_1 = "SmartAcademy";
        System.out.println(txt_1.toLowerCase());
        System.out.println(txt_1.toUpperCase());

        String txt_2 = "Find 'my location";
        System.out.println(txt_2.indexOf("my"));

        String txt_3 = "SmartAcademy \"help\"";
        System.out.println(txt_3);

        String txt_4 = "My number is 8\\3";
        System.out.println(txt_4);

        System.out.println(Math.max(30,50));
        System.out.println(Math.min(40,20));
        System.out.println(Math.random());
        System.out.println(Math.abs(-5));

        if (40>30){
            System.out.println("smartacademy_1");
        }

        int age = 25;
        if (age<18) {
            System.out.println("teenager");
        } else {
            System.out.println("other");
        }

        int age_1 = 16;
        if (age_1<18) {
            System.out.println("teenager");
        } else {
            System.out.println("other");
        }
        
        int age_2 = 25;
        if (age_2<18) {
            System.out.println("teenager");
        } else if (age_2<30) {
            System.out.println("young");

        }else {
            System.out.println("other");

        }
        int age_3 = 20;
        String result = (age_3<18)? "teenager" : "other";
        System.out.println(result);

        int week = 3;
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("week not found");

              int x = 0;
                while (x < 5) {
                    System.out.println(x);
                     x++;
               }
              int y = 0;
             do {
            System.out.println(y);
        y++;
       } while (y < -5);
        }
         for (int q = 0; q < 5; q++){

             System.out.println(q);
         }
    for (int z = 0; z <= 20; z +=2) {

        System.out.println(z);
    }
  for (int v = 0; v <=20; v++) {
      if (v % 2 == 0)
          System.out.println(v);

      for (int u = 0; u < 10; u++){

          if (u == 4) {
              break;
          }
          System.out.println(u);
      }

      for (int t = 0; t < 15; t++){
          if (t == 5) {
              continue;
          }
          System.out.println(t);
      }
     String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
      weekday[0] = "Sunday";
      System.out.printf(weekday[0]);
  }
        String[] weekday1 = {"Monday", "Tuesday", "Wednesday", "Thursday"};
        System.out.println(weekday1.length);


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int s = myNumbers[0][0];
        System.out.println(s);

        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }

// Lec 4

        ArrayList<String> names = new ArrayList<String>();
     names.add("Alisa");
     names.add("Maria");
        System.out.println(names);
        System.out.println(names.get(1));
        names.set(0, "Yana");
        System.out.println(names.get(0));

ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(10);
numbers.add(5);
numbers.add(8);
        Collections.sort(numbers);
        for (int i: numbers) {
            System.out.println(i);

        }
        int t = 0;
        do {
            System.out.println(t);
            t++;
        }
while (t > 5);


    }
    }
