package computer;

public class VideoCard {
    private String name;
    private int gigabyte;

    public VideoCard(String name, int gigabyte) {
        this.gigabyte = gigabyte;
        this.name = name;
    }

    @Override
    public String toString() {
        return "VideoCard: " +
                "name: " + name + '\'' +
                ", gigabyte: " + gigabyte;
    }

    public int getGigabyte() {
        return gigabyte;
    }

    public void setGigabyte(int gigabyte) {
        this.gigabyte = gigabyte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
