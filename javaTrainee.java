// import java.util.Scanner;

class javaTrainee {
    String name, mob, clg;
    int age, id;

    public static void main(String[] args) {
        // javaTrainee t = new javaTrainee(); // 1 object
        // System.out.println(t);
        // t.viewInfo();
        // t.name = "nilu";
        // t.clg = "LIT";
        // t.mob = "5767789";
        // t.age = 24;
        // t.id = 1419;
        // t.viewInfo();

        // javaTrainee t1 = new javaTrainee(); //2 obj
        // System.out.println(t1);

        // t1.viewInfo();

        // t1.name = "swatantar";
        // t1.clg = "LIT";
        // t1.mob = "5767789";
        // t1.age = 24;
        // t1.id = 1914;
        // t1.viewInfo();

        // javaTrainee t2, t3;
        // t2 = new javaTrainee(); //3 obj
        // System.out.println(t2);
        // System.out.println(new javaTrainee()); //4 obj

        // t2=t1; //for same referance id
        // System.out.println(t1);
        // System.out.println(t2);
        // t2.name="swtantarnilu"; //change the name using 2 obj
        // t1.viewInfo();

        // t.setdata();
        // t.viewInfo();

        // javaTrainee t2 = new javaTrainee();
        // t2.setdata("nilu", "LIT", "9087", 23, 909);
        // System.out.println("first info**********");
        // t2.viewInfo();

        // javaTrainee t3 = new javaTrainee();
        // t3.setdata("nilu singh", "LIT lko", "9087688899", 24, 9098899);
        // System.out.println("second info******");
        // t3.viewInfo();

        // take user input

        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("enter the name");
        String n = s.next();
        System.out.println("enter the clgname");
        String c = s.next();
        System.out.println("enter the mobile");
        String m = s.next();
        System.out.println("enter age");
        int a = s.nextInt();
        System.out.println("enter id");
        int i = s.nextInt();
        javaTrainee t4 = new javaTrainee();
        t4.setdata(n, c, m, a, i);
        t4.viewInfo();

    }

   
    private void viewInfo() {
        System.out.println(name);
        System.out.println(clg);
        System.out.println(mob);
        System.out.println(age);
        System.out.println(id);
    }

     //non parameterised method
    void setdata() {
    name = "nsp";
    mob = "898900";
    clg = "LIT";
    age = 24;
    id = 6789;

    }

    // parametriged method
    void setdata(String n, String c, String m, int a, int i) {
        name = n;
        mob = m;
        clg = c;
        age = a;
        id = i;

    }

}