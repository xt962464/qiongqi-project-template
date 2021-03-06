package com.qiongqi.video.guaikavideo.modules.user.service;

import com.qiongqi.video.guaikavideo.config.MybatisPlus.service.BaseService;
import com.qiongqi.video.guaikavideo.modules.user.dto.VUserDTO;
import com.qiongqi.video.guaikavideo.modules.user.entity.VUserEntity;
import com.qiongqi.video.guaikavideo.utils.page.PageData;

import java.util.List;
import java.util.Map;

/**
 * Description: 【 用户表 Service接口 】
 *
 * @author : ※狗尾巴草
 * @version : 1.0.0
 * @email : "m962464oo@gmail.com"
 * @date : 2021-01-16 14:22:50
 */
public interface VUserService extends BaseService<VUserEntity> {

    // ==================== 查询 ====================

    /**
     * Description:【 分页条件查询 】
     *
     * @param queryParams 查询参数
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    PageData<VUserDTO> page(Map<String, Object> queryParams);

    /**
     * Description:【 条件查询 】
     *
     * @param queryParams 查询参数
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    List<VUserDTO> list(Map<String, Object> queryParams);

    /**
     * Description:【 通过ID获取单条数据 】
     *
     * @param id
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    VUserDTO get(Long id);

    // ==================== ADD、MODIFY、REMOVE ===================

    /**
     * Description:【 保存到数据库中 】
     *
     * @param dto 数据
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    VUserEntity save(VUserDTO dto);

    /**
     * Description:【 修改数据 】
     *
     * @param dto 数据
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    boolean update(VUserDTO dto);

    /**
     * Description:【 通过ID删除数据 】
     *
     * @param id
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    boolean delete(Long id);

    /**
     * Description:【 通过ID数组,批量删除定时任务 】
     *
     * @param ids ID数组
     * @return
     * @author: ※狗尾巴草
     * @email: "m962464oo@gmail.com"
     * @date: 2021-01-16 14:22:50
     */
    boolean deleteBatch(Long[] ids);

//    VUserDTO getByWxId(String wxId);

    List<VUserDTO> getByUserName(String userName);

    VUserDTO getByWxIdAndRobotId(String wxid, Long robotId);

    List<VUserDTO> getByWxId(String wxId);


    // ==================== 其他 ====================

}
