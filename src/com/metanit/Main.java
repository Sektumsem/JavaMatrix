package com.metanit;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    /*int x=3;
    String text="Hello";
    float arv=1.34f;
	System.out.printf("Arv võrdub %d, \nText on %s\nFloat number %.2f....\n",x,text,arv);
	Scanner entry= new Scanner(System.in);
	System.out.println("Mis on sinu nimi?: ");
	String nimi=entry.nextLine();
	System.out.println(nimi);
    System.out.println("Jah või ei?: ");
	Boolean yesno=entry.nextBoolean();
    System.out.print(yesno);
    entry.close();
    if(yesno==true&& nimi.equals("Kirill")){
        System.out.println("Tere");
    }
    else{
        System.out.println("Head aega");
    }*/
/*    int number=100;
    boolean t=false;
    switch(number){
        case 10:
        case 20:
        case 30:
        case 40:
        case 50:
            t=true;
            break;
        case 51:
            System.out.print("51");
            break;
        default:
            t=false;
    }
    System.out.print(t);
    for (;number>0;number--){
        System.out.printf("Arv %d ruudus võrdub "+Math.sqrt(number)+ "\n",number);
    }*/
        /*for (int number=100; number>0;number--){
            System.out.printf("Arv %d ruudus võrdub "+Math.sqrt(number)+ "\n",number);
        }
        int number= 100;
        do{

            System.out.printf("Arv %d ruudus võrdub "+Math.sqrt(number)+ "\n",number);
            number--;
        }while (number>=0);

        number=100;
        while(number>=0){
            System.out.printf("Arv %d ruudus võrdub "+Math.sqrt(number)+ "\n",number);
            number--;
        }*/
       /* int[] arvud=new int []{1,100,25,700};
        int[] arvud2=new int[6];
        arvud2[0]=29;
        arvud2[1]=20;
        arvud2[2]=0;
        arvud2[3]=-25;
        arvud2[4]=28;
        arvud2[5]=50;

        for(int i=0;i<arvud2.length;i++){
            System.out.println(arvud2[i]);

        }
        for(int i=0;i<arvud.length;i++){
            System.out.println(arvud[i]);

        }*/
        Scanner entry= new Scanner(System.in);
        System.out.println("Sisestage arv 1 ja vajuta Enter: ");
        String sis1=entry.nextLine();
        System.out.println("Sisestage arv 2 ja vajuta Enter: ");
        String sis2=entry.nextLine();
        System.out.println("Sisestage arv 3 ja vajuta Enter: ");
        String sis3=entry.nextLine();
        System.out.println("Sisestage arv 4 ja vajuta Enter: ");
        String sis4=entry.nextLine();
        System.out.println("Sisestage arv 5 ja vajuta Enter: ");
        String sis5=entry.nextLine();
        System.out.println("Sisestage arv 6 ja vajuta Enter: ");
        String sis6=entry.nextLine();
        System.out.println("Sisestage arv 7 ja vajuta Enter: ");
        String sis7=entry.nextLine();
        System.out.println("Sisestage arv 8 ja vajuta Enter: ");
        String sis8=entry.nextLine();
        System.out.println("Sisestage arv 9 ja vajuta Enter: ");
        String sis9=entry.nextLine();
        double ar1 = Double.parseDouble(sis1);
        double ar2 = Double.parseDouble(sis2);
        double ar3 = Double.parseDouble(sis3);
        double ar4 = Double.parseDouble(sis4);
        double ar5 = Double.parseDouble(sis5);
        double ar6 = Double.parseDouble(sis6);
        double ar7 = Double.parseDouble(sis7);
        double ar8 = Double.parseDouble(sis8);
        double ar9 = Double.parseDouble(sis9);

        double[] [] determ= new double[][]{
                {ar1,ar2,ar3},
                {ar4,ar5,ar6},
                {ar7,ar8,ar9}
        };
        System.out.println("Teie matrix");
        for (int i=0;i<determ.length;i++) {
            for (int a = 0; a < determ[i].length; a++) {
                System.out.printf("%f ", determ[i][a]);
            }
            System.out.println();
        }

            System.out.println();
            System.out.println();
            System.out.println();
            double arvs = determ[0][0] * determ[1][1] * determ[2][2];
            double arvs2 = determ[0][1] * determ[1][2] * determ[2][0];
            double arvs3 = determ[0][2] * determ[1][0] * determ[2][1];
            double arvs4 = determ[0][2] * determ[1][1] * determ[2][0];
            double arvs5 = determ[0][0] * determ[1][2] * determ[2][1];
            double arvs6 = determ[0][1] * determ[1][0] * determ[2][2];
            double answs = arvs + arvs2 + arvs3 - arvs4 - arvs5 - arvs6;
            System.out.printf(ar1 + " * " + ar5 + " * " + ar9 + " + " + ar2 + " * " + ar6 + " * " + ar7 + " + " + ar3 + " * " + ar4 + " * " + ar8 + " - " + ar3 + " * " + ar5 + " * " + ar7 + " - " + ar1 + " * " + ar6 + " * " + ar8 + " - " + ar2 + " * " + ar4 + " * " + ar9 + " = ");
            System.out.println();
            System.out.printf(arvs + " + " + arvs2 + " + " + arvs3 + " - " + arvs4 + " - " + arvs5 + " - " + arvs6 + " = " + answs);

       /* for (int i=0;i<nums.length;i++) {
            for (int a = 0; a < nums[i].length; a++) {
                System.out.printf("%d ", nums[i][a]);
            }
            System.out.println();
        }*/

    }
}
