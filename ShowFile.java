import java.io.*;

class ShowFile {
public static void main(String args[]) throws IOException {
String source = "Hello World";
byte buf[] = source.getBytes();
FileInputStream tin;
int i;
try {
FileOutputStream fi = new FileOutputStream("file.txt");
for (i = 0; i < buf.length; i++)
fi.write(buf[i]);
fi.close();
} catch (IOException e) {
System.out.println("An I/O Error Occurred");
}
try {
tin = new FileInputStream(args[0]);
} catch (FileNotFoundException e) {
System.out.println("File not found");
return;
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Usage: ShowFile <file>");
return;
}
do {
i = tin.read();
if (i != -1)
System.out.print((char) i);
} while (i != -1);
tin.close();
}
}

