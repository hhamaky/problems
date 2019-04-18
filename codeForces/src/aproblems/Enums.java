package aproblems;

import java.util.function.Function;

public class Enums {
    public static void main(String[] args) {
        System.out.println(FunctionBasedEnum.username.apply("test"));
        System.out.println(FunctionBasedEnum.username.zoneName.apply("4"));

    }

    enum FunctionBasedEnum {
        username(s -> s + "2"),
        zoneName(s -> {
            int x = Integer.parseInt(s.toString());
            return x + 2;
        });

        private final Function o;

        FunctionBasedEnum(Function o) {
            this.o = o;
        }

        public Object apply(String s) {
            return this.o.apply(s);
        }
    }
}