package ru.gb.family_tree.file_work;

import java.io.Serializable;

public interface Writable {
    public boolean write(Serializable serializable, String fileName);
    public Object read(String fileName);
}
