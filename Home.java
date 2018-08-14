package home;

public class Home {

    //PROPERTY : prpperty of object
    double width;
    double size;
    double height;

    public static void main(String[] args) {

        //INSTANCE : exampe class
        Home homeObject = new Home();

        homeObject.width = 4;
        homeObject.size = 3;
        homeObject.height = 5;

        System.out.println("Width        : " + homeObject.width);
        System.out.println("Size       : " + homeObject.size);
        System.out.println("Height : " + homeObject.height);
    }

}
