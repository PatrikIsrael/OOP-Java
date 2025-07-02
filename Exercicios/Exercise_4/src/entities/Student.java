package entities;

public class Student {

        public String name;
        public int note1, note2, note3;


        public void verificarNotas() {
       int total = note1 + note2 + note3;

        System.out.println("final grade = " + total);

                if(total < 60){
                    int result = 60 - total;
                    System.out.println("Failed");
                    System.out.println("Missin " + result + " Points");
                }else {
                    System.out.println("Pass");
                }
    }
}
