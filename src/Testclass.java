public class Testclass {
        public static void main (String[] args)
        {
            Product p1 = new Product("waterbottle", 500 , 10 , new Date(9,1, 2023));
            Product p2 = new Product("schoolbag", 50 , 30 , new Date(17 , 5 , 2023));
            Product p3 = new Product("lunchbox" , 10 , 56 , new Date(7 , 2 , 2022) );
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println("The Latest product is");
            System.out.println(p1.isLatest(p1,p2));
        }

    }