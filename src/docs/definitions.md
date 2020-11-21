
<a name="definitions"></a>
## Definitions

<a name="modelandview"></a>
### ModelAndView

|Name|Schema|
|---|---|
|**empty**  <br>*optional*|boolean|
|**model**  <br>*optional*|object|
|**modelMap**  <br>*optional*|< string, object > map|
|**reference**  <br>*optional*|boolean|
|**status**  <br>*optional*|enum (100, 101, 102, 103, 200, 201, 202, 203, 204, 205, 206, 207, 208, 226, 300, 301, 302, 303, 304, 305, 307, 308, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 426, 428, 429, 431, 451, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511)|
|**view**  <br>*optional*|[View](#view)|
|**viewName**  <br>*optional*|string|


<a name="result"></a>
### Result

|Name|Schema|
|---|---|
|**code**  <br>*optional*|integer (int32)|
|**data**  <br>*optional*|object|
|**message**  <br>*optional*|string|


<a name="view"></a>
### View

|Name|Schema|
|---|---|
|**contentType**  <br>*optional*|string|


<a name="a7ad35acaea5046dd8a61010c6d30111"></a>
### 专业

|Name|Description|Schema|
|---|---|---|
|**department**  <br>*optional*|所在院系|string|
|**education**  <br>*optional*|学历|string|
|**inClass**  <br>*optional*|所在班级|string|
|**majorForeignLanguages**  <br>*optional*|主修外语语种|string|
|**normalStuCategory**  <br>*optional*|师范生类别|string|
|**professionalName**  <br>*optional*|专业名称|string|
|**schoolingLength**  <br>*optional*|学制|string|
|**specialtyId**  <br>*optional*|专业信息ID(主键)|integer (int32)|
|**subjectCategory**  <br>*optional*|学科门类|string|
|**trainingMethod**  <br>*optional*|培养方式|string|
|**wnormalSchool**  <br>*optional*||string|


<a name="f2996845b6bf0a07fe26f74f35e42ebe"></a>
### 单位

|Name|Description|Schema|
|---|---|---|
|**unitAffiliatedDepartment**  <br>*optional*|单位隶属部门|string|
|**unitArea**  <br>*optional*|单位所在地区|string|
|**unitCharacteristic**  <br>*optional*|单位性质|string|
|**unitContactPerson**  <br>*optional*|单位联系人|string|
|**unitContactPersonNumber**  <br>*optional*|联系人电话号码|string|
|**unitDetailedAddress**  <br>*optional*|单位具体地址|string|
|**unitId**  <br>*optional*|单位id(主键)|integer (int32)|
|**unitIndustry**  <br>*optional*|单位行业|string|
|**unitName**  <br>*optional*|单位名称|string|
|**unitOrganization**  <br>*optional*|单位组织机构|string|
|**unitPostalCode**  <br>*optional*|单位邮编|string|


<a name="d99040566fa44fa402b1f5b049a85e56"></a>
### 处分

|Name|Description|Schema|
|---|---|---|
|**date**  <br>*optional*|处分日期|string (date-time)|
|**level**  <br>*optional*|处分等级|string|
|**managerName**  <br>*optional*|经办人姓名|string|
|**name**  <br>*optional*|处分名称|string|
|**punishId**  <br>*optional*|处分id(主键)|integer (int32)|
|**reasons**  <br>*optional*|处分理由|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|


<a name="413b738061f6a5148fa3704c5c5bdca9"></a>
### 学校

|Name|Description|Schema|
|---|---|---|
|**branchSchoolName**  <br>*optional*|分校名称|string|
|**campus**  <br>*optional*|所在校区|string|
|**departmentCode**  <br>*optional*|院校隶属部门代码|string|
|**locationCode**  <br>*optional*|院校所在地代码|string|
|**provinceCode**  <br>*optional*|院校所在省份代码|string|
|**schoolCode**  <br>*optional*|院校代码|string|
|**schoolId**  <br>*optional*|学校id(主键)|integer (int32)|
|**schoolName**  <br>*optional*|院校名称|string|


<a name="c8514ac456bcff7fed29efa04a8c72a5"></a>
### 学生基础信息表

|Name|Description|Schema|
|---|---|---|
|**birthday**  <br>*optional*|生日|string (date-time)|
|**classBjId**  <br>*optional*|所在班级ID|integer (int32)|
|**counselorId**  <br>*optional*|辅导员id|integer (int32)|
|**courseId**  <br>*optional*|课程ID|integer (int32)|
|**email**  <br>*optional*|电子邮件|string|
|**gender**  <br>*optional*|性别|string|
|**hukouId**  <br>*optional*|户口id|integer (int32)|
|**idNumber**  <br>*optional*|身份证号|string|
|**name**  <br>*optional*|名字|string|
|**nation**  <br>*optional*|民族|string|
|**onlyChild**  <br>*optional*|独生子女|string|
|**password**  <br>*optional*|密码|string|
|**phoneNumber**  <br>*optional*|电话号码|string|
|**politicalStatus**  <br>*optional*|政治面貌|string|
|**qqNumber**  <br>*optional*|qq号码|string|
|**stuId**  <br>*optional*|学号(主键)|integer (int32)|
|**studentStatusId**  <br>*optional*|学籍信息id|integer (int32)|


<a name="242fb0c3da9419304213ea5fc766be43"></a>
### 就业信息

|Name|Description|Schema|
|---|---|---|
|**conscriptSoldiers**  <br>*optional*|应征义务兵|string|
|**dispatchRegistrationCardNumber**  <br>*optional*|派遣报到证号|string|
|**dispatchTime**  <br>*optional*|派遣时间|string|
|**employmentInfoId**  <br>*optional*|就业信息id(主键)|integer (int32)|
|**entryDate**  <br>*optional*|录入日期|string|
|**fileForwardingAddress**  <br>*optional*|档案转寄地址|string|
|**fileForwardingUnit**  <br>*optional*|档案转寄单位|string|
|**fileForwardingUnitPostcode**  <br>*optional*|档案转寄单位邮编|string|
|**graduateWhereabouts**  <br>*optional*|毕业去向|string|
|**jobSatisfaction**  <br>*optional*|就业满意度|string|
|**occupationalCategory**  <br>*optional*|职业类别|string|
|**otherInfo**  <br>*optional*|其它信息|string|
|**registrationCertificateIssuanceCategory**  <br>*optional*|报到证件签发类别|string|
|**relocationUnitName**  <br>*optional*|报到证迁往单位名称|string|
|**signedUnitLocation**  <br>*optional*|签往单位所在地|string|
|**specialInstructions**  <br>*optional*|特殊说明|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|
|**unitId**  <br>*optional*|单位id|integer (int32)|
|**wemployment**  <br>*optional*||string|


<a name="5ec03e1f732974b19d6f0b45b085b4ba"></a>
### 就业调查

|Name|Description|Schema|
|---|---|---|
|**employmentSurveyId**  <br>*optional*|就业调查id(主键)|integer (int32)|
|**expectedPlaceWork**  <br>*optional*|期望工作地点|string|
|**expectedUnitNature**  <br>*optional*|期望单位性质|string|
|**expectedWorkArea**  <br>*optional*|期望工作地域|string|
|**graduateExpectedSalary**  <br>*optional*|毕业期望薪酬|number|
|**instructionManual**  <br>*optional*|备注说明|string|
|**statisticsGraduatio**  <br>*optional*|毕业去向情况统计|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|
|**wentryHigherSchool**  <br>*optional*||string|
|**workProfessionalRelevance**  <br>*optional*|工作与专业相关度|string|


<a name="dc7f2233142f9fdc9e2c69e5b1ee0107"></a>
### 户口

|Name|Description|Schema|
|---|---|---|
|**codeNumber**  <br>*optional*|代码编号|string|
|**familyAddress**  <br>*optional*|家庭地址|string|
|**hukouId**  <br>*optional*|户口信息id(主键)|integer (int32)|
|**policeStationAddress**  <br>*optional*|派出所地址|string|
|**postalCode**  <br>*optional*|邮政编码|string|
|**povertyLevel**  <br>*optional*|贫困等级|string|


<a name="6881a6659c578e2dd0659c2035e0e424"></a>
### 教师基础信息表

|Name|Description|Schema|
|---|---|---|
|**address**  <br>*optional*|家庭地址|string|
|**birthDate**  <br>*optional*|出生日期|string|
|**courseId**  <br>*optional*|课程id|integer (int32)|
|**email**  <br>*optional*|电子邮箱|string|
|**gender**  <br>*optional*|教师性别|string|
|**idNumber**  <br>*optional*|身份证号|string|
|**jobNumber**  <br>*optional*|教师工号|integer (int32)|
|**name**  <br>*optional*|教师姓名|string|
|**nation**  <br>*optional*|民族|string|
|**password**  <br>*optional*|老师密码|string|
|**phoneNumber**  <br>*optional*|手机号码|string|
|**politicalStatus**  <br>*optional*|政治面貌|string|
|**qqNumber**  <br>*optional*|QQ号码|string|
|**teacherGrade**  <br>*optional*|教师等级|string|
|**teacherId**  <br>*optional*|教师号(主键)|integer (int32)|


<a name="20211b40d8451cb6cd05258d1453f78f"></a>
### 档案

|Name|Description|Schema|
|---|---|---|
|**agentType**  <br>*optional*|代理类型|string|
|**archivesRelationshipId**  <br>*optional*|档案关系id(主键)|integer (int32)|
|**flexibleContractSign**  <br>*optional*|灵活合同标志|string|
|**flexibleContractUnitName**  <br>*optional*|灵活合同单位名称|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|
|**talentAgencyLogo**  <br>*optional*|人才代理标志|string|
|**worganizationalRelationship**  <br>*optional*||string|


<a name="8ac67c8074f3d3cb29709c3aeb7391c5"></a>
### 班级

|Name|Description|Schema|
|---|---|---|
|**classId**  <br>*optional*|班级id(主键)|integer (int32)|
|**name**  <br>*optional*|班级名称|string|


<a name="2bd10fbdd269dcd4b434fdb132e96c62"></a>
### 考生表

|Name|Description|Schema|
|---|---|---|
|**beforeFileUnit**  <br>*optional*|入学前档案所在单位|string|
|**birthPlace**  <br>*optional*|生源所在地|string|
|**difficultStudentsCategory**  <br>*optional*|困难生类别|string|
|**enrollmentTime**  <br>*optional*|入校时间|string (date-time)|
|**graduationTime**  <br>*optional*|毕业时间|string (date-time)|
|**schoolId**  <br>*optional*|学校id|integer (int32)|
|**situationComprehensiveEvaluation**  <br>*optional*|综合评测情况|string|
|**situationEmployed**  <br>*optional*|在校任职情况|string|
|**specialtyId**  <br>*optional*|专业id|integer (int32)|
|**studentStatusId**  <br>*optional*|考生号码(主键)|integer (int32)|
|**studentStatusIdBofore**  <br>*optional*|原考生号|integer (int32)|
|**waccountTransfer**  <br>*optional*||string|
|**wdropOut**  <br>*optional*||string|
|**wfileTransfer**  <br>*optional*||string|
|**wstudentStatus**  <br>*optional*||string|


<a name="60ecb8ff34649c9043ede22c9f5b7f2a"></a>
### 考研信息

|Name|Description|Schema|
|---|---|---|
|**forwardingCollegeFiles**  <br>*optional*|升学档案转寄|string|
|**locationAdmissionInstitution**  <br>*optional*|录取院校所在地|string|
|**matchMajor**  <br>*optional*|专业对口|string|
|**orientationCommissioningUnit**  <br>*optional*|定向或委培单位|string|
|**postgraduateInfoId**  <br>*optional*|考研信息ID(主键)|integer (int32)|
|**proceedCollege**  <br>*optional*|升学院校|string|
|**recipientPhoneNumber**  <br>*optional*|接收人联系电话|string|
|**recipientProgressionFile**  <br>*optional*|升学档案接收人|string|
|**reportCardNumber**  <br>*optional*|报道证编号|string|
|**schoolPostcode**  <br>*optional*|升学院校邮编|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|
|**wexemptGraduateStudents**  <br>*optional*||string|
|**wfulltimePostgraduate**  <br>*optional*||string|


<a name="b5894313c2d9cc88561f8cdc7071f9f5"></a>
### 联系方式

|Name|Description|Schema|
|---|---|---|
|**contactId**  <br>*optional*|联系方式id(主键)|integer (int32)|
|**name**  <br>*optional*|姓名|string|
|**phoneNumber**  <br>*optional*|电话号码|integer (int32)|
|**relationship**  <br>*optional*|关系|string|
|**stuId**  <br>*optional*|学生id|integer (int32)|


<a name="58983b0dbd37e844a2fbd6094f31a2e0"></a>
### 课程

|Name|Description|Schema|
|---|---|---|
|**courseId**  <br>*optional*|班级id(主键)|integer (int32)|
|**name**  <br>*optional*|课程名称|string|
|**wprofessionalCourse**  <br>*optional*||string|


<a name="7e7ce92ead0fa54bf9116163a46cec8a"></a>
### 辅导员

|Name|Description|Schema|
|---|---|---|
|**counselorId**  <br>*optional*|辅导员id(主键)|integer (int32)|
|**name**  <br>*optional*|辅导员姓名|string|
|**phoneNumber**  <br>*optional*|电话|integer (int32)|



