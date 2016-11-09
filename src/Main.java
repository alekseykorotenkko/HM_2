public class Main {

    public static void main(String[] args) {

        // 1. С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?
        int a = 234;
        int b = 7;

        int c = (a/b);

        System.out.println("a / b =" + c);

        //2. Дан прямоугольник с размерами 543 130 мм. Сколько квадратов со стороной 130 мм можно отрезать от него?
        int d = 543130;
        int e = 130;

        int f = (d/(e*e));
        System.out.println("d/e =" + f);

        //  3.Дано двузначное число. Найти:
        int h = 95;
        int g = h/10; //  а) число десятков в нем;
        int i = h%10; //  б) число единиц в нем;
        int k = g+i;  //  в) сумму его цифр;
        int l = g*i;  //  г) произведение его цифр.

        System.out.println("g =" + g);
        System.out.println("i =" + i);
        System.out.println("k =" + k);
        System.out.println("l =" + l);

        // 4.Дано двузначное число. Получить число, образованное при перестановке цифр заданного числа.
        int m = i*10+g;

        System.out.println("m=" +m);

        /* Вычислить значение логического выражения при следующих значениях логических величин А, В и С: А = Истина, В = Ложь, С = Ложь:
          а) не А и В; б) А или не В; в) А и В или С.
        */

        boolean A = true;
        boolean B = false;
        boolean C = false;

        boolean D = !A&&B;
        boolean E = A||!B;
        boolean F = A&B|C;

        System.out.println("D =" +D);
        System.out.println("E =" +E);
        System.out.println("F =" +F);


        /* Вычислить значение логического выражения при следующих значениях логических величин X, Y и Z: X = Ложь,
        Y = Ложь, Z = Истина:
         */

        boolean X = false;
        boolean Y = false;
        boolean Z = true;

        boolean G = X|Y&!Z;     // а) X или Y и не Z;
        boolean H = !X&!Y;      // б) не X и не Y;
        boolean I = !(X&Z)|Y;   // в) не (X и Z) или Y;
        boolean K = X&!Y|Z;     // г) X и не Y или Z;
        boolean L = X&(!Y|Z);   // д) X и (не Y или Z);
        boolean M = X|(!(Y|Z)); //е) X или (не (Y или Z)).

        System.out.println("G =" +G);
        System.out.println("H =" +H);
        System.out.println("I =" +I);
        System.out.println("K =" +K);
        System.out.println("L =" +L);
        System.out.println("M =" +M);


        // Вычислить значение логического выражения:

        //а) x2 + y2  4при x =1, y =-1;
        int x = 1;
        int y = -1;

        boolean t = (x*x+y*y<=4) ;
        System.out.println("t =" +t);

        //б) (x>=0) или (y!=24) при x = 1, y = 2;
        x=1;
        y=2;

        boolean u = (x>=0)|(y!=24);
        System.out.println("u =" +u);

        //в) (x>=0) и (y2!=4) при x = 1, y = 2;

        boolean s = (x>=0)&(y*y!=4);
        System.out.println("s =" +s);

        //г) (x * y 0) и (y > x) при x = 2, y = 1;

        x=2;
        y=1;

        boolean O = (x*y!=0)&(y>x);
        System.out.println("O =" + O);

        //д) (x * y != 0) или (y < x) при x = 2, y = 1;

        boolean T = (x*y !=0) | (y<x);
        System.out.println("T =" +T);

        //е) (не(x * y < 0)) и (y > x) при x = 2, y = 1;

        boolean U = (!(x*y<0))&(y>x);
        System.out.println("U =" +U);

        //ж) (не(x * y < 0)) или (y > x) при x = 1, y = 2.

        x = 1;
        y = 2;

        boolean P = (!(x*y<0))|(y>x);
        System.out.println("P =" + P);


    }
}
