
public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        

        while(p.hasNext()){
            int index = p.position;
            System.out.println(p.persons[index]);
        }

        for (Person person : p) {
            int val = p.position;
                System.out.println(person.persons[val]);
           
        }


    }
}