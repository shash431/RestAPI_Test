Feature: Categories.feature

As a company user 
I want to be able to search for product categories
So that I can see the details of various products

@categories
Scenario Outline: Search for a category

Given I am an existing user
When I call the category service with categoryId <id>
Then I can see the name <name> of the category
And I can see the canRelist  <CanRelist> status of the product
And I can see a promotion element with promotionName <promotionname> and Description <description>

Examples:
|id|name|CanRelist|promotionname|description|
|"6327"|"Carbon credits"|"true"|"Gallery"|"2x larger image"|


