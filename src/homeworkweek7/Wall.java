package homeworkweek7;

public class Wall {
    //declare two  Instance variable
        double width;
        double height;
        public Wall() {//no argument constructor
            this.width = 0;
            this.height = 0;
        }
        public Wall(double width, double height) {//two parameters
            this.width = width;
            this.height = height;
        }
        //method with one parameter of type double
        public double getWidth() {
            return width;
        }
        public double getHeight() {
            return height;
        }

        {
        }public void setWidth(double width) {
            this.width = (width < 0) ? 0 : width;
        }
        //set width with one parameter type double

        public void setHeight(double height) {
            this.height = (height < 0) ? 0 : height;}//set height with one parameter type double
            public double getArea() {  //method getArea without any parameter
                return width * height;
            }


        public static void main(String[] args) {
            Wall wall = new Wall(5,4);
            System.out.println("area="+wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width="+wall.getWidth());
            System.out.println("height="+wall.getHeight());
            System.out.println("area="+wall.getArea());
        }

    }

