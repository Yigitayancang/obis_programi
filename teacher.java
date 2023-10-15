public class teacher {
    String name;
    String mphone;
    String branch;

    teacher(String name , String mphone , String branch){
        this.name = name;
        this.mphone= mphone;
        this.branch = branch;
    }

    void prininfo(){
        System.out.println("ADI : " + this.name);
        System.out.println("TELEFON : " + this.mphone);
        System.out.println("BRANŞ : " + this.branch);
    }   
}
