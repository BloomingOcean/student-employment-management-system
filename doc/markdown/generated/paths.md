
<a name="paths"></a>
## 资源

<a name="basic-error-controller_resource"></a>
### Basic-error-controller
Basic Error Controller


<a name="errorusingpost"></a>
#### error
```
POST /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusingget"></a>
#### error
```
GET /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusingput"></a>
#### error
```
PUT /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusingdelete"></a>
#### error
```
DELETE /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusingpatch"></a>
#### error
```
PATCH /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusinghead"></a>
#### error
```
HEAD /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="errorusingoptions"></a>
#### error
```
OPTIONS /error
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< string, object > map|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/error
```


##### HTTP响应示例

###### 响应 200
```
json :
"object"
```


<a name="f65fb42bf716ceb17618b0d0def6bd33"></a>
### 专业信息管理
Specialty Controller


<a name="addusingpost_11"></a>
#### 专业信息-添加
```
POST /specialty/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**specialty**  <br>*必填*|specialty|[专业](#a7ad35acaea5046dd8a61010c6d30111)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/specialty/add
```


###### 请求 body
```
json :
{
  "department" : "string",
  "education" : "string",
  "inClass" : "string",
  "majorForeignLanguages" : "string",
  "normalStuCategory" : "string",
  "professionalName" : "string",
  "schoolingLength" : "string",
  "specialtyId" : 0,
  "subjectCategory" : "string",
  "trainingMethod" : "string",
  "wnormalSchool" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_11"></a>
#### 专业信息-根据id删除
```
DELETE /specialty/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/specialty/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_10"></a>
#### 专业信息-根据id查询
```
GET /specialty/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/specialty/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_11"></a>
#### 专业信息-分页查询
```
GET /specialty/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/specialty/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_11"></a>
#### 专业信息-根据id更新
```
PUT /specialty/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WNormalSchool**  <br>*可选*||string|
|**Query**|**department**  <br>*可选*|所在院系|string|
|**Query**|**education**  <br>*可选*|学历|string|
|**Query**|**inClass**  <br>*可选*|所在班级|string|
|**Query**|**majorForeignLanguages**  <br>*可选*|主修外语语种|string|
|**Query**|**normalStuCategory**  <br>*可选*|师范生类别|string|
|**Query**|**professionalName**  <br>*可选*|专业名称|string|
|**Query**|**schoolingLength**  <br>*可选*|学制|string|
|**Query**|**specialtyId**  <br>*可选*|专业信息ID(主键)|integer (int32)|
|**Query**|**subjectCategory**  <br>*可选*|学科门类|string|
|**Query**|**trainingMethod**  <br>*可选*|培养方式|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/specialty/update
```


###### 请求 query
```
json :
{
  "WNormalSchool" : "string",
  "department" : "string",
  "education" : "string",
  "inClass" : "string",
  "majorForeignLanguages" : "string",
  "normalStuCategory" : "string",
  "professionalName" : "string",
  "schoolingLength" : "string",
  "specialtyId" : 0,
  "subjectCategory" : "string",
  "trainingMethod" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="23e5a31bc8ff56808fd0dff4d1ab3681"></a>
### 公司单位信息管理
Unit Controller


<a name="addusingpost_15"></a>
#### 公司单位信息-添加
```
POST /unit/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**unit**  <br>*必填*|unit|[单位](#f2996845b6bf0a07fe26f74f35e42ebe)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/add
```


###### 请求 body
```
json :
{
  "unitAffiliatedDepartment" : "string",
  "unitArea" : "string",
  "unitCharacteristic" : "string",
  "unitContactPerson" : "string",
  "unitContactPersonNumber" : "string",
  "unitDetailedAddress" : "string",
  "unitId" : 0,
  "unitIndustry" : "string",
  "unitName" : "string",
  "unitOrganization" : "string",
  "unitPostalCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_15"></a>
#### 公司单位信息-根据id删除
```
DELETE /unit/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_14"></a>
#### 公司单位信息-根据id查询
```
GET /unit/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_15"></a>
#### 公司单位信息-分页查询
```
GET /unit/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_15"></a>
#### 公司单位信息-根据id更新
```
PUT /unit/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**unitAffiliatedDepartment**  <br>*可选*|单位隶属部门|string|
|**Query**|**unitArea**  <br>*可选*|单位所在地区|string|
|**Query**|**unitCharacteristic**  <br>*可选*|单位性质|string|
|**Query**|**unitContactPerson**  <br>*可选*|单位联系人|string|
|**Query**|**unitContactPersonNumber**  <br>*可选*|联系人电话号码|string|
|**Query**|**unitDetailedAddress**  <br>*可选*|单位具体地址|string|
|**Query**|**unitId**  <br>*可选*|单位id(主键)|integer (int32)|
|**Query**|**unitIndustry**  <br>*可选*|单位行业|string|
|**Query**|**unitName**  <br>*可选*|单位名称|string|
|**Query**|**unitOrganization**  <br>*可选*|单位组织机构|string|
|**Query**|**unitPostalCode**  <br>*可选*|单位邮编|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/unit/update
```


###### 请求 query
```
json :
{
  "unitAffiliatedDepartment" : "string",
  "unitArea" : "string",
  "unitCharacteristic" : "string",
  "unitContactPerson" : "string",
  "unitContactPersonNumber" : "string",
  "unitDetailedAddress" : "string",
  "unitId" : 0,
  "unitIndustry" : "string",
  "unitName" : "string",
  "unitOrganization" : "string",
  "unitPostalCode" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="34e76df2198bda76cb8dea1fc15d6813"></a>
### 处分信息管理
Punish Controller


<a name="addusingpost_9"></a>
#### 处分信息-添加
```
POST /punish/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**punish**  <br>*必填*|punish|[处分](#d99040566fa44fa402b1f5b049a85e56)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/add
```


###### 请求 body
```
json :
{
  "date" : "string",
  "level" : "string",
  "managerName" : "string",
  "name" : "string",
  "punishId" : 0,
  "reasons" : "string",
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_9"></a>
#### 处分信息-根据id删除
```
DELETE /punish/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_8"></a>
#### 处分信息-根据id查询
```
GET /punish/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget_5"></a>
#### 处分信息-根据用户id获得info
```
GET /punish/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_9"></a>
#### 处分信息-分页查询
```
GET /punish/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_9"></a>
#### 处分信息-根据id更新
```
PUT /punish/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**date**  <br>*可选*|处分日期|string (date-time)|
|**Query**|**level**  <br>*可选*|处分等级|string|
|**Query**|**managerName**  <br>*可选*|经办人姓名|string|
|**Query**|**name**  <br>*可选*|处分名称|string|
|**Query**|**punishId**  <br>*可选*|处分id(主键)|integer (int32)|
|**Query**|**reasons**  <br>*可选*|处分理由|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/punish/update
```


###### 请求 query
```
json :
{
  "date" : "string",
  "level" : "string",
  "managerName" : "string",
  "name" : "string",
  "punishId" : 0,
  "reasons" : "string",
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="ff5f5c0e1529b1105947084dae1c0c40"></a>
### 学校信息管理
School Controller


<a name="addusingpost_10"></a>
#### 学校信息-添加
```
POST /school/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**school**  <br>*必填*|school|[学校](#413b738061f6a5148fa3704c5c5bdca9)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/school/add
```


###### 请求 body
```
json :
{
  "branchSchoolName" : "string",
  "campus" : "string",
  "departmentCode" : "string",
  "locationCode" : "string",
  "provinceCode" : "string",
  "schoolCode" : "string",
  "schoolId" : 0,
  "schoolName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_10"></a>
#### 学校信息-根据id删除
```
DELETE /school/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/school/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_9"></a>
#### 学校信息-根据id查询
```
GET /school/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/school/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_10"></a>
#### 学校信息-分页查询
```
GET /school/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/school/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_10"></a>
#### 学校信息-根据id更新
```
PUT /school/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**branchSchoolName**  <br>*可选*|分校名称|string|
|**Query**|**campus**  <br>*可选*|所在校区|string|
|**Query**|**departmentCode**  <br>*可选*|院校隶属部门代码|string|
|**Query**|**locationCode**  <br>*可选*|院校所在地代码|string|
|**Query**|**provinceCode**  <br>*可选*|院校所在省份代码|string|
|**Query**|**schoolCode**  <br>*可选*|院校代码|string|
|**Query**|**schoolId**  <br>*可选*|学校id(主键)|integer (int32)|
|**Query**|**schoolName**  <br>*可选*|院校名称|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/school/update
```


###### 请求 query
```
json :
{
  "branchSchoolName" : "string",
  "campus" : "string",
  "departmentCode" : "string",
  "locationCode" : "string",
  "provinceCode" : "string",
  "schoolCode" : "string",
  "schoolId" : 0,
  "schoolName" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="bd9fe6024cbb3145894a5e911f792003"></a>
### 学生信息管理
Student Controller


<a name="addusingpost_12"></a>
#### 学生信息-添加
```
POST /student/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**student**  <br>*必填*|student|[学生基础信息表](#c8514ac456bcff7fed29efa04a8c72a5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/add
```


###### 请求 body
```
json :
{
  "birthday" : "string",
  "classBjId" : 0,
  "counselorId" : 0,
  "courseId" : 0,
  "email" : "string",
  "gender" : "string",
  "hukouId" : 0,
  "idNumber" : "string",
  "name" : "string",
  "nation" : "string",
  "onlyChild" : "string",
  "password" : "string",
  "phoneNumber" : "string",
  "politicalStatus" : "string",
  "qqNumber" : "string",
  "stuId" : 0,
  "studentStatusId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="changepassusingput"></a>
#### 学生信息-修改学生密码
```
PUT /student/changepass
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|
|**Query**|**password**  <br>*必填*|password|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/changepass
```


###### 请求 query
```
json :
{
  "id" : 0,
  "password" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_12"></a>
#### 学生信息-根据id删除
```
DELETE /student/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_11"></a>
#### 学生信息-根据id查询
```
GET /student/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getclassgengerusingget"></a>
#### 学生信息-获取学生性别数量
```
GET /student/getclassgenger
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/getclassgenger
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getexpectedsalaryusingget"></a>
#### 学生信息-获取学生薪资水平分布
```
GET /student/getexceptsalary
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/getexceptsalary
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getpostemplnumberusingget"></a>
#### 学生信息-获得考研就业人数
```
GET /student/getpostemplnumber
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/getpostemplnumber
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_12"></a>
#### 学生信息-分页查询
```
GET /student/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_12"></a>
#### 学生信息-根据id更新
```
PUT /student/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**birthday**  <br>*可选*|生日|string|
|**Query**|**classBjId**  <br>*可选*|所在班级ID|integer (int32)|
|**Query**|**counselorId**  <br>*可选*|辅导员id|integer (int32)|
|**Query**|**courseId**  <br>*可选*|课程ID|integer (int32)|
|**Query**|**email**  <br>*可选*|电子邮件|string|
|**Query**|**gender**  <br>*可选*|性别|string|
|**Query**|**hukouId**  <br>*可选*|户口id|integer (int32)|
|**Query**|**idNumber**  <br>*可选*|身份证号|string|
|**Query**|**name**  <br>*可选*|名字|string|
|**Query**|**nation**  <br>*可选*|民族|string|
|**Query**|**onlyChild**  <br>*可选*|独生子女|string|
|**Query**|**password**  <br>*可选*|密码|string|
|**Query**|**phoneNumber**  <br>*可选*|电话号码|string|
|**Query**|**politicalStatus**  <br>*可选*|政治面貌|string|
|**Query**|**qqNumber**  <br>*可选*|qq号码|string|
|**Query**|**stuId**  <br>*可选*|学号(主键)|integer (int32)|
|**Query**|**studentStatusId**  <br>*可选*|学籍信息id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/student/update
```


###### 请求 query
```
json :
{
  "birthday" : "string",
  "classBjId" : 0,
  "counselorId" : 0,
  "courseId" : 0,
  "email" : "string",
  "gender" : "string",
  "hukouId" : 0,
  "idNumber" : "string",
  "name" : "string",
  "nation" : "string",
  "onlyChild" : "string",
  "password" : "string",
  "phoneNumber" : "string",
  "politicalStatus" : "string",
  "qqNumber" : "string",
  "stuId" : 0,
  "studentStatusId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="cc2262e1f84d23247cbbb6b35c0d1c8e"></a>
### 学生基础信息管理
Student Status Info Controller


<a name="addusingpost_13"></a>
#### 学生基础信息-添加
```
POST /studentstatusinfo/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**studentStatusInfo**  <br>*必填*|studentStatusInfo|[考生表](#2bd10fbdd269dcd4b434fdb132e96c62)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/add
```


###### 请求 body
```
json :
{
  "beforeFileUnit" : "string",
  "birthPlace" : "string",
  "difficultStudentsCategory" : "string",
  "enrollmentTime" : "string",
  "graduationTime" : "string",
  "schoolId" : 0,
  "situationComprehensiveEvaluation" : "string",
  "situationEmployed" : "string",
  "specialtyId" : 0,
  "studentStatusId" : 0,
  "studentStatusIdBofore" : 0,
  "waccountTransfer" : "string",
  "wdropOut" : "string",
  "wfileTransfer" : "string",
  "wstudentStatus" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_13"></a>
#### 学生基础信息-根据id删除
```
DELETE /studentstatusinfo/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_12"></a>
#### 学生基础信息-根据id查询
```
GET /studentstatusinfo/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getprovinceinfousingget"></a>
#### 学生信息-获得学生省份分布人数
```
GET /studentstatusinfo/getprovinceinfo
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/getprovinceinfo
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_13"></a>
#### 学生基础信息-分页查询
```
GET /studentstatusinfo/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_13"></a>
#### 学生基础信息-根据id更新
```
PUT /studentstatusinfo/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WAccountTransfer**  <br>*可选*||string|
|**Query**|**WDropOut**  <br>*可选*||string|
|**Query**|**WFileTransfer**  <br>*可选*||string|
|**Query**|**WStudentStatus**  <br>*可选*||string|
|**Query**|**beforeFileUnit**  <br>*可选*|入学前档案所在单位|string|
|**Query**|**birthPlace**  <br>*可选*|生源所在地|string|
|**Query**|**difficultStudentsCategory**  <br>*可选*|困难生类别|string|
|**Query**|**enrollmentTime**  <br>*可选*|入校时间|string|
|**Query**|**graduationTime**  <br>*可选*|毕业时间|string|
|**Query**|**schoolId**  <br>*可选*|学校id|integer (int32)|
|**Query**|**situationComprehensiveEvaluation**  <br>*可选*|综合评测情况|string|
|**Query**|**situationEmployed**  <br>*可选*|在校任职情况|string|
|**Query**|**specialtyId**  <br>*可选*|专业id|integer (int32)|
|**Query**|**studentStatusId**  <br>*可选*|考生号码(主键)|integer (int32)|
|**Query**|**studentStatusIdBofore**  <br>*可选*|原考生号|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/studentstatusinfo/update
```


###### 请求 query
```
json :
{
  "WAccountTransfer" : "string",
  "WDropOut" : "string",
  "WFileTransfer" : "string",
  "WStudentStatus" : "string",
  "beforeFileUnit" : "string",
  "birthPlace" : "string",
  "difficultStudentsCategory" : "string",
  "enrollmentTime" : "string",
  "graduationTime" : "string",
  "schoolId" : 0,
  "situationComprehensiveEvaluation" : "string",
  "situationEmployed" : "string",
  "specialtyId" : 0,
  "studentStatusId" : 0,
  "studentStatusIdBofore" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="081f8e8403e6ed95444c546ce58aff86"></a>
### 学生联系人信息管理
Contact Controller


<a name="addusingpost_2"></a>
#### 学生联系人信息-添加
```
POST /contact/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**contact**  <br>*必填*|contact|[联系方式](#b5894313c2d9cc88561f8cdc7071f9f5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/add
```


###### 请求 body
```
json :
{
  "contactId" : 0,
  "name" : "string",
  "phoneNumber" : 0,
  "relationship" : "string",
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_2"></a>
#### 学生联系人信息-根据id删除
```
DELETE /contact/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_2"></a>
#### 学生联系人信息-根据id查询
```
GET /contact/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget_1"></a>
#### 学生联系人信息-根据用户id获得info
```
GET /contact/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_2"></a>
#### 学生联系人信息-分页查询
```
GET /contact/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_2"></a>
#### 学生联系人信息-根据id更新
```
PUT /contact/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**contactId**  <br>*可选*|联系方式id(主键)|integer (int32)|
|**Query**|**name**  <br>*可选*|姓名|string|
|**Query**|**phoneNumber**  <br>*可选*|电话号码|integer (int32)|
|**Query**|**relationship**  <br>*可选*|关系|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/contact/update
```


###### 请求 query
```
json :
{
  "contactId" : 0,
  "name" : "string",
  "phoneNumber" : 0,
  "relationship" : "string",
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="e1a5ccb990f7d8fc5be3564f973133f6"></a>
### 就业信息管理
Employment Info Controller


<a name="addusingpost_5"></a>
#### 就业信息-添加
```
POST /employmentinfo/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**employmentInfo**  <br>*必填*|employmentInfo|[就业信息](#242fb0c3da9419304213ea5fc766be43)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/add
```


###### 请求 body
```
json :
{
  "conscriptSoldiers" : "string",
  "dispatchRegistrationCardNumber" : "string",
  "dispatchTime" : "string",
  "employmentInfoId" : 0,
  "entryDate" : "string",
  "fileForwardingAddress" : "string",
  "fileForwardingUnit" : "string",
  "fileForwardingUnitPostcode" : "string",
  "graduateWhereabouts" : "string",
  "jobSatisfaction" : "string",
  "occupationalCategory" : "string",
  "otherInfo" : "string",
  "registrationCertificateIssuanceCategory" : "string",
  "relocationUnitName" : "string",
  "signedUnitLocation" : "string",
  "specialInstructions" : "string",
  "stuId" : 0,
  "unitId" : 0,
  "wemployment" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_5"></a>
#### 就业信息-根据id删除
```
DELETE /employmentinfo/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget_2"></a>
#### 就业信息-根据用户id获得info
```
GET /employmentinfo/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getemploymentnumberusingget"></a>
#### 就业信息-获取已就业人数和未就业人数
```
GET /employmentinfo/getemploymentnumber
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/getemploymentnumber
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_5"></a>
#### 就业信息-分页查询
```
GET /employmentinfo/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_5"></a>
#### 就业信息-根据id更新
```
PUT /employmentinfo/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WEmployment**  <br>*可选*||string|
|**Query**|**conscriptSoldiers**  <br>*可选*|应征义务兵|string|
|**Query**|**dispatchRegistrationCardNumber**  <br>*可选*|派遣报到证号|string|
|**Query**|**dispatchTime**  <br>*可选*|派遣时间|string|
|**Query**|**employmentInfoId**  <br>*可选*|就业信息id(主键)|integer (int32)|
|**Query**|**entryDate**  <br>*可选*|录入日期|string|
|**Query**|**fileForwardingAddress**  <br>*可选*|档案转寄地址|string|
|**Query**|**fileForwardingUnit**  <br>*可选*|档案转寄单位|string|
|**Query**|**fileForwardingUnitPostcode**  <br>*可选*|档案转寄单位邮编|string|
|**Query**|**graduateWhereabouts**  <br>*可选*|毕业去向|string|
|**Query**|**jobSatisfaction**  <br>*可选*|就业满意度|string|
|**Query**|**occupationalCategory**  <br>*可选*|职业类别|string|
|**Query**|**otherInfo**  <br>*可选*|其它信息|string|
|**Query**|**registrationCertificateIssuanceCategory**  <br>*可选*|报到证件签发类别|string|
|**Query**|**relocationUnitName**  <br>*可选*|报到证迁往单位名称|string|
|**Query**|**signedUnitLocation**  <br>*可选*|签往单位所在地|string|
|**Query**|**specialInstructions**  <br>*可选*|特殊说明|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|
|**Query**|**unitId**  <br>*可选*|单位id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentinfo/update
```


###### 请求 query
```
json :
{
  "WEmployment" : "string",
  "conscriptSoldiers" : "string",
  "dispatchRegistrationCardNumber" : "string",
  "dispatchTime" : "string",
  "employmentInfoId" : 0,
  "entryDate" : "string",
  "fileForwardingAddress" : "string",
  "fileForwardingUnit" : "string",
  "fileForwardingUnitPostcode" : "string",
  "graduateWhereabouts" : "string",
  "jobSatisfaction" : "string",
  "occupationalCategory" : "string",
  "otherInfo" : "string",
  "registrationCertificateIssuanceCategory" : "string",
  "relocationUnitName" : "string",
  "signedUnitLocation" : "string",
  "specialInstructions" : "string",
  "stuId" : 0,
  "unitId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="5da9196c72c66ae79def376bc829a482"></a>
### 就业意向信息管理
Employment Survey Controller


<a name="addusingpost_6"></a>
#### 就业意向信息-添加
```
POST /employmentsurvey/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**employmentSurvey**  <br>*必填*|employmentSurvey|[就业调查](#5ec03e1f732974b19d6f0b45b085b4ba)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/add
```


###### 请求 body
```
json :
{
  "employmentSurveyId" : 0,
  "expectedPlaceWork" : "string",
  "expectedUnitNature" : "string",
  "expectedWorkArea" : "string",
  "graduateExpectedSalary" : 0.0,
  "instructionManual" : "string",
  "statisticsGraduatio" : "string",
  "stuId" : 0,
  "wentryHigherSchool" : "string",
  "workProfessionalRelevance" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_6"></a>
#### 就业意向信息-根据id删除
```
DELETE /employmentsurvey/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_5"></a>
#### 就业意向信息-根据id查询
```
GET /employmentsurvey/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget_3"></a>
#### 就业意向信息-根据用户id获得info
```
GET /employmentsurvey/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_6"></a>
#### 就业意向信息-分页查询
```
GET /employmentsurvey/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_6"></a>
#### 就业意向信息-根据id更新
```
PUT /employmentsurvey/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WEntryHigherSchool**  <br>*可选*||string|
|**Query**|**employmentSurveyId**  <br>*可选*|就业调查id(主键)|integer (int32)|
|**Query**|**expectedPlaceWork**  <br>*可选*|期望工作地点|string|
|**Query**|**expectedUnitNature**  <br>*可选*|期望单位性质|string|
|**Query**|**expectedWorkArea**  <br>*可选*|期望工作地域|string|
|**Query**|**graduateExpectedSalary**  <br>*可选*|毕业期望薪酬|number|
|**Query**|**instructionManual**  <br>*可选*|备注说明|string|
|**Query**|**statisticsGraduatio**  <br>*可选*|毕业去向情况统计|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|
|**Query**|**workProfessionalRelevance**  <br>*可选*|工作与专业相关度|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/employmentsurvey/update
```


###### 请求 query
```
json :
{
  "WEntryHigherSchool" : "string",
  "employmentSurveyId" : 0,
  "expectedPlaceWork" : "string",
  "expectedUnitNature" : "string",
  "expectedWorkArea" : "string",
  "graduateExpectedSalary" : 0.0,
  "instructionManual" : "string",
  "statisticsGraduatio" : "string",
  "stuId" : 0,
  "workProfessionalRelevance" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="425b693d63dc372cfac8ff21a98a6054"></a>
### 户口信息管理
Hukou Controller


<a name="addusingpost_7"></a>
#### 户口信息-添加
```
POST /hukou/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**hukou**  <br>*必填*|hukou|[户口](#dc7f2233142f9fdc9e2c69e5b1ee0107)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/hukou/add
```


###### 请求 body
```
json :
{
  "codeNumber" : "string",
  "familyAddress" : "string",
  "hukouId" : 0,
  "policeStationAddress" : "string",
  "postalCode" : "string",
  "povertyLevel" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_7"></a>
#### 户口信息-根据id删除
```
DELETE /hukou/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/hukou/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_6"></a>
#### 户口信息-根据id查询
```
GET /hukou/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/hukou/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_7"></a>
#### 户口信息-分页查询
```
GET /hukou/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/hukou/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_7"></a>
#### 户口信息-根据id更新
```
PUT /hukou/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**codeNumber**  <br>*可选*|代码编号|string|
|**Query**|**familyAddress**  <br>*可选*|家庭地址|string|
|**Query**|**hukouId**  <br>*可选*|户口信息id(主键)|integer (int32)|
|**Query**|**policeStationAddress**  <br>*可选*|派出所地址|string|
|**Query**|**postalCode**  <br>*可选*|邮政编码|string|
|**Query**|**povertyLevel**  <br>*可选*|贫困等级|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/hukou/update
```


###### 请求 query
```
json :
{
  "codeNumber" : "string",
  "familyAddress" : "string",
  "hukouId" : 0,
  "policeStationAddress" : "string",
  "postalCode" : "string",
  "povertyLevel" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="00e79068c6fa7084418fd76c4e2c43fe"></a>
### 档案信息管理
Archives Controller


<a name="addusingpost"></a>
#### 档案信息-添加
```
POST /archives/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**archives**  <br>*必填*|archives|[档案](#20211b40d8451cb6cd05258d1453f78f)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/add
```


###### 请求 body
```
json :
{
  "agentType" : "string",
  "archivesRelationshipId" : 0,
  "flexibleContractSign" : "string",
  "flexibleContractUnitName" : "string",
  "stuId" : 0,
  "talentAgencyLogo" : "string",
  "worganizationalRelationship" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete"></a>
#### 档案信息-根据id删除
```
DELETE /archives/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget"></a>
#### 档案信息-根据id查询
```
GET /archives/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget"></a>
#### 档案信息-根据用户id获得info
```
GET /archives/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget"></a>
#### 档案信息-分页查询
```
GET /archives/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput"></a>
#### 档案信息-根据id更新
```
PUT /archives/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WOrganizationalRelationship**  <br>*可选*||string|
|**Query**|**agentType**  <br>*可选*|代理类型|string|
|**Query**|**archivesRelationshipId**  <br>*可选*|档案关系id(主键)|integer (int32)|
|**Query**|**flexibleContractSign**  <br>*可选*|灵活合同标志|string|
|**Query**|**flexibleContractUnitName**  <br>*可选*|灵活合同单位名称|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|
|**Query**|**talentAgencyLogo**  <br>*可选*|人才代理标志|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/archives/update
```


###### 请求 query
```
json :
{
  "WOrganizationalRelationship" : "string",
  "agentType" : "string",
  "archivesRelationshipId" : 0,
  "flexibleContractSign" : "string",
  "flexibleContractUnitName" : "string",
  "stuId" : 0,
  "talentAgencyLogo" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="3b05b940b7a7cc114eb01b987b1b142b"></a>
### 班级信息管理
Class Controller


<a name="addusingpost_1"></a>
#### 班级信息-添加
```
POST /classbj/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**classBj**  <br>*必填*|classBj|[班级](#8ac67c8074f3d3cb29709c3aeb7391c5)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/add
```


###### 请求 body
```
json :
{
  "classId" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_1"></a>
#### 班级信息-根据id删除
```
DELETE /classbj/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_1"></a>
#### 班级信息-根据id查询
```
GET /classbj/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getclassmateusingget"></a>
#### 班级信息-获得所有同班同学信息
```
GET /classbj/getclassmate
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**className**  <br>*必填*|className|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|< [学生基础信息表](#c8514ac456bcff7fed29efa04a8c72a5) > array|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/getclassmate
```


###### 请求 query
```
json :
{
  "className" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
[ {
  "birthday" : "string",
  "classBjId" : 0,
  "counselorId" : 0,
  "courseId" : 0,
  "email" : "string",
  "gender" : "string",
  "hukouId" : 0,
  "idNumber" : "string",
  "name" : "string",
  "nation" : "string",
  "onlyChild" : "string",
  "password" : "string",
  "phoneNumber" : "string",
  "politicalStatus" : "string",
  "qqNumber" : "string",
  "stuId" : 0,
  "studentStatusId" : 0
} ]
```


<a name="listusingget_1"></a>
#### 班级信息-分页查询
```
GET /classbj/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_1"></a>
#### 班级信息-根据id更新
```
PUT /classbj/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**classId**  <br>*可选*|班级id(主键)|integer (int32)|
|**Query**|**name**  <br>*可选*|班级名称|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/classbj/update
```


###### 请求 query
```
json :
{
  "classId" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="4aa94a40e247153b5d3bd2d3d636610f"></a>
### 用户登录接口
Login Controller


<a name="loginusingget"></a>
#### 用户登录
```
GET /login
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**identityStatus**  <br>*必填*|identityStatus|integer (int32)|
|**Query**|**password**  <br>*必填*|password|string|
|**Query**|**username**  <br>*必填*|username|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/login
```


###### 请求 query
```
json :
{
  "identityStatus" : 0,
  "password" : "string",
  "username" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="2d549e13ac3bbc7f825b0904565c69fc"></a>
### 老师基础信息管理
Teacher Controller


<a name="addusingpost_14"></a>
#### 老师基础信息-添加
```
POST /teacher/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**teacher**  <br>*必填*|teacher|[教师基础信息表](#6881a6659c578e2dd0659c2035e0e424)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/add
```


###### 请求 body
```
json :
{
  "address" : "string",
  "birthDate" : "string",
  "courseId" : 0,
  "email" : "string",
  "gender" : "string",
  "idNumber" : "string",
  "jobNumber" : 0,
  "name" : "string",
  "nation" : "string",
  "password" : "string",
  "phoneNumber" : "string",
  "politicalStatus" : "string",
  "qqNumber" : "string",
  "teacherGrade" : "string",
  "teacherId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="changepassusingput_1"></a>
#### 老师基础信息-修改教师密码
```
PUT /teacher/changepass
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|
|**Query**|**password**  <br>*必填*|password|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/changepass
```


###### 请求 query
```
json :
{
  "id" : 0,
  "password" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_14"></a>
#### 老师基础信息-根据id删除
```
DELETE /teacher/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_13"></a>
#### 老师基础信息-根据id查询
```
GET /teacher/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_14"></a>
#### 老师基础信息-分页查询
```
GET /teacher/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_14"></a>
#### 老师基础信息-根据id更新
```
PUT /teacher/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**address**  <br>*可选*|家庭地址|string|
|**Query**|**birthDate**  <br>*可选*|出生日期|string|
|**Query**|**courseId**  <br>*可选*|课程id|integer (int32)|
|**Query**|**email**  <br>*可选*|电子邮箱|string|
|**Query**|**gender**  <br>*可选*|教师性别|string|
|**Query**|**idNumber**  <br>*可选*|身份证号|string|
|**Query**|**jobNumber**  <br>*可选*|教师工号|integer (int32)|
|**Query**|**name**  <br>*可选*|教师姓名|string|
|**Query**|**nation**  <br>*可选*|民族|string|
|**Query**|**password**  <br>*可选*|老师密码|string|
|**Query**|**phoneNumber**  <br>*可选*|手机号码|string|
|**Query**|**politicalStatus**  <br>*可选*|政治面貌|string|
|**Query**|**qqNumber**  <br>*可选*|QQ号码|string|
|**Query**|**teacherGrade**  <br>*可选*|教师等级|string|
|**Query**|**teacherId**  <br>*可选*|教师号(主键)|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/teacher/update
```


###### 请求 query
```
json :
{
  "address" : "string",
  "birthDate" : "string",
  "courseId" : 0,
  "email" : "string",
  "gender" : "string",
  "idNumber" : "string",
  "jobNumber" : 0,
  "name" : "string",
  "nation" : "string",
  "password" : "string",
  "phoneNumber" : "string",
  "politicalStatus" : "string",
  "qqNumber" : "string",
  "teacherGrade" : "string",
  "teacherId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="848bdd45f35cd364c6d52f706adade1c"></a>
### 考研信息管理
Postgraduate Info Controller


<a name="addusingpost_8"></a>
#### 考研信息-添加
```
POST /postgraduateinfo/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**postgraduateInfo**  <br>*必填*|postgraduateInfo|[考研信息](#60ecb8ff34649c9043ede22c9f5b7f2a)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/add
```


###### 请求 body
```
json :
{
  "forwardingCollegeFiles" : "string",
  "locationAdmissionInstitution" : "string",
  "matchMajor" : "string",
  "orientationCommissioningUnit" : "string",
  "postgraduateInfoId" : 0,
  "proceedCollege" : "string",
  "recipientPhoneNumber" : "string",
  "recipientProgressionFile" : "string",
  "reportCardNumber" : "string",
  "schoolPostcode" : "string",
  "stuId" : 0,
  "wexemptGraduateStudents" : "string",
  "wfulltimePostgraduate" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_8"></a>
#### 考研信息-根据id删除
```
DELETE /postgraduateinfo/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_7"></a>
#### 考研信息-根据id查询
```
GET /postgraduateinfo/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="getinfobyidusingget_4"></a>
#### 考研信息-根据用户id获得info
```
GET /postgraduateinfo/getbyid
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**stuId**  <br>*可选*|stuId|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/getbyid
```


###### 请求 query
```
json :
{
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_8"></a>
#### 考研信息-分页查询
```
GET /postgraduateinfo/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_8"></a>
#### 考研信息-根据id更新
```
PUT /postgraduateinfo/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WExemptGraduateStudents**  <br>*可选*||string|
|**Query**|**WFulltimePostgraduate**  <br>*可选*||string|
|**Query**|**forwardingCollegeFiles**  <br>*可选*|升学档案转寄|string|
|**Query**|**locationAdmissionInstitution**  <br>*可选*|录取院校所在地|string|
|**Query**|**matchMajor**  <br>*可选*|专业对口|string|
|**Query**|**orientationCommissioningUnit**  <br>*可选*|定向或委培单位|string|
|**Query**|**postgraduateInfoId**  <br>*可选*|考研信息ID(主键)|integer (int32)|
|**Query**|**proceedCollege**  <br>*可选*|升学院校|string|
|**Query**|**recipientPhoneNumber**  <br>*可选*|接收人联系电话|string|
|**Query**|**recipientProgressionFile**  <br>*可选*|升学档案接收人|string|
|**Query**|**reportCardNumber**  <br>*可选*|报道证编号|string|
|**Query**|**schoolPostcode**  <br>*可选*|升学院校邮编|string|
|**Query**|**stuId**  <br>*可选*|学生id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/postgraduateinfo/update
```


###### 请求 query
```
json :
{
  "WExemptGraduateStudents" : "string",
  "WFulltimePostgraduate" : "string",
  "forwardingCollegeFiles" : "string",
  "locationAdmissionInstitution" : "string",
  "matchMajor" : "string",
  "orientationCommissioningUnit" : "string",
  "postgraduateInfoId" : 0,
  "proceedCollege" : "string",
  "recipientPhoneNumber" : "string",
  "recipientProgressionFile" : "string",
  "reportCardNumber" : "string",
  "schoolPostcode" : "string",
  "stuId" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="9918a9832f6dc8128a129ec61274c7cb"></a>
### 获得各种单位的人数
Unit Distributed Controller


<a name="getunitdistributedusingget"></a>
#### 就业意向信息-获得各种单位的人数
```
GET /units/getunitdistributed
```


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/units/getunitdistributed
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="9f41d5f19f37dad2a998396f6a89f3d3"></a>
### 课程信息管理
Course Controller


<a name="addusingpost_4"></a>
#### 课程信息-添加
```
POST /course/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**course**  <br>*必填*|course|[课程](#58983b0dbd37e844a2fbd6094f31a2e0)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/course/add
```


###### 请求 body
```
json :
{
  "courseId" : 0,
  "name" : "string",
  "wprofessionalCourse" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_4"></a>
#### 课程信息-根据id删除
```
DELETE /course/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/course/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_4"></a>
#### 课程信息-根据id查询
```
GET /course/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/course/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_4"></a>
#### 课程信息-分页查询
```
GET /course/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/course/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_4"></a>
#### 课程信息-根据id更新
```
PUT /course/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**WProfessionalCourse**  <br>*可选*||string|
|**Query**|**courseId**  <br>*可选*|班级id(主键)|integer (int32)|
|**Query**|**name**  <br>*可选*|课程名称|string|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/course/update
```


###### 请求 query
```
json :
{
  "WProfessionalCourse" : "string",
  "courseId" : 0,
  "name" : "string"
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="fa91bb79d4050a7ca8b15d13eec17fa1"></a>
### 辅导员信息管理
Counselor Controller


<a name="addusingpost_3"></a>
#### 辅导员信息-添加
```
POST /counselor/add
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Body**|**counselor**  <br>*必填*|counselor|[辅导员](#7e7ce92ead0fa54bf9116163a46cec8a)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/counselor/add
```


###### 请求 body
```
json :
{
  "counselorId" : 0,
  "name" : "string",
  "phoneNumber" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="deleteusingdelete_3"></a>
#### 辅导员信息-根据id删除
```
DELETE /counselor/delete
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**204**|No Content|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/counselor/delete
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="detailusingget_3"></a>
#### 辅导员信息-根据id查询
```
GET /counselor/detail
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**id**  <br>*必填*|id|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/counselor/detail
```


###### 请求 query
```
json :
{
  "id" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="listusingget_3"></a>
#### 辅导员信息-分页查询
```
GET /counselor/list
```


##### 参数

|类型|名称|说明|类型|默认值|
|---|---|---|---|---|
|**Query**|**page**  <br>*可选*|page|integer (int32)|`0`|
|**Query**|**size**  <br>*可选*|size|integer (int32)|`0`|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/counselor/list
```


###### 请求 query
```
json :
{
  "page" : 0,
  "size" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```


<a name="updateusingput_3"></a>
#### 辅导员信息-根据id更新
```
PUT /counselor/update
```


##### 参数

|类型|名称|说明|类型|
|---|---|---|---|
|**Query**|**counselorId**  <br>*可选*|辅导员id(主键)|integer (int32)|
|**Query**|**name**  <br>*可选*|辅导员姓名|string|
|**Query**|**phoneNumber**  <br>*可选*|电话|integer (int32)|


##### 响应

|HTTP代码|说明|类型|
|---|---|---|
|**200**|OK|[Result](#result)|
|**201**|Created|无内容|
|**401**|Unauthorized|无内容|
|**403**|Forbidden|无内容|
|**404**|Not Found|无内容|


##### 消耗

* `application/json`


##### 生成

* `*/*`


##### HTTP请求示例

###### 请求 path
```
/counselor/update
```


###### 请求 query
```
json :
{
  "counselorId" : 0,
  "name" : "string",
  "phoneNumber" : 0
}
```


##### HTTP响应示例

###### 响应 200
```
json :
{
  "code" : 0,
  "data" : "object",
  "message" : "string"
}
```



