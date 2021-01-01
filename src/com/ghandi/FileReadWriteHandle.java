package com.ghandi;

import java.io.File;
import java.io.IOException;

public class FileReadWriteHandle {
    private File filePhat;

    public FileReadWriteHandle(File filePhat) {
        this.filePhat = filePhat;
        checkFileExists(this.filePhat);
    }

    public FileReadWriteHandle( String StringFileName ) {
        this.filePhat = new File(StringFileName);
        checkFileExists(this.filePhat);
    }

    private void checkFileExists(File filePhat) {
        try {
            if (! filePhat.exists()){
                filePhat.createNewFile();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
