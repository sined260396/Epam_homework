package homework5.vehicle;

public abstract class PublicTransport implements Vehicle{
    String name;
    String route;
    Type type;

    @Override
    public void go() {
        System.out.println("Started the movement");
    }

    @Override
    public void stop() {
        System.out.println("Stopped the movement");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    abstract boolean babki();

    @Override
    public String toString() {
        return "Name: " + name + ", route: " + route + ", type: " + type;
    }
}
