package jjfactory.ticket.config.converter;

import jjfactory.ticket.domain.user.enums.Gender;
import org.springframework.core.convert.converter.Converter;

import java.util.Locale;

public class StringToGender implements Converter<String, Gender> {

    @Override
    public Gender convert(String source) {
        return Gender.valueOf(source.toUpperCase());
    }
}
