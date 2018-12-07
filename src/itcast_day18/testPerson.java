package itcast_day18;

public class testPerson {
    public static  void main(String[] args){
    Person p = new Person("韩kkk梅",28);
    String s = p.toString();
    System.out.println(s);
    int j = p.hashCode();
    System.out.println(j);
    }
}
