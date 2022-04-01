package jjfactory.ticket.service.alarm;

import jjfactory.ticket.mapper.AlarmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AlarmServiceImpl implements AlarmService{
    private final AlarmMapper alarmMapper;
}
