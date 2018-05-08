import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class testUrlImg {
    public static void main(String[] args) {
        if(isOversize("http://pic.58pic.com/58pic/14/64/56/25h58PIC3eG_1024.jpg")){

        }
    }
    private static boolean isOversize(String imageUrl) {
        File file = new File("OversizeTem");
        try (
                BufferedInputStream bis = new BufferedInputStream(new URL(imageUrl).openStream());
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        ) {
            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] bytes = new byte[1024];
            int len;
            while ( (len = bis.read(bytes,0,1024)) > 0) {
                bos.write(bytes, 0, len);
            }
            bos.flush();
            System.out.println(file.length()*1.0/1024);

            if(file.length() > 2*1024*1024) {
                return true;
            }
        } catch (Exception e) {
        }
        file.delete();

        return false;
    }
}
