package java8.features.lambda;

/**
 * @author dong
 * @version 1.0.0
 * @ClassName Inteface1.java
 * @Description TODO
 * @createTime 2021年08月22日 20:07:00
 */
public class Inteface1 {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate( 100));
        System.out.println(formula.sqrt(-23));
        System.out.println(Formula.positive(-1));
    }
}
