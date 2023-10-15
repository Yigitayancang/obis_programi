public class mains {
    public static void main(String[] args) {
        teacher t1 = new teacher("mahmut", "0000", "THR");
        teacher t2 = new teacher("ahmet", "055555", "FZK");
        teacher t3 = new teacher("mehmet", "00055", "mat");
        
        course ders1 = new course("TARİH", "THR1", "THR");
        course ders2 = new course("fizik", "FZK1", "FZK");
        course ders3 = new course("matematik", "mat1", "mat");
        ders3.addteacher(t3);
        ders2.addteacher(t2);
        ders1.addteacher(t1);
         
        student s1 = new student("ahmet", "871", "10/c", ders1, ders2, ders3);

        s1.addbulkexemnot(40 , 30 , 20);
        s1.ispass();
        
    }
}
