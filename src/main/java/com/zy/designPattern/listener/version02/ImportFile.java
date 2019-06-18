package com.zy.designPattern.listener.version02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImportFile {

    private String fileName;
    private Integer fileMode;

}
