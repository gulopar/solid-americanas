package ada.tech.utils;

import org.reflections.Reflections;

import java.util.Set;

public abstract class ReflectionUtils {

    public static <T> Set<Class<? extends T>> getSubtypesOf(Class<T> clazz) {
        Reflections reflections = new Reflections("ada.tech");
        return reflections.getSubTypesOf(clazz);
    }




}
