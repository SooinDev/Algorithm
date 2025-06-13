import java.time.*;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneOffset.UTC);
        
        System.out.println(utcTime.getYear());      // 연도
        System.out.println(utcTime.getMonthValue()); // 월 (1-12)
        System.out.println(utcTime.getDayOfMonth()); // 일
    }
}