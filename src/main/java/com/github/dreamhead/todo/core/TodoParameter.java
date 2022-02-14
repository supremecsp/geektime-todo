package com.github.dreamhead.todo.core;

import lombok.Getter;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public final class TodoParameter {
    @Getter
    private final String content;

    private TodoParameter(final String content) {
        this.content = content;
    }

    public static TodoParameter of(final String content) {
        if (ObjectUtils.isEmpty(content)) {
            throw new IllegalArgumentException("Empty content is not allowed");
        }

        return new TodoParameter(content);
    }
}
