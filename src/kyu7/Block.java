package kyu7;
//http://www.codewars.com/kata/55b75fcf67e558d3750000a3

public class Block {

    public int width;
    public int length;
    public int height;

    public Block(int[] block) {
        this.width = block[0];
        this.length = block[1];
        this.height = block[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return (width * length * 2) + (width * height * 2) + (length * height * 2);
    }
}
