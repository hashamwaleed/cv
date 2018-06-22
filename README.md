# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

## How to Use

The following section explains how to use the Bitcasa library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *BitcasaLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

Clicking the ``` Add ``` button will open a dialog where you need to specify Bitcasa in ``` Group Id ``` and BitcasaLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Bitcasa-Java&workspaceName=Bitcasa&projectName=BitcasaLib&rootNamespace=io.cloudfs)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *BitcasaLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accountId | TODO: add a description |
| oAuthAccessToken | OAuth 2.0 Access Token |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String accountId = "TODO Add Value for parameter...";
String oAuthAccessToken = "oAuthAccessToken"; // OAuth 2.0 Access Token

BitcasaClient client = new BitcasaClient(accountId, oAuthAccessToken);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [UserOperationsController](#user_operations_controller)
* [CreateAccountController](#create_account_controller)
* [FileOperationsController](#file_operations_controller)
* [FoldersOperationsController](#folders_operations_controller)
* [ShareOperationsController](#share_operations_controller)
* [HistoryOperationsController](#history_operations_controller)
* [TrashOperationsController](#trash_operations_controller)
* [AdministratorsOperationsController](#administrators_operations_controller)
* [AuthenticationOperationsController](#authentication_operations_controller)

## <a name="user_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.UserOperationsController") UserOperationsController

### Get singleton instance

The singleton instance of the ``` UserOperationsController ``` class can be accessed from the API Client.

```java
UserOperationsController userOperations = client.getUserOperations();
```

### <a name="get_profile_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.UserOperationsController.getProfileAsync") getProfileAsync

> TODO: Add a method description


```java
void getProfileAsync(final APICallBack<GetProfileResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
userOperations.getProfileAsync(new APICallBack<GetProfileResponse>() {
    public void onSuccess(HttpContext context, GetProfileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="upload_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.UserOperationsController.uploadFileAsync") uploadFileAsync

> TODO: Add a method description


```java
void uploadFileAsync(
        final String path,
        final File file,
        final ExistsEnum exists,
        final String reuseAttributes,
        final String reuseFallback,
        final APICallBack<UploadFileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| file |  ``` Required ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |
| reuseAttributes |  ``` Optional ```  | TODO: Add a parameter description |
| reuseFallback |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
File file = new File("PathToFile");
ExistsEnum exists = ExistsEnum.fromString("fail");
String reuseAttributes = "reuse-attributes";
String reuseFallback = "reuse-fallback";
// Invoking the API call with sample inputs
userOperations.uploadFileAsync(path, file, exists, reuseAttributes, reuseFallback, new APICallBack<UploadFileResponse>() {
    public void onSuccess(HttpContext context, UploadFileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="create_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.CreateAccountController") CreateAccountController

### Get singleton instance

The singleton instance of the ``` CreateAccountController ``` class can be accessed from the API Client.

```java
CreateAccountController createAccount = client.getCreateAccount();
```

### <a name="create_account_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.CreateAccountController.createAccountAsync") createAccountAsync

> create new user 


```java
void createAccountAsync(
        final DateTime date,
        final String username,
        final String password,
        final String authorization,
        final String email,
        final String firstName,
        final String lastName,
        final APICallBack<GetProfileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | TODO: Add a parameter description |
| username |  ``` Required ```  | TODO: Add a parameter description |
| password |  ``` Required ```  | TODO: Add a parameter description |
| authorization |  ``` Required ```  | BCS client_application_id:request_signature |
| email |  ``` Optional ```  | TODO: Add a parameter description |
| firstName |  ``` Optional ```  | TODO: Add a parameter description |
| lastName |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
DateTime date = new Date();
String username = "username";
String password = "password";
String authorization = "Authorization";
String email = "email";
String firstName = "first_name";
String lastName = "last_name";
// Invoking the API call with sample inputs
createAccount.createAccountAsync(date, username, password, authorization, email, firstName, lastName, new APICallBack<GetProfileResponse>() {
    public void onSuccess(HttpContext context, GetProfileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="file_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.FileOperationsController") FileOperationsController

### Get singleton instance

The singleton instance of the ``` FileOperationsController ``` class can be accessed from the API Client.

```java
FileOperationsController fileOperations = client.getFileOperations();
```

### <a name="get_download_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.getDownloadFileAsync") getDownloadFileAsync

> TODO: Add a method description


```java
void getDownloadFileAsync(
        final String path,
        final String range,
        final Integer version,
        final String versionConflict,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | Base64-encoded path to any location in the authenticated user�s account. |
| range |  ``` Optional ```  | TODO: Add a parameter description |
| version |  ``` Optional ```  | TODO: Add a parameter description |
| versionConflict |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String range = "Range";
Integer version = 194;
String versionConflict = "version-conflict";
// Invoking the API call with sample inputs
fileOperations.getDownloadFileAsync(path, range, version, versionConflict, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Version was not supplied, or version was not the current version. |



### <a name="create_copy_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.createCopyFileAsync") createCopyFileAsync

> TODO: Add a method description


```java
void createCopyFileAsync(
        final String path,
        final String to,
        final String name,
        final ExistsEnum exists,
        final APICallBack<CopyAndMoveFileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| to |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Required ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  ``` DefaultValue ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String to = "to";
String name = "name";
ExistsEnum exists = ExistsEnum.fromString("rename");
// Invoking the API call with sample inputs
fileOperations.createCopyFileAsync(path, to, name, exists, new APICallBack<CopyAndMoveFileResponse>() {
    public void onSuccess(HttpContext context, CopyAndMoveFileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_move_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.createMoveFileAsync") createMoveFileAsync

> TODO: Add a method description


```java
void createMoveFileAsync(
        final String path,
        final String to,
        final String name,
        final ExistsEnum exists,
        final APICallBack<CopyAndMoveFileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| to |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Optional ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String to = "to";
String name = "name";
ExistsEnum exists = ExistsEnum.fromString("fail");
// Invoking the API call with sample inputs
fileOperations.createMoveFileAsync(path, to, name, exists, new APICallBack<CopyAndMoveFileResponse>() {
    public void onSuccess(HttpContext context, CopyAndMoveFileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.deleteFileAsync") deleteFileAsync

> TODO: Add a method description


```java
void deleteFileAsync(
        final String path,
        final String commit,
        final APICallBack<DeleteFileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| commit |  ``` Optional ```  ``` DefaultValue ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String commit = "false";
// Invoking the API call with sample inputs
fileOperations.deleteFileAsync(path, commit, new APICallBack<DeleteFileResponse>() {
    public void onSuccess(HttpContext context, DeleteFileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="list_file_versions_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.listFileVersionsAsync") listFileVersionsAsync

> TODO: Add a method description


```java
void listFileVersionsAsync(
        final String path,
        final Integer startVersion,
        final Integer stopVersion,
        final Integer limit,
        final APICallBack<ListFileVersionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| startVersion |  ``` Optional ```  | TODO: Add a parameter description |
| stopVersion |  ``` Optional ```  | TODO: Add a parameter description |
| limit |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
Integer startVersion = 194;
Integer stopVersion = 194;
Integer limit = 194;
// Invoking the API call with sample inputs
fileOperations.listFileVersionsAsync(path, startVersion, stopVersion, limit, new APICallBack<ListFileVersionsResponse>() {
    public void onSuccess(HttpContext context, ListFileVersionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="list_single_file_version_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.listSingleFileVersionAsync") listSingleFileVersionAsync

> TODO: Add a method description


```java
void listSingleFileVersionAsync(
        final String path,
        final int version,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
int version = 194;
// Invoking the API call with sample inputs
fileOperations.listSingleFileVersionAsync(path, version, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_file_meta_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.getFileMetaAsync") getFileMetaAsync

> TODO: Add a method description


```java
void getFileMetaAsync(
        final String path,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
fileOperations.getFileMetaAsync(path, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_after_file_meta_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.createAfterFileMetaAsync") createAfterFileMetaAsync

> TODO: Add a method description


```java
void createAfterFileMetaAsync(
        final String path,
        final String name,
        final String extension,
        final DateTime dateCreated,
        final DateTime dateMetaLastModified,
        final DateTime dateContentLastModified,
        final String mime,
        final Object applicationData,
        final Integer version,
        final String versionConflict,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Optional ```  | TODO: Add a parameter description |
| extension |  ``` Optional ```  | TODO: Add a parameter description |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| dateMetaLastModified |  ``` Optional ```  | TODO: Add a parameter description |
| dateContentLastModified |  ``` Optional ```  | TODO: Add a parameter description |
| mime |  ``` Optional ```  | TODO: Add a parameter description |
| applicationData |  ``` Optional ```  | TODO: Add a parameter description |
| version |  ``` Optional ```  | TODO: Add a parameter description |
| versionConflict |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String name = "name";
String extension = "extension";
DateTime dateCreated = new Date();
DateTime dateMetaLastModified = new Date();
DateTime dateContentLastModified = new Date();
String mime = "mime";
Object applicationData = new Object();
Integer version = 194;
String versionConflict = "version-conflict";
// Invoking the API call with sample inputs
fileOperations.createAfterFileMetaAsync(path, name, extension, dateCreated, dateMetaLastModified, dateContentLastModified, mime, applicationData, version, versionConflict, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_promote_file_version_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FileOperationsController.createPromoteFileVersionAsync") createPromoteFileVersionAsync

> TODO: Add a method description


```java
void createPromoteFileVersionAsync(
        final String path,
        final int version,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
int version = 194;
// Invoking the API call with sample inputs
fileOperations.createPromoteFileVersionAsync(path, version, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="folders_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.FoldersOperationsController") FoldersOperationsController

### Get singleton instance

The singleton instance of the ``` FoldersOperationsController ``` class can be accessed from the API Client.

```java
FoldersOperationsController foldersOperations = client.getFoldersOperations();
```

### <a name="create_folder_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.createFolderAsync") createFolderAsync

> TODO: Add a method description


```java
void createFolderAsync(
        final String path,
        final String name,
        final ExistsEnum exists,
        final APICallBack<CreateFolderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Required ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String name = "name";
ExistsEnum exists = ExistsEnum.fromString("fail");
// Invoking the API call with sample inputs
foldersOperations.createFolderAsync(path, name, exists, new APICallBack<CreateFolderResponse>() {
    public void onSuccess(HttpContext context, CreateFolderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_copy_folder_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.createCopyFolderAsync") createCopyFolderAsync

> TODO: Add a method description


```java
void createCopyFolderAsync(
        final String path,
        final String to,
        final String name,
        final ExistsEnum exists,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| to |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Required ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String to = "to";
String name = "name";
ExistsEnum exists = ExistsEnum.fromString("fail");
// Invoking the API call with sample inputs
foldersOperations.createCopyFolderAsync(path, to, name, exists, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_move_folder_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.createMoveFolderAsync") createMoveFolderAsync

> TODO: Add a method description


```java
void createMoveFolderAsync(
        final String path,
        final String to,
        final String name,
        final ExistsEnum exists,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| to |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Required ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String to = "to";
String name = "name";
ExistsEnum exists = ExistsEnum.fromString("fail");
// Invoking the API call with sample inputs
foldersOperations.createMoveFolderAsync(path, to, name, exists, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_folder_meta_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.getFolderMetaAsync") getFolderMetaAsync

> TODO: Add a method description


```java
void getFolderMetaAsync(
        final String path,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
foldersOperations.getFolderMetaAsync(path, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="alter_folder_meta_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.alterFolderMetaAsync") alterFolderMetaAsync

> TODO: Add a method description


```java
void alterFolderMetaAsync(
        final String operation,
        final String name,
        final int version,
        final String versionConflict,
        final String path,
        final DateTime dateCreated,
        final DateTime dateMetaLastModified,
        final DateTime dateContentLastModified,
        final Object applicationData,
        final APICallBack<ListSingleFileVersionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| operation |  ``` Required ```  | TODO: Add a parameter description |
| name |  ``` Required ```  | TODO: Add a parameter description |
| version |  ``` Required ```  | TODO: Add a parameter description |
| versionConflict |  ``` Required ```  | TODO: Add a parameter description |
| path |  ``` Optional ```  | TODO: Add a parameter description |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| dateMetaLastModified |  ``` Optional ```  | TODO: Add a parameter description |
| dateContentLastModified |  ``` Optional ```  | TODO: Add a parameter description |
| applicationData |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String operation = "operation";
String name = "name";
int version = 152;
String versionConflict = "version-conflict";
String path = "path";
DateTime dateCreated = new Date();
DateTime dateMetaLastModified = new Date();
DateTime dateContentLastModified = new Date();
Object applicationData = new Object();
// Invoking the API call with sample inputs
foldersOperations.alterFolderMetaAsync(operation, name, version, versionConflict, path, dateCreated, dateMetaLastModified, dateContentLastModified, applicationData, new APICallBack<ListSingleFileVersionResponse>() {
    public void onSuccess(HttpContext context, ListSingleFileVersionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_folder_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.deleteFolderAsync") deleteFolderAsync

> TODO: Add a method description


```java
void deleteFolderAsync(
        final String path,
        final String commit,
        final String force,
        final APICallBack<DeleteFileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| commit |  ``` Optional ```  | TODO: Add a parameter description |
| force |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String commit = "commit";
String force = "force";
// Invoking the API call with sample inputs
foldersOperations.deleteFolderAsync(path, commit, force, new APICallBack<DeleteFileResponse>() {
    public void onSuccess(HttpContext context, DeleteFileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="list_folder_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.FoldersOperationsController.listFolderAsync") listFolderAsync

> TODO: Add a method description


```java
void listFolderAsync(
        final String path,
        final String depth,
        final String filter,
        final String strictTraverse,
        final APICallBack<ListFolderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Optional ```  | TODO: Add a parameter description |
| depth |  ``` Optional ```  | TODO: Add a parameter description |
| filter |  ``` Optional ```  | TODO: Add a parameter description |
| strictTraverse |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String depth = "depth";
String filter = "filter";
String strictTraverse = "strict-traverse";
// Invoking the API call with sample inputs
foldersOperations.listFolderAsync(path, depth, filter, strictTraverse, new APICallBack<ListFolderResponse>() {
    public void onSuccess(HttpContext context, ListFolderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="share_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.ShareOperationsController") ShareOperationsController

### Get singleton instance

The singleton instance of the ``` ShareOperationsController ``` class can be accessed from the API Client.

```java
ShareOperationsController shareOperations = client.getShareOperations();
```

### <a name="create_share_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.createShareAsync") createShareAsync

> TODO: Add a method description


```java
void createShareAsync(
        final String path,
        final APICallBack<CreateAndAlterShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
shareOperations.createShareAsync(path, new APICallBack<CreateAndAlterShareResponse>() {
    public void onSuccess(HttpContext context, CreateAndAlterShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_browse_share_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.getBrowseShareAsync") getBrowseShareAsync

> TODO: Add a method description


```java
void getBrowseShareAsync(
        final String shareKey,
        final String path,
        final APICallBack<BrowseShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareKey |  ``` Required ```  | TODO: Add a parameter description |
| path |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String shareKey = "share_key";
String path = "path";
// Invoking the API call with sample inputs
shareOperations.getBrowseShareAsync(shareKey, path, new APICallBack<BrowseShareResponse>() {
    public void onSuccess(HttpContext context, BrowseShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_share_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.deleteShareAsync") deleteShareAsync

> TODO: Add a method description


```java
void deleteShareAsync(
        final String shareKey,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareKey |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String shareKey = "share_key";
// Invoking the API call with sample inputs
shareOperations.deleteShareAsync(shareKey, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="list_shares_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.listSharesAsync") listSharesAsync

> TODO: Add a method description


```java
void listSharesAsync(final APICallBack<ListShareResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
shareOperations.listSharesAsync(new APICallBack<ListShareResponse>() {
    public void onSuccess(HttpContext context, ListShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_receive_share_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.createReceiveShareAsync") createReceiveShareAsync

> TODO: Add a method description


```java
void createReceiveShareAsync(
        final String shareKey,
        final String path,
        final ExistsEnum exists,
        final APICallBack<ReceiveAndUnlockShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareKey |  ``` Required ```  | TODO: Add a parameter description |
| path |  ``` Optional ```  | TODO: Add a parameter description |
| exists |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String shareKey = "share_key";
String path = "path";
ExistsEnum exists = ExistsEnum.fromString("fail");
// Invoking the API call with sample inputs
shareOperations.createReceiveShareAsync(shareKey, path, exists, new APICallBack<ReceiveAndUnlockShareResponse>() {
    public void onSuccess(HttpContext context, ReceiveAndUnlockShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_unlock_share_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.createUnlockShareAsync") createUnlockShareAsync

> TODO: Add a method description


```java
void createUnlockShareAsync(
        final String shareKey,
        final String password,
        final APICallBack<ReceiveAndUnlockShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareKey |  ``` Required ```  | TODO: Add a parameter description |
| password |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String shareKey = "share_key";
String password = "password";
// Invoking the API call with sample inputs
shareOperations.createUnlockShareAsync(shareKey, password, new APICallBack<ReceiveAndUnlockShareResponse>() {
    public void onSuccess(HttpContext context, ReceiveAndUnlockShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="alter_share_info_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.ShareOperationsController.alterShareInfoAsync") alterShareInfoAsync

> TODO: Add a method description


```java
void alterShareInfoAsync(
        final String shareKey,
        final String currentPassword,
        final String password,
        final String name,
        final APICallBack<CreateAndAlterShareResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shareKey |  ``` Required ```  | TODO: Add a parameter description |
| currentPassword |  ``` Optional ```  | TODO: Add a parameter description |
| password |  ``` Optional ```  | TODO: Add a parameter description |
| name |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String shareKey = "share_key";
String currentPassword = "current_password";
String password = "password";
String name = "name";
// Invoking the API call with sample inputs
shareOperations.alterShareInfoAsync(shareKey, currentPassword, password, name, new APICallBack<CreateAndAlterShareResponse>() {
    public void onSuccess(HttpContext context, CreateAndAlterShareResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="history_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.HistoryOperationsController") HistoryOperationsController

### Get singleton instance

The singleton instance of the ``` HistoryOperationsController ``` class can be accessed from the API Client.

```java
HistoryOperationsController historyOperations = client.getHistoryOperations();
```

### <a name="list_history_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.HistoryOperationsController.listHistoryAsync") listHistoryAsync

> TODO: Add a method description


```java
void listHistoryAsync(
        final Integer start,
        final Integer stop,
        final APICallBack<ListHistoryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| start |  ``` Optional ```  | TODO: Add a parameter description |
| stop |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
Integer start = 152;
Integer stop = 152;
// Invoking the API call with sample inputs
historyOperations.listHistoryAsync(start, stop, new APICallBack<ListHistoryResponse>() {
    public void onSuccess(HttpContext context, ListHistoryResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="trash_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.TrashOperationsController") TrashOperationsController

### Get singleton instance

The singleton instance of the ``` TrashOperationsController ``` class can be accessed from the API Client.

```java
TrashOperationsController trashOperations = client.getTrashOperations();
```

### <a name="get_browse_trash_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.TrashOperationsController.getBrowseTrashAsync") getBrowseTrashAsync

> TODO: Add a method description


```java
void getBrowseTrashAsync(
        final String path,
        final APICallBack<BrowseTrashResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
trashOperations.getBrowseTrashAsync(path, new APICallBack<BrowseTrashResponse>() {
    public void onSuccess(HttpContext context, BrowseTrashResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_trash_items_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.TrashOperationsController.deleteTrashItemsAsync") deleteTrashItemsAsync

> TODO: Add a method description


```java
void deleteTrashItemsAsync(
        final String path,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
// Invoking the API call with sample inputs
trashOperations.deleteTrashItemsAsync(path, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_recover_trash_items_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.TrashOperationsController.createRecoverTrashItemsAsync") createRecoverTrashItemsAsync

> TODO: Add a method description


```java
void createRecoverTrashItemsAsync(
        final String path,
        final String restore,
        final String rescuePath,
        final String recreatePath,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| path |  ``` Required ```  | TODO: Add a parameter description |
| restore |  ``` Optional ```  | TODO: Add a parameter description |
| rescuePath |  ``` Optional ```  | TODO: Add a parameter description |
| recreatePath |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String path = "path";
String restore = "restore";
String rescuePath = "rescue-path";
String recreatePath = "recreate-path";
// Invoking the API call with sample inputs
trashOperations.createRecoverTrashItemsAsync(path, restore, rescuePath, recreatePath, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="administrators_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.AdministratorsOperationsController") AdministratorsOperationsController

### Get singleton instance

The singleton instance of the ``` AdministratorsOperationsController ``` class can be accessed from the API Client.

```java
AdministratorsOperationsController administratorsOperations = client.getAdministratorsOperations();
```

### <a name="create_account_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.AdministratorsOperationsController.createAccountAsync") createAccountAsync

> *Tags:*  ``` Skips Authentication ``` 

> TODO: Add a method description


```java
void createAccountAsync(
        final String authorization,
        final DateTime date,
        final String username,
        final String password,
        final String email,
        final String firstName,
        final String lastName,
        final APICallBack<GetProfileResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | BCS client_application_id:request_signature |
| date |  ``` Required ```  | TODO: Add a parameter description |
| username |  ``` Required ```  | TODO: Add a parameter description |
| password |  ``` Required ```  | TODO: Add a parameter description |
| email |  ``` Optional ```  | TODO: Add a parameter description |
| firstName |  ``` Optional ```  | TODO: Add a parameter description |
| lastName |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String authorization = "Authorization";
DateTime date = new Date();
String username = "username";
String password = "password";
String email = "email";
String firstName = "first_name";
String lastName = "last_name";
// Invoking the API call with sample inputs
administratorsOperations.createAccountAsync(authorization, date, username, password, email, firstName, lastName, new APICallBack<GetProfileResponse>() {
    public void onSuccess(HttpContext context, GetProfileResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="authentication_operations_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.cloudfs.controllers.AuthenticationOperationsController") AuthenticationOperationsController

### Get singleton instance

The singleton instance of the ``` AuthenticationOperationsController ``` class can be accessed from the API Client.

```java
AuthenticationOperationsController authenticationOperations = client.getAuthenticationOperations();
```

### <a name="create_o_auth2_password_credentials_grant_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.AuthenticationOperationsController.createOAuth2PasswordCredentialsGrantAsync") createOAuth2PasswordCredentialsGrantAsync

> *Tags:*  ``` Skips Authentication ``` 

> TODO: Add a method description


```java
void createOAuth2PasswordCredentialsGrantAsync(
        final String authorization,
        final DateTime date,
        final String username,
        final String password,
        final APICallBack<AuthenticationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | BCS : |
| date |  ``` Required ```  | TODO: Add a parameter description |
| username |  ``` Required ```  | TODO: Add a parameter description |
| password |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String authorization = "Authorization";
DateTime date = new Date();
String username = "username";
String password = "password";
// Invoking the API call with sample inputs
authenticationOperations.createOAuth2PasswordCredentialsGrantAsync(authorization, date, username, password, new APICallBack<AuthenticationResponse>() {
    public void onSuccess(HttpContext context, AuthenticationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_ping_async"></a>![Method: ](https://apidocs.io/img/method.png "io.cloudfs.controllers.AuthenticationOperationsController.getPingAsync") getPingAsync

> TODO: Add a method description


```java
void getPingAsync(
        final String authorization,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| authorization |  ``` Required ```  | Bearer |


#### Example Usage

```java
String authorization = "Authorization";
// Invoking the API call with sample inputs
authenticationOperations.getPingAsync(authorization, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



