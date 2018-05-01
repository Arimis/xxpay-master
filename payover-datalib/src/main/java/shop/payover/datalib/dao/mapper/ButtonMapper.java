package shop.payover.datalib.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import shop.payover.datalib.dao.model.Button;
import shop.payover.datalib.dao.model.ButtonExample;

public interface ButtonMapper {
    int countByExample(ButtonExample example);

    int deleteByExample(ButtonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Button record);

    int insertSelective(Button record);

    List<Button> selectByExample(ButtonExample example);

    Button selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByExample(@Param("record") Button record, @Param("example") ButtonExample example);

    int updateByPrimaryKeySelective(Button record);

    int updateByPrimaryKey(Button record);
}