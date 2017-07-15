package com.coderising.payroll.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public final class DateUtil {
    public static boolean isFriday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return 6 == calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static Date add(Date date, int days) {
        return DateUtils.addDays(date, days);
    }

    public static boolean isLastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date lastDayOfMonth = calendar.getTime();
        return DateUtils.isSameDay(lastDayOfMonth, date);
    }

    public static Date parseDate(String s) {
        try {
            return DateUtils.parseDate(s, "yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("日期转换异常");
        }
    }

    /**
     * 计算相差天数（按时间计算，相差23小时不算一天）
     * @param startDate
     * @param endDate
     * @return
     */
    public static long getDaysBetween(Date startDate, Date endDate) {
        return (endDate.getTime() - startDate.getTime()) / 1000 / 60 / 60 / 24;
    }

    public static Date getFirstDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    public static boolean between(Date date, Date start, Date end) {
        return date.getTime() > start.getTime() && date.getTime() < end.getTime();
    }
}
