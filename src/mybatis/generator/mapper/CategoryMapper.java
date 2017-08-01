package mybatis.generator.mapper;

import mybatis.generator.model.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}