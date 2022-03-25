package jjfactory.ticket.service.match;


import jjfactory.ticket.mapper.MatchMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class MatchServiceImpl implements MatchService{
    private final MatchMapper matchMapper;
}
