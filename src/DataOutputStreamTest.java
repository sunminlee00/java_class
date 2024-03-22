import java.io.*;

public class DataOutputStreamTest {
    public static void main(String[] args) {

       DataOutputStream dos= null;
        try {
            dos=new DataOutputStream(
                    new FileOutputStream("./hello.txt"));
            dos.writeUTF("안녕하세요");
            dos.writeInt(20);
            dos.writeBoolean(true);
            dos.writeDouble(10.2);
            System.out.println("쓰기 성공!!!");
        }catch(IOException e)
        {
            System.out.println(e);
        }finally{
            if(dos!=null) try{ dos.close();} catch(IOException e){}
        }

    }
}
