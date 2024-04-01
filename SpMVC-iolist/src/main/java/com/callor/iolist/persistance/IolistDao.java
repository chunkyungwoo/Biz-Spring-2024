package com.callor.iolist.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.callor.iolist.models.IolistVO;

public interface IolistDao {
	
	@Select(" SELECT * FROM tbl_iolist"
			+ " ORDER BY seq")
	public List<IolistVO> selectAll();
	
	public int insert(IolistVO vo);
	
	@Select(" SELECT * FROM tbl_iolist "
			+ " WHERE seq = #{seq} ")
	public IolistVO findById(String seq);
	
	public int update(IolistVO iolistVO);
	
	@Delete(" DELETE FROM tbl_iolist WHERE seq = #{seq}")
	public int delete(String seq);

}
