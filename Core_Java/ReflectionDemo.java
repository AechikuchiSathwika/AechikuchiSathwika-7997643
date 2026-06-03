import java.lang.reflect.*;
class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Student");
            System.out.println("Class Name: "
                    + cls.getName());
            Method[] methods =
                    cls.getDeclaredMethods();
            System.out.println("\nMethods:");
            for(Method m : methods) {
                System.out.print(m.getName()
                        + "(");
                Parameter[] params =
                        m.getParameters();
                for(Parameter p : params) {
                    System.out.print(
                        p.getType().getSimpleName()
                        + " "
                        + p.getName() + " "
                    );
                }
                System.out.println(")");
            }
            Object obj = cls.getDeclaredConstructor()
                       .newInstance();
            Method method =
                    cls.getDeclaredMethod("display");
            method.invoke(obj);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}