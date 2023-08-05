class javaTrainee {

    String name, mob, clg;
    int age, id;

    public static void main(String[] args) {
        javaTrainee t = new javaTrainee(); // 1 object

         System.out.println(t);
        //  t.viewInfo();
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

        t.setdata();
        t.viewInfo();

    }

    private void viewInfo() {
        System.out.println(name + " " + clg + " " + mob);
        System.out.println(age + " " + id);
    }

    void setdata() {
        name = "nsp";
        mob = "898900";
        clg = "LIT";
        age = 24;
        id = 6789;

    }

}