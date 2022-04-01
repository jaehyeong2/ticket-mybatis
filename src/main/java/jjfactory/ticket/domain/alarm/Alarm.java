package jjfactory.ticket.domain.alarm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public class Alarm {

    private String service;
    private String message;
    private String mobile;
    private String template;
    private String callbackNo;
    private String backupMessage;
    private String backupProcessCode;
    private List<Map<String, String>> buttons;
}
