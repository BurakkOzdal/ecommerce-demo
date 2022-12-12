package com.etiya.ecommercedemo4.business.constants;

public class Messages {
    public static class Address{
        public static final String StreetDoesNotExist = "STREET_DOES_NOT_EXIST";
    }

    public static class User{
        public static final String UserDoesNotExist = "USER_DOES_NOT_EXIST";
    }

    public static class Category{
        public static final String CategoryExists = "CATEGORY_EXISTS";
        public static final String CategoryDoesNotExist = "CATEGORY_DOES_NOT_EXIST";
    }

    public static class SuccessMessages {
        public static final String Add = "ENTITY_ADDED";
        public static final String ListAll = "ALL_ENTITIES_LISTED";
        public static final String ListById ="ENTITY_LISTED_BY_ID";
        public static final String ListByName ="ENTITY_LISTED_BY_NAME";
        public static final String Succeeded ="REQUEST_SUCCEEDED";
    }



}
