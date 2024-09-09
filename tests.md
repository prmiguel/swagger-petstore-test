# Tests

## `Pet`
### `PUT` - `/pet`
Update pet name - Acceptance</br>
Update pet category - Acceptance</br>
Update pet status - Acceptance</br>

### `POST` - `/pet`
Create pet only with required information - Acceptance</br>
Create pet with full information - Acceptance</br>
Create pet with duplicated ID - Acceptance</br>
Create pet with invalid category - Acceptance</br>
Create pet with multiple URLs for photos - Acceptance</br>
Create pet with no tags - Acceptance</br>
Create pet with multiple tags - Acceptance</br>
Create pet with missing required info - Validation</br>
Create pet with duplicated tags - Acceptance</br>
Create pet with non allowed status - Acceptance</br>

### `GET` - `/pet/findByStatus`
Find pets by status - Acceptance</br>
Find pets by status providing any status - Acceptance</br>
Find pets by invalid status - Acceptance</br>

### `GET` - `/pet/findByTags`
Find pets by a single tag - Acceptance</br>
Find pets by multiple tags - Acceptance</br>
Find pets by no tags - Acceptance</br>
Find pets by invalid tag - Acceptance</br>

### `GET` - `/pet/{petId}`
Get pet by Id - Acceptance</br>
Get pet by Id not found - Acceptance</br>
Get pet by invalid Id - Validation</br>
Get pet by Id without providing Id - Negative</br>

### `POST` - `/pet/{petId}`
Update pet name by Id - Acceptance</br>
Update pet status by Id - Acceptance</br>
Update pet with invalid information - Acceptance</br>

### `DELETE` - `/pet/{petId}`
Delete pet by Id - Acceptance</br>
Try to delete already deleted pet by Id - Acceptance</br>
Try to delete non existing pet by Id - Acceptance</br>
Try to delete by Id with missing Id - Negative</br>

### `POST` - `/pet/{petId}/uploadImage`
Upload image to ped - Acceptance</br>


## `Store`
### `GET` - `/store/inventory`
List inventories - Acceptance</br>

### `POST` - `/store/order`
Add new order for store - Acceptance</br>

### `GET` - `/store/order/{orderId}`
Get order By Id - Acceptance</br>

### `DELETE` - `/store/order/{orderId}`
Delete order By Id - Acceptance</br>

## `User`
### `POST` - `/user`
Create user with required information - Acceptance</br>
Create user with full information - Acceptance</br>
Attempt to create a user with duplicated ID - Acceptance</br>
Attempt to create a user with existing username - Acceptance</br>
Attempt to create a user with existing email - Acceptance</br>
Attempt to create a user with invalid status - Negative</br>
Attempt to create user with missing required info - Validation</br>
Attempt to create user with empty password - Acceptance</br>
Attempt to create a user with invalid email - Negative</br>

### `POST` - `/user/createWithList`
Attempt to create a list of user providing an empty list - Negative</br>
Create bulk users provided as list - Acceptance</br>
Attempt to create a list of user providing duplicated IDs - Validation</br>

### `GET` - `/user/login`
Login successfully providing valid credentials - Acceptance</br>
Attempt to login providing non-existing user credentials - Acceptance</br>
Attempt to login providing wrong password - Acceptance</br>
Login with user that is already logged in - Validation</br>

### `GET` - `/user/logout`
Logout with a logged user - Acceptance</br>
Logout with already logged user - Negative</br>

### `GET` - `/user/{username}`
Get user information by username - Acceptance</br>
Attempt to get user info providing non-existing username - Acceptance</br>
Attempt to get user info providing invalid username - Acceptance</br>
Attempt to get user info providing deleted username - Negative</br>

### `PUT` - `/user/{username}`
Update username - Acceptance</br>
Update username with existing value - Validation</br>

### `DELETE` - `/user/{username}`
Delete user - Acceptance</br>
Delete user twice - Negative</br>
Attemp to delete non-existing user - Acceptance</br>
