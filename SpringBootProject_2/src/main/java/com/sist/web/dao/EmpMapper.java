package com.sist.web.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.*;
import com.sist.web.vo.*;
@Mapper
public interface EmpMapper {
	/*
			empListData
	 */
	public List<EmpVO> empListData();
}
