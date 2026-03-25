package Unit3Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

class employee{
    int id;
    String name;
    int salary;

    employee(int id,String name,int salary){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }
    public String getname(){
        return name;

    }
    public int salary(){
        return salary;
    }
}
public class MapFilter {
    public static void main(String[] args) {
        List<employee> l2=Arrays.asList(
            new employee(1, "Daksh", 55000),
            new employee(2, "Deepak", 40000)
        );

        List<String> s1=employee.stream()
        .filter(s->salary>60000)
        .map(s->s.getname())
        .forEach(s->System.out.println(s));
        
    }
}
