package com.zy.designPattern.listener.version02;

import lombok.Data;
import lombok.Getter;

public enum FileType {

    excel(1), pdf(2);

    @Getter
    private Integer fileMode;

    private FileType(Integer fileMode) {
        this.fileMode = fileMode;
    }
}
