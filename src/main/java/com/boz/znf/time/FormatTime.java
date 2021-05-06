package com.boz.znf.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ZhangNanFu
 * @date 2021年05月03日 11:39
 */
public class FormatTime {
    public static String formatStander() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(fmt);
    }
}
