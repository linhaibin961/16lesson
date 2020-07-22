package org.crazyit.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 *
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CreatePackage {
    public static void main(String[] args) {
        String s = "F:\\Books\\java学习\\疯狂JAVA：突破程序员基本功的16课\\codes\\04\\4.1";
        File file = new File(s);

        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        });
//        for (File file1 : files) {
//            System.out.println(file1.getAbsolutePath());
//        }
        for (File file1 : files) {
            System.out.println("file1 name " + file1.getName());

            if (file1.isFile()) {
                try {


                    String file1Name = file1.getName();
                    String temp[] = file1Name.split("\\.");
                    String fileNameNow = temp[0];
                    fileNameNow = fileNameNow.substring(0, 1).toLowerCase() + fileNameNow.substring(1);
                    File direct = new File(file.getAbsolutePath() + "\\" + fileNameNow);

                    List<String> readAllLines = Files.readAllLines(Paths.get(file1.getAbsolutePath()), Charset.forName("utf-8"));
                    String content = "package " + fileNameNow + ";";
                    writeToFile(file1, readAllLines, content);
                    if (direct.exists() || direct.mkdir()) {
//                    direct.mkdir();
                        String parent = file1.getParent();
                        System.out.println("new file path " + direct.getAbsolutePath() + "\\" + file1Name);
                        file1.renameTo(new File(direct.getAbsolutePath() + "\\" + file1Name));
                    }

                } catch (Throwable throwable) {
                    System.out.println(throwable);
                }
            }
        }

        File[] classFiles = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".class");
            }
        });
        for (File classFile : classFiles) {
            System.out.println(classFile.getAbsolutePath());
            classFile.delete();
        }
    }

    /**
     * 逐行写入文件内容，第一行是指定的
     *
     * @param fileName
     * @param contents
     * @param firstLine
     * @throws IOException
     */
    public static void writeToFile(File fileName, List<String> contents, String firstLine) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        //写入第一行
        writer.write(firstLine + "\r\n");

        //写入列表，列表是原来读入的文件
        for (String content : contents) {
            writer.write(content);
            writer.write("\r\n");//写入换行符
        }

        writer.close();
    }
}
