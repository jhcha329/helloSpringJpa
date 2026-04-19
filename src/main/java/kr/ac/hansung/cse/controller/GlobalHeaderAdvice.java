package kr.ac.hansung.cse.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@ControllerAdvice
public class GlobalHeaderAdvice {

    private static final DateTimeFormatter PRACTICE_TIMESTAMP_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy 년 MM 월 dd 일 (E) a hh:mm:ss", Locale.KOREAN);

    @ModelAttribute("practiceTimestamp")
    public String practiceTimestamp() {
        return LocalDateTime.now().format(PRACTICE_TIMESTAMP_FORMATTER);
    }
}
