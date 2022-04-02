package jjfactory.ticket.config.converter;

import jjfactory.ticket.domain.user.enums.EventAgreement;
import org.springframework.core.convert.converter.Converter;

public class StringToEvent implements Converter<String, EventAgreement> {

    @Override
    public EventAgreement convert(String source) {
        return EventAgreement.valueOf(source.toUpperCase());
    }
}
