# TagChange

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**osmId** | **Long** | The OSM identifier of the feature that will have it&#x27;s tags changed |  [optional]
**osmType** | [**OSMType**](OSMType.md) |  |  [optional]
**updates** | **Map&lt;String, String&gt;** | The tags that you want to update on the feature. You will also place any tags you want to add in this object |  [optional]
**deletes** | **List&lt;String&gt;** | The tags that you want to delete from the feature |  [optional]
