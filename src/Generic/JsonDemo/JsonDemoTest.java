package Generic.JsonDemo;import Bean.Person;import com.google.common.collect.Lists;import java.util.List;/** * Created by Tan on 2016/11/9. */public class JsonDemoTest {    public static void main(String ... args){        List<Person> list = Lists.newArrayList();        Person person = new Person();        person.setName("谈");        person.setSex("男");        list.add(person);        String s =  JsonParse.parseListToJson(list);        System.out.println(s);        List<Person> persons = JsonParse.fromJsonList(s,Person.class);        for (int i = 0; i < persons.size(); i++) {            Person person1 = persons.get(i);            System.out.println(person1.getName());        }    }}