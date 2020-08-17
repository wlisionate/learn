import model.Duck;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectTest {
    public static void main(String[] args) throws Exception {
        Class<Duck> duckClass = Duck.class;
        Duck duck = duckClass.newInstance();
        System.out.println(duck);
        Constructor<Duck> constructor = duckClass.getConstructor(String.class, Integer.class);
        Duck duck1 = constructor.newInstance("小黄鸭", 2);
        System.out.println(duck1);
        Field[] declaredFields = duckClass.getDeclaredFields();
        for(Field field:declaredFields){
            field.setAccessible(true);
            System.out.println(field.getName()+":"+field.get(duck1));
        }
        Method method = duckClass.getDeclaredMethod("setAge",Integer.class);
        method.invoke(duck1,3);
        System.out.println(duck1);
    }
}
