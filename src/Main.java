public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("Задание №1");
        for (int sim=1;sim<=10;sim++){
            System.out.println(sim);
        }
        //Задание №2
        System.out.println("Задание №2");
        for (int mis=10;mis>0;mis--){
            System.out.println(mis);
        }

        //Задание №3
        System.out.println("Задание №3");
        int total=17;
        for (int sch=0;sch<=total;sch=sch+2){
           if(sch%2==0){
                System.out.println(sch);
           }

        }
        //Задание №4
        System.out.println("Задание №4");
        for (int pos=10;pos>=-10;pos--){

                System.out.println(pos);


        }
        //Задание №5
        System.out.println("Задание №5");
        for (int data=1904;data<=2096;data=data+4){
            System.out.println(data+" год является високосным");
        }
        //Задание №6
        System.out.println("Задание №6");
        for (int sun=7;sun<=100;sun=sun+7){
            System.out.println(sun);
        }

        //Задание №7
        System.out.println("Задание №7");
        for (int sky=1;sky<=512;sky=sky*2){
            System.out.println(sky);
        }

        //Задание №8
        System.out.println("Задание №8");
        int deposit=29000;
        int totalDeposit=0;
        for (int month=1;month<=12;month++){
            totalDeposit=totalDeposit+deposit;
            System.out.println("Месяц "+month+", сумма накоплений равна "+totalDeposit+" рублей");
        }

        //Задание №9
        System.out.println("Задание №9");
        int monthA = 0;
        int bankbDeposit = 29000;
        int total1 = 0;
        for (monthA = 0; monthA <= 12; monthA ++) {
            bankbDeposit = bankbDeposit + bankbDeposit / 100;
            total1 = total1 + bankbDeposit;
            System.out.println("Месяц " + monthA + ", сумьа накоплений равна " + total1 + " рублей");

        }
        //Задание №10
        System.out.println("Задание №10");
        int amount=0;
        System.out.println("Задание №10");
        for (int digit=1;digit<=10;digit++){
            amount=digit*2;
            System.out.println("2*"+digit+"="+amount);
        }

    }
}