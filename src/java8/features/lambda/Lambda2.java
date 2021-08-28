package java8.features.lambda;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Lsmbda2.java
 * @Description TODO
 * @createTime 2021年08月25日 21:59:00
 */
public class Lambda2 {

    public static interface Converter<F,T>{
        T convert(F from);
    }

    static class Something{
        String statsWith(String s){
            return String.valueOf(s.charAt(0));
        }
    }

    interface PersonFactory<P extends Person>{
        P create (String firstName,String lastName);
    }

    public static void main(String[] args){
        Converter<String,Integer> integerConverter=(from -> Integer.valueOf(from));
        Integer converted1 = integerConverter.convert("123");
        System.out.println(converted1);

        Converter<String,Integer> integerConverter2 = Integer::valueOf;
        Integer converterd2 = integerConverter2.convert("123");
        System.out.println(converterd2);

        Something something = new Something();

        Converter<String ,String> stringStringConverter = something::statsWith;
        String converted3 = stringStringConverter.convert("Java");
        System.out.println(converted3);

        PersonFactory<Person> personPersonFactory= Person::new;
        Person person = personPersonFactory.create("Peter","Parket");
    }
}
