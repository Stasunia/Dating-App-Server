package com.stas.server.enums;

public enum ErrorType {
    GENERAL_ERROR_OCCURRED(500, "General error occurred", true),
    ERROR_OCCURRED_WHILE_USING_FUNCTION(555, "Something went wrong, Please try again", false),
    EMPTY_CONTENT(585, "Cant leave it empty!!", false),
    LOGIN_ERROR(600, "The username or the password is wrong please try again", false),
    ADMIN_TYPE_CREATION_FAIL(601, "Only admin can create \"ADMIN\" user type", false),
    COMPANY_TYPE_CREATION_FAIL(602, "Only admin can create \"COMPANY\" user type", false),
    NAME_IS_TOO_SHORT(603, "The name is too short", false),
    NAME_IS_TOO_LONG(604, "The name is too long", false),
    PASSWORD_IS_TOO_SHORT(605, "The password is too short", false),
    PASSWORD_IS_TOO_LONG(606, "The password is too long", false),
    PASSWORD_IS_TOO_WEAK(607, "The password is too weak, must have at least: \n - 1 uppercase letter\n - 1 lowercase letter  \n-numeric character \n" +
            "-1 special character such as '!','@','#' etc.", false),
    NOT_ALLOWED_CHARACTERS(608, "Cant use the characters (`_-=.+*)", false),
    INVALID_EMAIL(609, "Invalid Email, please try again", false),
    INVALID_EMAIL_ADDRESS(610, "Only Gmail address is allowed", false),
    INVALID_ENTERED_NAME(611, "The entered name does not exist", false),
    INVALID_ENTERED_EMAIL(612, "The entered email does not exist", false),
    INVALID_ENTERED_ID(613, "The entered customer does not exist", false),
    THIS_ID_ALREADY_EXIST(614, "This ID is already exist", false),
    THIS_EMAIL_ALREADY_EXIST(615, "Thies email already exist", false),
    THIS_NAME_ALREADY_EXIST(616, "This name is already exist", false),
    INVALID_ID(618, "This  ID does not exist", false),
    INVALID_PHONE_NUMBER(619, "invalid phone number.", false),
    CUSTOMER_ADDRESS_ALREADY_EXIST(620, "This address already exist.", false),
    ADDRESS_IS_TOO_SHORT(621, "The entered address is too short", false),
    ADDRESS_IS_TOO_LONG(622, "The entered address is too long", false),
    CUSTOMER_PHONE_ALREADY_EXIST(623, "the entered phone number already exist", false),
    PHONE_NUMBER_IS_TOO_SHORT(624, "The entered phone number is too short.", false),
    PHONE_NUMBER_IS_TOO_LONG(625, "The entered phone number is too long.", false),
    INVALID_COUPON_AMOUNT_TO_LOW(626, "The amount of coupon is too low, min to enter: 1", false),
    INVALID_COUPON_AMOUNT_TO_HIGH(627, "The amount of coupon is too high, max to enter: 50", false),
    INVALID_COUPON_PRICE(628, "The coupon price must be higher than: 0.5, and lower than 1000000.0.", false),
    INVALID_START_DATE(629, "Start date cant be later than end date.", false),
    INVALID_END_DATE_TODAY(630, "End date must be at least one day later than the current day.", false),
    INVALID_COUPON_CATEGORY(631, "Coupon must have category", false),
    INVALID_CATEGORY_ID(632, "This category ID does not exist.", false),
    INVALID_PURCHASE_ID(633, "The purchase ID does not exist.", false),
    INVALID_AMOUNT_OF_UNITS(634, "Must choose at least one coupon.", false),
    INVALID_AMOUNT_OF_COUPONS_OUT_OF_BOND(635, "Amount of coupons is out of bond", false),
    COUPONS_OUT_OF_STOCK(636, "The coupon is out of stock", false),
    AMOUNT_OF_UNITS_IS_TOO_HIGH(636, "Cant buy coupons more than in stock.", false),
    NULL_NULL(999, "NULL", false);


    private int errorNumber;
    private final String errorMessage;
    private boolean isShowStackTrace;

    ErrorType(int errorNumber, String errorMessage, boolean isShowStackTrace) {
        this.errorNumber = errorNumber;
        this.errorMessage = errorMessage;
        this.isShowStackTrace = isShowStackTrace;
    }

    ErrorType(int errorNumber, String errorMessage) {
        this.errorNumber = errorNumber;
        this.errorMessage = errorMessage;
    }

    ErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public boolean isShowStackTrace() {
        return isShowStackTrace;
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "errorNumber=" + errorNumber +
                ", errorMessage='" + errorMessage + '\'' +
                ", isShowStackTrace=" + isShowStackTrace +
                '}';
    }
}

