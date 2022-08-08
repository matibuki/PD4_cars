public class Dimension {
    private int height;
    private int width;
    private int trunkCapacity;

    public Dimension(int height, int width, int trunkCapacity) {
        this.height = height;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }


    ////////////height
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    ///////////////width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /////////////trunkCapacity
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

}
