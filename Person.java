import java.util.Iterator;

public class Person implements Iterable<Person>, Iterator<Person> {
    
    int size = 0;
    String[] persons;
    int position = -1;

    public Person(){
        this.size = 5;
        persons = new String[size];


        persons[0] = "abdullah";
        persons[1] = "jarar";
        persons[2] = "FAiz";
        persons[3] = "khan";
        persons[4] = "rhamat";
    }

    @Override
    public Iterator<Person> iterator() {
       
        return this;
    }

    @Override
    public boolean hasNext() {
      
        if(position < size - 1 ){
            position ++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person next() {
       
        return (Person) iterator();
    }

}
