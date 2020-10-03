package com.azarenka.batwriter.services;

import java.util.List;

public interface IWriter {

    /**
     * Writes document witch contains strings. Writes them in the order in which they arrive at the method.
     *
     * @param strings strings
     */
    void writeDocument(List<String> strings);
}
