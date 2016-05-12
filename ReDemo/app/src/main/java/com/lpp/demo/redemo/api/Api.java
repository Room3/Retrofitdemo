package com.lpp.demo.redemo.api;


import com.lpp.demo.redemo.UserResult;
import com.lpp.demo.redemo.bean.Article;

import org.w3c.dom.Comment;

import java.util.Collection;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by liuwang on 2016/3/13.
 */
public interface Api {


    @FormUrlEncoded
    @POST("appuser/register.do")
    Call<UserResult> register(@Field("USERNAME") String userName, @Field("PASSWORD") String passWord, @Field("PHONE") String phone, @Field("CODE") String code, @Field("CODE_ID") String id);

    /**
     * 用户名是否存在
     *
     * @param userName
     * @return
     */

    /**
     * 发送验证码
     *
     * @param
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/sendSms.do")
//   // Call<MsgResult> sendSms(@Field("PHONE") String phone);

    @FormUrlEncoded
    @POST("list/T1348648517839/0-10.html")
    Call<Article> login(@Field("PASSWORD") String passWord, @Field("USERNAME") String userName);

    @FormUrlEncoded
    @POST("appuser/getCollection.do")
    Call<Collection> collection(@Field("U_ID") String u_id);


    /**
     * 用户工作提议
     *
     * @param uid
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWordAdviceByUID.do")
//    Call<WorkSuggest> listUserSuggest(@Field("U_ID") String uid, @Field("TIME") String time);
//
//    /**
//     * 部门工作提议
//     *
//     * @param did
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getWordAdviceByDID.do")
//    Call<WorkSuggest> listPartDivide(@Field("D_ID") String did, @Field("TIME") String time);


    /**
     * 备忘录
     *
     * @param u_id
     * @param t_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getMemory.do")
//    Call<Memo> getMemo(@Field("U_ID") String u_id, @Field("T_ID") String t_id, @Field("TIME") String time);
//
//    /**
//     * 获取备忘录的tab
//     *
//     * @param u_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getMemoryTag.do")
//    Call<MemoTab> getMemoTab(@Field("U_ID") String u_id);
//
//
//    @FormUrlEncoded
//    @POST("appuser/getGroup.do")
//    Call<FriendGroup> getGroup(@Field("U_ID") String u_id);

//    @FormUrlEncoded
//    @POST("appuser/getDepartment.do")
//    Call<Department> listDepartment(@Field("C_ID") String did, @Field("U_ID") String u_id);
//
//    /**
//     * 获取好友录
//     *
//     * @param u_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getNoteGroup.do")
//    Call<FriendGroup> getNoteGroup(@Field("U_ID") String u_id);
//
   /*** 获取同事录
    *
     * @param u_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getNoteCompany.do")
//    Call<CompanyNoteResult> getNoteCompany(@Field("C_ID") String u_id);

    /**
     * 获取工作提议详情
     *
     * @param p_id
     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getWordAdviceDetail.do")
//    Call<SuggestDetail> getSuggestDetail(@Field("P_ID") String p_id);

    /**
     * 工作分工列表
     *
     * @param d_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWorkPlanByDID.do")
//    Call<WorkDivide> listWorkDivide(@Field("D_ID") String d_id, @Field("TIME") String time);

    /**
     * 工作分工-我的列表
     *
     * @param u_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWorkPlanByUID.do")
//    Call<WorkDivide> listUserDivide(@Field("U_ID") String u_id, @Field("TIME") String time);

    /**
     * 工作分工详情
     *
     * @param p_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWordPlanDetail.do")
//    Call<WorkDivideDetail> listUserDivideDetail(@Field("P_ID") String p_id);

    /**
     * 执行组
     *
     * @param p_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getExecute.do")
//    Call<PerformGroup> listPerformGroup(@Field("P_ID") String p_id);


    /**
     * 获取赞详情
     *
     * @param dt_id
     * @param dt_type
     * @param support
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getDynamicStatus.do")
//    Call<DynamicStatus> getDynamicStatus(@Field("DT_ID") String dt_id, @Field("DT_TYPE") String dt_type,
//                                         @Field("SUPPORT") String support);

    /**
     * 获取反对详情
     *
     * @param dt_id
     * @param dt_type
     * @param trample
     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getDynamicStatus.do")
//    Call<DynamicStatus> getOppose(@Field("DT_ID") String dt_id, @Field("DT_TYPE") String dt_type,
         //                         @Field("TRAMPLE") String trample);


    /**
     * 获取工作痕迹（通过部门ID）
     *
     * @param d_id
     * @return
     */
   // @FormUrlEncoded
//    @POST("appuser/getWorkMemoryByDID.do")
//    Call<WorkingTrace> getWorkMemoryByDID(@Field("D_ID") String d_id, @Field("TIME") String time);

    /**
     * 获取工作痕迹（通过用户ID）
     *
     * @param u_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWorkMemoryByUID.do")
//    Call<WorkingTrace> getWorkMemoryByUID(@Field("U_ID") String u_id, @Field("TIME") String time);

    /**
     * 获取工作痕迹详情
     *
     * @param p_id
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getWorkMemoryDetail.do")
//    Call<WorkingTrace> getWorkMemoryDetail(@Field("P_ID") String p_id);

    /**
     * 获取主管通知和工作痕迹
     *
     * @param p_id
     * @param type
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/getPlanComment.do")
//    Call<PlanComment> getPlanComment(@Field("P_ID") String p_id, @Field("TYPE_ID") String type);

    /**
     * 获取工作提议的评论列表
     *
     * @param dt_type
     * @param dt_id
     * @return
     */
    @FormUrlEncoded
    @POST("appuser/getComment.do")
    Call<Comment> getComment(@Field("DT_TYPE") String dt_type, @Field("DT_ID") String dt_id);

    /**
     * 获取工作自荐列表
     *
     * @param p_id
     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getWorkRecommend.do")
//    Call<WorkRecommend> getWorkRecommend(@Field("P_ID") String p_id);

    /**
     * 工作提议提交数据
     *
     * @param c_id
     * @param d_id
     * @param u_id
     * @param createTime
     * @param endTime
     * @param money
     * @param stand
     * @param content
     * @return
     */
//    @FormUrlEncoded
//    @POST("appuser/saveWordAdvice.do")
//    Call<Result> sendWorkSuggest(@Field("C_ID") String c_id,
//                                 @Field("D_ID") String d_id,
//                                 @Field("U_ID") String u_id,
//                                 @Field("CREATE_TIME") String createTime,
//                                 @Field("END_TIME") String endTime,
//                                 @Field("MONEY") String money,
//                                 @Field("STAND") String stand,
//                                 @Field("CONTENT") String content);

    /**
     * 获取组长候选人
     */
//    @FormUrlEncoded
//    @POST("appuser/getUserByDID.do")
//    Call<Candidate> listCandidate(@Field("C_ID") String c_id, @Field("D_ID") String d_id);
//
//
//    @FormUrlEncoded
//    @POST("appuser/saveWordPlan.do")
//    Call<Result> saveWordPlan(@Field("C_ID") String c_id,
//                              @Field("D_ID") String d_id,
//                              @Field("U_ID") String u_id,
//                              @Field("CREATE_TIME") String createTime,
//                              @Field("END_TIME") String endTime,
//                              @Field("MONEY") String money,
//                              @Field("STAND") String stand,
//                              @Field("CONTENT") String content,
//                              @Field("UIDS") String uids,
//                              @Field("TIDS") String tids);
//
//    /**
//     * 发布工作自荐
//     *
//     * @param u_id
//     * @param p_id
//     * @param content
//     * @param createTime
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveWorkRecommend.do")
//    Call<Result> saveWorkRecommend(@Field("U_ID") String u_id,
//                                   @Field("P_ID") String p_id,
//                                   @Field("CONTENT") String content,
//                                   @Field("CREATE_TIME") String createTime);
//
//    /**
//     * 发布主管通知
//     *
//     * @param u_id
//     * @param p_id
//     * @param content
//     * @param createTime
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveQaRecommend.do")
//    Call<Result> saveQaRecommend(@Field("U_ID") String u_id,
//                                 @Field("P_ID") String p_id,
//                                 @Field("CONTENT") String content,
//                                 @Field("CREATE_TIME") String createTime);
//
//    /**
//     * 发布工作痕迹（内部）
//     *
//     * @param u_id
//     * @param p_id
//     * @param content
//     * @param createTime
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/savePlanRecommend.do")
//    Call<Result> savePlanRecommend(@Field("U_ID") String u_id,
//                                   @Field("P_ID") String p_id,
//                                   @Field("CONTENT") String content,
//                                   @Field("CREATE_TIME") String createTime);
//
//    /**
//     * 新增备忘录
//     *
//     * @param u_id
//     * @param type_id
//     * @param content
//     * @param createTime
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveMemory.do")
//    Call<Result> saveMemory(@Field("U_ID") String u_id,
//                            @Field("TYPE_ID") String type_id,
//                            @Field("CONTENT") String content,
//                            @Field("CREATE_TIME") String createTime);
//
//
//    /**
//     * 获取公司列表
//     *
//     * @param u_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getCompany.do")
//    Call<Company> getCompany(@Field("U_ID") String u_id);
//
//    /**
//     * 发表评论
//     *
//     * @param u_id
//     * @param time
//     * @param content
//     * @param createTime
//     * @param dt_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveComment.do")
//    Call<Result> saveComment(@Field("USER_ID") String u_id,
//                             @Field("TIME") String time,
//                             @Field("CONTENT") String content,
//                             @Field("DT_TYPE") String createTime, @Field("DT_ID") String dt_id);
//
//    /**
//     * 创建团队
//     *
//     * @param u_id
//     * @param name
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveCompany.do")
//    Call<CreateTeamResult> saveCompany(@Field("U_ID") String u_id,
//                                       @Field("NAME") String name, @Field("DESCRIPTION") String description);
//
//    /**
//     * 修改团队名称
//     *
//     * @param id
//     * @param name
//     * @param description
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/updateCName.do")
//    Call<Result> updateCName(@Field("ID") String id,
//                             @Field("NAME") String name, @Field("DESCRIPTION") String description);
//
//    /**
//     * 上传团队图片
//     *
//     * @param imgs
//     * @return
//     */
//    @Multipart
//    @POST("appuser/updateCompany")
//    Call<Result> updateCompany(@Part("file\"; filename=\"image.png\"") RequestBody imgs, @Part("C_ID") RequestBody c_id);
//
//
//    /**
//     * 获取我的功能
//     *
//     * @param u_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/getMenuByUID.do")
//    Call<Function> getMyFunction(@Field("U_ID") String u_id);
//
//    @FormUrlEncoded
//    @POST("appuser/getMenuByCID.do")
//    Call<Function> getDepartmentFunction(@Field("C_ID") String c_id);
//
//
//    /**
//     * 用户点赞
//     *
//     * @param id
//     * @param support
//     * @param dt_id
//     * @param dt_type
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveS.do")
//    Call<Result> saveS(@Field("USER_ID") String id,
//                       @Field("SUPPORT") String support, @Field("DT_ID") String dt_id, @Field("DT_TYPE") String dt_type, @Field("SUPPORTNUM") int num);
//
//    /**
//     * 用户踩
//     *
//     * @param id
//     * @param trample
//     * @param dt_id
//     * @param dt_type
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveTrample.do")
//    Call<Result> saveTrample(@Field("USER_ID") String id,
//                             @Field("TRAMPLE") String trample, @Field("DT_ID") String dt_id, @Field("DT_TYPE") String dt_type, @Field("TRAMPLENUM") int num);
//
//
//    /**
//     * 创建一级团组
//     *
//     * @param c_id
//     * @param name
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/saveDepartment.do")
//    Call<CreateTeamResult> createOneDepartment(@Field("C_ID") String c_id, @Field("NAME") String name);
//
//    /**
//     * @return 根据公司ID获取下面的员工
//     */
//    @FormUrlEncoded
//    @POST("appuser/getUserByCompany.do")
//    Call<UserByCompany> getUserByCompany(@Field("C_ID") String c_id);
//
//    /**
//     * 搜索团队
//     *
//     * @param name
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/searchCompany.do")
//    Call<TeamInfo> listCompany(@Field("NAME") String name);
//
//    /**
//     * 加入公司
//     *
//     * @param u_id
//     * @param c_id
//     * @return
//     */
//    @FormUrlEncoded
//    @POST("appuser/joinCompany.do")
//    Call<Result> joinCompany(@Field("U_ID") String u_id, @Field("C_ID") String c_id);
//
//
//    /**
//     * @return
//     * 添加团组成员
//     */
//    @FormUrlEncoded
//    @POST("appuser/joinDepartment.do")
//    Call<Result> JoinDepartment(@Field("C_ID") String c_id, @Field("UIDS") String u_ids, @Field("D_ID") String d_id);
}
