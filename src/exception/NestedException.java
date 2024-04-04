package exception;

public class NestedException {
    public static void main(String[] args) {
        try {
            System.out.println("1");
//            throw new Exception("Exception 1");
            try {
                System.out.println("2");
//                throw new Exception("Exception 2");
                try {
                    System.out.println("3");
                    throw new Exception("Exception 3");
                } catch (Exception e) {
                    System.out.println("Catch 3");
                } finally {
                    System.out.println("Finally 3");
                }
                throw new Exception("Exception 2");
            } catch (Exception e) {
                System.out.println("Catch 2");
            } finally {
                System.out.println("Finally 2");
            }
            throw new Exception("Exception 1");
        } catch (Exception e) {
            System.out.println("Catch 1");
        } finally {
            System.out.println("Finally 1");
        }

        try {
            System.out.println("4");
            throw new Exception("Exception 4");
        } catch (Exception e) {
            System.out.println("Catch 4");
        } finally {
            System.out.println("Finally 4");
        }
    }
}
