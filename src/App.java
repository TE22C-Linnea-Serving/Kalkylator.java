public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int tal1 = 23;
        double tal2 = 45.0;
        double summa;
        double produkt; 

        summa = tal1+tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);

        summa = tal1-tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);

        int tal3 = 234232;
        int tal4 = 3424;

        produkt = tal3*tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);

        produkt = tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);

        System.out.println(tal1+"/"+tal2+"="+(tal1/tal2));

        int tal5 = 10;
        int tal6 = 3;
        double kvot = (double)tal6/tal3;

        System.out.println(tal6+"/"+tal3+"="+kvot);

        System.out.println("Rest av tal5/tal6 = "+(tal5%tal6));
        System.out.println("Rest av 12/4 = "+(12%4));


    }
}
