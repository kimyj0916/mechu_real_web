package team.mreal.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import team.mreal.demo.dto.PracticeDto;

@Mapper
public interface PracticeDao {
    List<PracticeDto> getData();


    
}