class Geometry {
    float areaOfRect (float l, float b) {
        return l * b;
    }

    static float volumeOfCylinder (float r, float h) {
        return (22.0f / 7) * r * r * h;
    }

    float areaOfCircle (float r) {
        return (22.0f / 7) * r * r;
    }

    public static void main (String [] args) {
        Geometry geo = new Geometry();

        float rectArea = geo.areaOfRect(3.5f, 2);
        float circleArea = geo.areaOfCircle(2);
        float volCylinder = volumeOfCylinder(3.3f, 5);

        System.out.println("Area of Rectangle: " + rectArea);
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Volume of Cylinder: " + volCylinder);
}
}