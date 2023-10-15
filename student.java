import java.nio.charset.CoderResult;

public class student {
    course c1;
    course c2;
    course c3;
    String name;
    String no;
    String clases;
    double ort;
    boolean ispass;

    student(String name , String no , String clases ,course c1 , course c2  , course c3 ){

         this.name = name;
         this.no = no;
         this.clases = clases;
         this.c1 = c1;
         this.c2= c2;
         this.c3 = c3;
         this.ort = 0.0; 
         this.ispass = false;  

    }

    void addbulkexemnot(int note1 , int note2 , int note3){
        if(note1 >=0 && note1 <=100 ){
            this.c1.not = note1;
        }
        if(note2 >=0 && note2 <=100 ){
            this.c2.not = note2;
        }
        if(note3 >=0 && note3 <=100 ){
            this.c3.not = note3;
        }
    }

    void ispass(){
        this.ort=(this.c1.not + this.c2.not + this.c3.not) / 3.0;
        if(this.ort > 50){
            System.out.println("geçti");
            this.ispass = true;
        }
        else{
            System.out.println("kaldı");
            this.ispass = false;
        }

        printnote();
    }


    void printnote(){
        System.out.println(this.c1.name + "notu : " + this.c1.not);
        System.out.println(this.c2.name + "notu : " + this.c2.not);
        System.out.println(this.c3.name + "notu : " + this.c3.not);
        System.out.println("ORTALAMA : " + this.ort );
    }


}

