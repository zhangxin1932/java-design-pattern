package com.zy.designPattern.listener.version02;

public interface FileListener {

    boolean isMatch(Integer fileMode);

    void onImport(ImportFile importFile);

    // void onExport(ExportFile exportFile);
}
