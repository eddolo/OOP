public class CircleClass {
        private double radius;
        private String colour;
        private double area;

        public CircleClass(double radius, String colour) {
            setRadius(radius);
            setColour(colour);
            setArea(area);
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public String getColour() {
            return colour;
        }
        public void setColour (String colour) {
            this.colour = colour;
        }
    public double getArea() {
        return area;
    }
    public void setArea (double area) {
        double radSquare = radius * radius;
        this.area = 3.14f*radSquare;
    }

}
