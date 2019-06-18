package com.zy.designPattern.listener.version02;

import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
public class FileTopic {

    private Set<FileListener> listeners = new CopyOnWriteArraySet<>();

    /**
     * 绑定监听事件
     * @param listener
     */
    public void register(FileListener listener) {
        listeners.add(listener);
    }

    /**
     * 解绑监听事件
     * @param listener
     */
    public void unregister(FileListener listener) {
        Optional.ofNullable(listener).ifPresent(listener1 -> listeners.remove(listener1));
    }

    public void notifyImport(ImportFile importFile) {
        for (FileListener listener : listeners) {
            if (listener.isMatch(importFile.getFileMode())) {
                // 这里可自定义线程池异步执行任务
                listener.onImport(importFile);
            }
        }
    }

 /*   public void notifyExport(ExportFile exportFile) {

    }*/


}
