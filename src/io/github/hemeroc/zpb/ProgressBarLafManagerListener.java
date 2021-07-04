package io.github.hemeroc.zpb;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ProgressBarLafManagerListener implements LafManagerListener {

    public ProgressBarLafManagerListener() {
        updateProgressBarUI();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUI();
    }

    private static void updateProgressBarUI() {
        UIManager.put("ProgressBarUI", ProgressBarUI.class.getName());
        UIManager.getDefaults().put(ProgressBarUI.class.getName(), ProgressBarUI.class);
    }
}
