package com.example.scandaemon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liyanhao9999@outlook.com
 * @date 2022/3/2 17:14
 *  图片扫描处理类
 */
public class ImageHandle {

    /**
     * 1 扫描一张图片
     * 2 创建文件夹
     * 3 并返回图片文件路径
     */
    public static void getOneImage(){
        //通过命令扫描图片


    }

    /**
     * 1 扫描扫描仪中所有的图片
     * 2 文件夹的路径
     */
    public static void getListImages(){

    }

    /**
     * 清理扫描文件夹中所有的图片
     */
    public static void clearAllImages(){

    }

    /**
     * 根据路径删除一张图片
     * @param filePath
     */
    public static void removeImage(String filePath){

    }

    /**
     * 执行linux命令
     * @param commands
     * @return
     */
    public List<String> executeNewFlow(List<String> commands) {
        List<String> rspList = new ArrayList<String>();
        Runtime run = Runtime.getRuntime();
        try {
            Process proc = run.exec("/bin/bash", null, null);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(proc.getOutputStream())), true);
            for (String line : commands) {
                out.println(line);
            }
            // out.println("cd /home/test");
            // out.println("pwd");
            // out.println("rm -fr /home/proxy.log");
            // 这个命令必须执行，否则in流不结束。
            out.println("exit");
            String rspLine = "";
            while ((rspLine = in.readLine()) != null) {
                System.out.println(rspLine);
                rspList.add(rspLine);
            }
            proc.waitFor();
            in.close();
            out.close();
            proc.destroy();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rspList;
    }

}
