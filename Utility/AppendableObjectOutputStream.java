package com.example.group22_uber_2312262_2321374_2330201_2310256.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
