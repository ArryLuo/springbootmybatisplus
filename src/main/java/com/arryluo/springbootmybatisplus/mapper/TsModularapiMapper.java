package com.arryluo.springbootmybatisplus.mapper;

import com.arryluo.springbootmybatisplus.entity.TsModularapi;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author arryluo
 * @since 2018-12-27
 */
public interface TsModularapiMapper extends BaseMapper<TsModularapi> {
    Map<String, Object> sysInfo();
}
