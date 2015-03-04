package com.steve.plugin.restart;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;

public class RestartAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        ApplicationManager.getApplication().restart();
    }
}
