package com.zfcraft.web.entity;


import com.zfcraft.web.common.ExcelVOAttribute;

public class BackstageWithdrawDepositInfo {

    @ExcelVOAttribute(name = "钱包详情id", column = "A")
    private Long walletDetailsId;

    @ExcelVOAttribute(name = "用户id", column = "B")
    private Long userId;

    @ExcelVOAttribute(name = "申请时间", column = "C")
    private String createDate;

    @ExcelVOAttribute(name = "用户昵称", column = "D")
    private String nickName;

    @ExcelVOAttribute(name = "用户头像", column = "E")
    private String headImageUrl;

    @ExcelVOAttribute(name = "用户电话", column = "F")
    private String phoneNumber;

    @ExcelVOAttribute(name = "用户截止当日总提现次数", column = "G")
    private Long withdrawCount;

    @ExcelVOAttribute(name = "用户成功提现总金额（分）", column = "H")
    private Long withdrawSum;

    @ExcelVOAttribute(name = "本次提现金额（分）", column = "I")
    private Long count;

    @ExcelVOAttribute(name = "批复状态", column = "J", combo = {"提现审核", "提现成功", "提现失败"})
    private String status;

    @ExcelVOAttribute(name = "拒绝原因", column = "K", combo = {"抱歉，活动已结束，更多精彩活动正在筹备中，敬请期待……",
            "抱歉，今日平台提现金额已达上线，明天早点来哦", "抱歉，平台显示账户异常，如有疑问，请联系小轻老师咨询（微信号：413007703）",
            "其他原因，详情可联系小轻老师咨询（微信号：413007703）"})
    private String note;

    public Long getWalletDetailsId() {
        return walletDetailsId;
    }

    public void setWalletDetailsId(Long walletDetailsId) {
        this.walletDetailsId = walletDetailsId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getWithdrawCount() {
        return withdrawCount;
    }

    public void setWithdrawCount(Long withdrawCount) {
        this.withdrawCount = withdrawCount;
    }

    public Long getWithdrawSum() {
        return withdrawSum;
    }

    public void setWithdrawSum(Long withdrawSum) {
        this.withdrawSum = withdrawSum;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}