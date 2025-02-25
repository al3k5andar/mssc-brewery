package guru.springframework.msscbrewery.web.mapper;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

    public OffsetDateTime asOffsetDateTime(Timestamp timestamp){
        if(timestamp== null)
            return null;
        return OffsetDateTime.of(
                timestamp.toLocalDateTime().getYear(), timestamp.toLocalDateTime().getMonthValue(),
                timestamp.toLocalDateTime().getDayOfMonth(), timestamp.toLocalDateTime().getHour(),
                timestamp.toLocalDateTime().getMinute(), timestamp.toLocalDateTime().getSecond(),
                timestamp.toLocalDateTime().getNano(), ZoneOffset.UTC
        );
    }

    public Timestamp asTimestamp(OffsetDateTime offsetDateTime){
        if(offsetDateTime== null)
            return null;
        return Timestamp.valueOf(offsetDateTime.atZoneSimilarLocal(ZoneOffset.UTC).toLocalDateTime());
    }
}
