import java.util.ArrayList;

public class Computer implements Mobile {

    private String name;
    private double price;
    private ArrayList<String> features;
    public String getName() {

        return null;

    }

    @Override
    public String getname() {
        return null;
    }

    public double getPrice() {

        return 1.1;

    }

    public ArrayList<String> getFeatures() {
        return null;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", features=" + features +
                '}';
    }

    public Computer(String name, double price, ArrayList<String> features) {
        this.name = name;
        this.price = price;
        this.features = features;



    }

}

/*
    private class RaspberriPi {
        String getName;
        double getPrice;
        ArrayList<String> getFeatures;

        public RaspberriPi(String getName, double getPrice, ArrayList<String> getFeatures){
            this.getName = getName;
            this.getPrice = getPrice;
            this.getFeatures = getFeatures;
        }
    }
}


 */
