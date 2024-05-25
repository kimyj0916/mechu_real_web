package team.mreal.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import team.mreal.demo.dao.PracticeDao;
import team.mreal.demo.dto.PracticeDto;
import team.mreal.demo.service.PracticeService;

@Service
public class PracticeServiceImpl implements PracticeService{

    @Autowired
    private PracticeDao practiceDao;

    @Override
    public List<PracticeDto> getData() {
        return practiceDao.getData();
    }

}
