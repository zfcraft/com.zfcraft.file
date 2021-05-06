package com.zfcraft.web.mapper;


import com.zfcraft.web.entity.Tbagent;
import java.util.List;

/**
 * Created by Administrator on 2018/1/16.
 */
public interface ExcelMapper {

    /**
     * 批量导入数据
     * @param tbagentList
     */
    void batchInsert(List<Tbagent> tbagentList);
}
