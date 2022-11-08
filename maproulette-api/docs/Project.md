# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the project |  [optional]
**owner** | **Long** | The OSM identifier of the owner of the project, set automatically |  [optional]
**name** | **String** | The internal name of the project | 
**created** | **Integer** | The time that this project was created, set by the database |  [optional]
**modified** | **Integer** | The last time that this project was modified, set by the database |  [optional]
**description** | **String** | The description for the project |  [optional]
**grants** | [**List&lt;OrgMaprouletteFrameworkModelGrant&gt;**](OrgMaprouletteFrameworkModelGrant.md) | The grants associated with the project, which is completely managed by the backend |  [optional]
**enabled** | **Boolean** | Whether this project is enabled for use or not |  [optional]
**deleted** | **Boolean** | Field stating whether this project is ready to be deleted by the system |  [optional]
**featured** | **Boolean** | Whether or not this is a featured project. Only super users can set this field |  [optional]
