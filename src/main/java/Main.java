//package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void convert(String json, String xml) throws IOException {
        String s = readUsingFiles(json);
        ObjectMapper mapper = new ObjectMapper();
        database DB = mapper.readValue(s, database.class);
        XmlMapper mapper2 = new XmlMapper();
        FileWriter writer = new FileWriter(xml);
        mapper2.writeValue(writer, DB);
    }

    public static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) throws IOException {

        String xml;
        String json;
        Scanner in = new Scanner(System.in);
        json = new String(in.nextLine());
        xml = new String(in.nextLine());
        convert(json, xml);
    }
}
