package com.shuzijun.leetcode.plugin.actions.editor;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.shuzijun.leetcode.plugin.manager.CodeManager;
import com.shuzijun.leetcode.plugin.model.Config;
import com.shuzijun.leetcode.plugin.model.Question;

/**
 * @author shuzijun
 */
public class SubmitAction extends AbstractEditAsynAction {

    @Override
    public void perform(AnActionEvent anActionEvent, Config config, Question question) {
        CodeManager.SubmitCode(question, anActionEvent.getProject());
    }
}
