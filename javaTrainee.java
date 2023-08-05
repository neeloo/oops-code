class javaTrainee {
    
     String name, mob,clg;
    int age, id;
    public static void main(String[] args) {
       javaTrainee t=new javaTrainee();
       System.out.println(t);

       t.viewInfo();

       t.name="nilu";
       t.clg="LIT";
       t.mob="5767789";
       t.age=24;
       t.id=1419;
       t.viewInfo();
       
       javaTrainee t1=new javaTrainee();
       System.out.println(t1);

       t1.viewInfo();

       t1.name="swatantar";
       t1.clg="LIT";
       t1.mob="5767789";
       t1.age=24;
       t1.id=1914;
       t1.viewInfo();

       javaTrainee t2;
       t2=new javaTrainee();
       System.out.println(t2);

    }

    private void viewInfo(){
        System.out.println(name+" "+clg +" "+mob);
        System.out.println(age +" "+id);
    }
   
}