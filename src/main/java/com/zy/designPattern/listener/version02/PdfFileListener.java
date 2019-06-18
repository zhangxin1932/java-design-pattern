package com.zy.designPattern.listener.version02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PdfFileListener implements FileListener {

    @Autowired
    private FileTopic fileTopic;

    @Override
    public boolean isMatch(Integer fileMode) {
        return FileType.pdf.getFileMode().equals(fileMode);
    }

    @Override
    public void onImport(ImportFile importFile) {
        // 这里执行具体的导入任务
        System.out.println("导入pdf文件, 名称-->" + importFile.getFileName());
    }

    @PostConstruct
    public void init() {
        fileTopic.register(this);
    }

}
