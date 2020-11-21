
<a name="paths"></a>
## Paths

<a name="addusingpost"></a>
### 添加
```
POST /archives/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**archives**  <br>*required*|archives|[档案](#20211b40d8451cb6cd05258d1453f78f)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="deleteusingdelete"></a>
### 根据id删除
```
DELETE /archives/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="detailusingget"></a>
### 根据id查询
```
GET /archives/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="getinfobyidusingget"></a>
### 根据用户id获得info
```
GET /archives/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="listusingget"></a>
### 分页查询
```
GET /archives/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="updateusingput"></a>
### 根据id更新
```
PUT /archives/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WOrganizationalRelationship**  <br>*optional*||string|
|**Query**|**agentType**  <br>*optional*|代理类型|string|
|**Query**|**archivesRelationshipId**  <br>*optional*|档案关系id(主键)|integer (int32)|
|**Query**|**flexibleContractSign**  <br>*optional*|灵活合同标志|string|
|**Query**|**flexibleContractUnitName**  <br>*optional*|灵活合同单位名称|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|
|**Query**|**talentAgencyLogo**  <br>*optional*|人才代理标志|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 档案信息管理


<a name="addusingpost_1"></a>
### 添加
```
POST /classbj/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**classBj**  <br>*required*|classBj|[班级](#8ac67c8074f3d3cb29709c3aeb7391c5)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="deleteusingdelete_1"></a>
### 根据id删除
```
DELETE /classbj/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="detailusingget_1"></a>
### 根据id查询
```
GET /classbj/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="getclassmateusingget"></a>
### 获得所有同班同学信息
```
GET /classbj/getclassmate
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**className**  <br>*required*|className|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|< [学生基础信息表](#c8514ac456bcff7fed29efa04a8c72a5) > array|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="listusingget_1"></a>
### 分页查询
```
GET /classbj/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="updateusingput_1"></a>
### 根据id更新
```
PUT /classbj/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**classId**  <br>*optional*|班级id(主键)|integer (int32)|
|**Query**|**name**  <br>*optional*|班级名称|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 班级信息管理


<a name="addusingpost_2"></a>
### 添加
```
POST /contact/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**contact**  <br>*required*|contact|[联系方式](#b5894313c2d9cc88561f8cdc7071f9f5)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="deleteusingdelete_2"></a>
### 根据id删除
```
DELETE /contact/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="detailusingget_2"></a>
### 根据id查询
```
GET /contact/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="getinfobyidusingget_1"></a>
### 根据用户id获得info
```
GET /contact/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="listusingget_2"></a>
### 分页查询
```
GET /contact/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="updateusingput_2"></a>
### 根据id更新
```
PUT /contact/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**contactId**  <br>*optional*|联系方式id(主键)|integer (int32)|
|**Query**|**name**  <br>*optional*|姓名|string|
|**Query**|**phoneNumber**  <br>*optional*|电话号码|integer (int32)|
|**Query**|**relationship**  <br>*optional*|关系|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生联系人信息管理


<a name="addusingpost_3"></a>
### 添加
```
POST /counselor/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**counselor**  <br>*required*|counselor|[辅导员](#7e7ce92ead0fa54bf9116163a46cec8a)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 辅导员信息管理


<a name="deleteusingdelete_3"></a>
### 根据id删除
```
DELETE /counselor/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 辅导员信息管理


<a name="detailusingget_3"></a>
### 根据id查询
```
GET /counselor/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 辅导员信息管理


<a name="listusingget_3"></a>
### 分页查询
```
GET /counselor/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 辅导员信息管理


<a name="updateusingput_3"></a>
### 根据id更新
```
PUT /counselor/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**counselorId**  <br>*optional*|辅导员id(主键)|integer (int32)|
|**Query**|**name**  <br>*optional*|辅导员姓名|string|
|**Query**|**phoneNumber**  <br>*optional*|电话|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 辅导员信息管理


<a name="addusingpost_4"></a>
### 添加
```
POST /course/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**course**  <br>*required*|course|[课程](#58983b0dbd37e844a2fbd6094f31a2e0)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 课程信息管理


<a name="deleteusingdelete_4"></a>
### 根据id删除
```
DELETE /course/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 课程信息管理


<a name="detailusingget_4"></a>
### 根据id查询
```
GET /course/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 课程信息管理


<a name="listusingget_4"></a>
### 分页查询
```
GET /course/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 课程信息管理


<a name="updateusingput_4"></a>
### 根据id更新
```
PUT /course/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WProfessionalCourse**  <br>*optional*||string|
|**Query**|**courseId**  <br>*optional*|班级id(主键)|integer (int32)|
|**Query**|**name**  <br>*optional*|课程名称|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 课程信息管理


<a name="addusingpost_5"></a>
### 添加
```
POST /employmentinfo/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**employmentInfo**  <br>*required*|employmentInfo|[就业信息](#242fb0c3da9419304213ea5fc766be43)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="deleteusingdelete_5"></a>
### 根据id删除
```
DELETE /employmentinfo/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="detailusingget_5"></a>
### 根据id查询
```
GET /employmentinfo/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="getinfobyidusingget_2"></a>
### 根据用户id获得info
```
GET /employmentinfo/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="listusingget_5"></a>
### 分页查询
```
GET /employmentinfo/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="updateusingput_5"></a>
### 根据id更新
```
PUT /employmentinfo/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WEmployment**  <br>*optional*||string|
|**Query**|**conscriptSoldiers**  <br>*optional*|应征义务兵|string|
|**Query**|**dispatchRegistrationCardNumber**  <br>*optional*|派遣报到证号|string|
|**Query**|**dispatchTime**  <br>*optional*|派遣时间|string|
|**Query**|**employmentInfoId**  <br>*optional*|就业信息id(主键)|integer (int32)|
|**Query**|**entryDate**  <br>*optional*|录入日期|string|
|**Query**|**fileForwardingAddress**  <br>*optional*|档案转寄地址|string|
|**Query**|**fileForwardingUnit**  <br>*optional*|档案转寄单位|string|
|**Query**|**fileForwardingUnitPostcode**  <br>*optional*|档案转寄单位邮编|string|
|**Query**|**graduateWhereabouts**  <br>*optional*|毕业去向|string|
|**Query**|**jobSatisfaction**  <br>*optional*|就业满意度|string|
|**Query**|**occupationalCategory**  <br>*optional*|职业类别|string|
|**Query**|**otherInfo**  <br>*optional*|其它信息|string|
|**Query**|**registrationCertificateIssuanceCategory**  <br>*optional*|报到证件签发类别|string|
|**Query**|**relocationUnitName**  <br>*optional*|报到证迁往单位名称|string|
|**Query**|**signedUnitLocation**  <br>*optional*|签往单位所在地|string|
|**Query**|**specialInstructions**  <br>*optional*|特殊说明|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|
|**Query**|**unitId**  <br>*optional*|单位id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 就业信息管理


<a name="addusingpost_6"></a>
### 添加
```
POST /employmentsurvey/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**employmentSurvey**  <br>*required*|employmentSurvey|[就业调查](#5ec03e1f732974b19d6f0b45b085b4ba)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="deleteusingdelete_6"></a>
### 根据id删除
```
DELETE /employmentsurvey/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="detailusingget_6"></a>
### 根据id查询
```
GET /employmentsurvey/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="getinfobyidusingget_3"></a>
### 根据用户id获得info
```
GET /employmentsurvey/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="listusingget_6"></a>
### 分页查询
```
GET /employmentsurvey/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="updateusingput_6"></a>
### 根据id更新
```
PUT /employmentsurvey/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WEntryHigherSchool**  <br>*optional*||string|
|**Query**|**employmentSurveyId**  <br>*optional*|就业调查id(主键)|integer (int32)|
|**Query**|**expectedPlaceWork**  <br>*optional*|期望工作地点|string|
|**Query**|**expectedUnitNature**  <br>*optional*|期望单位性质|string|
|**Query**|**expectedWorkArea**  <br>*optional*|期望工作地域|string|
|**Query**|**graduateExpectedSalary**  <br>*optional*|毕业期望薪酬|number|
|**Query**|**instructionManual**  <br>*optional*|备注说明|string|
|**Query**|**statisticsGraduatio**  <br>*optional*|毕业去向情况统计|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|
|**Query**|**workProfessionalRelevance**  <br>*optional*|工作与专业相关度|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 就业意向信息管理


<a name="errorhtmlusingpost"></a>
### errorHtml
```
POST /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusingget"></a>
### errorHtml
```
GET /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusingput"></a>
### errorHtml
```
PUT /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusingdelete"></a>
### errorHtml
```
DELETE /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusingpatch"></a>
### errorHtml
```
PATCH /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusinghead"></a>
### errorHtml
```
HEAD /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="errorhtmlusingoptions"></a>
### errorHtml
```
OPTIONS /error
```


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ModelAndView](#modelandview)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Consumes

* `application/json`


#### Produces

* `text/html`


#### Tags

* basic-error-controller


<a name="addusingpost_7"></a>
### 添加
```
POST /hukou/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**hukou**  <br>*required*|hukou|[户口](#dc7f2233142f9fdc9e2c69e5b1ee0107)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 户口信息管理


<a name="deleteusingdelete_7"></a>
### 根据id删除
```
DELETE /hukou/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 户口信息管理


<a name="detailusingget_7"></a>
### 根据id查询
```
GET /hukou/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 户口信息管理


<a name="listusingget_7"></a>
### 分页查询
```
GET /hukou/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 户口信息管理


<a name="updateusingput_7"></a>
### 根据id更新
```
PUT /hukou/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**codeNumber**  <br>*optional*|代码编号|string|
|**Query**|**familyAddress**  <br>*optional*|家庭地址|string|
|**Query**|**hukouId**  <br>*optional*|户口信息id(主键)|integer (int32)|
|**Query**|**policeStationAddress**  <br>*optional*|派出所地址|string|
|**Query**|**postalCode**  <br>*optional*|邮政编码|string|
|**Query**|**povertyLevel**  <br>*optional*|贫困等级|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 户口信息管理


<a name="loginusingget"></a>
### 用户登录
```
GET /login
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**identityStatus**  <br>*required*|identityStatus|integer (int32)|
|**Query**|**password**  <br>*required*|password|string|
|**Query**|**username**  <br>*required*|username|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|integer (int32)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 用户登录接口


<a name="addusingpost_8"></a>
### 添加
```
POST /postgraduateinfo/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**postgraduateInfo**  <br>*required*|postgraduateInfo|[考研信息](#60ecb8ff34649c9043ede22c9f5b7f2a)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="deleteusingdelete_8"></a>
### 根据id删除
```
DELETE /postgraduateinfo/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="detailusingget_8"></a>
### 根据id查询
```
GET /postgraduateinfo/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="getinfobyidusingget_4"></a>
### 根据用户id获得info
```
GET /postgraduateinfo/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="listusingget_8"></a>
### 分页查询
```
GET /postgraduateinfo/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="updateusingput_8"></a>
### 根据id更新
```
PUT /postgraduateinfo/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WExemptGraduateStudents**  <br>*optional*||string|
|**Query**|**WFulltimePostgraduate**  <br>*optional*||string|
|**Query**|**forwardingCollegeFiles**  <br>*optional*|升学档案转寄|string|
|**Query**|**locationAdmissionInstitution**  <br>*optional*|录取院校所在地|string|
|**Query**|**matchMajor**  <br>*optional*|专业对口|string|
|**Query**|**orientationCommissioningUnit**  <br>*optional*|定向或委培单位|string|
|**Query**|**postgraduateInfoId**  <br>*optional*|考研信息ID(主键)|integer (int32)|
|**Query**|**proceedCollege**  <br>*optional*|升学院校|string|
|**Query**|**recipientPhoneNumber**  <br>*optional*|接收人联系电话|string|
|**Query**|**recipientProgressionFile**  <br>*optional*|升学档案接收人|string|
|**Query**|**reportCardNumber**  <br>*optional*|报道证编号|string|
|**Query**|**schoolPostcode**  <br>*optional*|升学院校邮编|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 考研信息管理


<a name="addusingpost_9"></a>
### 添加
```
POST /punish/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**punish**  <br>*required*|punish|[处分](#d99040566fa44fa402b1f5b049a85e56)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="deleteusingdelete_9"></a>
### 根据id删除
```
DELETE /punish/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="detailusingget_9"></a>
### 根据id查询
```
GET /punish/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="getinfobyidusingget_5"></a>
### 根据用户id获得info
```
GET /punish/getbyid
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**stuId**  <br>*optional*|stuId|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="listusingget_9"></a>
### 分页查询
```
GET /punish/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="updateusingput_9"></a>
### 根据id更新
```
PUT /punish/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**date**  <br>*optional*|处分日期|string (date-time)|
|**Query**|**level**  <br>*optional*|处分等级|string|
|**Query**|**managerName**  <br>*optional*|经办人姓名|string|
|**Query**|**name**  <br>*optional*|处分名称|string|
|**Query**|**punishId**  <br>*optional*|处分id(主键)|integer (int32)|
|**Query**|**reasons**  <br>*optional*|处分理由|string|
|**Query**|**stuId**  <br>*optional*|学生id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 处分信息管理


<a name="addusingpost_10"></a>
### 添加
```
POST /school/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**school**  <br>*required*|school|[学校](#413b738061f6a5148fa3704c5c5bdca9)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学校信息管理


<a name="deleteusingdelete_10"></a>
### 根据id删除
```
DELETE /school/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 学校信息管理


<a name="detailusingget_10"></a>
### 根据id查询
```
GET /school/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学校信息管理


<a name="listusingget_10"></a>
### 分页查询
```
GET /school/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学校信息管理


<a name="updateusingput_10"></a>
### 根据id更新
```
PUT /school/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**branchSchoolName**  <br>*optional*|分校名称|string|
|**Query**|**campus**  <br>*optional*|所在校区|string|
|**Query**|**departmentCode**  <br>*optional*|院校隶属部门代码|string|
|**Query**|**locationCode**  <br>*optional*|院校所在地代码|string|
|**Query**|**provinceCode**  <br>*optional*|院校所在省份代码|string|
|**Query**|**schoolCode**  <br>*optional*|院校代码|string|
|**Query**|**schoolId**  <br>*optional*|学校id(主键)|integer (int32)|
|**Query**|**schoolName**  <br>*optional*|院校名称|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学校信息管理


<a name="addusingpost_11"></a>
### 添加
```
POST /specialty/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**specialty**  <br>*required*|specialty|[专业](#a7ad35acaea5046dd8a61010c6d30111)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 专业信息管理


<a name="deleteusingdelete_11"></a>
### 根据id删除
```
DELETE /specialty/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 专业信息管理


<a name="detailusingget_11"></a>
### 根据id查询
```
GET /specialty/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 专业信息管理


<a name="listusingget_11"></a>
### 分页查询
```
GET /specialty/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 专业信息管理


<a name="updateusingput_11"></a>
### 根据id更新
```
PUT /specialty/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WNormalSchool**  <br>*optional*||string|
|**Query**|**department**  <br>*optional*|所在院系|string|
|**Query**|**education**  <br>*optional*|学历|string|
|**Query**|**inClass**  <br>*optional*|所在班级|string|
|**Query**|**majorForeignLanguages**  <br>*optional*|主修外语语种|string|
|**Query**|**normalStuCategory**  <br>*optional*|师范生类别|string|
|**Query**|**professionalName**  <br>*optional*|专业名称|string|
|**Query**|**schoolingLength**  <br>*optional*|学制|string|
|**Query**|**specialtyId**  <br>*optional*|专业信息ID(主键)|integer (int32)|
|**Query**|**subjectCategory**  <br>*optional*|学科门类|string|
|**Query**|**trainingMethod**  <br>*optional*|培养方式|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 专业信息管理


<a name="addusingpost_12"></a>
### 添加
```
POST /student/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**student**  <br>*required*|student|[学生基础信息表](#c8514ac456bcff7fed29efa04a8c72a5)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="changepassusingput"></a>
### 修改学生密码
```
PUT /student/changepass
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|
|**Query**|**password**  <br>*required*|password|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="deleteusingdelete_12"></a>
### 根据id删除
```
DELETE /student/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="detailusingget_12"></a>
### 根据id查询
```
GET /student/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="listusingget_12"></a>
### 分页查询
```
GET /student/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="updateusingput_12"></a>
### 根据id更新
```
PUT /student/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**birthday**  <br>*optional*|生日|string (date-time)|
|**Query**|**classBjId**  <br>*optional*|所在班级ID|integer (int32)|
|**Query**|**counselorId**  <br>*optional*|辅导员id|integer (int32)|
|**Query**|**courseId**  <br>*optional*|课程ID|integer (int32)|
|**Query**|**email**  <br>*optional*|电子邮件|string|
|**Query**|**gender**  <br>*optional*|性别|string|
|**Query**|**hukouId**  <br>*optional*|户口id|integer (int32)|
|**Query**|**idNumber**  <br>*optional*|身份证号|string|
|**Query**|**name**  <br>*optional*|名字|string|
|**Query**|**nation**  <br>*optional*|民族|string|
|**Query**|**onlyChild**  <br>*optional*|独生子女|string|
|**Query**|**password**  <br>*optional*|密码|string|
|**Query**|**phoneNumber**  <br>*optional*|电话号码|string|
|**Query**|**politicalStatus**  <br>*optional*|政治面貌|string|
|**Query**|**qqNumber**  <br>*optional*|qq号码|string|
|**Query**|**stuId**  <br>*optional*|学号(主键)|integer (int32)|
|**Query**|**studentStatusId**  <br>*optional*|学籍信息id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生信息管理


<a name="addusingpost_13"></a>
### 添加
```
POST /studentstatusinfo/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**studentStatusInfo**  <br>*required*|studentStatusInfo|[考生表](#2bd10fbdd269dcd4b434fdb132e96c62)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生基础信息管理


<a name="deleteusingdelete_13"></a>
### 根据id删除
```
DELETE /studentstatusinfo/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 学生基础信息管理


<a name="detailusingget_13"></a>
### 根据id查询
```
GET /studentstatusinfo/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生基础信息管理


<a name="listusingget_13"></a>
### 分页查询
```
GET /studentstatusinfo/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 学生基础信息管理


<a name="updateusingput_13"></a>
### 根据id更新
```
PUT /studentstatusinfo/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**WAccountTransfer**  <br>*optional*||string|
|**Query**|**WDropOut**  <br>*optional*||string|
|**Query**|**WFileTransfer**  <br>*optional*||string|
|**Query**|**WStudentStatus**  <br>*optional*||string|
|**Query**|**beforeFileUnit**  <br>*optional*|入学前档案所在单位|string|
|**Query**|**birthPlace**  <br>*optional*|生源所在地|string|
|**Query**|**difficultStudentsCategory**  <br>*optional*|困难生类别|string|
|**Query**|**enrollmentTime**  <br>*optional*|入校时间|string (date-time)|
|**Query**|**graduationTime**  <br>*optional*|毕业时间|string (date-time)|
|**Query**|**schoolId**  <br>*optional*|学校id|integer (int32)|
|**Query**|**situationComprehensiveEvaluation**  <br>*optional*|综合评测情况|string|
|**Query**|**situationEmployed**  <br>*optional*|在校任职情况|string|
|**Query**|**specialtyId**  <br>*optional*|专业id|integer (int32)|
|**Query**|**studentStatusId**  <br>*optional*|考生号码(主键)|integer (int32)|
|**Query**|**studentStatusIdBofore**  <br>*optional*|原考生号|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 学生基础信息管理


<a name="addusingpost_14"></a>
### 添加
```
POST /teacher/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**teacher**  <br>*required*|teacher|[教师基础信息表](#6881a6659c578e2dd0659c2035e0e424)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="changepassusingput_1"></a>
### 修改教师密码
```
PUT /teacher/changepass
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|
|**Query**|**password**  <br>*required*|password|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="deleteusingdelete_14"></a>
### 根据id删除
```
DELETE /teacher/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="detailusingget_14"></a>
### 根据id查询
```
GET /teacher/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="listusingget_14"></a>
### 分页查询
```
GET /teacher/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="updateusingput_14"></a>
### 根据id更新
```
PUT /teacher/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**teacher**  <br>*required*|teacher|[教师基础信息表](#6881a6659c578e2dd0659c2035e0e424)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 老师基础信息管理


<a name="addusingpost_15"></a>
### 添加
```
POST /unit/add
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**unit**  <br>*required*|unit|[单位](#f2996845b6bf0a07fe26f74f35e42ebe)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 公司单位信息管理


<a name="deleteusingdelete_15"></a>
### 根据id删除
```
DELETE /unit/delete
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* 公司单位信息管理


<a name="detailusingget_15"></a>
### 根据id查询
```
GET /unit/detail
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 公司单位信息管理


<a name="listusingget_15"></a>
### 分页查询
```
GET /unit/list
```


#### Parameters

|Type|Name|Description|Schema|Default|
|---|---|---|---|---|
|**Query**|**page**  <br>*optional*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*optional*|size|integer (int32)|`0`|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* 公司单位信息管理


<a name="updateusingput_15"></a>
### 根据id更新
```
PUT /unit/update
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**unitAffiliatedDepartment**  <br>*optional*|单位隶属部门|string|
|**Query**|**unitArea**  <br>*optional*|单位所在地区|string|
|**Query**|**unitCharacteristic**  <br>*optional*|单位性质|string|
|**Query**|**unitContactPerson**  <br>*optional*|单位联系人|string|
|**Query**|**unitContactPersonNumber**  <br>*optional*|联系人电话号码|string|
|**Query**|**unitDetailedAddress**  <br>*optional*|单位具体地址|string|
|**Query**|**unitId**  <br>*optional*|单位id(主键)|integer (int32)|
|**Query**|**unitIndustry**  <br>*optional*|单位行业|string|
|**Query**|**unitName**  <br>*optional*|单位名称|string|
|**Query**|**unitOrganization**  <br>*optional*|单位组织机构|string|
|**Query**|**unitPostalCode**  <br>*optional*|单位邮编|string|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* 公司单位信息管理



