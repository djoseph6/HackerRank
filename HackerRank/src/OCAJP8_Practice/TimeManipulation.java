package OCAJP8_Practice;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Period pr = Period.parse("p01y");
		System.out.println(pr);

		System.out.println(LocalDateTime.now());
		
		ZoneId zn = ZoneId.of("America/New_York");
		
		LocalDateTime.now(zn);
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		
		System.out.println(LocalDateTime.now().format(dtf));
		
		Period p = Period.of(2, 1, 4);
		LocalDateTime newLDT = LocalDateTime.now().plus(p);
		
		System.out.println(newLDT.format(dtf));
		
		p = Period.ofMonths(16);
		System.out.println(p);
		System.out.println(p.normalized());
		
		
	}

}
