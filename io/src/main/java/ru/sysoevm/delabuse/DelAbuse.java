package ru.sysoevm.delabuse;

import java.io.*;

public class DelAbuse {
   public void dropAbuses(InputStream in, OutputStream out, String[] abuse) throws IOException {
        try (
                BufferedReader bf = new BufferedReader(new InputStreamReader(in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
        ) {
            String line;
            while ((line=bf.readLine())!=null) {
                for(String s : abuse)  {
                    if (line.contains(s)) {
                        line = line.replaceAll(s, "");
                    }
                }
                bw.write(line + System.lineSeparator());
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
