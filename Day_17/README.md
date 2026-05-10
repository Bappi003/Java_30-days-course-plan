#  Example 1
~~~ java
import java.io.FileInputStream;
import java.io.IOException;

public class IT24046 {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {

            // Open file
            fileInputStream =
                    new FileInputStream("example.txt");

            int byteData;

            // Read bytes until end of file
            while((byteData =
                    fileInputStream.read()) != -1) {

                // Convert byte to character
                System.out.print((char) byteData);
            }

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close stream
            if(fileInputStream != null) {

                try {

                    fileInputStream.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
~~~
#  Example 2
~~~ java
import java.io.FileOutputStream;
import java.io.IOException;

public class IT24046 {

    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;

        try {

            // Create output stream
            fileOutputStream =
                    new FileOutputStream("output.txt");

            String data = "Hello, World!";

            // Convert string to bytes
            byte[] byteData = data.getBytes();

            // Write bytes
            fileOutputStream.write(byteData);

            System.out.println(
                    "Data written successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close stream
            if(fileOutputStream != null) {

                try {

                    fileOutputStream.close();
                }
                catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
~~~
#  Exampple 3
~~~ java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IT24046 {

    public static void main(String[] args) {

        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {

            // Read source file
            inputFile =
                    new FileInputStream("source.txt");

            // Write destination file
            outputFile =
                    new FileOutputStream("destination.txt");

            int byteData;

            // Copy bytes
            while((byteData =
                    inputFile.read()) != -1) {

                outputFile.write(byteData);
            }

            System.out.println(
                    "File copied successfully.");

        }
        catch (IOException e) {

            e.printStackTrace();
        }

        finally {

            // Close streams
            try {

                if(inputFile != null)
                    inputFile.close();

                if(outputFile != null)
                    outputFile.close();

            }
            catch (IOException e) {

                e.printStackTrace();
            }
        }
    }
}
~~~
