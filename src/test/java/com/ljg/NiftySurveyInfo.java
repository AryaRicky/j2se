package com.ljg;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Created by ljg on 2016/10/17.
 * nifty随访表单数据结构
 */
public class NiftySurveyInfo implements Comparator<NiftySurveyInfo>, Serializable {

    private static final long serialVersionUID = -448034369999127273L;

    private String id;


    /**
     * 姓名
     */
    private String examineName = "";


    /**
     * 身份证号
     */
    private String idCard = "";
    /**
     * 手机号码
     */


    private String phoneNumber = "";


    /**
     * 所在城市
     */
    private String userCity = "";


    /**
     * 籍贯
     */
    private String birthPlace = "";


    /**
     * 民族
     */
    private String userNation = "";


    /**
     * 是否已经出生 1-是 2-否
     */
    private Integer isBorn = 0;


    /**
     * 宝宝生日
     */
    private String childBirthday = "";


    /**
     * 终止妊娠原因：1-B超发现异常引产、2-因孕妇疾病终止妊娠、3-染色体核型异常、4-自然流产、5-死胎死产、6-拒绝告知具体情况、7-其他（注明具体原因）
     */
    private Integer stopPregnancy = 0;


    /**
     * 终止妊娠原因详情描述
     */
    private String stopPregnancyDesc = "";


    /**
     * 胎数1-单胎 2-多胎
     */
    private Integer tireNumber = 0;


    /**
     * 体重 1-<2500g 2-2500-4000g 3->4000g
     */
    private Integer childWeight = 0;


    /**
     * 当tireNumber=1时，性别 1-男 2-女
     * 当tireNumber=2时，性别 1-男男 2-女女 3-男女
     */
    private Integer childGendar = 0;


    /**
     * 足跟血结果
     */
    private String heelBloodResult = "";


    /**
     * 足跟血结果未通过详情
     */
    private String heelBloodResultDetail = "";


    /**
     * 听力筛查结果
     */
    private String hearingResult = "";
    /**
     * 听力筛查结果未通过详情
     */


    private String hearingResultDetail = "";


    /**
     * 心脏检查结果
     */
    private String heartCheckResult = "";
    /**
     * 心脏检查结果未通过详情
     */


    private String heartCheckResultDetail = "";


    /**
     * 面型 1-正常 2-异常
     */
    private Integer childAppearanceStatus = 0;


    /**
     * 面型异常情况 1-1T8患儿 2-T13患儿 3-T21患儿 4-未发现宝宝是T21、T13、1T8患儿
     */
    private Integer appearanceAbnormalDesc = 0;


    /**
     * 未发现宝宝是T21、T13、1T8患儿详细描述
     */
    private String appearanceAbnormalDescOther = "";


    /**
     * 身体 1-正常 2-异常
     */
    private Integer childBodyStatus = 0;


    /**
     * 身体异常情况 1-1T8患儿 2-T13患儿 3-T21患儿 4-未发现宝宝是T21、T13、1T8患儿
     */
    private Integer bodyAbnormalDesc = 0;


    /**
     * 未发现宝宝是T21、T13、1T8患儿详细描述
     */
    private String bodyAbnormalDescOther = "";


    /**
     * 分娩孕周
     */
    private String gestationalAge = "";


    /**
     * 分娩方式 1-顺产 2-刨宫产
     */
    private Integer deliveryMode = 0;


    /**
     * 刨宫产原因
     */
    private String cesareanSectionReason = "";


    /**
     * 您是否出现过妊娠期并发症 1-是 2-否
     */
    private Integer pregnancyComplicationsStatus = 0;


    /**
     * 并发症：1-高血压 2-子痫 3-糖尿病 4-其他
     */
    private String pregnancyComplicationsDesc = "";


    /**
     * 其他并发症
     */
    private String pregnancyComplicationsOtherDetail = "";


    /**
     * 您在孕期是否接受过羊水穿刺或脐带血穿刺 1-是 2-否
     */
    private Integer amniocentesisAndCordBloodCheck = 0;


    /**
     * 请选择羊穿或脐穿结果 1-正常 2-异常
     */
    private Integer amniocentesisAndCordBloodStatus = 0;


    /**
     * 穿或脐穿结果异常情况
     */
    private String amniocentesisAndCordBloodDesc = "";


    /**
     * 做无创产前基因检测的原因 1-唐筛高危或临界风险 2-35岁以上的高龄产妇 3-曾生育过染色体病患儿 4-B超检查怀疑胎儿可能有染色体异常 5-夫妇一方为染色体异常携带者 6-无高危风险，为了安心，主动要求检查 7-其他
     */
    private String DNATestingReason = "";


    /**
     * 做无创产前基因检测的其他原因
     */
    private String DNATestingOtherReason = "";


    /**
     * 获知该项检测的渠道 1-医生推荐 2-朋友推荐 3-网络报刊杂志获知 4-其他
     */
    private String obtainInfoSource = "";


    /**
     * 获知该项检测的其他渠道
     */
    private String obtainInfoSourceOther = "";


    /**
     * 对无创产前基因检测服务的评价 1-10分
     */
    private Integer checkEvaluate = 0;


    /**
     * 检测前期不满意的地方 1-信息咨询 2-文件签署
     */
    private String notSatisfiedEarly = "";


    /**
     * 检测中期不满意的地方 1-进度查询 2-重抽血
     */
    private String notSatisfiedMid = "";


    /**
     * 检测后期不满意的地方 1-报告发票相关 2-问题处理
     */
    private String notSatisfiedLate = "";


    /**
     * 不满意详情
     */
    private String notSatisfiedDetail = "";


    /**
     * 无创产前基因检测产品在市场上的价格评估 1-价格偏高 2-价格一般 3-价格偏低
     */
    private Integer DNATestingPriceEVal = 0;


    /**
     * 缴费金额
     */
    private String DNATestingPrice = "";


    /**
     * 您在医院缴费的流程是否便利 1-是 2-否
     */
    private Integer payConvenientStatus = 0;


    /**
     * 您的缴费方式
     */
    private String payType = "";


    /**
     * 请注明收款人单位、姓名或转账账户户头姓名
     */
    private String transferMoneyDetail = "";


    /**
     * 是否收到发票或收据凭证 1-是 2-否
     */
    private Integer invoiceFlag = 0;


    /**
     * 请注明未需要发票或收据凭证原因
     */
    private String notInvoiceReason = "";


    /**
     * 如果您的朋友或家人有检测需求，您会在多大程度上推荐华大基因的无创产前基因检测产品 1-10分
     */
    private Integer recommendProbability = 0;


    /**
     * 建议
     */
    private String userSuggestion = "";


    /**
     * 家庭成员的年龄、体重、身高
     */
    private String familyMember = "";


    private String heartRate = "";


    /**
     * 血压
     */
    private String bloodPressure = "";


    /**
     * 做问卷调查时间
     */
    private Long createTime = 0L;


    /**
     * 采样医院
     */
    private String samplingHospital = "";


    /**
     * 抽血时间
     */
    private String bloodTime = "";
    /**
     * 样品编号
     */


    private String sampleNum = "";


    /**
     * 以下是字段为了匹配数据仓库返回的xml字符串所加
     */


    private String birthDate;


    private String bloodCollect;


    private String bloodDate;


    private String customerCode;


    private String customerName;


    private String doctorName;


    private String zoneCode;


    private String zoneName;


    private String DNATime;


    private String DNATimeState;


    private String edd;


    private String gestationalWeeks;


    private String idNumber;


    private String messageSend;


    private String personalReproductiveHistory;


    private String previousHistory;


    private String familyHistory;


    private String freeType;


    private String phoneNum;


    private String productCode;


    private String productName;


    private String resultT13;


    private String resultT18;


    private String resultT21;


    private String resultTChar13;


    private String resultTChar18;


    private String resultTChar21;


    private String resultTExponentChr13;


    private String resultTExponentChr18;


    private String resultTExponentChr21;


    private String sampleAge;


    private String sampleName;


    private String t13Result;


    private String t18Result;


    private String t21Result;


    private String toSamplingTime;


    private String sampleType;


    private String ultrasonography;


    private String areaName;


    private String otherReportNum;


    private String projectId;


    private String projectName;


    private String testHeterosome;


    private String tangshaiResult;


    private String hexinResult;


    private String inputOfPeople;


    private String reportCheckPeople;


    private String note;


    private String note2;


    private String note3;


    private String formalType;


    private String formalDate;


    private String delayedReason;


    private String genebook;


    private String isIvf;


    private String spellName;


    private String clinicalDiagnosis;


    private String applyTime;


    private String sampleShortId;


    private String patientNum;


    private String sampleState;


    private String sampleLongId;


    private String isHeavyBlood;


    private String originalBloodNum;


    private String previousBloodNum;


    private String tq;


    private String tw;


    private String twResult;


    private String tc;


    private String flowTime;


    private String reportPath;


    private String filePath;


    private String bloodCollectState;


    private String postTimeState;


    private String toSamplingTimeState;


    private String flowTimeState;


    private String formalDateState;


    private String criduchat;


    private String critype;


    private String criposition;


    private String crisize;


    private String jacobsen;


    private String jacobsentype;


    private String jacobsenposition;


    private String jacobsensize;


    private String digeorge;


    private String digeorgetype;


    private String digeorgeposition;


    private String digeorgesize;


    private String sampleOpenFlag;


    private String sampleNotOpenReason;


    private String customerOpenFlag;


    private String customerNotOpenReason;


    private String lastModifiedTime;


    private String childSex;


    private String postTime;


    private String businessIsDown;


    private String haveOtherReport;


    private String openOtherReport;


    private String reportOpenFlag;


    private String otherReportResults;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExamineName() {
        return examineName;
    }

    public void setExamineName(String examineName) {
        this.examineName = examineName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public Integer getIsBorn() {
        return isBorn;
    }

    public void setIsBorn(Integer isBorn) {
        this.isBorn = isBorn;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public void setChildBirthday(String childBirthday) {
        this.childBirthday = childBirthday;
    }

    public Integer getStopPregnancy() {
        return stopPregnancy;
    }

    public void setStopPregnancy(Integer stopPregnancy) {
        this.stopPregnancy = stopPregnancy;
    }

    public String getStopPregnancyDesc() {
        return stopPregnancyDesc;
    }

    public void setStopPregnancyDesc(String stopPregnancyDesc) {
        this.stopPregnancyDesc = stopPregnancyDesc;
    }

    public Integer getTireNumber() {
        return tireNumber;
    }

    public void setTireNumber(Integer tireNumber) {
        this.tireNumber = tireNumber;
    }

    public Integer getChildWeight() {
        return childWeight;
    }

    public void setChildWeight(Integer childWeight) {
        this.childWeight = childWeight;
    }

    public Integer getChildGendar() {
        return childGendar;
    }

    public void setChildGendar(Integer childGendar) {
        this.childGendar = childGendar;
    }

    public String getHeelBloodResult() {
        return heelBloodResult;
    }

    public void setHeelBloodResult(String heelBloodResult) {
        this.heelBloodResult = heelBloodResult;
    }

    public String getHeelBloodResultDetail() {
        return heelBloodResultDetail;
    }

    public void setHeelBloodResultDetail(String heelBloodResultDetail) {
        this.heelBloodResultDetail = heelBloodResultDetail;
    }

    public String getHearingResult() {
        return hearingResult;
    }

    public void setHearingResult(String hearingResult) {
        this.hearingResult = hearingResult;
    }

    public String getHearingResultDetail() {
        return hearingResultDetail;
    }

    public void setHearingResultDetail(String hearingResultDetail) {
        this.hearingResultDetail = hearingResultDetail;
    }

    public String getHeartCheckResult() {
        return heartCheckResult;
    }

    public void setHeartCheckResult(String heartCheckResult) {
        this.heartCheckResult = heartCheckResult;
    }

    public String getHeartCheckResultDetail() {
        return heartCheckResultDetail;
    }

    public void setHeartCheckResultDetail(String heartCheckResultDetail) {
        this.heartCheckResultDetail = heartCheckResultDetail;
    }

    public Integer getChildAppearanceStatus() {
        return childAppearanceStatus;
    }

    public void setChildAppearanceStatus(Integer childAppearanceStatus) {
        this.childAppearanceStatus = childAppearanceStatus;
    }

    public Integer getAppearanceAbnormalDesc() {
        return appearanceAbnormalDesc;
    }

    public void setAppearanceAbnormalDesc(Integer appearanceAbnormalDesc) {
        this.appearanceAbnormalDesc = appearanceAbnormalDesc;
    }

    public String getAppearanceAbnormalDescOther() {
        return appearanceAbnormalDescOther;
    }

    public void setAppearanceAbnormalDescOther(String appearanceAbnormalDescOther) {
        this.appearanceAbnormalDescOther = appearanceAbnormalDescOther;
    }

    public Integer getChildBodyStatus() {
        return childBodyStatus;
    }

    public void setChildBodyStatus(Integer childBodyStatus) {
        this.childBodyStatus = childBodyStatus;
    }

    public Integer getBodyAbnormalDesc() {
        return bodyAbnormalDesc;
    }

    public void setBodyAbnormalDesc(Integer bodyAbnormalDesc) {
        this.bodyAbnormalDesc = bodyAbnormalDesc;
    }

    public String getBodyAbnormalDescOther() {
        return bodyAbnormalDescOther;
    }

    public void setBodyAbnormalDescOther(String bodyAbnormalDescOther) {
        this.bodyAbnormalDescOther = bodyAbnormalDescOther;
    }

    public String getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(String gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public Integer getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(Integer deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public String getCesareanSectionReason() {
        return cesareanSectionReason;
    }

    public void setCesareanSectionReason(String cesareanSectionReason) {
        this.cesareanSectionReason = cesareanSectionReason;
    }

    public Integer getPregnancyComplicationsStatus() {
        return pregnancyComplicationsStatus;
    }

    public void setPregnancyComplicationsStatus(Integer pregnancyComplicationsStatus) {
        this.pregnancyComplicationsStatus = pregnancyComplicationsStatus;
    }

    public String getPregnancyComplicationsDesc() {
        return pregnancyComplicationsDesc;
    }

    public void setPregnancyComplicationsDesc(String pregnancyComplicationsDesc) {
        this.pregnancyComplicationsDesc = pregnancyComplicationsDesc;
    }

    public String getPregnancyComplicationsOtherDetail() {
        return pregnancyComplicationsOtherDetail;
    }

    public void setPregnancyComplicationsOtherDetail(String pregnancyComplicationsOtherDetail) {
        this.pregnancyComplicationsOtherDetail = pregnancyComplicationsOtherDetail;
    }

    public Integer getAmniocentesisAndCordBloodCheck() {
        return amniocentesisAndCordBloodCheck;
    }

    public void setAmniocentesisAndCordBloodCheck(Integer amniocentesisAndCordBloodCheck) {
        this.amniocentesisAndCordBloodCheck = amniocentesisAndCordBloodCheck;
    }

    public Integer getAmniocentesisAndCordBloodStatus() {
        return amniocentesisAndCordBloodStatus;
    }

    public void setAmniocentesisAndCordBloodStatus(Integer amniocentesisAndCordBloodStatus) {
        this.amniocentesisAndCordBloodStatus = amniocentesisAndCordBloodStatus;
    }

    public String getAmniocentesisAndCordBloodDesc() {
        return amniocentesisAndCordBloodDesc;
    }

    public void setAmniocentesisAndCordBloodDesc(String amniocentesisAndCordBloodDesc) {
        this.amniocentesisAndCordBloodDesc = amniocentesisAndCordBloodDesc;
    }

    public String getDNATestingReason() {
        return DNATestingReason;
    }

    public void setDNATestingReason(String DNATestingReason) {
        this.DNATestingReason = DNATestingReason;
    }

    public String getDNATestingOtherReason() {
        return DNATestingOtherReason;
    }

    public void setDNATestingOtherReason(String DNATestingOtherReason) {
        this.DNATestingOtherReason = DNATestingOtherReason;
    }

    public String getObtainInfoSource() {
        return obtainInfoSource;
    }

    public void setObtainInfoSource(String obtainInfoSource) {
        this.obtainInfoSource = obtainInfoSource;
    }

    public String getObtainInfoSourceOther() {
        return obtainInfoSourceOther;
    }

    public void setObtainInfoSourceOther(String obtainInfoSourceOther) {
        this.obtainInfoSourceOther = obtainInfoSourceOther;
    }

    public Integer getCheckEvaluate() {
        return checkEvaluate;
    }

    public void setCheckEvaluate(Integer checkEvaluate) {
        this.checkEvaluate = checkEvaluate;
    }

    public String getNotSatisfiedEarly() {
        return notSatisfiedEarly;
    }

    public void setNotSatisfiedEarly(String notSatisfiedEarly) {
        this.notSatisfiedEarly = notSatisfiedEarly;
    }

    public String getNotSatisfiedMid() {
        return notSatisfiedMid;
    }

    public void setNotSatisfiedMid(String notSatisfiedMid) {
        this.notSatisfiedMid = notSatisfiedMid;
    }

    public String getNotSatisfiedLate() {
        return notSatisfiedLate;
    }

    public void setNotSatisfiedLate(String notSatisfiedLate) {
        this.notSatisfiedLate = notSatisfiedLate;
    }

    public String getNotSatisfiedDetail() {
        return notSatisfiedDetail;
    }

    public void setNotSatisfiedDetail(String notSatisfiedDetail) {
        this.notSatisfiedDetail = notSatisfiedDetail;
    }

    public Integer getDNATestingPriceEVal() {
        return DNATestingPriceEVal;
    }

    public void setDNATestingPriceEVal(Integer DNATestingPriceEVal) {
        this.DNATestingPriceEVal = DNATestingPriceEVal;
    }

    public String getDNATestingPrice() {
        return DNATestingPrice;
    }

    public void setDNATestingPrice(String DNATestingPrice) {
        this.DNATestingPrice = DNATestingPrice;
    }

    public Integer getPayConvenientStatus() {
        return payConvenientStatus;
    }

    public void setPayConvenientStatus(Integer payConvenientStatus) {
        this.payConvenientStatus = payConvenientStatus;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getTransferMoneyDetail() {
        return transferMoneyDetail;
    }

    public void setTransferMoneyDetail(String transferMoneyDetail) {
        this.transferMoneyDetail = transferMoneyDetail;
    }

    public Integer getInvoiceFlag() {
        return invoiceFlag;
    }

    public void setInvoiceFlag(Integer invoiceFlag) {
        this.invoiceFlag = invoiceFlag;
    }

    public String getNotInvoiceReason() {
        return notInvoiceReason;
    }

    public void setNotInvoiceReason(String notInvoiceReason) {
        this.notInvoiceReason = notInvoiceReason;
    }

    public Integer getRecommendProbability() {
        return recommendProbability;
    }

    public void setRecommendProbability(Integer recommendProbability) {
        this.recommendProbability = recommendProbability;
    }

    public String getUserSuggestion() {
        return userSuggestion;
    }

    public void setUserSuggestion(String userSuggestion) {
        this.userSuggestion = userSuggestion;
    }

    public String getFamilyMember() {
        return familyMember;
    }

    public void setFamilyMember(String familyMember) {
        this.familyMember = familyMember;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getSamplingHospital() {
        return samplingHospital;
    }

    public void setSamplingHospital(String samplingHospital) {
        this.samplingHospital = samplingHospital;
    }

    public String getBloodTime() {
        return bloodTime;
    }

    public void setBloodTime(String bloodTime) {
        this.bloodTime = bloodTime;
    }

    public String getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(String sampleNum) {
        this.sampleNum = sampleNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodCollect() {
        return bloodCollect;
    }

    public void setBloodCollect(String bloodCollect) {
        this.bloodCollect = bloodCollect;
    }

    public String getBloodDate() {
        return bloodDate;
    }

    public void setBloodDate(String bloodDate) {
        this.bloodDate = bloodDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getDNATime() {
        return DNATime;
    }

    public void setDNATime(String DNATime) {
        this.DNATime = DNATime;
    }

    public String getDNATimeState() {
        return DNATimeState;
    }

    public void setDNATimeState(String DNATimeState) {
        this.DNATimeState = DNATimeState;
    }

    public String getEdd() {
        return edd;
    }

    public void setEdd(String edd) {
        this.edd = edd;
    }

    public String getGestationalWeeks() {
        return gestationalWeeks;
    }

    public void setGestationalWeeks(String gestationalWeeks) {
        this.gestationalWeeks = gestationalWeeks;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMessageSend() {
        return messageSend;
    }

    public void setMessageSend(String messageSend) {
        this.messageSend = messageSend;
    }

    public String getPersonalReproductiveHistory() {
        return personalReproductiveHistory;
    }

    public void setPersonalReproductiveHistory(String personalReproductiveHistory) {
        this.personalReproductiveHistory = personalReproductiveHistory;
    }

    public String getPreviousHistory() {
        return previousHistory;
    }

    public void setPreviousHistory(String previousHistory) {
        this.previousHistory = previousHistory;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public String getFreeType() {
        return freeType;
    }

    public void setFreeType(String freeType) {
        this.freeType = freeType;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getResultT13() {
        return resultT13;
    }

    public void setResultT13(String resultT13) {
        this.resultT13 = resultT13;
    }

    public String getResultT18() {
        return resultT18;
    }

    public void setResultT18(String resultT18) {
        this.resultT18 = resultT18;
    }

    public String getResultT21() {
        return resultT21;
    }

    public void setResultT21(String resultT21) {
        this.resultT21 = resultT21;
    }

    public String getResultTChar13() {
        return resultTChar13;
    }

    public void setResultTChar13(String resultTChar13) {
        this.resultTChar13 = resultTChar13;
    }

    public String getResultTChar18() {
        return resultTChar18;
    }

    public void setResultTChar18(String resultTChar18) {
        this.resultTChar18 = resultTChar18;
    }

    public String getResultTChar21() {
        return resultTChar21;
    }

    public void setResultTChar21(String resultTChar21) {
        this.resultTChar21 = resultTChar21;
    }

    public String getResultTExponentChr13() {
        return resultTExponentChr13;
    }

    public void setResultTExponentChr13(String resultTExponentChr13) {
        this.resultTExponentChr13 = resultTExponentChr13;
    }

    public String getResultTExponentChr18() {
        return resultTExponentChr18;
    }

    public void setResultTExponentChr18(String resultTExponentChr18) {
        this.resultTExponentChr18 = resultTExponentChr18;
    }

    public String getResultTExponentChr21() {
        return resultTExponentChr21;
    }

    public void setResultTExponentChr21(String resultTExponentChr21) {
        this.resultTExponentChr21 = resultTExponentChr21;
    }

    public String getSampleAge() {
        return sampleAge;
    }

    public void setSampleAge(String sampleAge) {
        this.sampleAge = sampleAge;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getT13Result() {
        return t13Result;
    }

    public void setT13Result(String t13Result) {
        this.t13Result = t13Result;
    }

    public String getT18Result() {
        return t18Result;
    }

    public void setT18Result(String t18Result) {
        this.t18Result = t18Result;
    }

    public String getT21Result() {
        return t21Result;
    }

    public void setT21Result(String t21Result) {
        this.t21Result = t21Result;
    }

    public String getToSamplingTime() {
        return toSamplingTime;
    }

    public void setToSamplingTime(String toSamplingTime) {
        this.toSamplingTime = toSamplingTime;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getUltrasonography() {
        return ultrasonography;
    }

    public void setUltrasonography(String ultrasonography) {
        this.ultrasonography = ultrasonography;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getOtherReportNum() {
        return otherReportNum;
    }

    public void setOtherReportNum(String otherReportNum) {
        this.otherReportNum = otherReportNum;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTestHeterosome() {
        return testHeterosome;
    }

    public void setTestHeterosome(String testHeterosome) {
        this.testHeterosome = testHeterosome;
    }

    public String getTangshaiResult() {
        return tangshaiResult;
    }

    public void setTangshaiResult(String tangshaiResult) {
        this.tangshaiResult = tangshaiResult;
    }

    public String getHexinResult() {
        return hexinResult;
    }

    public void setHexinResult(String hexinResult) {
        this.hexinResult = hexinResult;
    }

    public String getInputOfPeople() {
        return inputOfPeople;
    }

    public void setInputOfPeople(String inputOfPeople) {
        this.inputOfPeople = inputOfPeople;
    }

    public String getReportCheckPeople() {
        return reportCheckPeople;
    }

    public void setReportCheckPeople(String reportCheckPeople) {
        this.reportCheckPeople = reportCheckPeople;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getFormalType() {
        return formalType;
    }

    public void setFormalType(String formalType) {
        this.formalType = formalType;
    }

    public String getFormalDate() {
        return formalDate;
    }

    public void setFormalDate(String formalDate) {
        this.formalDate = formalDate;
    }

    public String getDelayedReason() {
        return delayedReason;
    }

    public void setDelayedReason(String delayedReason) {
        this.delayedReason = delayedReason;
    }

    public String getGenebook() {
        return genebook;
    }

    public void setGenebook(String genebook) {
        this.genebook = genebook;
    }

    public String getIsIvf() {
        return isIvf;
    }

    public void setIsIvf(String isIvf) {
        this.isIvf = isIvf;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getSampleShortId() {
        return sampleShortId;
    }

    public void setSampleShortId(String sampleShortId) {
        this.sampleShortId = sampleShortId;
    }

    public String getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(String patientNum) {
        this.patientNum = patientNum;
    }

    public String getSampleState() {
        return sampleState;
    }

    public void setSampleState(String sampleState) {
        this.sampleState = sampleState;
    }

    public String getSampleLongId() {
        return sampleLongId;
    }

    public void setSampleLongId(String sampleLongId) {
        this.sampleLongId = sampleLongId;
    }

    public String getIsHeavyBlood() {
        return isHeavyBlood;
    }

    public void setIsHeavyBlood(String isHeavyBlood) {
        this.isHeavyBlood = isHeavyBlood;
    }

    public String getOriginalBloodNum() {
        return originalBloodNum;
    }

    public void setOriginalBloodNum(String originalBloodNum) {
        this.originalBloodNum = originalBloodNum;
    }

    public String getPreviousBloodNum() {
        return previousBloodNum;
    }

    public void setPreviousBloodNum(String previousBloodNum) {
        this.previousBloodNum = previousBloodNum;
    }

    public String getTq() {
        return tq;
    }

    public void setTq(String tq) {
        this.tq = tq;
    }

    public String getTw() {
        return tw;
    }

    public void setTw(String tw) {
        this.tw = tw;
    }

    public String getTwResult() {
        return twResult;
    }

    public void setTwResult(String twResult) {
        this.twResult = twResult;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getFlowTime() {
        return flowTime;
    }

    public void setFlowTime(String flowTime) {
        this.flowTime = flowTime;
    }

    public String getReportPath() {
        return reportPath;
    }

    public void setReportPath(String reportPath) {
        this.reportPath = reportPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getBloodCollectState() {
        return bloodCollectState;
    }

    public void setBloodCollectState(String bloodCollectState) {
        this.bloodCollectState = bloodCollectState;
    }

    public String getPostTimeState() {
        return postTimeState;
    }

    public void setPostTimeState(String postTimeState) {
        this.postTimeState = postTimeState;
    }

    public String getToSamplingTimeState() {
        return toSamplingTimeState;
    }

    public void setToSamplingTimeState(String toSamplingTimeState) {
        this.toSamplingTimeState = toSamplingTimeState;
    }

    public String getFlowTimeState() {
        return flowTimeState;
    }

    public void setFlowTimeState(String flowTimeState) {
        this.flowTimeState = flowTimeState;
    }

    public String getFormalDateState() {
        return formalDateState;
    }

    public void setFormalDateState(String formalDateState) {
        this.formalDateState = formalDateState;
    }

    public String getCriduchat() {
        return criduchat;
    }

    public void setCriduchat(String criduchat) {
        this.criduchat = criduchat;
    }

    public String getCritype() {
        return critype;
    }

    public void setCritype(String critype) {
        this.critype = critype;
    }

    public String getCriposition() {
        return criposition;
    }

    public void setCriposition(String criposition) {
        this.criposition = criposition;
    }

    public String getCrisize() {
        return crisize;
    }

    public void setCrisize(String crisize) {
        this.crisize = crisize;
    }

    public String getJacobsen() {
        return jacobsen;
    }

    public void setJacobsen(String jacobsen) {
        this.jacobsen = jacobsen;
    }

    public String getJacobsentype() {
        return jacobsentype;
    }

    public void setJacobsentype(String jacobsentype) {
        this.jacobsentype = jacobsentype;
    }

    public String getJacobsenposition() {
        return jacobsenposition;
    }

    public void setJacobsenposition(String jacobsenposition) {
        this.jacobsenposition = jacobsenposition;
    }

    public String getJacobsensize() {
        return jacobsensize;
    }

    public void setJacobsensize(String jacobsensize) {
        this.jacobsensize = jacobsensize;
    }

    public String getDigeorge() {
        return digeorge;
    }

    public void setDigeorge(String digeorge) {
        this.digeorge = digeorge;
    }

    public String getDigeorgetype() {
        return digeorgetype;
    }

    public void setDigeorgetype(String digeorgetype) {
        this.digeorgetype = digeorgetype;
    }

    public String getDigeorgeposition() {
        return digeorgeposition;
    }

    public void setDigeorgeposition(String digeorgeposition) {
        this.digeorgeposition = digeorgeposition;
    }

    public String getDigeorgesize() {
        return digeorgesize;
    }

    public void setDigeorgesize(String digeorgesize) {
        this.digeorgesize = digeorgesize;
    }

    public String getSampleOpenFlag() {
        return sampleOpenFlag;
    }

    public void setSampleOpenFlag(String sampleOpenFlag) {
        this.sampleOpenFlag = sampleOpenFlag;
    }

    public String getSampleNotOpenReason() {
        return sampleNotOpenReason;
    }

    public void setSampleNotOpenReason(String sampleNotOpenReason) {
        this.sampleNotOpenReason = sampleNotOpenReason;
    }

    public String getCustomerOpenFlag() {
        return customerOpenFlag;
    }

    public void setCustomerOpenFlag(String customerOpenFlag) {
        this.customerOpenFlag = customerOpenFlag;
    }

    public String getCustomerNotOpenReason() {
        return customerNotOpenReason;
    }

    public void setCustomerNotOpenReason(String customerNotOpenReason) {
        this.customerNotOpenReason = customerNotOpenReason;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getChildSex() {
        return childSex;
    }

    public void setChildSex(String childSex) {
        this.childSex = childSex;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getBusinessIsDown() {
        return businessIsDown;
    }

    public void setBusinessIsDown(String businessIsDown) {
        this.businessIsDown = businessIsDown;
    }

    public String getHaveOtherReport() {
        return haveOtherReport;
    }

    public void setHaveOtherReport(String haveOtherReport) {
        this.haveOtherReport = haveOtherReport;
    }

    public String getOpenOtherReport() {
        return openOtherReport;
    }

    public void setOpenOtherReport(String openOtherReport) {
        this.openOtherReport = openOtherReport;
    }

    public String getReportOpenFlag() {
        return reportOpenFlag;
    }

    public void setReportOpenFlag(String reportOpenFlag) {
        this.reportOpenFlag = reportOpenFlag;
    }

    public String getOtherReportResults() {
        return otherReportResults;
    }

    public void setOtherReportResults(String otherReportResults) {
        this.otherReportResults = otherReportResults;
    }

    public int compare(NiftySurveyInfo o1, NiftySurveyInfo o2) {
        return o1.getBloodDate().compareTo(o2.getBloodDate());
    }

    public String toString() {
        try {
            return JSON.toJSONString(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
