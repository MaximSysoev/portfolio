package ru.sysoevm.printfiles;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

import static java.nio.file.FileVisitResult.*;

public class PrintFiles implements FileVisitor<Path> {

    private Path startingDir;
    private String exts;
    private int countFiles = 0;

    public int getCountFiles() {
        return countFiles;
    }

    public PrintFiles(Path startingDir, String exts) {
        this.startingDir = startingDir;
        this.exts = exts;
    }

    public boolean isExts(String path) {
        return false;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Директория: " + dir.toAbsolutePath());
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(exts)) {
            System.out.println(file.getFileName());
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return null;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return TERMINATE;
    }

    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("io/src/main/java/io/tmpdir");
        String exts = ".jpg";
        Files.walkFileTree(startingDir, new PrintFiles(startingDir, exts));
    }
}

