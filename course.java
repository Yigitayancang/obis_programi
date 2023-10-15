public class course {
    teacher teach;
    String name;
    String code;
    String prefix;
    int not ;

    course(String name , String code , String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int not ;
    }

    void addteacher(teacher teacher){
        if(teacher.branch.equals(this.prefix)){
             this.teach = teacher;
        }
        else{
            System.out.println(" öğretmen ve ders bölümleri uyuşmuyor");
        }

       
    }

    void teacherinfor(){
        this.teach.prininfo();
    }
}
