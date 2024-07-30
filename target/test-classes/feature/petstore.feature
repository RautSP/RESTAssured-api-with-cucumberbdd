Feature: petstore api for accessing pets

Scenario: add a new pet to the store
Given create request using payload
When add pet to the store
Then verify status code
And verify id  