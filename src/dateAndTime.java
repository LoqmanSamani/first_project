import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class dateAndTime{
	public static void main(String[] args){
		// how to work with dates and times using java
		// (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
		
		// default formats
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		Instant instant = Instant.now();
		System.out.println(instant);

		// custom formats
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String newDateTime = dateTime.format(formatter);
		System.out.println(newDateTime);
		
		LocalDate customDate = LocalDate.of(2026, 12, 25);
		System.out.println(customDate);

		LocalDateTime customDateTime1 = LocalDateTime.of(2027, 1, 1, 0, 0, 0);
		System.out.println(customDateTime1);

		LocalDateTime customDateTime2 = LocalDateTime.of(2027, 1, 1, 0, 0, 0);
		System.out.println(customDateTime2);

		if (customDateTime1.isBefore(customDateTime2)){
			System.out.printf("%s is earlier than %s%n", customDateTime1, customDateTime2);
		}else if (customDateTime1.isAfter(customDateTime2)){
			System.out.printf("%s is later than %s%n", customDateTime1, customDateTime2);
		}else if (customDateTime1.isEqual(customDateTime2)){
			System.out.printf("%s is equal to %s%n", customDateTime1, customDateTime2);
		}

	}

}
