package module_21.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date date = new Date();
    LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    System.out.println(ld);
//    LocalDate localDate = convert(date, new LocalDate(2000,0,0));
//    LocalDate localTime = convert(date, new LocalTime(2000,0,0,0));
//    LocalDate localDateTime = convert(date, new LocalDateTime(localDate,localTime));
//
//    System.out.println(localDate);
//    System.out.println(localTime);
//    System.out.println(localDateTime);
  }

  private static <T> T convert(Date date, T convertDate) {
    if (convertDate instanceof LocalDate) convertDate = (T) date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    else if (convertDate instanceof LocalTime)
      convertDate = (T) date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    else if (convertDate instanceof LocalDateTime)
      convertDate = (T) date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    return convertDate;
  }
}
