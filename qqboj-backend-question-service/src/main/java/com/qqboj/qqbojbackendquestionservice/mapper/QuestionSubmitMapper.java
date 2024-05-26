package com.qqboj.qqbojbackendquestionservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qqboj.qqbojbackendmodel.model.entity.QuestionSubmit;

/**
* @author 22384
* @description 针对表【question_submit(题目提交)】的数据库操作Mapper
* @createDate 2024-03-13 11:57:19
* @Entity generator.domain.QuestionSubmit
*/
public interface QuestionSubmitMapper extends BaseMapper<QuestionSubmit> {

    QuestionSubmit getQuestionSubmitById(long questionSubmitId);

    boolean updateQuestionSubmitById(QuestionSubmit questionSubmit);
}




