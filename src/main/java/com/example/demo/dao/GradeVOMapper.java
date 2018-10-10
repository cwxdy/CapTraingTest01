package com.example.demo.dao;

import java.util.List;

import com.example.demo.bean.Grade;
import com.example.demo.bean.vo.GradeVO;

public interface GradeVOMapper {
	// 添加
	void addGrade(Grade grade);
	
	// 更新
	void updateGrade(Grade grade);
	
	// 删除
	void deleteGradeById(String gradeId);
	
	/**
	 * 获取年级对象
	 * @param gradeId 年级id
	 * @return
	 */
	GradeVO getGradeById(String gradeId);
	
	/**
	 * 获取年级列表
	 * @return
	 */
	List<GradeVO> getGradeList();
}
