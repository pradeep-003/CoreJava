package Inheritance;

class DB_Driver {

    public void getDriver() {

        System.out.println("Type-1 Driver");

    }
}
        class New_DB_Driver extends DB_Driver {

            public void getDriver() {

                System.out.println("Type-4-Driver");

            }
        }
                class Test1 {

                    public static void main(String args[]) {

                        DB_Driver driver = new New_DB_Driver();

                        driver.getDriver();

                    }
                }