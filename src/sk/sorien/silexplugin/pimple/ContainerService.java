package sk.sorien.silexplugin.pimple;

/**
 * @author Stanislav Turza
 */
public class ContainerService {

    private final String name;
    private final String className;

    public ContainerService(String name, String className) {
        this.name = name;

        if (!className.startsWith("\\")) {
            className = "\\" + className;
        }

        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
