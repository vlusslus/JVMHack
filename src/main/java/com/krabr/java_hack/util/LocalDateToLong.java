package com.krabr.java_hack.util;

import javax.persistence.Converter;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;

@Converter
public class LocalDateToLong implements AttributeConverter<LocalDate, Long> {

    @Override
    public Long convertToDatabaseColumn(LocalDate date) {
        if (date != null) {
            long epochDay = date.toEpochDay();
            return epochDay;
        }
        return null;
    }

    @Override
    public LocalDate convertToEntityAttribute(Long epochDay) {
        // TODO Auto-generated method stub
        if (epochDay != null) {
            LocalDate date = LocalDate.ofEpochDay(epochDay);
            return date;
        }
        return null;
    }

}