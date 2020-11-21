
<a name="definitions"></a>
## 定义

<a name="modelandview"></a>
### ModelAndView

|名称|说明|类型|
|---|---|---|
|**empty**  <br>*可选*|**样例** : `true`|boolean|
|**model**  <br>*可选*|**样例** : `"object"`|object|
|**modelMap**  <br>*可选*|**样例** : `{<br>  "string" : "object"<br>}`|< string, object > map|
|**reference**  <br>*可选*|**样例** : `true`|boolean|
|**status**  <br>*可选*|**样例** : `"string"`|enum (100, 101, 102, 103, 200, 201, 202, 203, 204, 205, 206, 207, 208, 226, 300, 301, 302, 303, 304, 305, 307, 308, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 426, 428, 429, 431, 451, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511)|
|**view**  <br>*可选*|**样例** : `"[view](#view)"`|[View](#view)|
|**viewName**  <br>*可选*|**样例** : `"string"`|string|


<a name="result"></a>
### Result

|名称|说明|类型|
|---|---|---|
|**code**  <br>*可选*|**样例** : `0`|integer (int32)|
|**data**  <br>*可选*|**样例** : `"object"`|object|
|**message**  <br>*可选*|**样例** : `"string"`|string|


<a name="view"></a>
### View

|名称|说明|类型|
|---|---|---|
|**contentType**  <br>*可选*|**样例** : `"string"`|string|


<a name="a7ad35acaea5046dd8a61010c6d30111"></a>
### 专业

|名称|说明|类型|
|---|---|---|
|**department**  <br>*可选*|所在院系  <br>**样例** : `"string"`|string|
|**education**  <br>*可选*|学历  <br>**样例** : `"string"`|string|
|**inClass**  <br>*可选*|所在班级  <br>**样例** : `"string"`|string|
|**majorForeignLanguages**  <br>*可选*|主修外语语种  <br>**样例** : `"string"`|string|
|**normalStuCategory**  <br>*可选*|师范生类别  <br>**样例** : `"string"`|string|
|**professionalName**  <br>*可选*|专业名称  <br>**样例** : `"string"`|string|
|**schoolingLength**  <br>*可选*|学制  <br>**样例** : `"string"`|string|
|**specialtyId**  <br>*可选*|专业信息ID(主键)  <br>**样例** : `0`|integer (int32)|
|**subjectCategory**  <br>*可选*|学科门类  <br>**样例** : `"string"`|string|
|**trainingMethod**  <br>*可选*|培养方式  <br>**样例** : `"string"`|string|
|**wnormalSchool**  <br>*可选*|**样例** : `"string"`|string|


<a name="f2996845b6bf0a07fe26f74f35e42ebe"></a>
### 单位

|名称|说明|类型|
|---|---|---|
|**unitAffiliatedDepartment**  <br>*可选*|单位隶属部门  <br>**样例** : `"string"`|string|
|**unitArea**  <br>*可选*|单位所在地区  <br>**样例** : `"string"`|string|
|**unitCharacteristic**  <br>*可选*|单位性质  <br>**样例** : `"string"`|string|
|**unitContactPerson**  <br>*可选*|单位联系人  <br>**样例** : `"string"`|string|
|**unitContactPersonNumber**  <br>*可选*|联系人电话号码  <br>**样例** : `"string"`|string|
|**unitDetailedAddress**  <br>*可选*|单位具体地址  <br>**样例** : `"string"`|string|
|**unitId**  <br>*可选*|单位id(主键)  <br>**样例** : `0`|integer (int32)|
|**unitIndustry**  <br>*可选*|单位行业  <br>**样例** : `"string"`|string|
|**unitName**  <br>*可选*|单位名称  <br>**样例** : `"string"`|string|
|**unitOrganization**  <br>*可选*|单位组织机构  <br>**样例** : `"string"`|string|
|**unitPostalCode**  <br>*可选*|单位邮编  <br>**样例** : `"string"`|string|


<a name="d99040566fa44fa402b1f5b049a85e56"></a>
### 处分

|名称|说明|类型|
|---|---|---|
|**date**  <br>*可选*|处分日期  <br>**样例** : `"string"`|string (date-time)|
|**level**  <br>*可选*|处分等级  <br>**样例** : `"string"`|string|
|**managerName**  <br>*可选*|经办人姓名  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|处分名称  <br>**样例** : `"string"`|string|
|**punishId**  <br>*可选*|处分id(主键)  <br>**样例** : `0`|integer (int32)|
|**reasons**  <br>*可选*|处分理由  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|


<a name="413b738061f6a5148fa3704c5c5bdca9"></a>
### 学校

|名称|说明|类型|
|---|---|---|
|**branchSchoolName**  <br>*可选*|分校名称  <br>**样例** : `"string"`|string|
|**campus**  <br>*可选*|所在校区  <br>**样例** : `"string"`|string|
|**departmentCode**  <br>*可选*|院校隶属部门代码  <br>**样例** : `"string"`|string|
|**locationCode**  <br>*可选*|院校所在地代码  <br>**样例** : `"string"`|string|
|**provinceCode**  <br>*可选*|院校所在省份代码  <br>**样例** : `"string"`|string|
|**schoolCode**  <br>*可选*|院校代码  <br>**样例** : `"string"`|string|
|**schoolId**  <br>*可选*|学校id(主键)  <br>**样例** : `0`|integer (int32)|
|**schoolName**  <br>*可选*|院校名称  <br>**样例** : `"string"`|string|


<a name="c8514ac456bcff7fed29efa04a8c72a5"></a>
### 学生基础信息表

|名称|说明|类型|
|---|---|---|
|**birthday**  <br>*可选*|生日  <br>**样例** : `"string"`|string|
|**classBjId**  <br>*可选*|所在班级ID  <br>**样例** : `0`|integer (int32)|
|**counselorId**  <br>*可选*|辅导员id  <br>**样例** : `0`|integer (int32)|
|**courseId**  <br>*可选*|课程ID  <br>**样例** : `0`|integer (int32)|
|**email**  <br>*可选*|电子邮件  <br>**样例** : `"string"`|string|
|**gender**  <br>*可选*|性别  <br>**样例** : `"string"`|string|
|**hukouId**  <br>*可选*|户口id  <br>**样例** : `0`|integer (int32)|
|**idNumber**  <br>*可选*|身份证号  <br>**样例** : `"string"`|string|
|**name**  <br>*可选*|名字  <br>**样例** : `"string"`|string|
|**nation**  <br>*可选*|民族  <br>**样例** : `"string"`|string|
|**onlyChild**  <br>*可选*|独生子女  <br>**样例** : `"string"`|string|
|**password**  <br>*可选*|密码  <br>**样例** : `"string"`|string|
|**phoneNumber**  <br>*可选*|电话号码  <br>**样例** : `"string"`|string|
|**politicalStatus**  <br>*可选*|政治面貌  <br>**样例** : `"string"`|string|
|**qqNumber**  <br>*可选*|qq号码  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学号(主键)  <br>**样例** : `0`|integer (int32)|
|**studentStatusId**  <br>*可选*|学籍信息id  <br>**样例** : `0`|integer (int32)|


<a name="242fb0c3da9419304213ea5fc766be43"></a>
### 就业信息

|名称|说明|类型|
|---|---|---|
|**conscriptSoldiers**  <br>*可选*|应征义务兵  <br>**样例** : `"string"`|string|
|**dispatchRegistrationCardNumber**  <br>*可选*|派遣报到证号  <br>**样例** : `"string"`|string|
|**dispatchTime**  <br>*可选*|派遣时间  <br>**样例** : `"string"`|string|
|**employmentInfoId**  <br>*可选*|就业信息id(主键)  <br>**样例** : `0`|integer (int32)|
|**entryDate**  <br>*可选*|录入日期  <br>**样例** : `"string"`|string|
|**fileForwardingAddress**  <br>*可选*|档案转寄地址  <br>**样例** : `"string"`|string|
|**fileForwardingUnit**  <br>*可选*|档案转寄单位  <br>**样例** : `"string"`|string|
|**fileForwardingUnitPostcode**  <br>*可选*|档案转寄单位邮编  <br>**样例** : `"string"`|string|
|**graduateWhereabouts**  <br>*可选*|毕业去向  <br>**样例** : `"string"`|string|
|**jobSatisfaction**  <br>*可选*|就业满意度  <br>**样例** : `"string"`|string|
|**occupationalCategory**  <br>*可选*|职业类别  <br>**样例** : `"string"`|string|
|**otherInfo**  <br>*可选*|其它信息  <br>**样例** : `"string"`|string|
|**registrationCertificateIssuanceCategory**  <br>*可选*|报到证件签发类别  <br>**样例** : `"string"`|string|
|**relocationUnitName**  <br>*可选*|报到证迁往单位名称  <br>**样例** : `"string"`|string|
|**signedUnitLocation**  <br>*可选*|签往单位所在地  <br>**样例** : `"string"`|string|
|**specialInstructions**  <br>*可选*|特殊说明  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|
|**unitId**  <br>*可选*|单位id  <br>**样例** : `0`|integer (int32)|
|**wemployment**  <br>*可选*|**样例** : `"string"`|string|


<a name="5ec03e1f732974b19d6f0b45b085b4ba"></a>
### 就业调查

|名称|说明|类型|
|---|---|---|
|**employmentSurveyId**  <br>*可选*|就业调查id(主键)  <br>**样例** : `0`|integer (int32)|
|**expectedPlaceWork**  <br>*可选*|期望工作地点  <br>**样例** : `"string"`|string|
|**expectedUnitNature**  <br>*可选*|期望单位性质  <br>**样例** : `"string"`|string|
|**expectedWorkArea**  <br>*可选*|期望工作地域  <br>**样例** : `"string"`|string|
|**graduateExpectedSalary**  <br>*可选*|毕业期望薪酬  <br>**样例** : `0.0`|number|
|**instructionManual**  <br>*可选*|备注说明  <br>**样例** : `"string"`|string|
|**statisticsGraduatio**  <br>*可选*|毕业去向情况统计  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|
|**wentryHigherSchool**  <br>*可选*|**样例** : `"string"`|string|
|**workProfessionalRelevance**  <br>*可选*|工作与专业相关度  <br>**样例** : `"string"`|string|


<a name="dc7f2233142f9fdc9e2c69e5b1ee0107"></a>
### 户口

|名称|说明|类型|
|---|---|---|
|**codeNumber**  <br>*可选*|代码编号  <br>**样例** : `"string"`|string|
|**familyAddress**  <br>*可选*|家庭地址  <br>**样例** : `"string"`|string|
|**hukouId**  <br>*可选*|户口信息id(主键)  <br>**样例** : `0`|integer (int32)|
|**policeStationAddress**  <br>*可选*|派出所地址  <br>**样例** : `"string"`|string|
|**postalCode**  <br>*可选*|邮政编码  <br>**样例** : `"string"`|string|
|**povertyLevel**  <br>*可选*|贫困等级  <br>**样例** : `"string"`|string|


<a name="6881a6659c578e2dd0659c2035e0e424"></a>
### 教师基础信息表

|名称|说明|类型|
|---|---|---|
|**address**  <br>*可选*|家庭地址  <br>**样例** : `"string"`|string|
|**birthDate**  <br>*可选*|出生日期  <br>**样例** : `"string"`|string|
|**courseId**  <br>*可选*|课程id  <br>**样例** : `0`|integer (int32)|
|**email**  <br>*可选*|电子邮箱  <br>**样例** : `"string"`|string|
|**gender**  <br>*可选*|教师性别  <br>**样例** : `"string"`|string|
|**idNumber**  <br>*可选*|身份证号  <br>**样例** : `"string"`|string|
|**jobNumber**  <br>*可选*|教师工号  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|教师姓名  <br>**样例** : `"string"`|string|
|**nation**  <br>*可选*|民族  <br>**样例** : `"string"`|string|
|**password**  <br>*可选*|老师密码  <br>**样例** : `"string"`|string|
|**phoneNumber**  <br>*可选*|手机号码  <br>**样例** : `"string"`|string|
|**politicalStatus**  <br>*可选*|政治面貌  <br>**样例** : `"string"`|string|
|**qqNumber**  <br>*可选*|QQ号码  <br>**样例** : `"string"`|string|
|**teacherGrade**  <br>*可选*|教师等级  <br>**样例** : `"string"`|string|
|**teacherId**  <br>*可选*|教师号(主键)  <br>**样例** : `0`|integer (int32)|


<a name="20211b40d8451cb6cd05258d1453f78f"></a>
### 档案

|名称|说明|类型|
|---|---|---|
|**agentType**  <br>*可选*|代理类型  <br>**样例** : `"string"`|string|
|**archivesRelationshipId**  <br>*可选*|档案关系id(主键)  <br>**样例** : `0`|integer (int32)|
|**flexibleContractSign**  <br>*可选*|灵活合同标志  <br>**样例** : `"string"`|string|
|**flexibleContractUnitName**  <br>*可选*|灵活合同单位名称  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|
|**talentAgencyLogo**  <br>*可选*|人才代理标志  <br>**样例** : `"string"`|string|
|**worganizationalRelationship**  <br>*可选*|**样例** : `"string"`|string|


<a name="8ac67c8074f3d3cb29709c3aeb7391c5"></a>
### 班级

|名称|说明|类型|
|---|---|---|
|**classId**  <br>*可选*|班级id(主键)  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|班级名称  <br>**样例** : `"string"`|string|


<a name="2bd10fbdd269dcd4b434fdb132e96c62"></a>
### 考生表

|名称|说明|类型|
|---|---|---|
|**beforeFileUnit**  <br>*可选*|入学前档案所在单位  <br>**样例** : `"string"`|string|
|**birthPlace**  <br>*可选*|生源所在地  <br>**样例** : `"string"`|string|
|**difficultStudentsCategory**  <br>*可选*|困难生类别  <br>**样例** : `"string"`|string|
|**enrollmentTime**  <br>*可选*|入校时间  <br>**样例** : `"string"`|string|
|**graduationTime**  <br>*可选*|毕业时间  <br>**样例** : `"string"`|string|
|**schoolId**  <br>*可选*|学校id  <br>**样例** : `0`|integer (int32)|
|**situationComprehensiveEvaluation**  <br>*可选*|综合评测情况  <br>**样例** : `"string"`|string|
|**situationEmployed**  <br>*可选*|在校任职情况  <br>**样例** : `"string"`|string|
|**specialtyId**  <br>*可选*|专业id  <br>**样例** : `0`|integer (int32)|
|**studentStatusId**  <br>*可选*|考生号码(主键)  <br>**样例** : `0`|integer (int32)|
|**studentStatusIdBofore**  <br>*可选*|原考生号  <br>**样例** : `0`|integer (int32)|
|**waccountTransfer**  <br>*可选*|**样例** : `"string"`|string|
|**wdropOut**  <br>*可选*|**样例** : `"string"`|string|
|**wfileTransfer**  <br>*可选*|**样例** : `"string"`|string|
|**wstudentStatus**  <br>*可选*|**样例** : `"string"`|string|


<a name="60ecb8ff34649c9043ede22c9f5b7f2a"></a>
### 考研信息

|名称|说明|类型|
|---|---|---|
|**forwardingCollegeFiles**  <br>*可选*|升学档案转寄  <br>**样例** : `"string"`|string|
|**locationAdmissionInstitution**  <br>*可选*|录取院校所在地  <br>**样例** : `"string"`|string|
|**matchMajor**  <br>*可选*|专业对口  <br>**样例** : `"string"`|string|
|**orientationCommissioningUnit**  <br>*可选*|定向或委培单位  <br>**样例** : `"string"`|string|
|**postgraduateInfoId**  <br>*可选*|考研信息ID(主键)  <br>**样例** : `0`|integer (int32)|
|**proceedCollege**  <br>*可选*|升学院校  <br>**样例** : `"string"`|string|
|**recipientPhoneNumber**  <br>*可选*|接收人联系电话  <br>**样例** : `"string"`|string|
|**recipientProgressionFile**  <br>*可选*|升学档案接收人  <br>**样例** : `"string"`|string|
|**reportCardNumber**  <br>*可选*|报道证编号  <br>**样例** : `"string"`|string|
|**schoolPostcode**  <br>*可选*|升学院校邮编  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|
|**wexemptGraduateStudents**  <br>*可选*|**样例** : `"string"`|string|
|**wfulltimePostgraduate**  <br>*可选*|**样例** : `"string"`|string|


<a name="b5894313c2d9cc88561f8cdc7071f9f5"></a>
### 联系方式

|名称|说明|类型|
|---|---|---|
|**contactId**  <br>*可选*|联系方式id(主键)  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|姓名  <br>**样例** : `"string"`|string|
|**phoneNumber**  <br>*可选*|电话号码  <br>**样例** : `0`|integer (int32)|
|**relationship**  <br>*可选*|关系  <br>**样例** : `"string"`|string|
|**stuId**  <br>*可选*|学生id  <br>**样例** : `0`|integer (int32)|


<a name="58983b0dbd37e844a2fbd6094f31a2e0"></a>
### 课程

|名称|说明|类型|
|---|---|---|
|**courseId**  <br>*可选*|班级id(主键)  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|课程名称  <br>**样例** : `"string"`|string|
|**wprofessionalCourse**  <br>*可选*|**样例** : `"string"`|string|


<a name="7e7ce92ead0fa54bf9116163a46cec8a"></a>
### 辅导员

|名称|说明|类型|
|---|---|---|
|**counselorId**  <br>*可选*|辅导员id(主键)  <br>**样例** : `0`|integer (int32)|
|**name**  <br>*可选*|辅导员姓名  <br>**样例** : `"string"`|string|
|**phoneNumber**  <br>*可选*|电话  <br>**样例** : `0`|integer (int32)|



